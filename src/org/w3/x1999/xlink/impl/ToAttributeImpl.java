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
package org.w3.x1999.xlink.impl;  
/**
 * A document containing one to(@http://www.w3.org/1999/xlink) attribute.
 *
 * This is a complex type.
 */
public class ToAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.ToAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ToAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TO$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "to");
    
    
    /**
     * Gets the "to" attribute
     */
    public java.lang.String getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "to" attribute
     */
    public org.w3.x1999.xlink.ToType xgetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ToType target = null;
            target = (org.w3.x1999.xlink.ToType)get_store().find_attribute_user(TO$0);
            return target;
        }
    }
    
    /**
     * True if has "to" attribute
     */
    public boolean isSetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TO$0) != null;
        }
    }
    
    /**
     * Sets the "to" attribute
     */
     public void setTo(java.lang.String to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$0);
            }
            target.setStringValue(to);
        }
    }
    
    /**
     * Sets (as xml) the "to" attribute
     */
    public void xsetTo(org.w3.x1999.xlink.ToType to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ToType target = null;
            target = (org.w3.x1999.xlink.ToType)get_store().find_attribute_user(TO$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ToType)get_store().add_attribute_user(TO$0);
            }
            target.set(to);
        }
    }
    
    /**
     * Unsets the "to" attribute
     */
    public void unsetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TO$0);
        }
    }
}
