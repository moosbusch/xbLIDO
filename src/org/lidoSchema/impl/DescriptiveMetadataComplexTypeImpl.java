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
 * An XML descriptiveMetadataComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class DescriptiveMetadataComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.DescriptiveMetadataComplexType
{
    private static final long serialVersionUID = 1L;

    public DescriptiveMetadataComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName OBJECTCLASSIFICATIONWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectClassificationWrap");
    private static final javax.xml.namespace.QName OBJECTIDENTIFICATIONWRAP$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectIdentificationWrap");
    private static final javax.xml.namespace.QName EVENTWRAP$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventWrap");
    private static final javax.xml.namespace.QName OBJECTRELATIONWRAP$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectRelationWrap");
    private static final javax.xml.namespace.QName LANG$8 =
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");


    /**
     * Gets the "objectClassificationWrap" element
     */
    public org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap getObjectClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap target = null;
            target = (org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap)get_store().find_element_user(OBJECTCLASSIFICATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "objectClassificationWrap" element
     */
     public void setObjectClassificationWrap(org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap objectClassificationWrap)
    {
        generatedSetterHelperImpl(objectClassificationWrap, OBJECTCLASSIFICATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "objectClassificationWrap" element
     */
    public org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap addNewObjectClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap target = null;
            target = (org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap)get_store().add_element_user(OBJECTCLASSIFICATIONWRAP$0);
            return target;
        }
    }

    /**
     * Gets the "objectIdentificationWrap" element
     */
    public org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap getObjectIdentificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap target = null;
            target = (org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap)get_store().find_element_user(OBJECTIDENTIFICATIONWRAP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "objectIdentificationWrap" element
     */
     public void setObjectIdentificationWrap(org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap objectIdentificationWrap)
    {
        generatedSetterHelperImpl(objectIdentificationWrap, OBJECTIDENTIFICATIONWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "objectIdentificationWrap" element
     */
    public org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap addNewObjectIdentificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap target = null;
            target = (org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap)get_store().add_element_user(OBJECTIDENTIFICATIONWRAP$2);
            return target;
        }
    }

    /**
     * Gets the "eventWrap" element
     */
    public org.lidoSchema.EventWrapDocument.EventWrap getEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventWrapDocument.EventWrap target = null;
            target = (org.lidoSchema.EventWrapDocument.EventWrap)get_store().find_element_user(EVENTWRAP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "eventWrap" element
     */
    public boolean isSetEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTWRAP$4) != 0;
        }
    }

    /**
     * Sets the "eventWrap" element
     */
     public void setEventWrap(org.lidoSchema.EventWrapDocument.EventWrap eventWrap)
    {
        generatedSetterHelperImpl(eventWrap, EVENTWRAP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "eventWrap" element
     */
    public org.lidoSchema.EventWrapDocument.EventWrap addNewEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventWrapDocument.EventWrap target = null;
            target = (org.lidoSchema.EventWrapDocument.EventWrap)get_store().add_element_user(EVENTWRAP$4);
            return target;
        }
    }

    /**
     * Unsets the "eventWrap" element
     */
    public void unsetEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTWRAP$4, 0);
        }
    }

    /**
     * Gets the "objectRelationWrap" element
     */
    public org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap getObjectRelationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap target = null;
            target = (org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap)get_store().find_element_user(OBJECTRELATIONWRAP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "objectRelationWrap" element
     */
    public boolean isSetObjectRelationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTRELATIONWRAP$6) != 0;
        }
    }

    /**
     * Sets the "objectRelationWrap" element
     */
     public void setObjectRelationWrap(org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap objectRelationWrap)
    {
        generatedSetterHelperImpl(objectRelationWrap, OBJECTRELATIONWRAP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "objectRelationWrap" element
     */
    public org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap addNewObjectRelationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap target = null;
            target = (org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap)get_store().add_element_user(OBJECTRELATIONWRAP$6);
            return target;
        }
    }

    /**
     * Unsets the "objectRelationWrap" element
     */
    public void unsetObjectRelationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTRELATIONWRAP$6, 0);
        }
    }

    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$8);
            return target;
        }
    }

    /**
     * Sets the "lang" attribute
     */
     public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$8);
            }
            target.setStringValue(lang);
        }
    }

    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$8);
            }
            target.set(lang);
        }
    }
}
