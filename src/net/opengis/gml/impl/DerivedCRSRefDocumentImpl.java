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
 * A document containing one derivedCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DerivedCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DerivedCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivedCRSRef");
    
    
    /**
     * Gets the "derivedCRSRef" element
     */
    public net.opengis.gml.DerivedCRSRefType getDerivedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSRefType target = null;
            target = (net.opengis.gml.DerivedCRSRefType)get_store().find_element_user(DERIVEDCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedCRSRef" element
     */
     public void setDerivedCRSRef(net.opengis.gml.DerivedCRSRefType derivedCRSRef)
    {
        generatedSetterHelperImpl(derivedCRSRef, DERIVEDCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivedCRSRef" element
     */
    public net.opengis.gml.DerivedCRSRefType addNewDerivedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSRefType target = null;
            target = (net.opengis.gml.DerivedCRSRefType)get_store().add_element_user(DERIVEDCRSREF$0);
            return target;
        }
    }
}
