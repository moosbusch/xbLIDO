/*
 * An XML document type.
 * Localname: usesGeodeticDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesGeodeticDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesGeodeticDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesGeodeticDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesGeodeticDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesGeodeticDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESGEODETICDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesGeodeticDatum");
    
    
    /**
     * Gets the "usesGeodeticDatum" element
     */
    public net.opengis.gml.GeodeticDatumRefType getUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().find_element_user(USESGEODETICDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesGeodeticDatum" element
     */
    @Inject(optional=true) public void setUsesGeodeticDatum(net.opengis.gml.GeodeticDatumRefType usesGeodeticDatum)
    {
        generatedSetterHelperImpl(usesGeodeticDatum, USESGEODETICDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesGeodeticDatum" element
     */
    public net.opengis.gml.GeodeticDatumRefType addNewUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().add_element_user(USESGEODETICDATUM$0);
            return target;
        }
    }
}
