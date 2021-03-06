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
 * A document containing one _ParametricCurveSurface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ParametricCurveSurfaceDocumentImpl extends net.opengis.gml.impl.SurfacePatchDocumentImpl implements net.opengis.gml.ParametricCurveSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParametricCurveSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETRICCURVESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ParametricCurveSurface");
    private static final org.apache.xmlbeans.QNameSet PARAMETRICCURVESURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ParametricCurveSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cone"),
    });
    
    
    /**
     * Gets the "_ParametricCurveSurface" element
     */
    public net.opengis.gml.AbstractParametricCurveSurfaceType getParametricCurveSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.AbstractParametricCurveSurfaceType)get_store().find_element_user(PARAMETRICCURVESURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_ParametricCurveSurface" element
     */
     public void setParametricCurveSurface(net.opengis.gml.AbstractParametricCurveSurfaceType parametricCurveSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.AbstractParametricCurveSurfaceType)get_store().find_element_user(PARAMETRICCURVESURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractParametricCurveSurfaceType)get_store().add_element_user(PARAMETRICCURVESURFACE$0);
            }
            target.set(parametricCurveSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "_ParametricCurveSurface" element
     */
    public net.opengis.gml.AbstractParametricCurveSurfaceType addNewParametricCurveSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.AbstractParametricCurveSurfaceType)get_store().add_element_user(PARAMETRICCURVESURFACE$0);
            return target;
        }
    }
}
