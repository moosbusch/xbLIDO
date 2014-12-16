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
 * An XML BaseUnitType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class BaseUnitTypeImpl extends net.opengis.gml.impl.UnitDefinitionTypeImpl implements net.opengis.gml.BaseUnitType
{
    private static final long serialVersionUID = 1L;
    
    public BaseUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITSSYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "unitsSystem");
    
    
    /**
     * Gets the "unitsSystem" element
     */
    public net.opengis.gml.ReferenceType getUnitsSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().find_element_user(UNITSSYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unitsSystem" element
     */
     public void setUnitsSystem(net.opengis.gml.ReferenceType unitsSystem)
    {
        generatedSetterHelperImpl(unitsSystem, UNITSSYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "unitsSystem" element
     */
    public net.opengis.gml.ReferenceType addNewUnitsSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().add_element_user(UNITSSYSTEM$0);
            return target;
        }
    }
}
