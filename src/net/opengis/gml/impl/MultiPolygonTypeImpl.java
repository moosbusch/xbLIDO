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
 * An XML MultiPolygonType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiPolygonTypeImpl extends net.opengis.gml.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.MultiPolygonType
{
    private static final long serialVersionUID = 1L;
    
    public MultiPolygonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polygonMember");
    
    
    /**
     * Gets a List of "polygonMember" elements
     */
    public java.util.List<net.opengis.gml.PolygonPropertyType> getPolygonMemberList()
    {
        final class PolygonMemberList extends java.util.AbstractList<net.opengis.gml.PolygonPropertyType>
        {
            @Override
            public net.opengis.gml.PolygonPropertyType get(int i)
                { return MultiPolygonTypeImpl.this.getPolygonMemberArray(i); }
            
            @Override
            public net.opengis.gml.PolygonPropertyType set(int i, net.opengis.gml.PolygonPropertyType o)
            {
                net.opengis.gml.PolygonPropertyType old = MultiPolygonTypeImpl.this.getPolygonMemberArray(i);
                MultiPolygonTypeImpl.this.setPolygonMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PolygonPropertyType o)
                { MultiPolygonTypeImpl.this.insertNewPolygonMember(i).set(o); }
            
            @Override
            public net.opengis.gml.PolygonPropertyType remove(int i)
            {
                net.opengis.gml.PolygonPropertyType old = MultiPolygonTypeImpl.this.getPolygonMemberArray(i);
                MultiPolygonTypeImpl.this.removePolygonMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return MultiPolygonTypeImpl.this.sizeOfPolygonMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PolygonMemberList();
        }
    }
    
    /**
     * Gets array of all "polygonMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.PolygonPropertyType[] getPolygonMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.PolygonPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.PolygonPropertyType>();
            get_store().find_all_element_users(POLYGONMEMBER$0, targetList);
            net.opengis.gml.PolygonPropertyType[] result = new net.opengis.gml.PolygonPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "polygonMember" element
     */
    public net.opengis.gml.PolygonPropertyType getPolygonMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().find_element_user(POLYGONMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "polygonMember" element
     */
    public int sizeOfPolygonMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGONMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "polygonMember" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setPolygonMemberArray(net.opengis.gml.PolygonPropertyType[] polygonMemberArray)
    {
        check_orphaned();
        arraySetterHelper(polygonMemberArray, POLYGONMEMBER$0);
    }
    
    /**
     * Sets ith "polygonMember" element
     */
     public void setPolygonMemberArray(int i, net.opengis.gml.PolygonPropertyType polygonMember)
    {
        generatedSetterHelperImpl(polygonMember, POLYGONMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "polygonMember" element
     */
    public net.opengis.gml.PolygonPropertyType insertNewPolygonMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().insert_element_user(POLYGONMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "polygonMember" element
     */
    public net.opengis.gml.PolygonPropertyType addNewPolygonMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().add_element_user(POLYGONMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "polygonMember" element
     */
    public void removePolygonMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGONMEMBER$0, i);
        }
    }
}
