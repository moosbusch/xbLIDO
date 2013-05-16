/*
 * An XML document type.
 * Localname: GeographicCRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeographicCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one GeographicCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeographicCRSDocumentImpl extends net.opengis.gml.impl.CoordinateReferenceSystemDocumentImpl implements net.opengis.gml.GeographicCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeographicCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeographicCRS");
    
    
    /**
     * Gets the "GeographicCRS" element
     */
    public net.opengis.gml.GeographicCRSType getGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeographicCRSType target = null;
            target = (net.opengis.gml.GeographicCRSType)get_store().find_element_user(GEOGRAPHICCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeographicCRS" element
     */
    @Inject(optional=true) public void setGeographicCRS(net.opengis.gml.GeographicCRSType geographicCRS)
    {
        generatedSetterHelperImpl(geographicCRS, GEOGRAPHICCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeographicCRS" element
     */
    public net.opengis.gml.GeographicCRSType addNewGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeographicCRSType target = null;
            target = (net.opengis.gml.GeographicCRSType)get_store().add_element_user(GEOGRAPHICCRS$0);
            return target;
        }
    }
}
