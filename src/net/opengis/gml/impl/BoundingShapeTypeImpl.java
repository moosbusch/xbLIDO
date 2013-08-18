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
 * An XML BoundingShapeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class BoundingShapeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BoundingShapeType
{
    private static final long serialVersionUID = 1L;
    
    public BoundingShapeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Envelope");
    private static final org.apache.xmlbeans.QNameSet ENVELOPE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EnvelopeWithTimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Envelope"),
    });
    private static final javax.xml.namespace.QName NULL$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Null");
    
    
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
     * True if has "Envelope" element
     */
    public boolean isSetEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVELOPE$1) != 0;
        }
    }
    
    /**
     * Sets the "Envelope" element
     */
    @Inject(optional=true) public void setEnvelope(net.opengis.gml.EnvelopeType envelope)
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
    
    /**
     * Unsets the "Envelope" element
     */
    public void unsetEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVELOPE$1, 0);
        }
    }
    
    /**
     * Gets the "Null" element
     */
    public java.lang.Object getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "Null" element
     */
    public net.opengis.gml.NullType xgetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Null" element
     */
    public boolean isSetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$2) != 0;
        }
    }
    
    /**
     * Sets the "Null" element
     */
    @Inject(optional=true) public void setNull(java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NULL$2);
            }
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Sets (as xml) the "Null" element
     */
    public void xsetNull(net.opengis.gml.NullType xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.NullType)get_store().add_element_user(NULL$2);
            }
            target.set(xnull);
        }
    }
    
    /**
     * Unsets the "Null" element
     */
    public void unsetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$2, 0);
        }
    }
}
