/*
 * An XML document type.
 * Localname: Circle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CircleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Circle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CircleDocumentImpl extends net.opengis.gml.impl.ArcDocumentImpl implements net.opengis.gml.CircleDocument
{
    private static final long serialVersionUID = 1L;
    
    public CircleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Circle");
    
    
    /**
     * Gets the "Circle" element
     */
    public net.opengis.gml.CircleType getCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleType target = null;
            target = (net.opengis.gml.CircleType)get_store().find_element_user(CIRCLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Circle" element
     */
    @Inject(optional=true) public void setCircle(net.opengis.gml.CircleType circle)
    {
        generatedSetterHelperImpl(circle, CIRCLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Circle" element
     */
    public net.opengis.gml.CircleType addNewCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleType target = null;
            target = (net.opengis.gml.CircleType)get_store().add_element_user(CIRCLE$0);
            return target;
        }
    }
}
