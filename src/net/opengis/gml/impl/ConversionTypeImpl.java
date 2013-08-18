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
 * An XML ConversionType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ConversionTypeImpl extends net.opengis.gml.impl.AbstractGeneralConversionTypeImpl implements net.opengis.gml.ConversionType
{
    private static final long serialVersionUID = 1L;
    
    public ConversionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesMethod");
    private static final javax.xml.namespace.QName USESVALUE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesValue");
    
    
    /**
     * Gets the "usesMethod" element
     */
    public net.opengis.gml.OperationMethodRefType getUsesMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationMethodRefType target = null;
            target = (net.opengis.gml.OperationMethodRefType)get_store().find_element_user(USESMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesMethod" element
     */
    @Inject(optional=true) public void setUsesMethod(net.opengis.gml.OperationMethodRefType usesMethod)
    {
        generatedSetterHelperImpl(usesMethod, USESMETHOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesMethod" element
     */
    public net.opengis.gml.OperationMethodRefType addNewUsesMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationMethodRefType target = null;
            target = (net.opengis.gml.OperationMethodRefType)get_store().add_element_user(USESMETHOD$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "usesValue" elements
     */
    public java.util.List<net.opengis.gml.ParameterValueType> getUsesValueList()
    {
        final class UsesValueList extends java.util.AbstractList<net.opengis.gml.ParameterValueType>
        {
            @Override
            public net.opengis.gml.ParameterValueType get(int i)
                { return ConversionTypeImpl.this.getUsesValueArray(i); }
            
            @Override
            public net.opengis.gml.ParameterValueType set(int i, net.opengis.gml.ParameterValueType o)
            {
                net.opengis.gml.ParameterValueType old = ConversionTypeImpl.this.getUsesValueArray(i);
                ConversionTypeImpl.this.setUsesValueArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.ParameterValueType o)
                { ConversionTypeImpl.this.insertNewUsesValue(i).set(o); }
            
            @Override
            public net.opengis.gml.ParameterValueType remove(int i)
            {
                net.opengis.gml.ParameterValueType old = ConversionTypeImpl.this.getUsesValueArray(i);
                ConversionTypeImpl.this.removeUsesValue(i);
                return old;
            }
            
            @Override
            public int size()
                { return ConversionTypeImpl.this.sizeOfUsesValueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UsesValueList();
        }
    }
    
    /**
     * Gets array of all "usesValue" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.ParameterValueType[] getUsesValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.ParameterValueType> targetList = new java.util.ArrayList<net.opengis.gml.ParameterValueType>();
            get_store().find_all_element_users(USESVALUE$2, targetList);
            net.opengis.gml.ParameterValueType[] result = new net.opengis.gml.ParameterValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "usesValue" element
     */
    public net.opengis.gml.ParameterValueType getUsesValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueType target = null;
            target = (net.opengis.gml.ParameterValueType)get_store().find_element_user(USESVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "usesValue" element
     */
    public int sizeOfUsesValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESVALUE$2);
        }
    }
    
    /**
     * Sets array of all "usesValue" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setUsesValueArray(net.opengis.gml.ParameterValueType[] usesValueArray)
    {
        check_orphaned();
        arraySetterHelper(usesValueArray, USESVALUE$2);
    }
    
    /**
     * Sets ith "usesValue" element
     */
    @Inject(optional=true) public void setUsesValueArray(int i, net.opengis.gml.ParameterValueType usesValue)
    {
        generatedSetterHelperImpl(usesValue, USESVALUE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usesValue" element
     */
    public net.opengis.gml.ParameterValueType insertNewUsesValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueType target = null;
            target = (net.opengis.gml.ParameterValueType)get_store().insert_element_user(USESVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usesValue" element
     */
    public net.opengis.gml.ParameterValueType addNewUsesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueType target = null;
            target = (net.opengis.gml.ParameterValueType)get_store().add_element_user(USESVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "usesValue" element
     */
    public void removeUsesValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESVALUE$2, i);
        }
    }
}
