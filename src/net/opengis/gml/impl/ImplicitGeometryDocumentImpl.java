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
 * A document containing one _ImplicitGeometry(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ImplicitGeometryDocumentImpl extends net.opengis.gml.impl.GeometryDocumentImpl implements net.opengis.gml.ImplicitGeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImplicitGeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLICITGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ImplicitGeometry");
    private static final org.apache.xmlbeans.QNameSet IMPLICITGEOMETRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Grid"),
    });
    
    
    /**
     * Gets the "_ImplicitGeometry" element
     */
    public net.opengis.gml.AbstractGeometryType getImplicitGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().find_element_user(IMPLICITGEOMETRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_ImplicitGeometry" element
     */
     public void setImplicitGeometry(net.opengis.gml.AbstractGeometryType implicitGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().find_element_user(IMPLICITGEOMETRY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeometryType)get_store().add_element_user(IMPLICITGEOMETRY$0);
            }
            target.set(implicitGeometry);
        }
    }
    
    /**
     * Appends and returns a new empty "_ImplicitGeometry" element
     */
    public net.opengis.gml.AbstractGeometryType addNewImplicitGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().add_element_user(IMPLICITGEOMETRY$0);
            return target;
        }
    }
}
