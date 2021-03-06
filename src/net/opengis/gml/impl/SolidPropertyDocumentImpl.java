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
 * A document containing one solidProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SolidPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SolidPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "solidProperty");
    
    
    /**
     * Gets the "solidProperty" element
     */
    public net.opengis.gml.SolidPropertyType getSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().find_element_user(SOLIDPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solidProperty" element
     */
     public void setSolidProperty(net.opengis.gml.SolidPropertyType solidProperty)
    {
        generatedSetterHelperImpl(solidProperty, SOLIDPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidProperty" element
     */
    public net.opengis.gml.SolidPropertyType addNewSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().add_element_user(SOLIDPROPERTY$0);
            return target;
        }
    }
}
