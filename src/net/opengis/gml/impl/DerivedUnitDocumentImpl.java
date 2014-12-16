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
 * A document containing one DerivedUnit(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DerivedUnitDocumentImpl extends net.opengis.gml.impl.UnitDefinitionDocumentImpl implements net.opengis.gml.DerivedUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedUnit");
    
    
    /**
     * Gets the "DerivedUnit" element
     */
    public net.opengis.gml.DerivedUnitType getDerivedUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedUnitType target = null;
            target = (net.opengis.gml.DerivedUnitType)get_store().find_element_user(DERIVEDUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DerivedUnit" element
     */
     public void setDerivedUnit(net.opengis.gml.DerivedUnitType derivedUnit)
    {
        generatedSetterHelperImpl(derivedUnit, DERIVEDUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DerivedUnit" element
     */
    public net.opengis.gml.DerivedUnitType addNewDerivedUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedUnitType target = null;
            target = (net.opengis.gml.DerivedUnitType)get_store().add_element_user(DERIVEDUNIT$0);
            return target;
        }
    }
}
