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
 * An XML DirectedObservationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DirectedObservationTypeImpl extends net.opengis.gml.impl.ObservationTypeImpl implements net.opengis.gml.DirectedObservationType
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "direction");
    
    
    /**
     * Gets the "direction" element
     */
    public net.opengis.gml.DirectionPropertyType getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionPropertyType target = null;
            target = (net.opengis.gml.DirectionPropertyType)get_store().find_element_user(DIRECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "direction" element
     */
     public void setDirection(net.opengis.gml.DirectionPropertyType direction)
    {
        generatedSetterHelperImpl(direction, DIRECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "direction" element
     */
    public net.opengis.gml.DirectionPropertyType addNewDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionPropertyType target = null;
            target = (net.opengis.gml.DirectionPropertyType)get_store().add_element_user(DIRECTION$0);
            return target;
        }
    }
}
