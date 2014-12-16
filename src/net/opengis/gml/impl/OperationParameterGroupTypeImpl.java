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
 * An XML OperationParameterGroupType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class OperationParameterGroupTypeImpl extends net.opengis.gml.impl.OperationParameterGroupBaseTypeImpl implements net.opengis.gml.OperationParameterGroupType
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "groupID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName MAXIMUMOCCURS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "maximumOccurs");
    private static final javax.xml.namespace.QName INCLUDESPARAMETER$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesParameter");
    
    
    /**
     * Gets a List of "groupID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getGroupIDList()
    {
        final class GroupIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return OperationParameterGroupTypeImpl.this.getGroupIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = OperationParameterGroupTypeImpl.this.getGroupIDArray(i);
                OperationParameterGroupTypeImpl.this.setGroupIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { OperationParameterGroupTypeImpl.this.insertNewGroupID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = OperationParameterGroupTypeImpl.this.getGroupIDArray(i);
                OperationParameterGroupTypeImpl.this.removeGroupID(i);
                return old;
            }
            
            @Override
            public int size()
                { return OperationParameterGroupTypeImpl.this.sizeOfGroupIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GroupIDList();
        }
    }
    
    /**
     * Gets array of all "groupID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getGroupIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(GROUPID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "groupID" element
     */
    public net.opengis.gml.IdentifierType getGroupIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(GROUPID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "groupID" element
     */
    public int sizeOfGroupIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPID$0);
        }
    }
    
    /**
     * Sets array of all "groupID" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setGroupIDArray(net.opengis.gml.IdentifierType[] groupIDArray)
    {
        check_orphaned();
        arraySetterHelper(groupIDArray, GROUPID$0);
    }
    
    /**
     * Sets ith "groupID" element
     */
     public void setGroupIDArray(int i, net.opengis.gml.IdentifierType groupID)
    {
        generatedSetterHelperImpl(groupID, GROUPID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "groupID" element
     */
    public net.opengis.gml.IdentifierType insertNewGroupID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(GROUPID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "groupID" element
     */
    public net.opengis.gml.IdentifierType addNewGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(GROUPID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "groupID" element
     */
    public void removeGroupID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPID$0, i);
        }
    }
    
    /**
     * Gets the "remarks" element
     */
    public net.opengis.gml.StringOrRefType getRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(REMARKS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remarks" element
     */
    public boolean isSetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMARKS$2) != 0;
        }
    }
    
    /**
     * Sets the "remarks" element
     */
     public void setRemarks(net.opengis.gml.StringOrRefType remarks)
    {
        generatedSetterHelperImpl(remarks, REMARKS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    public net.opengis.gml.StringOrRefType addNewRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(REMARKS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "remarks" element
     */
    public void unsetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMARKS$2, 0);
        }
    }
    
    /**
     * Gets the "maximumOccurs" element
     */
    public java.math.BigInteger getMaximumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMOCCURS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximumOccurs" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetMaximumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXIMUMOCCURS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "maximumOccurs" element
     */
    public boolean isSetMaximumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMOCCURS$4) != 0;
        }
    }
    
    /**
     * Sets the "maximumOccurs" element
     */
     public void setMaximumOccurs(java.math.BigInteger maximumOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMOCCURS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMOCCURS$4);
            }
            target.setBigIntegerValue(maximumOccurs);
        }
    }
    
    /**
     * Sets (as xml) the "maximumOccurs" element
     */
    public void xsetMaximumOccurs(org.apache.xmlbeans.XmlPositiveInteger maximumOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXIMUMOCCURS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MAXIMUMOCCURS$4);
            }
            target.set(maximumOccurs);
        }
    }
    
    /**
     * Unsets the "maximumOccurs" element
     */
    public void unsetMaximumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMOCCURS$4, 0);
        }
    }
    
    /**
     * Gets a List of "includesParameter" elements
     */
    public java.util.List<net.opengis.gml.AbstractGeneralOperationParameterRefType> getIncludesParameterList()
    {
        final class IncludesParameterList extends java.util.AbstractList<net.opengis.gml.AbstractGeneralOperationParameterRefType>
        {
            @Override
            public net.opengis.gml.AbstractGeneralOperationParameterRefType get(int i)
                { return OperationParameterGroupTypeImpl.this.getIncludesParameterArray(i); }
            
            @Override
            public net.opengis.gml.AbstractGeneralOperationParameterRefType set(int i, net.opengis.gml.AbstractGeneralOperationParameterRefType o)
            {
                net.opengis.gml.AbstractGeneralOperationParameterRefType old = OperationParameterGroupTypeImpl.this.getIncludesParameterArray(i);
                OperationParameterGroupTypeImpl.this.setIncludesParameterArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractGeneralOperationParameterRefType o)
                { OperationParameterGroupTypeImpl.this.insertNewIncludesParameter(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractGeneralOperationParameterRefType remove(int i)
            {
                net.opengis.gml.AbstractGeneralOperationParameterRefType old = OperationParameterGroupTypeImpl.this.getIncludesParameterArray(i);
                OperationParameterGroupTypeImpl.this.removeIncludesParameter(i);
                return old;
            }
            
            @Override
            public int size()
                { return OperationParameterGroupTypeImpl.this.sizeOfIncludesParameterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IncludesParameterList();
        }
    }
    
    /**
     * Gets array of all "includesParameter" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractGeneralOperationParameterRefType[] getIncludesParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractGeneralOperationParameterRefType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractGeneralOperationParameterRefType>();
            get_store().find_all_element_users(INCLUDESPARAMETER$6, targetList);
            net.opengis.gml.AbstractGeneralOperationParameterRefType[] result = new net.opengis.gml.AbstractGeneralOperationParameterRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "includesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType getIncludesParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().find_element_user(INCLUDESPARAMETER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "includesParameter" element
     */
    public int sizeOfIncludesParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDESPARAMETER$6);
        }
    }
    
    /**
     * Sets array of all "includesParameter" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setIncludesParameterArray(net.opengis.gml.AbstractGeneralOperationParameterRefType[] includesParameterArray)
    {
        check_orphaned();
        arraySetterHelper(includesParameterArray, INCLUDESPARAMETER$6);
    }
    
    /**
     * Sets ith "includesParameter" element
     */
     public void setIncludesParameterArray(int i, net.opengis.gml.AbstractGeneralOperationParameterRefType includesParameter)
    {
        generatedSetterHelperImpl(includesParameter, INCLUDESPARAMETER$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "includesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType insertNewIncludesParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().insert_element_user(INCLUDESPARAMETER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "includesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType addNewIncludesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().add_element_user(INCLUDESPARAMETER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "includesParameter" element
     */
    public void removeIncludesParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDESPARAMETER$6, i);
        }
    }
}
