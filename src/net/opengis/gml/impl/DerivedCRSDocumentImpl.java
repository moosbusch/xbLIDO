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
 * A document containing one DerivedCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DerivedCRSDocumentImpl extends net.opengis.gml.impl.GeneralDerivedCRSDocumentImpl implements net.opengis.gml.DerivedCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS");
    
    
    /**
     * Gets the "DerivedCRS" element
     */
    public net.opengis.gml.DerivedCRSType getDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSType target = null;
            target = (net.opengis.gml.DerivedCRSType)get_store().find_element_user(DERIVEDCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DerivedCRS" element
     */
     public void setDerivedCRS(net.opengis.gml.DerivedCRSType derivedCRS)
    {
        generatedSetterHelperImpl(derivedCRS, DERIVEDCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DerivedCRS" element
     */
    public net.opengis.gml.DerivedCRSType addNewDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSType target = null;
            target = (net.opengis.gml.DerivedCRSType)get_store().add_element_user(DERIVEDCRS$0);
            return target;
        }
    }
}
