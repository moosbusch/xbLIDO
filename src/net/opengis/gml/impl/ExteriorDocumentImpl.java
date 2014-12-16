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
 * A document containing one exterior(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ExteriorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ExteriorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExteriorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "exterior");
    private static final org.apache.xmlbeans.QNameSet EXTERIOR$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "outerBoundaryIs"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "exterior"),
    });
    
    
    /**
     * Gets the "exterior" element
     */
    public net.opengis.gml.AbstractRingPropertyType getExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exterior" element
     */
     public void setExterior(net.opengis.gml.AbstractRingPropertyType exterior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            }
            target.set(exterior);
        }
    }
    
    /**
     * Appends and returns a new empty "exterior" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            return target;
        }
    }
}
