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
 * A document containing one _GeneralConversion(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralConversionDocumentImpl extends net.opengis.gml.impl.OperationDocumentImpl implements net.opengis.gml.GeneralConversionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralConversionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALCONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion");
    private static final org.apache.xmlbeans.QNameSet GENERALCONVERSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion"),
    });
    
    
    /**
     * Gets the "_GeneralConversion" element
     */
    public net.opengis.gml.AbstractGeneralConversionType getGeneralConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.AbstractGeneralConversionType)get_store().find_element_user(GENERALCONVERSION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeneralConversion" element
     */
     public void setGeneralConversion(net.opengis.gml.AbstractGeneralConversionType generalConversion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.AbstractGeneralConversionType)get_store().find_element_user(GENERALCONVERSION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeneralConversionType)get_store().add_element_user(GENERALCONVERSION$0);
            }
            target.set(generalConversion);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeneralConversion" element
     */
    public net.opengis.gml.AbstractGeneralConversionType addNewGeneralConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralConversionType target = null;
            target = (net.opengis.gml.AbstractGeneralConversionType)get_store().add_element_user(GENERALCONVERSION$0);
            return target;
        }
    }
}
