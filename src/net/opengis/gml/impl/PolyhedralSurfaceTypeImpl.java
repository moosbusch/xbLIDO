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
 * An XML PolyhedralSurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PolyhedralSurfaceTypeImpl extends net.opengis.gml.impl.SurfaceTypeImpl implements net.opengis.gml.PolyhedralSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public PolyhedralSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONPATCHES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polygonPatches");
    
    
    /**
     * Gets the "polygonPatches" element
     */
    public net.opengis.gml.PolygonPatchArrayPropertyType getPolygonPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchArrayPropertyType target = null;
            target = (net.opengis.gml.PolygonPatchArrayPropertyType)get_store().find_element_user(POLYGONPATCHES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polygonPatches" element
     */
     public void setPolygonPatches(net.opengis.gml.PolygonPatchArrayPropertyType polygonPatches)
    {
        generatedSetterHelperImpl(polygonPatches, POLYGONPATCHES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "polygonPatches" element
     */
    public net.opengis.gml.PolygonPatchArrayPropertyType addNewPolygonPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchArrayPropertyType target = null;
            target = (net.opengis.gml.PolygonPatchArrayPropertyType)get_store().add_element_user(POLYGONPATCHES$0);
            return target;
        }
    }
}
