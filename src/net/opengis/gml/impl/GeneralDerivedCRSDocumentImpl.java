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
 * A document containing one _GeneralDerivedCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralDerivedCRSDocumentImpl extends net.opengis.gml.impl.CoordinateReferenceSystemDocumentImpl implements net.opengis.gml.GeneralDerivedCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralDerivedCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALDERIVEDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS");
    private static final org.apache.xmlbeans.QNameSet GENERALDERIVEDCRS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS"),
    });
    
    
    /**
     * Gets the "_GeneralDerivedCRS" element
     */
    public net.opengis.gml.AbstractGeneralDerivedCRSType getGeneralDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.AbstractGeneralDerivedCRSType)get_store().find_element_user(GENERALDERIVEDCRS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeneralDerivedCRS" element
     */
     public void setGeneralDerivedCRS(net.opengis.gml.AbstractGeneralDerivedCRSType generalDerivedCRS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.AbstractGeneralDerivedCRSType)get_store().find_element_user(GENERALDERIVEDCRS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeneralDerivedCRSType)get_store().add_element_user(GENERALDERIVEDCRS$0);
            }
            target.set(generalDerivedCRS);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeneralDerivedCRS" element
     */
    public net.opengis.gml.AbstractGeneralDerivedCRSType addNewGeneralDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.AbstractGeneralDerivedCRSType)get_store().add_element_user(GENERALDERIVEDCRS$0);
            return target;
        }
    }
}
