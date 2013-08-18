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
package org.w3.x2001.smil20.impl;

import com.google.inject.Inject;

/**
 * An XML setPrototype(@http://www.w3.org/2001/SMIL20/).
 *
 * This is a complex type.
 */
public class SetPrototypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.smil20.SetPrototype
{
    private static final long serialVersionUID = 1L;

    public SetPrototypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ATTRIBUTENAME$0 =
        new javax.xml.namespace.QName("", "attributeName");
    private static final javax.xml.namespace.QName ATTRIBUTETYPE$2 =
        new javax.xml.namespace.QName("", "attributeType");
    private static final javax.xml.namespace.QName TO$4 =
        new javax.xml.namespace.QName("", "to");


    /**
     * Gets the "attributeName" attribute
     */
    public java.lang.String getAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTENAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "attributeName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATTRIBUTENAME$0);
            return target;
        }
    }

    /**
     * Sets the "attributeName" attribute
     */
    @Inject(optional=true) public void setAttributeName(java.lang.String attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTENAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTRIBUTENAME$0);
            }
            target.setStringValue(attributeName);
        }
    }

    /**
     * Sets (as xml) the "attributeName" attribute
     */
    public void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATTRIBUTENAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ATTRIBUTENAME$0);
            }
            target.set(attributeName);
        }
    }

    /**
     * Gets the "attributeType" attribute
     */
    public org.w3.x2001.smil20.SetPrototype.AttributeType.Enum getAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ATTRIBUTETYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.SetPrototype.AttributeType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "attributeType" attribute
     */
    public org.w3.x2001.smil20.SetPrototype.AttributeType xgetAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.SetPrototype.AttributeType target = null;
            target = (org.w3.x2001.smil20.SetPrototype.AttributeType)get_store().find_attribute_user(ATTRIBUTETYPE$2);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.SetPrototype.AttributeType)get_default_attribute_value(ATTRIBUTETYPE$2);
            }
            return target;
        }
    }

    /**
     * True if has "attributeType" attribute
     */
    public boolean isSetAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ATTRIBUTETYPE$2) != null;
        }
    }

    /**
     * Sets the "attributeType" attribute
     */
    @Inject(optional=true) public void setAttributeType(org.w3.x2001.smil20.SetPrototype.AttributeType.Enum attributeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTRIBUTETYPE$2);
            }
            target.setEnumValue(attributeType);
        }
    }

    /**
     * Sets (as xml) the "attributeType" attribute
     */
    public void xsetAttributeType(org.w3.x2001.smil20.SetPrototype.AttributeType attributeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.SetPrototype.AttributeType target = null;
            target = (org.w3.x2001.smil20.SetPrototype.AttributeType)get_store().find_attribute_user(ATTRIBUTETYPE$2);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.SetPrototype.AttributeType)get_store().add_attribute_user(ATTRIBUTETYPE$2);
            }
            target.set(attributeType);
        }
    }

    /**
     * Unsets the "attributeType" attribute
     */
    public void unsetAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ATTRIBUTETYPE$2);
        }
    }

    /**
     * Gets the "to" attribute
     */
    public java.lang.String getTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$4);
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
    public org.apache.xmlbeans.XmlString xgetTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$4);
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
            return get_store().find_attribute_user(TO$4) != null;
        }
    }

    /**
     * Sets the "to" attribute
     */
    @Inject(optional=true) public void setTo(java.lang.String to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$4);
            }
            target.setStringValue(to);
        }
    }

    /**
     * Sets (as xml) the "to" attribute
     */
    public void xsetTo(org.apache.xmlbeans.XmlString to)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TO$4);
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
            get_store().remove_attribute(TO$4);
        }
    }
    /**
     * An XML attributeType(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.smil20.SetPrototype$AttributeType.
     */
    public static class AttributeTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.smil20.SetPrototype.AttributeType
    {
        private static final long serialVersionUID = 1L;

        public AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }

        protected AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
