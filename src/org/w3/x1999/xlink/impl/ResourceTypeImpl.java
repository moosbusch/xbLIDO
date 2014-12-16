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
 * An XML resourceType(@http://www.w3.org/1999/xlink).
 *
 * This is a complex type.
 */
public class ResourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.ResourceType
{
    private static final long serialVersionUID = 1L;
    
    public ResourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type");
    private static final javax.xml.namespace.QName ROLE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role");
    private static final javax.xml.namespace.QName TITLE$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName LABEL$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "label");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.TypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TypeType target = null;
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_default_attribute_value(TYPE$0);
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
     public void setType(org.w3.x1999.xlink.TypeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.w3.x1999.xlink.TypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TypeType target = null;
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "role" attribute
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public org.w3.x1999.xlink.RoleType xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.RoleType target = null;
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$2);
            return target;
        }
    }
    
    /**
     * True if has "role" attribute
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLE$2) != null;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
     public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$2);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.w3.x1999.xlink.RoleType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.RoleType target = null;
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$2);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.RoleType)get_store().add_attribute_user(ROLE$2);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" attribute
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLE$2);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.w3.x1999.xlink.TitleAttrType xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE$4);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$4) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
     public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$4);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.w3.x1999.xlink.TitleAttrType title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE$4);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TitleAttrType)get_store().add_attribute_user(TITLE$4);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$4);
        }
    }
    
    /**
     * Gets the "label" attribute
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "label" attribute
     */
    public org.w3.x1999.xlink.LabelType xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.LabelType target = null;
            target = (org.w3.x1999.xlink.LabelType)get_store().find_attribute_user(LABEL$6);
            return target;
        }
    }
    
    /**
     * True if has "label" attribute
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABEL$6) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
     public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$6);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" attribute
     */
    public void xsetLabel(org.w3.x1999.xlink.LabelType label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.LabelType target = null;
            target = (org.w3.x1999.xlink.LabelType)get_store().find_attribute_user(LABEL$6);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.LabelType)get_store().add_attribute_user(LABEL$6);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "label" attribute
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABEL$6);
        }
    }
}
