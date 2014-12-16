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
 * An XML CompositeSolidType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CompositeSolidTypeImpl extends net.opengis.gml.impl.AbstractSolidTypeImpl implements net.opengis.gml.CompositeSolidType
{
    private static final long serialVersionUID = 1L;
    
    public CompositeSolidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "solidMember");
    
    
    /**
     * Gets a List of "solidMember" elements
     */
    public java.util.List<net.opengis.gml.SolidPropertyType> getSolidMemberList()
    {
        final class SolidMemberList extends java.util.AbstractList<net.opengis.gml.SolidPropertyType>
        {
            @Override
            public net.opengis.gml.SolidPropertyType get(int i)
                { return CompositeSolidTypeImpl.this.getSolidMemberArray(i); }
            
            @Override
            public net.opengis.gml.SolidPropertyType set(int i, net.opengis.gml.SolidPropertyType o)
            {
                net.opengis.gml.SolidPropertyType old = CompositeSolidTypeImpl.this.getSolidMemberArray(i);
                CompositeSolidTypeImpl.this.setSolidMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.SolidPropertyType o)
                { CompositeSolidTypeImpl.this.insertNewSolidMember(i).set(o); }
            
            @Override
            public net.opengis.gml.SolidPropertyType remove(int i)
            {
                net.opengis.gml.SolidPropertyType old = CompositeSolidTypeImpl.this.getSolidMemberArray(i);
                CompositeSolidTypeImpl.this.removeSolidMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return CompositeSolidTypeImpl.this.sizeOfSolidMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SolidMemberList();
        }
    }
    
    /**
     * Gets array of all "solidMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.SolidPropertyType[] getSolidMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.SolidPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.SolidPropertyType>();
            get_store().find_all_element_users(SOLIDMEMBER$0, targetList);
            net.opengis.gml.SolidPropertyType[] result = new net.opengis.gml.SolidPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "solidMember" element
     */
    public net.opengis.gml.SolidPropertyType getSolidMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().find_element_user(SOLIDMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "solidMember" element
     */
    public int sizeOfSolidMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLIDMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "solidMember" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setSolidMemberArray(net.opengis.gml.SolidPropertyType[] solidMemberArray)
    {
        check_orphaned();
        arraySetterHelper(solidMemberArray, SOLIDMEMBER$0);
    }
    
    /**
     * Sets ith "solidMember" element
     */
     public void setSolidMemberArray(int i, net.opengis.gml.SolidPropertyType solidMember)
    {
        generatedSetterHelperImpl(solidMember, SOLIDMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "solidMember" element
     */
    public net.opengis.gml.SolidPropertyType insertNewSolidMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().insert_element_user(SOLIDMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "solidMember" element
     */
    public net.opengis.gml.SolidPropertyType addNewSolidMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().add_element_user(SOLIDMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "solidMember" element
     */
    public void removeSolidMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLIDMEMBER$0, i);
        }
    }
}
