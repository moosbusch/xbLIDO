/*
 * An XML document type.
 * Localname: VerticalDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.VerticalDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one VerticalDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class VerticalDatumDocumentImpl extends net.opengis.gml.impl.DatumDocumentImpl implements net.opengis.gml.VerticalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalDatum");
    
    
    /**
     * Gets the "VerticalDatum" element
     */
    public net.opengis.gml.VerticalDatumType getVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumType target = null;
            target = (net.opengis.gml.VerticalDatumType)get_store().find_element_user(VERTICALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "VerticalDatum" element
     */
    @Inject(optional=true) public void setVerticalDatum(net.opengis.gml.VerticalDatumType verticalDatum)
    {
        generatedSetterHelperImpl(verticalDatum, VERTICALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "VerticalDatum" element
     */
    public net.opengis.gml.VerticalDatumType addNewVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumType target = null;
            target = (net.opengis.gml.VerticalDatumType)get_store().add_element_user(VERTICALDATUM$0);
            return target;
        }
    }
}
