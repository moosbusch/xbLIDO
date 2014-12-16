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
 * A document containing one Envelope(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EnvelopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EnvelopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Envelope");
    private static final org.apache.xmlbeans.QNameSet ENVELOPE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EnvelopeWithTimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Envelope"),
    });
    
    
    /**
     * Gets the "Envelope" element
     */
    public net.opengis.gml.EnvelopeType getEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(ENVELOPE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Envelope" element
     */
     public void setEnvelope(net.opengis.gml.EnvelopeType envelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(ENVELOPE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(ENVELOPE$0);
            }
            target.set(envelope);
        }
    }
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    public net.opengis.gml.EnvelopeType addNewEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(ENVELOPE$0);
            return target;
        }
    }
}
