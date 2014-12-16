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
 * A document containing one coord(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coord");
    
    
    /**
     * Gets the "coord" element
     */
    public net.opengis.gml.CoordType getCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordType target = null;
            target = (net.opengis.gml.CoordType)get_store().find_element_user(COORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coord" element
     */
     public void setCoord(net.opengis.gml.CoordType coord)
    {
        generatedSetterHelperImpl(coord, COORD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coord" element
     */
    public net.opengis.gml.CoordType addNewCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordType target = null;
            target = (net.opengis.gml.CoordType)get_store().add_element_user(COORD$0);
            return target;
        }
    }
}
