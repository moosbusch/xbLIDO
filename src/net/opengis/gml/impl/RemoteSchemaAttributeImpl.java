/*
 * An XML attribute type.
 * Localname: remoteSchema
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RemoteSchemaAttribute
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one remoteSchema(@http://www.opengis.net/gml) attribute.
 *
 * This is a complex type.
 */
public class RemoteSchemaAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.RemoteSchemaAttribute
{
    private static final long serialVersionUID = 1L;
    
    public RemoteSchemaAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOTESCHEMA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remoteSchema");
    
    
    /**
     * Gets the "remoteSchema" attribute
     */
    public java.lang.String getRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "remoteSchema" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$0);
            return target;
        }
    }
    
    /**
     * True if has "remoteSchema" attribute
     */
    public boolean isSetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REMOTESCHEMA$0) != null;
        }
    }
    
    /**
     * Sets the "remoteSchema" attribute
     */
    @Inject(optional=true) public void setRemoteSchema(java.lang.String remoteSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOTESCHEMA$0);
            }
            target.setStringValue(remoteSchema);
        }
    }
    
    /**
     * Sets (as xml) the "remoteSchema" attribute
     */
    public void xsetRemoteSchema(org.apache.xmlbeans.XmlAnyURI remoteSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(REMOTESCHEMA$0);
            }
            target.set(remoteSchema);
        }
    }
    
    /**
     * Unsets the "remoteSchema" attribute
     */
    public void unsetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REMOTESCHEMA$0);
        }
    }
}
