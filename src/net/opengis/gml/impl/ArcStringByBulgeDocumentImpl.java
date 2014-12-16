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
 * A document containing one ArcStringByBulge(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArcStringByBulgeDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.ArcStringByBulgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcStringByBulgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCSTRINGBYBULGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcStringByBulge");
    private static final org.apache.xmlbeans.QNameSet ARCSTRINGBYBULGE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcByBulge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcStringByBulge"),
    });
    
    
    /**
     * Gets the "ArcStringByBulge" element
     */
    public net.opengis.gml.ArcStringByBulgeType getArcStringByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.ArcStringByBulgeType)get_store().find_element_user(ARCSTRINGBYBULGE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcStringByBulge" element
     */
     public void setArcStringByBulge(net.opengis.gml.ArcStringByBulgeType arcStringByBulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.ArcStringByBulgeType)get_store().find_element_user(ARCSTRINGBYBULGE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcStringByBulgeType)get_store().add_element_user(ARCSTRINGBYBULGE$0);
            }
            target.set(arcStringByBulge);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcStringByBulge" element
     */
    public net.opengis.gml.ArcStringByBulgeType addNewArcStringByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.ArcStringByBulgeType)get_store().add_element_user(ARCSTRINGBYBULGE$0);
            return target;
        }
    }
}
