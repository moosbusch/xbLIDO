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
 * A document containing one Arc(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArcDocumentImpl extends net.opengis.gml.impl.ArcStringDocumentImpl implements net.opengis.gml.ArcDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARC$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Arc");
    private static final org.apache.xmlbeans.QNameSet ARC$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Arc"),
    });
    
    
    /**
     * Gets the "Arc" element
     */
    public net.opengis.gml.ArcType getArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcType target = null;
            target = (net.opengis.gml.ArcType)get_store().find_element_user(ARC$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Arc" element
     */
     public void setArc(net.opengis.gml.ArcType arc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcType target = null;
            target = (net.opengis.gml.ArcType)get_store().find_element_user(ARC$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcType)get_store().add_element_user(ARC$0);
            }
            target.set(arc);
        }
    }
    
    /**
     * Appends and returns a new empty "Arc" element
     */
    public net.opengis.gml.ArcType addNewArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcType target = null;
            target = (net.opengis.gml.ArcType)get_store().add_element_user(ARC$0);
            return target;
        }
    }
}
