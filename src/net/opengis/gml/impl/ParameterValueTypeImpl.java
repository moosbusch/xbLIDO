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
 * An XML ParameterValueType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ParameterValueTypeImpl extends net.opengis.gml.impl.AbstractGeneralParameterValueTypeImpl implements net.opengis.gml.ParameterValueType
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "value");
    private static final javax.xml.namespace.QName DMSANGLEVALUE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dmsAngleValue");
    private static final javax.xml.namespace.QName STRINGVALUE1$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "stringValue");
    private static final javax.xml.namespace.QName INTEGERVALUE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "integerValue");
    private static final javax.xml.namespace.QName BOOLEANVALUE1$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "booleanValue");
    private static final javax.xml.namespace.QName VALUELIST$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueList");
    private static final javax.xml.namespace.QName INTEGERVALUELIST$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "integerValueList");
    private static final javax.xml.namespace.QName VALUEFILE$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueFile");
    private static final javax.xml.namespace.QName VALUEOFPARAMETER$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueOfParameter");
    
    
    /**
     * Gets the "value" element
     */
    public net.opengis.gml.MeasureType getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    @Inject(optional=true) public void setValue(net.opengis.gml.MeasureType value)
    {
        generatedSetterHelperImpl(value, VALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public net.opengis.gml.MeasureType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$0, 0);
        }
    }
    
    /**
     * Gets the "dmsAngleValue" element
     */
    public net.opengis.gml.DMSAngleType getDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DMSAngleType target = null;
            target = (net.opengis.gml.DMSAngleType)get_store().find_element_user(DMSANGLEVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dmsAngleValue" element
     */
    public boolean isSetDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DMSANGLEVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "dmsAngleValue" element
     */
    @Inject(optional=true) public void setDmsAngleValue(net.opengis.gml.DMSAngleType dmsAngleValue)
    {
        generatedSetterHelperImpl(dmsAngleValue, DMSANGLEVALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dmsAngleValue" element
     */
    public net.opengis.gml.DMSAngleType addNewDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DMSAngleType target = null;
            target = (net.opengis.gml.DMSAngleType)get_store().add_element_user(DMSANGLEVALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dmsAngleValue" element
     */
    public void unsetDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DMSANGLEVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "stringValue" element
     */
    public java.lang.String getStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stringValue" element
     */
    public org.apache.xmlbeans.XmlString xgetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "stringValue" element
     */
    public boolean isSetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRINGVALUE1$4) != 0;
        }
    }
    
    /**
     * Sets the "stringValue" element
     */
    @Inject(optional=true) public void setStringValue1(java.lang.String stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGVALUE1$4);
            }
            target.setStringValue(stringValue1);
        }
    }
    
    /**
     * Sets (as xml) the "stringValue" element
     */
    public void xsetStringValue1(org.apache.xmlbeans.XmlString stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGVALUE1$4);
            }
            target.set(stringValue1);
        }
    }
    
    /**
     * Unsets the "stringValue" element
     */
    public void unsetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRINGVALUE1$4, 0);
        }
    }
    
    /**
     * Gets the "integerValue" element
     */
    public java.math.BigInteger getIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerValue" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INTEGERVALUE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "integerValue" element
     */
    public boolean isSetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGERVALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "integerValue" element
     */
    @Inject(optional=true) public void setIntegerValue(java.math.BigInteger integerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERVALUE$6);
            }
            target.setBigIntegerValue(integerValue);
        }
    }
    
    /**
     * Sets (as xml) the "integerValue" element
     */
    public void xsetIntegerValue(org.apache.xmlbeans.XmlPositiveInteger integerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INTEGERVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(INTEGERVALUE$6);
            }
            target.set(integerValue);
        }
    }
    
    /**
     * Unsets the "integerValue" element
     */
    public void unsetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGERVALUE$6, 0);
        }
    }
    
    /**
     * Gets the "booleanValue" element
     */
    public boolean getBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "booleanValue" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "booleanValue" element
     */
    public boolean isSetBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEANVALUE1$8) != 0;
        }
    }
    
    /**
     * Sets the "booleanValue" element
     */
    @Inject(optional=true) public void setBooleanValue1(boolean booleanValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANVALUE1$8);
            }
            target.setBooleanValue(booleanValue1);
        }
    }
    
    /**
     * Sets (as xml) the "booleanValue" element
     */
    public void xsetBooleanValue1(org.apache.xmlbeans.XmlBoolean booleanValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEANVALUE1$8);
            }
            target.set(booleanValue1);
        }
    }
    
    /**
     * Unsets the "booleanValue" element
     */
    public void unsetBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEANVALUE1$8, 0);
        }
    }
    
    /**
     * Gets the "valueList" element
     */
    public net.opengis.gml.MeasureListType getValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureListType target = null;
            target = (net.opengis.gml.MeasureListType)get_store().find_element_user(VALUELIST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueList" element
     */
    public boolean isSetValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUELIST$10) != 0;
        }
    }
    
    /**
     * Sets the "valueList" element
     */
    @Inject(optional=true) public void setValueList(net.opengis.gml.MeasureListType valueList)
    {
        generatedSetterHelperImpl(valueList, VALUELIST$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueList" element
     */
    public net.opengis.gml.MeasureListType addNewValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureListType target = null;
            target = (net.opengis.gml.MeasureListType)get_store().add_element_user(VALUELIST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "valueList" element
     */
    public void unsetValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUELIST$10, 0);
        }
    }
    
    /**
     * Gets the "integerValueList" element
     */
    public java.util.List getIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUELIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerValueList" element
     */
    public net.opengis.gml.IntegerList xgetIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(INTEGERVALUELIST$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "integerValueList" element
     */
    public boolean isSetIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGERVALUELIST$12) != 0;
        }
    }
    
    /**
     * Sets the "integerValueList" element
     */
    @Inject(optional=true) public void setIntegerValueList(java.util.List integerValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUELIST$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERVALUELIST$12);
            }
            target.setListValue(integerValueList);
        }
    }
    
    /**
     * Sets (as xml) the "integerValueList" element
     */
    public void xsetIntegerValueList(net.opengis.gml.IntegerList integerValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(INTEGERVALUELIST$12, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IntegerList)get_store().add_element_user(INTEGERVALUELIST$12);
            }
            target.set(integerValueList);
        }
    }
    
    /**
     * Unsets the "integerValueList" element
     */
    public void unsetIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGERVALUELIST$12, 0);
        }
    }
    
    /**
     * Gets the "valueFile" element
     */
    public java.lang.String getValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEFILE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueFile" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(VALUEFILE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "valueFile" element
     */
    public boolean isSetValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEFILE$14) != 0;
        }
    }
    
    /**
     * Sets the "valueFile" element
     */
    @Inject(optional=true) public void setValueFile(java.lang.String valueFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEFILE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUEFILE$14);
            }
            target.setStringValue(valueFile);
        }
    }
    
    /**
     * Sets (as xml) the "valueFile" element
     */
    public void xsetValueFile(org.apache.xmlbeans.XmlAnyURI valueFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(VALUEFILE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(VALUEFILE$14);
            }
            target.set(valueFile);
        }
    }
    
    /**
     * Unsets the "valueFile" element
     */
    public void unsetValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEFILE$14, 0);
        }
    }
    
    /**
     * Gets the "valueOfParameter" element
     */
    public net.opengis.gml.OperationParameterRefType getValueOfParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterRefType target = null;
            target = (net.opengis.gml.OperationParameterRefType)get_store().find_element_user(VALUEOFPARAMETER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueOfParameter" element
     */
    @Inject(optional=true) public void setValueOfParameter(net.opengis.gml.OperationParameterRefType valueOfParameter)
    {
        generatedSetterHelperImpl(valueOfParameter, VALUEOFPARAMETER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueOfParameter" element
     */
    public net.opengis.gml.OperationParameterRefType addNewValueOfParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterRefType target = null;
            target = (net.opengis.gml.OperationParameterRefType)get_store().add_element_user(VALUEOFPARAMETER$16);
            return target;
        }
    }
}
