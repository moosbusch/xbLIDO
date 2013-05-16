/*
 * An XML document type.
 * Localname: boundingBox
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BoundingBoxDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one boundingBox(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BoundingBoxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BoundingBoxDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundingBoxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDINGBOX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "boundingBox");
    
    
    /**
     * Gets the "boundingBox" element
     */
    public net.opengis.gml.EnvelopeType getBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(BOUNDINGBOX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "boundingBox" element
     */
    @Inject(optional=true) public void setBoundingBox(net.opengis.gml.EnvelopeType boundingBox)
    {
        generatedSetterHelperImpl(boundingBox, BOUNDINGBOX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "boundingBox" element
     */
    public net.opengis.gml.EnvelopeType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(BOUNDINGBOX$0);
            return target;
        }
    }
}
