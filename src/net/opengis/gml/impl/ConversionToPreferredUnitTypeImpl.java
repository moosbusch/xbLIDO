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
 * An XML ConversionToPreferredUnitType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ConversionToPreferredUnitTypeImpl extends net.opengis.gml.impl.UnitOfMeasureTypeImpl implements net.opengis.gml.ConversionToPreferredUnitType
{
    private static final long serialVersionUID = 1L;
    
    public ConversionToPreferredUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACTOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "factor");
    private static final javax.xml.namespace.QName FORMULA$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "formula");
    
    
    /**
     * Gets the "factor" element
     */
    public double getFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACTOR$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "factor" element
     */
    public org.apache.xmlbeans.XmlDouble xgetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(FACTOR$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "factor" element
     */
    public boolean isSetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FACTOR$0) != 0;
        }
    }
    
    /**
     * Sets the "factor" element
     */
     public void setFactor(double factor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACTOR$0);
            }
            target.setDoubleValue(factor);
        }
    }
    
    /**
     * Sets (as xml) the "factor" element
     */
    public void xsetFactor(org.apache.xmlbeans.XmlDouble factor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(FACTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(FACTOR$0);
            }
            target.set(factor);
        }
    }
    
    /**
     * Unsets the "factor" element
     */
    public void unsetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FACTOR$0, 0);
        }
    }
    
    /**
     * Gets the "formula" element
     */
    public net.opengis.gml.FormulaType getFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FormulaType target = null;
            target = (net.opengis.gml.FormulaType)get_store().find_element_user(FORMULA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "formula" element
     */
    public boolean isSetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMULA$2) != 0;
        }
    }
    
    /**
     * Sets the "formula" element
     */
     public void setFormula(net.opengis.gml.FormulaType formula)
    {
        generatedSetterHelperImpl(formula, FORMULA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "formula" element
     */
    public net.opengis.gml.FormulaType addNewFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FormulaType target = null;
            target = (net.opengis.gml.FormulaType)get_store().add_element_user(FORMULA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "formula" element
     */
    public void unsetFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMULA$2, 0);
        }
    }
}
