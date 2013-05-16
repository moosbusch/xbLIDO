/*
 * An XML document type.
 * Localname: GeodesicString
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeodesicStringDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one GeodesicString(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeodesicStringDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.GeodesicStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodesicStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODESICSTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodesicString");
    private static final org.apache.xmlbeans.QNameSet GEODESICSTRING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodesicString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Geodesic"),
    });
    
    
    /**
     * Gets the "GeodesicString" element
     */
    public net.opengis.gml.GeodesicStringType getGeodesicString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodesicStringType target = null;
            target = (net.opengis.gml.GeodesicStringType)get_store().find_element_user(GEODESICSTRING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeodesicString" element
     */
    @Inject(optional=true) public void setGeodesicString(net.opengis.gml.GeodesicStringType geodesicString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodesicStringType target = null;
            target = (net.opengis.gml.GeodesicStringType)get_store().find_element_user(GEODESICSTRING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.GeodesicStringType)get_store().add_element_user(GEODESICSTRING$0);
            }
            target.set(geodesicString);
        }
    }
    
    /**
     * Appends and returns a new empty "GeodesicString" element
     */
    public net.opengis.gml.GeodesicStringType addNewGeodesicString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodesicStringType target = null;
            target = (net.opengis.gml.GeodesicStringType)get_store().add_element_user(GEODESICSTRING$0);
            return target;
        }
    }
}
