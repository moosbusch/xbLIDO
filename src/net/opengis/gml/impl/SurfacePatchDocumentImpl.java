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
 * A document containing one _SurfacePatch(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SurfacePatchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SurfacePatchDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfacePatchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEPATCH$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SurfacePatch");
    private static final org.apache.xmlbeans.QNameSet SURFACEPATCH$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Rectangle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolygonPatch"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ParametricCurveSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SurfacePatch"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Triangle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cone"),
    });
    
    
    /**
     * Gets the "_SurfacePatch" element
     */
    public net.opengis.gml.AbstractSurfacePatchType getSurfacePatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.AbstractSurfacePatchType)get_store().find_element_user(SURFACEPATCH$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_SurfacePatch" element
     */
    @Inject(optional=true) public void setSurfacePatch(net.opengis.gml.AbstractSurfacePatchType surfacePatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.AbstractSurfacePatchType)get_store().find_element_user(SURFACEPATCH$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractSurfacePatchType)get_store().add_element_user(SURFACEPATCH$0);
            }
            target.set(surfacePatch);
        }
    }
    
    /**
     * Appends and returns a new empty "_SurfacePatch" element
     */
    public net.opengis.gml.AbstractSurfacePatchType addNewSurfacePatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfacePatchType target = null;
            target = (net.opengis.gml.AbstractSurfacePatchType)get_store().add_element_user(SURFACEPATCH$0);
            return target;
        }
    }
}
