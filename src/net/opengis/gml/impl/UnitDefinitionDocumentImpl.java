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
 * A document containing one UnitDefinition(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UnitDefinitionDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.UnitDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnitDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UnitDefinition");
    private static final org.apache.xmlbeans.QNameSet UNITDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedUnit"),
    });
    
    
    /**
     * Gets the "UnitDefinition" element
     */
    public net.opengis.gml.UnitDefinitionType getUnitDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitDefinitionType target = null;
            target = (net.opengis.gml.UnitDefinitionType)get_store().find_element_user(UNITDEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnitDefinition" element
     */
     public void setUnitDefinition(net.opengis.gml.UnitDefinitionType unitDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitDefinitionType target = null;
            target = (net.opengis.gml.UnitDefinitionType)get_store().find_element_user(UNITDEFINITION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.UnitDefinitionType)get_store().add_element_user(UNITDEFINITION$0);
            }
            target.set(unitDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "UnitDefinition" element
     */
    public net.opengis.gml.UnitDefinitionType addNewUnitDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitDefinitionType target = null;
            target = (net.opengis.gml.UnitDefinitionType)get_store().add_element_user(UNITDEFINITION$0);
            return target;
        }
    }
}
