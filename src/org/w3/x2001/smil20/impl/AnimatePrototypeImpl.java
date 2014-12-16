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



/**
 * An XML animatePrototype(@http://www.w3.org/2001/SMIL20/).
 *
 * This is a complex type.
 */
public class AnimatePrototypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.smil20.AnimatePrototype
{
    private static final long serialVersionUID = 1L;

    public AnimatePrototypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ATTRIBUTENAME$0 =
        new javax.xml.namespace.QName("", "attributeName");
    private static final javax.xml.namespace.QName ATTRIBUTETYPE$2 =
        new javax.xml.namespace.QName("", "attributeType");
    private static final javax.xml.namespace.QName ADDITIVE$4 =
        new javax.xml.namespace.QName("", "additive");
    private static final javax.xml.namespace.QName ACCUMULATE$6 =
        new javax.xml.namespace.QName("", "accumulate");
    private static final javax.xml.namespace.QName TO$8 =
        new javax.xml.namespace.QName("", "to");
    private static final javax.xml.namespace.QName FROM$10 =
        new javax.xml.namespace.QName("", "from");
    private static final javax.xml.namespace.QName BY$12 =
        new javax.xml.namespace.QName("", "by");
    private static final javax.xml.namespace.QName VALUES$14 =
        new javax.xml.namespace.QName("", "values");


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
     public void setAttributeName(java.lang.String attributeName)
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
    public org.w3.x2001.smil20.AnimatePrototype.AttributeType.Enum getAttributeType()
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
            return (org.w3.x2001.smil20.AnimatePrototype.AttributeType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "attributeType" attribute
     */
    public org.w3.x2001.smil20.AnimatePrototype.AttributeType xgetAttributeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.AnimatePrototype.AttributeType target = null;
            target = (org.w3.x2001.smil20.AnimatePrototype.AttributeType)get_store().find_attribute_user(ATTRIBUTETYPE$2);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.AnimatePrototype.AttributeType)get_default_attribute_value(ATTRIBUTETYPE$2);
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
     public void setAttributeType(org.w3.x2001.smil20.AnimatePrototype.AttributeType.Enum attributeType)
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
    public void xsetAttributeType(org.w3.x2001.smil20.AnimatePrototype.AttributeType attributeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.AnimatePrototype.AttributeType target = null;
            target = (org.w3.x2001.smil20.AnimatePrototype.AttributeType)get_store().find_attribute_user(ATTRIBUTETYPE$2);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.AnimatePrototype.AttributeType)get_store().add_attribute_user(ATTRIBUTETYPE$2);
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
     * Gets the "additive" attribute
     */
    public org.w3.x2001.smil20.AnimatePrototype.Additive.Enum getAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDITIVE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADDITIVE$4);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.AnimatePrototype.Additive.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "additive" attribute
     */
    public org.w3.x2001.smil20.AnimatePrototype.Additive xgetAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.AnimatePrototype.Additive target = null;
            target = (org.w3.x2001.smil20.AnimatePrototype.Additive)get_store().find_attribute_user(ADDITIVE$4);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.AnimatePrototype.Additive)get_default_attribute_value(ADDITIVE$4);
            }
            return target;
        }
    }

    /**
     * True if has "additive" attribute
     */
    public boolean isSetAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDITIVE$4) != null;
        }
    }

    /**
     * Sets the "additive" attribute
     */
     public void setAdditive(org.w3.x2001.smil20.AnimatePrototype.Additive.Enum additive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDITIVE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDITIVE$4);
            }
            target.setEnumValue(additive);
        }
    }

    /**
     * Sets (as xml) the "additive" attribute
     */
    public void xsetAdditive(org.w3.x2001.smil20.AnimatePrototype.Additive additive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.AnimatePrototype.Additive target = null;
            target = (org.w3.x2001.smil20.AnimatePrototype.Additive)get_store().find_attribute_user(ADDITIVE$4);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.AnimatePrototype.Additive)get_store().add_attribute_user(ADDITIVE$4);
            }
            target.set(additive);
        }
    }

    /**
     * Unsets the "additive" attribute
     */
    public void unsetAdditive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDITIVE$4);
        }
    }

    /**
     * Gets the "accumulate" attribute
     */
    public org.w3.x2001.smil20.AnimatePrototype.Accumulate.Enum getAccumulate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCUMULATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACCUMULATE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x2001.smil20.AnimatePrototype.Accumulate.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "accumulate" attribute
     */
    public org.w3.x2001.smil20.AnimatePrototype.Accumulate xgetAccumulate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.AnimatePrototype.Accumulate target = null;
            target = (org.w3.x2001.smil20.AnimatePrototype.Accumulate)get_store().find_attribute_user(ACCUMULATE$6);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.AnimatePrototype.Accumulate)get_default_attribute_value(ACCUMULATE$6);
            }
            return target;
        }
    }

    /**
     * True if has "accumulate" attribute
     */
    public boolean isSetAccumulate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCUMULATE$6) != null;
        }
    }

    /**
     * Sets the "accumulate" attribute
     */
     public void setAccumulate(org.w3.x2001.smil20.AnimatePrototype.Accumulate.Enum accumulate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCUMULATE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCUMULATE$6);
            }
            target.setEnumValue(accumulate);
        }
    }

    /**
     * Sets (as xml) the "accumulate" attribute
     */
    public void xsetAccumulate(org.w3.x2001.smil20.AnimatePrototype.Accumulate accumulate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.AnimatePrototype.Accumulate target = null;
            target = (org.w3.x2001.smil20.AnimatePrototype.Accumulate)get_store().find_attribute_user(ACCUMULATE$6);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.AnimatePrototype.Accumulate)get_store().add_attribute_user(ACCUMULATE$6);
            }
            target.set(accumulate);
        }
    }

    /**
     * Unsets the "accumulate" attribute
     */
    public void unsetAccumulate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCUMULATE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$8);
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
            return get_store().find_attribute_user(TO$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TO$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TO$8);
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
            get_store().remove_attribute(TO$8);
        }
    }

    /**
     * Gets the "from" attribute
     */
    public java.lang.String getFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "from" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$10);
            return target;
        }
    }

    /**
     * True if has "from" attribute
     */
    public boolean isSetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FROM$10) != null;
        }
    }

    /**
     * Sets the "from" attribute
     */
     public void setFrom(java.lang.String from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROM$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROM$10);
            }
            target.setStringValue(from);
        }
    }

    /**
     * Sets (as xml) the "from" attribute
     */
    public void xsetFrom(org.apache.xmlbeans.XmlString from)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROM$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROM$10);
            }
            target.set(from);
        }
    }

    /**
     * Unsets the "from" attribute
     */
    public void unsetFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FROM$10);
        }
    }

    /**
     * Gets the "by" attribute
     */
    public java.lang.String getBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "by" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BY$12);
            return target;
        }
    }

    /**
     * True if has "by" attribute
     */
    public boolean isSetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BY$12) != null;
        }
    }

    /**
     * Sets the "by" attribute
     */
     public void setBy(java.lang.String by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BY$12);
            }
            target.setStringValue(by);
        }
    }

    /**
     * Sets (as xml) the "by" attribute
     */
    public void xsetBy(org.apache.xmlbeans.XmlString by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BY$12);
            }
            target.set(by);
        }
    }

    /**
     * Unsets the "by" attribute
     */
    public void unsetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BY$12);
        }
    }

    /**
     * Gets the "values" attribute
     */
    public java.lang.String getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUES$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "values" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUES$14);
            return target;
        }
    }

    /**
     * True if has "values" attribute
     */
    public boolean isSetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUES$14) != null;
        }
    }

    /**
     * Sets the "values" attribute
     */
     public void setValues(java.lang.String values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUES$14);
            }
            target.setStringValue(values);
        }
    }

    /**
     * Sets (as xml) the "values" attribute
     */
    public void xsetValues(org.apache.xmlbeans.XmlString values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUES$14);
            }
            target.set(values);
        }
    }

    /**
     * Unsets the "values" attribute
     */
    public void unsetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUES$14);
        }
    }
    /**
     * An XML attributeType(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.smil20.AnimatePrototype$AttributeType.
     */
    public static class AttributeTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.smil20.AnimatePrototype.AttributeType
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
    /**
     * An XML additive(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.smil20.AnimatePrototype$Additive.
     */
    public static class AdditiveImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.smil20.AnimatePrototype.Additive
    {
        private static final long serialVersionUID = 1L;

        public AdditiveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }

        protected AdditiveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML accumulate(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.smil20.AnimatePrototype$Accumulate.
     */
    public static class AccumulateImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x2001.smil20.AnimatePrototype.Accumulate
    {
        private static final long serialVersionUID = 1L;

        public AccumulateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }

        protected AccumulateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
