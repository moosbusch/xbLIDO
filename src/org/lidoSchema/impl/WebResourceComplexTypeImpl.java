/*
 * XML Type:  webResourceComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.WebResourceComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML webResourceComplexType(@http://www.lido-schema.org).
 *
 * This is an atomic type that is a restriction of org.lidoSchema.WebResourceComplexType.
 */
public class WebResourceComplexTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.WebResourceComplexType
{
    private static final long serialVersionUID = 1L;
    
    public WebResourceComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected WebResourceComplexTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName PREF$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "pref");
    private static final javax.xml.namespace.QName FORMATRESOURCE$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "formatResource");
    private static final javax.xml.namespace.QName LANG$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName ENCODINGANALOG$6 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
    private static final javax.xml.namespace.QName LABEL$8 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
    
    
    /**
     * Gets the "pref" attribute
     */
    public java.lang.String getPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pref" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREF$0);
            return target;
        }
    }
    
    /**
     * True if has "pref" attribute
     */
    public boolean isSetPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREF$0) != null;
        }
    }
    
    /**
     * Sets the "pref" attribute
     */
    @Inject(optional=true) public void setPref(java.lang.String pref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREF$0);
            }
            target.setStringValue(pref);
        }
    }
    
    /**
     * Sets (as xml) the "pref" attribute
     */
    public void xsetPref(org.apache.xmlbeans.XmlString pref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREF$0);
            }
            target.set(pref);
        }
    }
    
    /**
     * Unsets the "pref" attribute
     */
    public void unsetPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREF$0);
        }
    }
    
    /**
     * Gets the "formatResource" attribute
     */
    public java.lang.String getFormatResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATRESOURCE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "formatResource" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFormatResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMATRESOURCE$2);
            return target;
        }
    }
    
    /**
     * True if has "formatResource" attribute
     */
    public boolean isSetFormatResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMATRESOURCE$2) != null;
        }
    }
    
    /**
     * Sets the "formatResource" attribute
     */
    @Inject(optional=true) public void setFormatResource(java.lang.String formatResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATRESOURCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATRESOURCE$2);
            }
            target.setStringValue(formatResource);
        }
    }
    
    /**
     * Sets (as xml) the "formatResource" attribute
     */
    public void xsetFormatResource(org.apache.xmlbeans.XmlString formatResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMATRESOURCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMATRESOURCE$2);
            }
            target.set(formatResource);
        }
    }
    
    /**
     * Unsets the "formatResource" attribute
     */
    public void unsetFormatResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMATRESOURCE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$4) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    @Inject(optional=true) public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$4);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$4);
        }
    }
    
    /**
     * Gets the "encodinganalog" attribute
     */
    public java.lang.String getEncodinganalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$6);
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
            return get_store().find_attribute_user(ENCODINGANALOG$6) != null;
        }
    }
    
    /**
     * Sets the "encodinganalog" attribute
     */
    @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$6);
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
            get_store().remove_attribute(ENCODINGANALOG$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
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
    public org.apache.xmlbeans.XmlString xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
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
            return get_store().find_attribute_user(LABEL$8) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
    @Inject(optional=true) public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$8);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" attribute
     */
    public void xsetLabel(org.apache.xmlbeans.XmlString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$8);
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
            get_store().remove_attribute(LABEL$8);
        }
    }
}
