/*
 * An XML document type.
 * Localname: Ring
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RingDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Ring(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RingDocument2Impl extends net.opengis.gml.impl.RingDocumentImpl implements net.opengis.gml.RingDocument2
{
    private static final long serialVersionUID = 1L;
    
    public RingDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RING2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ring");
    
    
    /**
     * Gets the "Ring" element
     */
    public net.opengis.gml.RingType getRing2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RingType target = null;
            target = (net.opengis.gml.RingType)get_store().find_element_user(RING2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ring" element
     */
    @Inject(optional=true) public void setRing2(net.opengis.gml.RingType ring2)
    {
        generatedSetterHelperImpl(ring2, RING2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Ring" element
     */
    public net.opengis.gml.RingType addNewRing2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RingType target = null;
            target = (net.opengis.gml.RingType)get_store().add_element_user(RING2$0);
            return target;
        }
    }
}
