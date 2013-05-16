/*
 * An XML attribute type.
 * Localname: actuate
 * Namespace: http://www.w3.org/1999/xlink
 * Java type: org.w3.x1999.xlink.ActuateAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink.impl;  import com.google.inject.Inject;
/**
 * A document containing one actuate(@http://www.w3.org/1999/xlink) attribute.
 *
 * This is a complex type.
 */
public class ActuateAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.ActuateAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ActuateAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTUATE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "actuate");
    
    
    /**
     * Gets the "actuate" attribute
     */
    public org.w3.x1999.xlink.ActuateType.Enum getActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$0);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.ActuateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "actuate" attribute
     */
    public org.w3.x1999.xlink.ActuateType xgetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ActuateType target = null;
            target = (org.w3.x1999.xlink.ActuateType)get_store().find_attribute_user(ACTUATE$0);
            return target;
        }
    }
    
    /**
     * True if has "actuate" attribute
     */
    public boolean isSetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTUATE$0) != null;
        }
    }
    
    /**
     * Sets the "actuate" attribute
     */
    @Inject(optional=true) public void setActuate(org.w3.x1999.xlink.ActuateType.Enum actuate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTUATE$0);
            }
            target.setEnumValue(actuate);
        }
    }
    
    /**
     * Sets (as xml) the "actuate" attribute
     */
    public void xsetActuate(org.w3.x1999.xlink.ActuateType actuate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ActuateType target = null;
            target = (org.w3.x1999.xlink.ActuateType)get_store().find_attribute_user(ACTUATE$0);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ActuateType)get_store().add_attribute_user(ACTUATE$0);
            }
            target.set(actuate);
        }
    }
    
    /**
     * Unsets the "actuate" attribute
     */
    public void unsetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTUATE$0);
        }
    }
}
