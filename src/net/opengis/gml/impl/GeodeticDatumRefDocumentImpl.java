/*
 * An XML document type.
 * Localname: geodeticDatumRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeodeticDatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one geodeticDatumRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeodeticDatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeodeticDatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODETICDATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geodeticDatumRef");
    
    
    /**
     * Gets the "geodeticDatumRef" element
     */
    public net.opengis.gml.GeodeticDatumRefType getGeodeticDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().find_element_user(GEODETICDATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geodeticDatumRef" element
     */
    @Inject(optional=true) public void setGeodeticDatumRef(net.opengis.gml.GeodeticDatumRefType geodeticDatumRef)
    {
        generatedSetterHelperImpl(geodeticDatumRef, GEODETICDATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geodeticDatumRef" element
     */
    public net.opengis.gml.GeodeticDatumRefType addNewGeodeticDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().add_element_user(GEODETICDATUMREF$0);
            return target;
        }
    }
}
