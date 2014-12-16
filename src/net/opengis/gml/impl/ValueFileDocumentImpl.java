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
 * A document containing one valueFile(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ValueFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValueFileDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEFILE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueFile");
    
    
    /**
     * Gets the "valueFile" element
     */
    public java.lang.String getValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueFile" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(VALUEFILE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "valueFile" element
     */
     public void setValueFile(java.lang.String valueFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEFILE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUEFILE$0);
            }
            target.setStringValue(valueFile);
        }
    }
    
    /**
     * Sets (as xml) the "valueFile" element
     */
    public void xsetValueFile(org.apache.xmlbeans.XmlAnyURI valueFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(VALUEFILE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(VALUEFILE$0);
            }
            target.set(valueFile);
        }
    }
}
