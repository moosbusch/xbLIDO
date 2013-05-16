/*
 * An XML attribute type.
 * Localname: pref
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.PrefAttribute
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one pref(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class PrefAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.PrefAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PrefAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREF$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "pref");
    
    
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
}
