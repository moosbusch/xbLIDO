/*
 * An XML document type.
 * Localname: geographicCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeographicCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one geographicCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeographicCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeographicCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeographicCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geographicCRSRef");
    
    
    /**
     * Gets the "geographicCRSRef" element
     */
    public net.opengis.gml.GeographicCRSRefType getGeographicCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeographicCRSRefType target = null;
            target = (net.opengis.gml.GeographicCRSRefType)get_store().find_element_user(GEOGRAPHICCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geographicCRSRef" element
     */
    @Inject(optional=true) public void setGeographicCRSRef(net.opengis.gml.GeographicCRSRefType geographicCRSRef)
    {
        generatedSetterHelperImpl(geographicCRSRef, GEOGRAPHICCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geographicCRSRef" element
     */
    public net.opengis.gml.GeographicCRSRefType addNewGeographicCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeographicCRSRefType target = null;
            target = (net.opengis.gml.GeographicCRSRefType)get_store().add_element_user(GEOGRAPHICCRSREF$0);
            return target;
        }
    }
}
