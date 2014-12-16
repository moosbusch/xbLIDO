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
 * An XML SurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class SurfaceTypeImpl extends net.opengis.gml.impl.AbstractSurfaceTypeImpl implements net.opengis.gml.SurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATCHES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "patches");
    private static final org.apache.xmlbeans.QNameSet PATCHES$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "patches"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "trianglePatches"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polygonPatches"),
    });
    
    
    /**
     * Gets the "patches" element
     */
    public net.opengis.gml.SurfacePatchArrayPropertyType getPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.SurfacePatchArrayPropertyType)get_store().find_element_user(PATCHES$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "patches" element
     */
     public void setPatches(net.opengis.gml.SurfacePatchArrayPropertyType patches)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.SurfacePatchArrayPropertyType)get_store().find_element_user(PATCHES$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.SurfacePatchArrayPropertyType)get_store().add_element_user(PATCHES$0);
            }
            target.set(patches);
        }
    }
    
    /**
     * Appends and returns a new empty "patches" element
     */
    public net.opengis.gml.SurfacePatchArrayPropertyType addNewPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.SurfacePatchArrayPropertyType)get_store().add_element_user(PATCHES$0);
            return target;
        }
    }
}
