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
 * A document containing one ArcString(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArcStringDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.ArcStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCSTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcString");
    private static final org.apache.xmlbeans.QNameSet ARCSTRING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Arc"),
    });
    
    
    /**
     * Gets the "ArcString" element
     */
    public net.opengis.gml.ArcStringType getArcString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringType target = null;
            target = (net.opengis.gml.ArcStringType)get_store().find_element_user(ARCSTRING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcString" element
     */
     public void setArcString(net.opengis.gml.ArcStringType arcString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringType target = null;
            target = (net.opengis.gml.ArcStringType)get_store().find_element_user(ARCSTRING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcStringType)get_store().add_element_user(ARCSTRING$0);
            }
            target.set(arcString);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcString" element
     */
    public net.opengis.gml.ArcStringType addNewArcString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringType target = null;
            target = (net.opengis.gml.ArcStringType)get_store().add_element_user(ARCSTRING$0);
            return target;
        }
    }
}
