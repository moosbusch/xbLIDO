/*
 * An XML attribute type.
 * Localname: label
 * Namespace: http://www.w3.org/1999/xlink
 * Java type: org.w3.x1999.xlink.LabelAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink.impl;  import com.google.inject.Inject;
/**
 * A document containing one label(@http://www.w3.org/1999/xlink) attribute.
 *
 * This is a complex type.
 */
public class LabelAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.LabelAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LabelAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "label");
    
    
    /**
     * Gets the "label" attribute
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$0);
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
            target = (org.w3.x1999.xlink.LabelType)get_store().find_attribute_user(LABEL$0);
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
            return get_store().find_attribute_user(LABEL$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$0);
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
            target = (org.w3.x1999.xlink.LabelType)get_store().find_attribute_user(LABEL$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.LabelType)get_store().add_attribute_user(LABEL$0);
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
            get_store().remove_attribute(LABEL$0);
        }
    }
}
