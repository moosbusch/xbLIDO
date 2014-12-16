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
 * A document containing one _Surface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SurfaceDocumentImpl extends net.opengis.gml.impl.GeometricPrimitiveDocumentImpl implements net.opengis.gml.SurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface");
    private static final org.apache.xmlbeans.QNameSet SURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSurface"),
    });
    
    
    /**
     * Gets the "_Surface" element
     */
    public net.opengis.gml.AbstractSurfaceType getSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().find_element_user(SURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Surface" element
     */
     public void setSurface(net.opengis.gml.AbstractSurfaceType surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().find_element_user(SURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractSurfaceType)get_store().add_element_user(SURFACE$0);
            }
            target.set(surface);
        }
    }
    
    /**
     * Appends and returns a new empty "_Surface" element
     */
    public net.opengis.gml.AbstractSurfaceType addNewSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().add_element_user(SURFACE$0);
            return target;
        }
    }
}
