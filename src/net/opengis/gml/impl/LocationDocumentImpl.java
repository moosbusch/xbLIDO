/*
 * An XML document type.
 * Localname: location
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LocationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one location(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "priorityLocation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "location"),
    });
    
    
    /**
     * Gets the "location" element
     */
    public net.opengis.gml.LocationPropertyType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    @Inject(optional=true) public void setLocation(net.opengis.gml.LocationPropertyType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().find_element_user(LOCATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LocationPropertyType)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public net.opengis.gml.LocationPropertyType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
}
