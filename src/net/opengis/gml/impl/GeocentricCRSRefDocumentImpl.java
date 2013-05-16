/*
 * An XML document type.
 * Localname: geocentricCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeocentricCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one geocentricCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeocentricCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeocentricCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocentricCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCENTRICCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geocentricCRSRef");
    
    
    /**
     * Gets the "geocentricCRSRef" element
     */
    public net.opengis.gml.GeocentricCRSRefType getGeocentricCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeocentricCRSRefType target = null;
            target = (net.opengis.gml.GeocentricCRSRefType)get_store().find_element_user(GEOCENTRICCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geocentricCRSRef" element
     */
    @Inject(optional=true) public void setGeocentricCRSRef(net.opengis.gml.GeocentricCRSRefType geocentricCRSRef)
    {
        generatedSetterHelperImpl(geocentricCRSRef, GEOCENTRICCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geocentricCRSRef" element
     */
    public net.opengis.gml.GeocentricCRSRefType addNewGeocentricCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeocentricCRSRefType target = null;
            target = (net.opengis.gml.GeocentricCRSRefType)get_store().add_element_user(GEOCENTRICCRSREF$0);
            return target;
        }
    }
}
