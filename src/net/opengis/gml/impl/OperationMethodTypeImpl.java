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
 * An XML OperationMethodType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class OperationMethodTypeImpl extends net.opengis.gml.impl.OperationMethodBaseTypeImpl implements net.opengis.gml.OperationMethodType
{
    private static final long serialVersionUID = 1L;
    
    public OperationMethodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName METHODFORMULA$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodFormula");
    private static final javax.xml.namespace.QName SOURCEDIMENSIONS$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "sourceDimensions");
    private static final javax.xml.namespace.QName TARGETDIMENSIONS$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "targetDimensions");
    private static final javax.xml.namespace.QName USESPARAMETER$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesParameter");
    
    
    /**
     * Gets a List of "methodID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getMethodIDList()
    {
        final class MethodIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return OperationMethodTypeImpl.this.getMethodIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = OperationMethodTypeImpl.this.getMethodIDArray(i);
                OperationMethodTypeImpl.this.setMethodIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { OperationMethodTypeImpl.this.insertNewMethodID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = OperationMethodTypeImpl.this.getMethodIDArray(i);
                OperationMethodTypeImpl.this.removeMethodID(i);
                return old;
            }
            
            @Override
            public int size()
                { return OperationMethodTypeImpl.this.sizeOfMethodIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MethodIDList();
        }
    }
    
    /**
     * Gets array of all "methodID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getMethodIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(METHODID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "methodID" element
     */
    public net.opengis.gml.IdentifierType getMethodIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(METHODID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "methodID" element
     */
    public int sizeOfMethodIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHODID$0);
        }
    }
    
    /**
     * Sets array of all "methodID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMethodIDArray(net.opengis.gml.IdentifierType[] methodIDArray)
    {
        check_orphaned();
        arraySetterHelper(methodIDArray, METHODID$0);
    }
    
    /**
     * Sets ith "methodID" element
     */
    @Inject(optional=true) public void setMethodIDArray(int i, net.opengis.gml.IdentifierType methodID)
    {
        generatedSetterHelperImpl(methodID, METHODID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "methodID" element
     */
    public net.opengis.gml.IdentifierType insertNewMethodID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(METHODID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "methodID" element
     */
    public net.opengis.gml.IdentifierType addNewMethodID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(METHODID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "methodID" element
     */
    public void removeMethodID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHODID$0, i);
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
    @Inject(optional=true) public void setRemarks(net.opengis.gml.StringOrRefType remarks)
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
     * Gets the "methodFormula" element
     */
    public net.opengis.gml.CodeType getMethodFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(METHODFORMULA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "methodFormula" element
     */
    @Inject(optional=true) public void setMethodFormula(net.opengis.gml.CodeType methodFormula)
    {
        generatedSetterHelperImpl(methodFormula, METHODFORMULA$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "methodFormula" element
     */
    public net.opengis.gml.CodeType addNewMethodFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(METHODFORMULA$4);
            return target;
        }
    }
    
    /**
     * Gets the "sourceDimensions" element
     */
    public java.math.BigInteger getSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIMENSIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceDimensions" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetSourceDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(SOURCEDIMENSIONS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceDimensions" element
     */
    @Inject(optional=true) public void setSourceDimensions(java.math.BigInteger sourceDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEDIMENSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEDIMENSIONS$6);
            }
            target.setBigIntegerValue(sourceDimensions);
        }
    }
    
    /**
     * Sets (as xml) the "sourceDimensions" element
     */
    public void xsetSourceDimensions(org.apache.xmlbeans.XmlPositiveInteger sourceDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(SOURCEDIMENSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(SOURCEDIMENSIONS$6);
            }
            target.set(sourceDimensions);
        }
    }
    
    /**
     * Gets the "targetDimensions" element
     */
    public java.math.BigInteger getTargetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDIMENSIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetDimensions" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetTargetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(TARGETDIMENSIONS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetDimensions" element
     */
    @Inject(optional=true) public void setTargetDimensions(java.math.BigInteger targetDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDIMENSIONS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETDIMENSIONS$8);
            }
            target.setBigIntegerValue(targetDimensions);
        }
    }
    
    /**
     * Sets (as xml) the "targetDimensions" element
     */
    public void xsetTargetDimensions(org.apache.xmlbeans.XmlPositiveInteger targetDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(TARGETDIMENSIONS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(TARGETDIMENSIONS$8);
            }
            target.set(targetDimensions);
        }
    }
    
    /**
     * Gets a List of "usesParameter" elements
     */
    public java.util.List<net.opengis.gml.AbstractGeneralOperationParameterRefType> getUsesParameterList()
    {
        final class UsesParameterList extends java.util.AbstractList<net.opengis.gml.AbstractGeneralOperationParameterRefType>
        {
            @Override
            public net.opengis.gml.AbstractGeneralOperationParameterRefType get(int i)
                { return OperationMethodTypeImpl.this.getUsesParameterArray(i); }
            
            @Override
            public net.opengis.gml.AbstractGeneralOperationParameterRefType set(int i, net.opengis.gml.AbstractGeneralOperationParameterRefType o)
            {
                net.opengis.gml.AbstractGeneralOperationParameterRefType old = OperationMethodTypeImpl.this.getUsesParameterArray(i);
                OperationMethodTypeImpl.this.setUsesParameterArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractGeneralOperationParameterRefType o)
                { OperationMethodTypeImpl.this.insertNewUsesParameter(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractGeneralOperationParameterRefType remove(int i)
            {
                net.opengis.gml.AbstractGeneralOperationParameterRefType old = OperationMethodTypeImpl.this.getUsesParameterArray(i);
                OperationMethodTypeImpl.this.removeUsesParameter(i);
                return old;
            }
            
            @Override
            public int size()
                { return OperationMethodTypeImpl.this.sizeOfUsesParameterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UsesParameterList();
        }
    }
    
    /**
     * Gets array of all "usesParameter" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractGeneralOperationParameterRefType[] getUsesParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractGeneralOperationParameterRefType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractGeneralOperationParameterRefType>();
            get_store().find_all_element_users(USESPARAMETER$10, targetList);
            net.opengis.gml.AbstractGeneralOperationParameterRefType[] result = new net.opengis.gml.AbstractGeneralOperationParameterRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "usesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType getUsesParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().find_element_user(USESPARAMETER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "usesParameter" element
     */
    public int sizeOfUsesParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESPARAMETER$10);
        }
    }
    
    /**
     * Sets array of all "usesParameter" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setUsesParameterArray(net.opengis.gml.AbstractGeneralOperationParameterRefType[] usesParameterArray)
    {
        check_orphaned();
        arraySetterHelper(usesParameterArray, USESPARAMETER$10);
    }
    
    /**
     * Sets ith "usesParameter" element
     */
    @Inject(optional=true) public void setUsesParameterArray(int i, net.opengis.gml.AbstractGeneralOperationParameterRefType usesParameter)
    {
        generatedSetterHelperImpl(usesParameter, USESPARAMETER$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType insertNewUsesParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().insert_element_user(USESPARAMETER$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType addNewUsesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().add_element_user(USESPARAMETER$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "usesParameter" element
     */
    public void removeUsesParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESPARAMETER$10, i);
        }
    }
}
