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
package net.opengis.gml.impl; 
/**
 * An XML CompoundCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CompoundCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.CompoundCRSType
{
    private static final long serialVersionUID = 1L;
    
    public CompoundCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesCRS");
    
    
    /**
     * Gets a List of "includesCRS" elements
     */
    public java.util.List<net.opengis.gml.CoordinateReferenceSystemRefType> getIncludesCRSList()
    {
        final class IncludesCRSList extends java.util.AbstractList<net.opengis.gml.CoordinateReferenceSystemRefType>
        {
            @Override
            public net.opengis.gml.CoordinateReferenceSystemRefType get(int i)
                { return CompoundCRSTypeImpl.this.getIncludesCRSArray(i); }
            
            @Override
            public net.opengis.gml.CoordinateReferenceSystemRefType set(int i, net.opengis.gml.CoordinateReferenceSystemRefType o)
            {
                net.opengis.gml.CoordinateReferenceSystemRefType old = CompoundCRSTypeImpl.this.getIncludesCRSArray(i);
                CompoundCRSTypeImpl.this.setIncludesCRSArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CoordinateReferenceSystemRefType o)
                { CompoundCRSTypeImpl.this.insertNewIncludesCRS(i).set(o); }
            
            @Override
            public net.opengis.gml.CoordinateReferenceSystemRefType remove(int i)
            {
                net.opengis.gml.CoordinateReferenceSystemRefType old = CompoundCRSTypeImpl.this.getIncludesCRSArray(i);
                CompoundCRSTypeImpl.this.removeIncludesCRS(i);
                return old;
            }
            
            @Override
            public int size()
                { return CompoundCRSTypeImpl.this.sizeOfIncludesCRSArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IncludesCRSList();
        }
    }
    
    /**
     * Gets array of all "includesCRS" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CoordinateReferenceSystemRefType[] getIncludesCRSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CoordinateReferenceSystemRefType> targetList = new java.util.ArrayList<net.opengis.gml.CoordinateReferenceSystemRefType>();
            get_store().find_all_element_users(INCLUDESCRS$0, targetList);
            net.opengis.gml.CoordinateReferenceSystemRefType[] result = new net.opengis.gml.CoordinateReferenceSystemRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "includesCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType getIncludesCRSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().find_element_user(INCLUDESCRS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "includesCRS" element
     */
    public int sizeOfIncludesCRSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDESCRS$0);
        }
    }
    
    /**
     * Sets array of all "includesCRS" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setIncludesCRSArray(net.opengis.gml.CoordinateReferenceSystemRefType[] includesCRSArray)
    {
        check_orphaned();
        arraySetterHelper(includesCRSArray, INCLUDESCRS$0);
    }
    
    /**
     * Sets ith "includesCRS" element
     */
     public void setIncludesCRSArray(int i, net.opengis.gml.CoordinateReferenceSystemRefType includesCRS)
    {
        generatedSetterHelperImpl(includesCRS, INCLUDESCRS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "includesCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType insertNewIncludesCRS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().insert_element_user(INCLUDESCRS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "includesCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType addNewIncludesCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().add_element_user(INCLUDESCRS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "includesCRS" element
     */
    public void removeIncludesCRS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDESCRS$0, i);
        }
    }
}
