/*
 * An XML document type.
 * Localname: Rectangle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RectangleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Rectangle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RectangleDocumentImpl extends net.opengis.gml.impl.SurfacePatchDocumentImpl implements net.opengis.gml.RectangleDocument
{
    private static final long serialVersionUID = 1L;
    
    public RectangleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTANGLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Rectangle");
    
    
    /**
     * Gets the "Rectangle" element
     */
    public net.opengis.gml.RectangleType getRectangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectangleType target = null;
            target = (net.opengis.gml.RectangleType)get_store().find_element_user(RECTANGLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Rectangle" element
     */
    @Inject(optional=true) public void setRectangle(net.opengis.gml.RectangleType rectangle)
    {
        generatedSetterHelperImpl(rectangle, RECTANGLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Rectangle" element
     */
    public net.opengis.gml.RectangleType addNewRectangle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectangleType target = null;
            target = (net.opengis.gml.RectangleType)get_store().add_element_user(RECTANGLE$0);
            return target;
        }
    }
}
