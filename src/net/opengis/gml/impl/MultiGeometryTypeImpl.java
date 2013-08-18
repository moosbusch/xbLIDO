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
 * An XML MultiGeometryType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiGeometryTypeImpl extends net.opengis.gml.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.MultiGeometryType
{
    private static final long serialVersionUID = 1L;
    
    public MultiGeometryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geometryMember");
    private static final javax.xml.namespace.QName GEOMETRYMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geometryMembers");
    
    
    /**
     * Gets a List of "geometryMember" elements
     */
    public java.util.List<net.opengis.gml.GeometryPropertyType> getGeometryMemberList()
    {
        final class GeometryMemberList extends java.util.AbstractList<net.opengis.gml.GeometryPropertyType>
        {
            @Override
            public net.opengis.gml.GeometryPropertyType get(int i)
                { return MultiGeometryTypeImpl.this.getGeometryMemberArray(i); }
            
            @Override
            public net.opengis.gml.GeometryPropertyType set(int i, net.opengis.gml.GeometryPropertyType o)
            {
                net.opengis.gml.GeometryPropertyType old = MultiGeometryTypeImpl.this.getGeometryMemberArray(i);
                MultiGeometryTypeImpl.this.setGeometryMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.GeometryPropertyType o)
                { MultiGeometryTypeImpl.this.insertNewGeometryMember(i).set(o); }
            
            @Override
            public net.opengis.gml.GeometryPropertyType remove(int i)
            {
                net.opengis.gml.GeometryPropertyType old = MultiGeometryTypeImpl.this.getGeometryMemberArray(i);
                MultiGeometryTypeImpl.this.removeGeometryMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return MultiGeometryTypeImpl.this.sizeOfGeometryMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GeometryMemberList();
        }
    }
    
    /**
     * Gets array of all "geometryMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.GeometryPropertyType[] getGeometryMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.GeometryPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.GeometryPropertyType>();
            get_store().find_all_element_users(GEOMETRYMEMBER$0, targetList);
            net.opengis.gml.GeometryPropertyType[] result = new net.opengis.gml.GeometryPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geometryMember" element
     */
    public net.opengis.gml.GeometryPropertyType getGeometryMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryPropertyType target = null;
            target = (net.opengis.gml.GeometryPropertyType)get_store().find_element_user(GEOMETRYMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geometryMember" element
     */
    public int sizeOfGeometryMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRYMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "geometryMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setGeometryMemberArray(net.opengis.gml.GeometryPropertyType[] geometryMemberArray)
    {
        check_orphaned();
        arraySetterHelper(geometryMemberArray, GEOMETRYMEMBER$0);
    }
    
    /**
     * Sets ith "geometryMember" element
     */
    @Inject(optional=true) public void setGeometryMemberArray(int i, net.opengis.gml.GeometryPropertyType geometryMember)
    {
        generatedSetterHelperImpl(geometryMember, GEOMETRYMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geometryMember" element
     */
    public net.opengis.gml.GeometryPropertyType insertNewGeometryMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryPropertyType target = null;
            target = (net.opengis.gml.GeometryPropertyType)get_store().insert_element_user(GEOMETRYMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geometryMember" element
     */
    public net.opengis.gml.GeometryPropertyType addNewGeometryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryPropertyType target = null;
            target = (net.opengis.gml.GeometryPropertyType)get_store().add_element_user(GEOMETRYMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "geometryMember" element
     */
    public void removeGeometryMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRYMEMBER$0, i);
        }
    }
    
    /**
     * Gets the "geometryMembers" element
     */
    public net.opengis.gml.GeometryArrayPropertyType getGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryArrayPropertyType target = null;
            target = (net.opengis.gml.GeometryArrayPropertyType)get_store().find_element_user(GEOMETRYMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "geometryMembers" element
     */
    public boolean isSetGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRYMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "geometryMembers" element
     */
    @Inject(optional=true) public void setGeometryMembers(net.opengis.gml.GeometryArrayPropertyType geometryMembers)
    {
        generatedSetterHelperImpl(geometryMembers, GEOMETRYMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometryMembers" element
     */
    public net.opengis.gml.GeometryArrayPropertyType addNewGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryArrayPropertyType target = null;
            target = (net.opengis.gml.GeometryArrayPropertyType)get_store().add_element_user(GEOMETRYMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "geometryMembers" element
     */
    public void unsetGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRYMEMBERS$2, 0);
        }
    }
}
