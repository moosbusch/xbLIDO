/*
 * XML Type:  PriorityLocationPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PriorityLocationPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML PriorityLocationPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PriorityLocationPropertyTypeImpl extends net.opengis.gml.impl.LocationPropertyTypeImpl implements net.opengis.gml.PriorityLocationPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public PriorityLocationPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIORITY$0 = 
        new javax.xml.namespace.QName("", "priority");
    
    
    /**
     * Gets the "priority" attribute
     */
    public java.lang.String getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "priority" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIORITY$0);
            return target;
        }
    }
    
    /**
     * True if has "priority" attribute
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRIORITY$0) != null;
        }
    }
    
    /**
     * Sets the "priority" attribute
     */
    @Inject(optional=true) public void setPriority(java.lang.String priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$0);
            }
            target.setStringValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "priority" attribute
     */
    public void xsetPriority(org.apache.xmlbeans.XmlString priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PRIORITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PRIORITY$0);
            }
            target.set(priority);
        }
    }
    
    /**
     * Unsets the "priority" attribute
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRIORITY$0);
        }
    }
}
