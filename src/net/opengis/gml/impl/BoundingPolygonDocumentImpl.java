/*
 * An XML document type.
 * Localname: boundingPolygon
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BoundingPolygonDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one boundingPolygon(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BoundingPolygonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BoundingPolygonDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundingPolygonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDINGPOLYGON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "boundingPolygon");
    
    
    /**
     * Gets the "boundingPolygon" element
     */
    public net.opengis.gml.PolygonType getBoundingPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(BOUNDINGPOLYGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "boundingPolygon" element
     */
    @Inject(optional=true) public void setBoundingPolygon(net.opengis.gml.PolygonType boundingPolygon)
    {
        generatedSetterHelperImpl(boundingPolygon, BOUNDINGPOLYGON$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "boundingPolygon" element
     */
    public net.opengis.gml.PolygonType addNewBoundingPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().add_element_user(BOUNDINGPOLYGON$0);
            return target;
        }
    }
}
