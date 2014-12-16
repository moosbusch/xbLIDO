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
 * A document containing one Observation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ObservationDocumentImpl extends net.opengis.gml.impl.FeatureDocumentImpl implements net.opengis.gml.ObservationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObservationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBSERVATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation");
    private static final org.apache.xmlbeans.QNameSet OBSERVATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
    });
    
    
    /**
     * Gets the "Observation" element
     */
    public net.opengis.gml.ObservationType getObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObservationType target = null;
            target = (net.opengis.gml.ObservationType)get_store().find_element_user(OBSERVATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Observation" element
     */
     public void setObservation(net.opengis.gml.ObservationType observation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObservationType target = null;
            target = (net.opengis.gml.ObservationType)get_store().find_element_user(OBSERVATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ObservationType)get_store().add_element_user(OBSERVATION$0);
            }
            target.set(observation);
        }
    }
    
    /**
     * Appends and returns a new empty "Observation" element
     */
    public net.opengis.gml.ObservationType addNewObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObservationType target = null;
            target = (net.opengis.gml.ObservationType)get_store().add_element_user(OBSERVATION$0);
            return target;
        }
    }
}
