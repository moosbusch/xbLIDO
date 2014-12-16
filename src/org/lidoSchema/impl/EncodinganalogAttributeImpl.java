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
package org.lidoSchema.impl;  
/**
 * A document containing one encodinganalog(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class EncodinganalogAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.EncodinganalogAttribute
{
    private static final long serialVersionUID = 1L;
    
    public EncodinganalogAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCODINGANALOG$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
    
    
    /**
     * Gets the "encodinganalog" attribute
     */
    public java.lang.String getEncodinganalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "encodinganalog" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEncodinganalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$0);
            return target;
        }
    }
    
    /**
     * True if has "encodinganalog" attribute
     */
    public boolean isSetEncodinganalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCODINGANALOG$0) != null;
        }
    }
    
    /**
     * Sets the "encodinganalog" attribute
     */
     public void setEncodinganalog(java.lang.String encodinganalog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$0);
            }
            target.setStringValue(encodinganalog);
        }
    }
    
    /**
     * Sets (as xml) the "encodinganalog" attribute
     */
    public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$0);
            }
            target.set(encodinganalog);
        }
    }
    
    /**
     * Unsets the "encodinganalog" attribute
     */
    public void unsetEncodinganalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCODINGANALOG$0);
        }
    }
}
