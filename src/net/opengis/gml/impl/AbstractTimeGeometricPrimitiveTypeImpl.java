/*
 * XML Type:  AbstractTimeGeometricPrimitiveType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractTimeGeometricPrimitiveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML AbstractTimeGeometricPrimitiveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractTimeGeometricPrimitiveTypeImpl extends net.opengis.gml.impl.AbstractTimePrimitiveTypeImpl implements net.opengis.gml.AbstractTimeGeometricPrimitiveType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeGeometricPrimitiveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRAME$0 = 
        new javax.xml.namespace.QName("", "frame");
    
    
    /**
     * Gets the "frame" attribute
     */
    public java.lang.String getFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FRAME$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FRAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(FRAME$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "frame" attribute
     */
    public boolean isSetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAME$0) != null;
        }
    }
    
    /**
     * Sets the "frame" attribute
     */
    @Inject(optional=true) public void setFrame(java.lang.String frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$0);
            }
            target.setStringValue(frame);
        }
    }
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    public void xsetFrame(org.apache.xmlbeans.XmlAnyURI frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FRAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(FRAME$0);
            }
            target.set(frame);
        }
    }
    
    /**
     * Unsets the "frame" attribute
     */
    public void unsetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAME$0);
        }
    }
}
