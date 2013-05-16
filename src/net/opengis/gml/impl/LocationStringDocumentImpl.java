/*
 * An XML document type.
 * Localname: LocationString
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LocationStringDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one LocationString(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LocationStringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LocationStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONSTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LocationString");
    
    
    /**
     * Gets the "LocationString" element
     */
    public net.opengis.gml.StringOrRefType getLocationString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(LOCATIONSTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocationString" element
     */
    @Inject(optional=true) public void setLocationString(net.opengis.gml.StringOrRefType locationString)
    {
        generatedSetterHelperImpl(locationString, LOCATIONSTRING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocationString" element
     */
    public net.opengis.gml.StringOrRefType addNewLocationString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(LOCATIONSTRING$0);
            return target;
        }
    }
}
