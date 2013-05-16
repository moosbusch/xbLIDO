/*
 * An XML document type.
 * Localname: GeodeticDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeodeticDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one GeodeticDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeodeticDatumDocumentImpl extends net.opengis.gml.impl.DatumDocumentImpl implements net.opengis.gml.GeodeticDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODETICDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodeticDatum");
    
    
    /**
     * Gets the "GeodeticDatum" element
     */
    public net.opengis.gml.GeodeticDatumType getGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumType target = null;
            target = (net.opengis.gml.GeodeticDatumType)get_store().find_element_user(GEODETICDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeodeticDatum" element
     */
    @Inject(optional=true) public void setGeodeticDatum(net.opengis.gml.GeodeticDatumType geodeticDatum)
    {
        generatedSetterHelperImpl(geodeticDatum, GEODETICDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeodeticDatum" element
     */
    public net.opengis.gml.GeodeticDatumType addNewGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumType target = null;
            target = (net.opengis.gml.GeodeticDatumType)get_store().add_element_user(GEODETICDATUM$0);
            return target;
        }
    }
}
