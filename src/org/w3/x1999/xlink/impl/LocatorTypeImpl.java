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
 * An XML locatorType(@http://www.w3.org/1999/xlink).
 *
 * This is a complex type.
 */
public class LocatorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.LocatorType
{
    private static final long serialVersionUID = 1L;
    
    public LocatorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type");
    private static final javax.xml.namespace.QName HREF$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href");
    private static final javax.xml.namespace.QName ROLE$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role");
    private static final javax.xml.namespace.QName TITLE2$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName LABEL$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "label");
    
    
    /**
     * Gets a List of "title" elements
     */
    public java.util.List<org.w3.x1999.xlink.TitleEltType> getTitleList()
    {
        final class TitleList extends java.util.AbstractList<org.w3.x1999.xlink.TitleEltType>
        {
            @Override
            public org.w3.x1999.xlink.TitleEltType get(int i)
                { return LocatorTypeImpl.this.getTitleArray(i); }
            
            @Override
            public org.w3.x1999.xlink.TitleEltType set(int i, org.w3.x1999.xlink.TitleEltType o)
            {
                org.w3.x1999.xlink.TitleEltType old = LocatorTypeImpl.this.getTitleArray(i);
                LocatorTypeImpl.this.setTitleArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x1999.xlink.TitleEltType o)
                { LocatorTypeImpl.this.insertNewTitle(i).set(o); }
            
            @Override
            public org.w3.x1999.xlink.TitleEltType remove(int i)
            {
                org.w3.x1999.xlink.TitleEltType old = LocatorTypeImpl.this.getTitleArray(i);
                LocatorTypeImpl.this.removeTitle(i);
                return old;
            }
            
            @Override
            public int size()
                { return LocatorTypeImpl.this.sizeOfTitleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TitleList();
        }
    }
    
    /**
     * Gets array of all "title" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x1999.xlink.TitleEltType[] getTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x1999.xlink.TitleEltType> targetList = new java.util.ArrayList<org.w3.x1999.xlink.TitleEltType>();
            get_store().find_all_element_users(TITLE2$8, targetList);
            org.w3.x1999.xlink.TitleEltType[] result = new org.w3.x1999.xlink.TitleEltType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "title" element
     */
    public org.w3.x1999.xlink.TitleEltType getTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleEltType target = null;
            target = (org.w3.x1999.xlink.TitleEltType)get_store().find_element_user(TITLE2$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "title" element
     */
    public int sizeOfTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE2$8);
        }
    }
    
    /**
     * Sets array of all "title" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setTitleArray(org.w3.x1999.xlink.TitleEltType[] titleArray)
    {
        check_orphaned();
        arraySetterHelper(titleArray, TITLE2$8);
    }
    
    /**
     * Sets ith "title" element
     */
     public void setTitleArray(int i, org.w3.x1999.xlink.TitleEltType title)
    {
        generatedSetterHelperImpl(title, TITLE2$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    public org.w3.x1999.xlink.TitleEltType insertNewTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleEltType target = null;
            target = (org.w3.x1999.xlink.TitleEltType)get_store().insert_element_user(TITLE2$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    public org.w3.x1999.xlink.TitleEltType addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleEltType target = null;
            target = (org.w3.x1999.xlink.TitleEltType)get_store().add_element_user(TITLE2$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "title" element
     */
    public void removeTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE2$8, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
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
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_default_attribute_value(TYPE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
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
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.w3.x1999.xlink.HrefType xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.HrefType target = null;
            target = (org.w3.x1999.xlink.HrefType)get_store().find_attribute_user(HREF$4);
            return target;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
     public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$4);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.w3.x1999.xlink.HrefType href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.HrefType target = null;
            target = (org.w3.x1999.xlink.HrefType)get_store().find_attribute_user(HREF$4);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.HrefType)get_store().add_attribute_user(HREF$4);
            }
            target.set(href);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$6);
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
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$6);
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
            return get_store().find_attribute_user(ROLE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$6);
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
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$6);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.RoleType)get_store().add_attribute_user(ROLE$6);
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
            get_store().remove_attribute(ROLE$6);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE2$8);
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
    public org.w3.x1999.xlink.TitleAttrType xgetTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE2$8);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE2$8) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
     public void setTitle2(java.lang.String title2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE2$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE2$8);
            }
            target.setStringValue(title2);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle2(org.w3.x1999.xlink.TitleAttrType title2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE2$8);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TitleAttrType)get_store().add_attribute_user(TITLE2$8);
            }
            target.set(title2);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE2$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$10);
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
            target = (org.w3.x1999.xlink.LabelType)get_store().find_attribute_user(LABEL$10);
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
            return get_store().find_attribute_user(LABEL$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$10);
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
            target = (org.w3.x1999.xlink.LabelType)get_store().find_attribute_user(LABEL$10);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.LabelType)get_store().add_attribute_user(LABEL$10);
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
            get_store().remove_attribute(LABEL$10);
        }
    }
}
