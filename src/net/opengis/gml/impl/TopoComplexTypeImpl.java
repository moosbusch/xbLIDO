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
 * An XML TopoComplexType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TopoComplexTypeImpl extends net.opengis.gml.impl.AbstractTopologyTypeImpl implements net.opengis.gml.TopoComplexType
{
    private static final long serialVersionUID = 1L;
    
    public TopoComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXIMALCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "maximalComplex");
    private static final javax.xml.namespace.QName SUPERCOMPLEX$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "superComplex");
    private static final javax.xml.namespace.QName SUBCOMPLEX$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "subComplex");
    private static final javax.xml.namespace.QName TOPOPRIMITIVEMEMBER$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topoPrimitiveMember");
    private static final javax.xml.namespace.QName TOPOPRIMITIVEMEMBERS$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topoPrimitiveMembers");
    private static final javax.xml.namespace.QName ISMAXIMAL$10 = 
        new javax.xml.namespace.QName("", "isMaximal");
    
    
    /**
     * Gets the "maximalComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType getMaximalComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().find_element_user(MAXIMALCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maximalComplex" element
     */
    @Inject(optional=true) public void setMaximalComplex(net.opengis.gml.TopoComplexMemberType maximalComplex)
    {
        generatedSetterHelperImpl(maximalComplex, MAXIMALCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maximalComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType addNewMaximalComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().add_element_user(MAXIMALCOMPLEX$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "superComplex" elements
     */
    public java.util.List<net.opengis.gml.TopoComplexMemberType> getSuperComplexList()
    {
        final class SuperComplexList extends java.util.AbstractList<net.opengis.gml.TopoComplexMemberType>
        {
            @Override
            public net.opengis.gml.TopoComplexMemberType get(int i)
                { return TopoComplexTypeImpl.this.getSuperComplexArray(i); }
            
            @Override
            public net.opengis.gml.TopoComplexMemberType set(int i, net.opengis.gml.TopoComplexMemberType o)
            {
                net.opengis.gml.TopoComplexMemberType old = TopoComplexTypeImpl.this.getSuperComplexArray(i);
                TopoComplexTypeImpl.this.setSuperComplexArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TopoComplexMemberType o)
                { TopoComplexTypeImpl.this.insertNewSuperComplex(i).set(o); }
            
            @Override
            public net.opengis.gml.TopoComplexMemberType remove(int i)
            {
                net.opengis.gml.TopoComplexMemberType old = TopoComplexTypeImpl.this.getSuperComplexArray(i);
                TopoComplexTypeImpl.this.removeSuperComplex(i);
                return old;
            }
            
            @Override
            public int size()
                { return TopoComplexTypeImpl.this.sizeOfSuperComplexArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SuperComplexList();
        }
    }
    
    /**
     * Gets array of all "superComplex" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TopoComplexMemberType[] getSuperComplexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TopoComplexMemberType> targetList = new java.util.ArrayList<net.opengis.gml.TopoComplexMemberType>();
            get_store().find_all_element_users(SUPERCOMPLEX$2, targetList);
            net.opengis.gml.TopoComplexMemberType[] result = new net.opengis.gml.TopoComplexMemberType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "superComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType getSuperComplexArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().find_element_user(SUPERCOMPLEX$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "superComplex" element
     */
    public int sizeOfSuperComplexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPERCOMPLEX$2);
        }
    }
    
    /**
     * Sets array of all "superComplex" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSuperComplexArray(net.opengis.gml.TopoComplexMemberType[] superComplexArray)
    {
        check_orphaned();
        arraySetterHelper(superComplexArray, SUPERCOMPLEX$2);
    }
    
    /**
     * Sets ith "superComplex" element
     */
    @Inject(optional=true) public void setSuperComplexArray(int i, net.opengis.gml.TopoComplexMemberType superComplex)
    {
        generatedSetterHelperImpl(superComplex, SUPERCOMPLEX$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "superComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType insertNewSuperComplex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().insert_element_user(SUPERCOMPLEX$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "superComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType addNewSuperComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().add_element_user(SUPERCOMPLEX$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "superComplex" element
     */
    public void removeSuperComplex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPERCOMPLEX$2, i);
        }
    }
    
    /**
     * Gets a List of "subComplex" elements
     */
    public java.util.List<net.opengis.gml.TopoComplexMemberType> getSubComplexList()
    {
        final class SubComplexList extends java.util.AbstractList<net.opengis.gml.TopoComplexMemberType>
        {
            @Override
            public net.opengis.gml.TopoComplexMemberType get(int i)
                { return TopoComplexTypeImpl.this.getSubComplexArray(i); }
            
            @Override
            public net.opengis.gml.TopoComplexMemberType set(int i, net.opengis.gml.TopoComplexMemberType o)
            {
                net.opengis.gml.TopoComplexMemberType old = TopoComplexTypeImpl.this.getSubComplexArray(i);
                TopoComplexTypeImpl.this.setSubComplexArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TopoComplexMemberType o)
                { TopoComplexTypeImpl.this.insertNewSubComplex(i).set(o); }
            
            @Override
            public net.opengis.gml.TopoComplexMemberType remove(int i)
            {
                net.opengis.gml.TopoComplexMemberType old = TopoComplexTypeImpl.this.getSubComplexArray(i);
                TopoComplexTypeImpl.this.removeSubComplex(i);
                return old;
            }
            
            @Override
            public int size()
                { return TopoComplexTypeImpl.this.sizeOfSubComplexArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SubComplexList();
        }
    }
    
    /**
     * Gets array of all "subComplex" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TopoComplexMemberType[] getSubComplexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TopoComplexMemberType> targetList = new java.util.ArrayList<net.opengis.gml.TopoComplexMemberType>();
            get_store().find_all_element_users(SUBCOMPLEX$4, targetList);
            net.opengis.gml.TopoComplexMemberType[] result = new net.opengis.gml.TopoComplexMemberType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType getSubComplexArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().find_element_user(SUBCOMPLEX$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subComplex" element
     */
    public int sizeOfSubComplexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCOMPLEX$4);
        }
    }
    
    /**
     * Sets array of all "subComplex" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSubComplexArray(net.opengis.gml.TopoComplexMemberType[] subComplexArray)
    {
        check_orphaned();
        arraySetterHelper(subComplexArray, SUBCOMPLEX$4);
    }
    
    /**
     * Sets ith "subComplex" element
     */
    @Inject(optional=true) public void setSubComplexArray(int i, net.opengis.gml.TopoComplexMemberType subComplex)
    {
        generatedSetterHelperImpl(subComplex, SUBCOMPLEX$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType insertNewSubComplex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().insert_element_user(SUBCOMPLEX$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType addNewSubComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().add_element_user(SUBCOMPLEX$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "subComplex" element
     */
    public void removeSubComplex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCOMPLEX$4, i);
        }
    }
    
    /**
     * Gets a List of "topoPrimitiveMember" elements
     */
    public java.util.List<net.opengis.gml.TopoPrimitiveMemberType> getTopoPrimitiveMemberList()
    {
        final class TopoPrimitiveMemberList extends java.util.AbstractList<net.opengis.gml.TopoPrimitiveMemberType>
        {
            @Override
            public net.opengis.gml.TopoPrimitiveMemberType get(int i)
                { return TopoComplexTypeImpl.this.getTopoPrimitiveMemberArray(i); }
            
            @Override
            public net.opengis.gml.TopoPrimitiveMemberType set(int i, net.opengis.gml.TopoPrimitiveMemberType o)
            {
                net.opengis.gml.TopoPrimitiveMemberType old = TopoComplexTypeImpl.this.getTopoPrimitiveMemberArray(i);
                TopoComplexTypeImpl.this.setTopoPrimitiveMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TopoPrimitiveMemberType o)
                { TopoComplexTypeImpl.this.insertNewTopoPrimitiveMember(i).set(o); }
            
            @Override
            public net.opengis.gml.TopoPrimitiveMemberType remove(int i)
            {
                net.opengis.gml.TopoPrimitiveMemberType old = TopoComplexTypeImpl.this.getTopoPrimitiveMemberArray(i);
                TopoComplexTypeImpl.this.removeTopoPrimitiveMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return TopoComplexTypeImpl.this.sizeOfTopoPrimitiveMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TopoPrimitiveMemberList();
        }
    }
    
    /**
     * Gets array of all "topoPrimitiveMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TopoPrimitiveMemberType[] getTopoPrimitiveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TopoPrimitiveMemberType> targetList = new java.util.ArrayList<net.opengis.gml.TopoPrimitiveMemberType>();
            get_store().find_all_element_users(TOPOPRIMITIVEMEMBER$6, targetList);
            net.opengis.gml.TopoPrimitiveMemberType[] result = new net.opengis.gml.TopoPrimitiveMemberType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "topoPrimitiveMember" element
     */
    public net.opengis.gml.TopoPrimitiveMemberType getTopoPrimitiveMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.TopoPrimitiveMemberType)get_store().find_element_user(TOPOPRIMITIVEMEMBER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "topoPrimitiveMember" element
     */
    public int sizeOfTopoPrimitiveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPOPRIMITIVEMEMBER$6);
        }
    }
    
    /**
     * Sets array of all "topoPrimitiveMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTopoPrimitiveMemberArray(net.opengis.gml.TopoPrimitiveMemberType[] topoPrimitiveMemberArray)
    {
        check_orphaned();
        arraySetterHelper(topoPrimitiveMemberArray, TOPOPRIMITIVEMEMBER$6);
    }
    
    /**
     * Sets ith "topoPrimitiveMember" element
     */
    @Inject(optional=true) public void setTopoPrimitiveMemberArray(int i, net.opengis.gml.TopoPrimitiveMemberType topoPrimitiveMember)
    {
        generatedSetterHelperImpl(topoPrimitiveMember, TOPOPRIMITIVEMEMBER$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topoPrimitiveMember" element
     */
    public net.opengis.gml.TopoPrimitiveMemberType insertNewTopoPrimitiveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.TopoPrimitiveMemberType)get_store().insert_element_user(TOPOPRIMITIVEMEMBER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topoPrimitiveMember" element
     */
    public net.opengis.gml.TopoPrimitiveMemberType addNewTopoPrimitiveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.TopoPrimitiveMemberType)get_store().add_element_user(TOPOPRIMITIVEMEMBER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "topoPrimitiveMember" element
     */
    public void removeTopoPrimitiveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPOPRIMITIVEMEMBER$6, i);
        }
    }
    
    /**
     * Gets the "topoPrimitiveMembers" element
     */
    public net.opengis.gml.TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveArrayAssociationType target = null;
            target = (net.opengis.gml.TopoPrimitiveArrayAssociationType)get_store().find_element_user(TOPOPRIMITIVEMEMBERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "topoPrimitiveMembers" element
     */
    public boolean isSetTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPOPRIMITIVEMEMBERS$8) != 0;
        }
    }
    
    /**
     * Sets the "topoPrimitiveMembers" element
     */
    @Inject(optional=true) public void setTopoPrimitiveMembers(net.opengis.gml.TopoPrimitiveArrayAssociationType topoPrimitiveMembers)
    {
        generatedSetterHelperImpl(topoPrimitiveMembers, TOPOPRIMITIVEMEMBERS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoPrimitiveMembers" element
     */
    public net.opengis.gml.TopoPrimitiveArrayAssociationType addNewTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveArrayAssociationType target = null;
            target = (net.opengis.gml.TopoPrimitiveArrayAssociationType)get_store().add_element_user(TOPOPRIMITIVEMEMBERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "topoPrimitiveMembers" element
     */
    public void unsetTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPOPRIMITIVEMEMBERS$8, 0);
        }
    }
    
    /**
     * Gets the "isMaximal" attribute
     */
    public boolean getIsMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMAXIMAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISMAXIMAL$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isMaximal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMAXIMAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISMAXIMAL$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "isMaximal" attribute
     */
    public boolean isSetIsMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISMAXIMAL$10) != null;
        }
    }
    
    /**
     * Sets the "isMaximal" attribute
     */
    @Inject(optional=true) public void setIsMaximal(boolean isMaximal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMAXIMAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISMAXIMAL$10);
            }
            target.setBooleanValue(isMaximal);
        }
    }
    
    /**
     * Sets (as xml) the "isMaximal" attribute
     */
    public void xsetIsMaximal(org.apache.xmlbeans.XmlBoolean isMaximal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMAXIMAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISMAXIMAL$10);
            }
            target.set(isMaximal);
        }
    }
    
    /**
     * Unsets the "isMaximal" attribute
     */
    public void unsetIsMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISMAXIMAL$10);
        }
    }
}
