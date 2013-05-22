/*
 * XML Type:  administrativeMetadataComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.AdministrativeMetadataComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.inject.annotation.Language;
/**
 * An XML administrativeMetadataComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class AdministrativeMetadataComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.AdministrativeMetadataComplexType
{
    private static final long serialVersionUID = 1L;

    public AdministrativeMetadataComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName RIGHTSWORKWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "rightsWorkWrap");
    private static final javax.xml.namespace.QName RECORDWRAP$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "recordWrap");
    private static final javax.xml.namespace.QName RESOURCEWRAP$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceWrap");
    private static final javax.xml.namespace.QName LANG$6 =
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");


    /**
     * Gets the "rightsWorkWrap" element
     */
    public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap getRightsWorkWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap target = null;
            target = (org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap)get_store().find_element_user(RIGHTSWORKWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "rightsWorkWrap" element
     */
    public boolean isSetRightsWorkWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHTSWORKWRAP$0) != 0;
        }
    }

    /**
     * Sets the "rightsWorkWrap" element
     */
    @Inject(optional=true) public void setRightsWorkWrap(org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap rightsWorkWrap)
    {
        generatedSetterHelperImpl(rightsWorkWrap, RIGHTSWORKWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "rightsWorkWrap" element
     */
    public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap addNewRightsWorkWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap target = null;
            target = (org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap)get_store().add_element_user(RIGHTSWORKWRAP$0);
            return target;
        }
    }

    /**
     * Unsets the "rightsWorkWrap" element
     */
    public void unsetRightsWorkWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHTSWORKWRAP$0, 0);
        }
    }

    /**
     * Gets the "recordWrap" element
     */
    public org.lidoSchema.RecordWrapDocument.RecordWrap getRecordWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RecordWrapDocument.RecordWrap target = null;
            target = (org.lidoSchema.RecordWrapDocument.RecordWrap)get_store().find_element_user(RECORDWRAP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "recordWrap" element
     */
    @Inject(optional=true) public void setRecordWrap(org.lidoSchema.RecordWrapDocument.RecordWrap recordWrap)
    {
        generatedSetterHelperImpl(recordWrap, RECORDWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "recordWrap" element
     */
    public org.lidoSchema.RecordWrapDocument.RecordWrap addNewRecordWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RecordWrapDocument.RecordWrap target = null;
            target = (org.lidoSchema.RecordWrapDocument.RecordWrap)get_store().add_element_user(RECORDWRAP$2);
            return target;
        }
    }

    /**
     * Gets the "resourceWrap" element
     */
    public org.lidoSchema.ResourceWrapDocument.ResourceWrap getResourceWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceWrapDocument.ResourceWrap target = null;
            target = (org.lidoSchema.ResourceWrapDocument.ResourceWrap)get_store().find_element_user(RESOURCEWRAP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "resourceWrap" element
     */
    public boolean isSetResourceWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEWRAP$4) != 0;
        }
    }

    /**
     * Sets the "resourceWrap" element
     */
    @Inject(optional=true) public void setResourceWrap(org.lidoSchema.ResourceWrapDocument.ResourceWrap resourceWrap)
    {
        generatedSetterHelperImpl(resourceWrap, RESOURCEWRAP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "resourceWrap" element
     */
    public org.lidoSchema.ResourceWrapDocument.ResourceWrap addNewResourceWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceWrapDocument.ResourceWrap target = null;
            target = (org.lidoSchema.ResourceWrapDocument.ResourceWrap)get_store().add_element_user(RESOURCEWRAP$4);
            return target;
        }
    }

    /**
     * Unsets the "resourceWrap" element
     */
    public void unsetResourceWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEWRAP$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$6);
            return target;
        }
    }

    /**
     * Sets the "lang" attribute
     */
    @Inject(optional=true) public void setLang(@Language java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$6);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$6);
            }
            target.set(lang);
        }
    }
}
