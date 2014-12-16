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
 * A document containing one interior(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class InteriorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.InteriorDocument
{
    private static final long serialVersionUID = 1L;
    
    public InteriorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "interior");
    private static final org.apache.xmlbeans.QNameSet INTERIOR$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "innerBoundaryIs"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "interior"),
    });
    
    
    /**
     * Gets the "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType getInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interior" element
     */
     public void setInterior(net.opengis.gml.AbstractRingPropertyType interior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(INTERIOR$0);
            }
            target.set(interior);
        }
    }
    
    /**
     * Appends and returns a new empty "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(INTERIOR$0);
            return target;
        }
    }
}
