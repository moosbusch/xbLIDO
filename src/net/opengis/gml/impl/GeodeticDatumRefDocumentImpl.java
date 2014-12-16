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
 * A document containing one geodeticDatumRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeodeticDatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeodeticDatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODETICDATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geodeticDatumRef");
    
    
    /**
     * Gets the "geodeticDatumRef" element
     */
    public net.opengis.gml.GeodeticDatumRefType getGeodeticDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().find_element_user(GEODETICDATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geodeticDatumRef" element
     */
     public void setGeodeticDatumRef(net.opengis.gml.GeodeticDatumRefType geodeticDatumRef)
    {
        generatedSetterHelperImpl(geodeticDatumRef, GEODETICDATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geodeticDatumRef" element
     */
    public net.opengis.gml.GeodeticDatumRefType addNewGeodeticDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().add_element_user(GEODETICDATUMREF$0);
            return target;
        }
    }
}
