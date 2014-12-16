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
 * A document containing one sphericalCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SphericalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SphericalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public SphericalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPHERICALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "sphericalCSRef");
    
    
    /**
     * Gets the "sphericalCSRef" element
     */
    public net.opengis.gml.SphericalCSRefType getSphericalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphericalCSRefType target = null;
            target = (net.opengis.gml.SphericalCSRefType)get_store().find_element_user(SPHERICALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sphericalCSRef" element
     */
     public void setSphericalCSRef(net.opengis.gml.SphericalCSRefType sphericalCSRef)
    {
        generatedSetterHelperImpl(sphericalCSRef, SPHERICALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sphericalCSRef" element
     */
    public net.opengis.gml.SphericalCSRefType addNewSphericalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphericalCSRefType target = null;
            target = (net.opengis.gml.SphericalCSRefType)get_store().add_element_user(SPHERICALCSREF$0);
            return target;
        }
    }
}
