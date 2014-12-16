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
 * A document containing one Surface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SurfaceDocument2Impl extends net.opengis.gml.impl.SurfaceDocumentImpl implements net.opengis.gml.SurfaceDocument2
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACE2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Surface");
    private static final org.apache.xmlbeans.QNameSet SURFACE2$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolyhedralSurface"),
    });
    
    
    /**
     * Gets the "Surface" element
     */
    public net.opengis.gml.SurfaceType getSurface2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceType target = null;
            target = (net.opengis.gml.SurfaceType)get_store().find_element_user(SURFACE2$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Surface" element
     */
     public void setSurface2(net.opengis.gml.SurfaceType surface2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceType target = null;
            target = (net.opengis.gml.SurfaceType)get_store().find_element_user(SURFACE2$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.SurfaceType)get_store().add_element_user(SURFACE2$0);
            }
            target.set(surface2);
        }
    }
    
    /**
     * Appends and returns a new empty "Surface" element
     */
    public net.opengis.gml.SurfaceType addNewSurface2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceType target = null;
            target = (net.opengis.gml.SurfaceType)get_store().add_element_user(SURFACE2$0);
            return target;
        }
    }
}
