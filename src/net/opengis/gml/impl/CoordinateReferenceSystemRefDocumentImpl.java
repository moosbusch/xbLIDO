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
 * A document containing one coordinateReferenceSystemRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateReferenceSystemRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordinateReferenceSystemRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateReferenceSystemRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEREFERENCESYSTEMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateReferenceSystemRef");
    
    
    /**
     * Gets the "coordinateReferenceSystemRef" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType getCoordinateReferenceSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().find_element_user(COORDINATEREFERENCESYSTEMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateReferenceSystemRef" element
     */
     public void setCoordinateReferenceSystemRef(net.opengis.gml.CoordinateReferenceSystemRefType coordinateReferenceSystemRef)
    {
        generatedSetterHelperImpl(coordinateReferenceSystemRef, COORDINATEREFERENCESYSTEMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateReferenceSystemRef" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType addNewCoordinateReferenceSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().add_element_user(COORDINATEREFERENCESYSTEMREF$0);
            return target;
        }
    }
}
