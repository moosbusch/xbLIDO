/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML AbstractTimePrimitiveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractTimePrimitiveTypeImpl extends net.opengis.gml.impl.AbstractTimeObjectTypeImpl implements net.opengis.gml.AbstractTimePrimitiveType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimePrimitiveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "relatedTime");
    
    
    /**
     * Gets a List of "relatedTime" elements
     */
    public java.util.List<net.opengis.gml.RelatedTimeType> getRelatedTimeList()
    {
        final class RelatedTimeList extends java.util.AbstractList<net.opengis.gml.RelatedTimeType>
        {
            @Override
            public net.opengis.gml.RelatedTimeType get(int i)
                { return AbstractTimePrimitiveTypeImpl.this.getRelatedTimeArray(i); }
            
            @Override
            public net.opengis.gml.RelatedTimeType set(int i, net.opengis.gml.RelatedTimeType o)
            {
                net.opengis.gml.RelatedTimeType old = AbstractTimePrimitiveTypeImpl.this.getRelatedTimeArray(i);
                AbstractTimePrimitiveTypeImpl.this.setRelatedTimeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.RelatedTimeType o)
                { AbstractTimePrimitiveTypeImpl.this.insertNewRelatedTime(i).set(o); }
            
            @Override
            public net.opengis.gml.RelatedTimeType remove(int i)
            {
                net.opengis.gml.RelatedTimeType old = AbstractTimePrimitiveTypeImpl.this.getRelatedTimeArray(i);
                AbstractTimePrimitiveTypeImpl.this.removeRelatedTime(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractTimePrimitiveTypeImpl.this.sizeOfRelatedTimeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RelatedTimeList();
        }
    }
    
    /**
     * Gets array of all "relatedTime" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.RelatedTimeType[] getRelatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.RelatedTimeType> targetList = new java.util.ArrayList<net.opengis.gml.RelatedTimeType>();
            get_store().find_all_element_users(RELATEDTIME$0, targetList);
            net.opengis.gml.RelatedTimeType[] result = new net.opengis.gml.RelatedTimeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedTime" element
     */
    public net.opengis.gml.RelatedTimeType getRelatedTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RelatedTimeType target = null;
            target = (net.opengis.gml.RelatedTimeType)get_store().find_element_user(RELATEDTIME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedTime" element
     */
    public int sizeOfRelatedTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDTIME$0);
        }
    }
    
    /**
     * Sets array of all "relatedTime" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRelatedTimeArray(net.opengis.gml.RelatedTimeType[] relatedTimeArray)
    {
        check_orphaned();
        arraySetterHelper(relatedTimeArray, RELATEDTIME$0);
    }
    
    /**
     * Sets ith "relatedTime" element
     */
    @Inject(optional=true) public void setRelatedTimeArray(int i, net.opengis.gml.RelatedTimeType relatedTime)
    {
        generatedSetterHelperImpl(relatedTime, RELATEDTIME$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedTime" element
     */
    public net.opengis.gml.RelatedTimeType insertNewRelatedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RelatedTimeType target = null;
            target = (net.opengis.gml.RelatedTimeType)get_store().insert_element_user(RELATEDTIME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedTime" element
     */
    public net.opengis.gml.RelatedTimeType addNewRelatedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RelatedTimeType target = null;
            target = (net.opengis.gml.RelatedTimeType)get_store().add_element_user(RELATEDTIME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedTime" element
     */
    public void removeRelatedTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDTIME$0, i);
        }
    }
}
