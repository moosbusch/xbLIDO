/*
 * An XML document type.
 * Localname: verticalExtent
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.VerticalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one verticalExtent(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class VerticalExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.VerticalExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "verticalExtent");
    
    
    /**
     * Gets the "verticalExtent" element
     */
    public net.opengis.gml.EnvelopeType getVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(VERTICALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalExtent" element
     */
    @Inject(optional=true) public void setVerticalExtent(net.opengis.gml.EnvelopeType verticalExtent)
    {
        generatedSetterHelperImpl(verticalExtent, VERTICALEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verticalExtent" element
     */
    public net.opengis.gml.EnvelopeType addNewVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(VERTICALEXTENT$0);
            return target;
        }
    }
}
