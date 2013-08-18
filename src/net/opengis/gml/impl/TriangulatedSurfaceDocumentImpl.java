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
 * A document containing one TriangulatedSurface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TriangulatedSurfaceDocumentImpl extends net.opengis.gml.impl.SurfaceDocument2Impl implements net.opengis.gml.TriangulatedSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TriangulatedSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIANGULATEDSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface");
    private static final org.apache.xmlbeans.QNameSet TRIANGULATEDSURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface"),
    });
    
    
    /**
     * Gets the "TriangulatedSurface" element
     */
    public net.opengis.gml.TriangulatedSurfaceType getTriangulatedSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TriangulatedSurfaceType target = null;
            target = (net.opengis.gml.TriangulatedSurfaceType)get_store().find_element_user(TRIANGULATEDSURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TriangulatedSurface" element
     */
    @Inject(optional=true) public void setTriangulatedSurface(net.opengis.gml.TriangulatedSurfaceType triangulatedSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TriangulatedSurfaceType target = null;
            target = (net.opengis.gml.TriangulatedSurfaceType)get_store().find_element_user(TRIANGULATEDSURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.TriangulatedSurfaceType)get_store().add_element_user(TRIANGULATEDSURFACE$0);
            }
            target.set(triangulatedSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "TriangulatedSurface" element
     */
    public net.opengis.gml.TriangulatedSurfaceType addNewTriangulatedSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TriangulatedSurfaceType target = null;
            target = (net.opengis.gml.TriangulatedSurfaceType)get_store().add_element_user(TRIANGULATEDSURFACE$0);
            return target;
        }
    }
}
