/*
 * An XML attribute type.
 * Localname: uom
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UomAttribute
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one uom(@http://www.opengis.net/gml) attribute.
 *
 * This is a complex type.
 */
public class UomAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UomAttribute
{
    private static final long serialVersionUID = 1L;
    
    public UomAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UOM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "uom");
    
    
    /**
     * Gets the "uom" attribute
     */
    public java.lang.String getUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(UOM$0);
            return target;
        }
    }
    
    /**
     * True if has "uom" attribute
     */
    public boolean isSetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UOM$0) != null;
        }
    }
    
    /**
     * Sets the "uom" attribute
     */
    @Inject(optional=true) public void setUom(java.lang.String uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$0);
            }
            target.setStringValue(uom);
        }
    }
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    public void xsetUom(org.apache.xmlbeans.XmlAnyURI uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(UOM$0);
            }
            target.set(uom);
        }
    }
    
    /**
     * Unsets the "uom" attribute
     */
    public void unsetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UOM$0);
        }
    }
}
