/*
 * An XML attribute type.
 * Localname: arcrole
 * Namespace: http://www.w3.org/1999/xlink
 * Java type: org.w3.x1999.xlink.ArcroleAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink.impl;  import com.google.inject.Inject;
/**
 * A document containing one arcrole(@http://www.w3.org/1999/xlink) attribute.
 *
 * This is a complex type.
 */
public class ArcroleAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.ArcroleAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ArcroleAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCROLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "arcrole");
    
    
    /**
     * Gets the "arcrole" attribute
     */
    public java.lang.String getArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arcrole" attribute
     */
    public org.w3.x1999.xlink.ArcroleType xgetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcroleType target = null;
            target = (org.w3.x1999.xlink.ArcroleType)get_store().find_attribute_user(ARCROLE$0);
            return target;
        }
    }
    
    /**
     * True if has "arcrole" attribute
     */
    public boolean isSetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARCROLE$0) != null;
        }
    }
    
    /**
     * Sets the "arcrole" attribute
     */
    @Inject(optional=true) public void setArcrole(java.lang.String arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCROLE$0);
            }
            target.setStringValue(arcrole);
        }
    }
    
    /**
     * Sets (as xml) the "arcrole" attribute
     */
    public void xsetArcrole(org.w3.x1999.xlink.ArcroleType arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcroleType target = null;
            target = (org.w3.x1999.xlink.ArcroleType)get_store().find_attribute_user(ARCROLE$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ArcroleType)get_store().add_attribute_user(ARCROLE$0);
            }
            target.set(arcrole);
        }
    }
    
    /**
     * Unsets the "arcrole" attribute
     */
    public void unsetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARCROLE$0);
        }
    }
}