/*
 * An XML attribute type.
 * Localname: encodinganalog
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.EncodinganalogAttribute
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one encodinganalog(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class EncodinganalogAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.EncodinganalogAttribute
{
    private static final long serialVersionUID = 1L;
    
    public EncodinganalogAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENCODINGANALOG$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
    
    
    /**
     * Gets the "encodinganalog" attribute
     */
    public java.lang.String getEncodinganalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$0);
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
            return get_store().find_attribute_user(ENCODINGANALOG$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$0);
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
            get_store().remove_attribute(ENCODINGANALOG$0);
        }
    }
}
