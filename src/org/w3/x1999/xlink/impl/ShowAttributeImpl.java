/*
 * An XML attribute type.
 * Localname: show
 * Namespace: http://www.w3.org/1999/xlink
 * Java type: org.w3.x1999.xlink.ShowAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink.impl;  import com.google.inject.Inject;
/**
 * A document containing one show(@http://www.w3.org/1999/xlink) attribute.
 *
 * This is a complex type.
 */
public class ShowAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.ShowAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ShowAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHOW$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "show");
    
    
    /**
     * Gets the "show" attribute
     */
    public org.w3.x1999.xlink.ShowType.Enum getShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$0);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.ShowType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "show" attribute
     */
    public org.w3.x1999.xlink.ShowType xgetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ShowType target = null;
            target = (org.w3.x1999.xlink.ShowType)get_store().find_attribute_user(SHOW$0);
            return target;
        }
    }
    
    /**
     * True if has "show" attribute
     */
    public boolean isSetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOW$0) != null;
        }
    }
    
    /**
     * Sets the "show" attribute
     */
    @Inject(optional=true) public void setShow(org.w3.x1999.xlink.ShowType.Enum show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOW$0);
            }
            target.setEnumValue(show);
        }
    }
    
    /**
     * Sets (as xml) the "show" attribute
     */
    public void xsetShow(org.w3.x1999.xlink.ShowType show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ShowType target = null;
            target = (org.w3.x1999.xlink.ShowType)get_store().find_attribute_user(SHOW$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ShowType)get_store().add_attribute_user(SHOW$0);
            }
            target.set(show);
        }
    }
    
    /**
     * Unsets the "show" attribute
     */
    public void unsetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOW$0);
        }
    }
}
