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
 * A document containing one DirectedObservation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectedObservationDocumentImpl extends net.opengis.gml.impl.ObservationDocumentImpl implements net.opengis.gml.DirectedObservationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDOBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation");
    private static final org.apache.xmlbeans.QNameSet DIRECTEDOBSERVATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
    });
    
    
    /**
     * Gets the "DirectedObservation" element
     */
    public net.opengis.gml.DirectedObservationType getDirectedObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationType target = null;
            target = (net.opengis.gml.DirectedObservationType)get_store().find_element_user(DIRECTEDOBSERVATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectedObservation" element
     */
    @Inject(optional=true) public void setDirectedObservation(net.opengis.gml.DirectedObservationType directedObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationType target = null;
            target = (net.opengis.gml.DirectedObservationType)get_store().find_element_user(DIRECTEDOBSERVATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DirectedObservationType)get_store().add_element_user(DIRECTEDOBSERVATION$0);
            }
            target.set(directedObservation);
        }
    }
    
    /**
     * Appends and returns a new empty "DirectedObservation" element
     */
    public net.opengis.gml.DirectedObservationType addNewDirectedObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedObservationType target = null;
            target = (net.opengis.gml.DirectedObservationType)get_store().add_element_user(DIRECTEDOBSERVATION$0);
            return target;
        }
    }
}
