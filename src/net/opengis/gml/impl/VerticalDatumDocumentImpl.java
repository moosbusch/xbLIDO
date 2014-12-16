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
 * A document containing one VerticalDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class VerticalDatumDocumentImpl extends net.opengis.gml.impl.DatumDocumentImpl implements net.opengis.gml.VerticalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalDatum");
    
    
    /**
     * Gets the "VerticalDatum" element
     */
    public net.opengis.gml.VerticalDatumType getVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumType target = null;
            target = (net.opengis.gml.VerticalDatumType)get_store().find_element_user(VERTICALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerticalDatum" element
     */
     public void setVerticalDatum(net.opengis.gml.VerticalDatumType verticalDatum)
    {
        generatedSetterHelperImpl(verticalDatum, VERTICALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerticalDatum" element
     */
    public net.opengis.gml.VerticalDatumType addNewVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumType target = null;
            target = (net.opengis.gml.VerticalDatumType)get_store().add_element_user(VERTICALDATUM$0);
            return target;
        }
    }
}
