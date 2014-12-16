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
 * A document containing one derivationUnitTerm(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DerivationUnitTermDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DerivationUnitTermDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivationUnitTermDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVATIONUNITTERM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivationUnitTerm");
    
    
    /**
     * Gets the "derivationUnitTerm" element
     */
    public net.opengis.gml.DerivationUnitTermType getDerivationUnitTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivationUnitTermType target = null;
            target = (net.opengis.gml.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivationUnitTerm" element
     */
     public void setDerivationUnitTerm(net.opengis.gml.DerivationUnitTermType derivationUnitTerm)
    {
        generatedSetterHelperImpl(derivationUnitTerm, DERIVATIONUNITTERM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivationUnitTerm" element
     */
    public net.opengis.gml.DerivationUnitTermType addNewDerivationUnitTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivationUnitTermType target = null;
            target = (net.opengis.gml.DerivationUnitTermType)get_store().add_element_user(DERIVATIONUNITTERM$0);
            return target;
        }
    }
}
