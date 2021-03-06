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
 * A document containing one DirectedObservationAtDistance(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectedObservationAtDistanceDocumentImpl extends net.opengis.gml.impl.DirectedObservationDocumentImpl implements net.opengis.gml.DirectedObservationAtDistanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationAtDistanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDOBSERVATIONATDISTANCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance");
    
    
    /**
     * Gets the "DirectedObservationAtDistance" element
     */
    public net.opengis.gml.DirectedObservationAtDistanceType getDirectedObservationAtDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationAtDistanceType target = null;
            target = (net.opengis.gml.DirectedObservationAtDistanceType)get_store().find_element_user(DIRECTEDOBSERVATIONATDISTANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectedObservationAtDistance" element
     */
     public void setDirectedObservationAtDistance(net.opengis.gml.DirectedObservationAtDistanceType directedObservationAtDistance)
    {
        generatedSetterHelperImpl(directedObservationAtDistance, DIRECTEDOBSERVATIONATDISTANCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DirectedObservationAtDistance" element
     */
    public net.opengis.gml.DirectedObservationAtDistanceType addNewDirectedObservationAtDistance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationAtDistanceType target = null;
            target = (net.opengis.gml.DirectedObservationAtDistanceType)get_store().add_element_user(DIRECTEDOBSERVATIONATDISTANCE$0);
            return target;
        }
    }
}
