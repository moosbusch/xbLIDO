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
 * A document containing one relatedencoding(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class RelatedencodingAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RelatedencodingAttribute
{
    private static final long serialVersionUID = 1L;
    
    public RelatedencodingAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDENCODING$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedencoding");
    
    
    /**
     * Gets the "relatedencoding" attribute
     */
    public java.lang.String getRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relatedencoding" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$0);
            return target;
        }
    }
    
    /**
     * True if has "relatedencoding" attribute
     */
    public boolean isSetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATEDENCODING$0) != null;
        }
    }
    
    /**
     * Sets the "relatedencoding" attribute
     */
     public void setRelatedencoding(java.lang.String relatedencoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATEDENCODING$0);
            }
            target.setStringValue(relatedencoding);
        }
    }
    
    /**
     * Sets (as xml) the "relatedencoding" attribute
     */
    public void xsetRelatedencoding(org.apache.xmlbeans.XmlString relatedencoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATEDENCODING$0);
            }
            target.set(relatedencoding);
        }
    }
    
    /**
     * Unsets the "relatedencoding" attribute
     */
    public void unsetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATEDENCODING$0);
        }
    }
}
