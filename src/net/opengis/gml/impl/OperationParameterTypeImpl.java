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
 * An XML OperationParameterType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class OperationParameterTypeImpl extends net.opengis.gml.impl.OperationParameterBaseTypeImpl implements net.opengis.gml.OperationParameterType
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    
    
    /**
     * Gets a List of "parameterID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getParameterIDList()
    {
        final class ParameterIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return OperationParameterTypeImpl.this.getParameterIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = OperationParameterTypeImpl.this.getParameterIDArray(i);
                OperationParameterTypeImpl.this.setParameterIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { OperationParameterTypeImpl.this.insertNewParameterID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = OperationParameterTypeImpl.this.getParameterIDArray(i);
                OperationParameterTypeImpl.this.removeParameterID(i);
                return old;
            }
            
            @Override
            public int size()
                { return OperationParameterTypeImpl.this.sizeOfParameterIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParameterIDList();
        }
    }
    
    /**
     * Gets array of all "parameterID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getParameterIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(PARAMETERID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameterID" element
     */
    public net.opengis.gml.IdentifierType getParameterIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(PARAMETERID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameterID" element
     */
    public int sizeOfParameterIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERID$0);
        }
    }
    
    /**
     * Sets array of all "parameterID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setParameterIDArray(net.opengis.gml.IdentifierType[] parameterIDArray)
    {
        check_orphaned();
        arraySetterHelper(parameterIDArray, PARAMETERID$0);
    }
    
    /**
     * Sets ith "parameterID" element
     */
    @Inject(optional=true) public void setParameterIDArray(int i, net.opengis.gml.IdentifierType parameterID)
    {
        generatedSetterHelperImpl(parameterID, PARAMETERID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterID" element
     */
    public net.opengis.gml.IdentifierType insertNewParameterID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(PARAMETERID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterID" element
     */
    public net.opengis.gml.IdentifierType addNewParameterID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(PARAMETERID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameterID" element
     */
    public void removeParameterID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERID$0, i);
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
}
