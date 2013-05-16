/*
 * An XML document type.
 * Localname: PolyhedralSurface
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolyhedralSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one PolyhedralSurface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PolyhedralSurfaceDocumentImpl extends net.opengis.gml.impl.SurfaceDocument2Impl implements net.opengis.gml.PolyhedralSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolyhedralSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYHEDRALSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolyhedralSurface");
    
    
    /**
     * Gets the "PolyhedralSurface" element
     */
    public net.opengis.gml.PolyhedralSurfaceType getPolyhedralSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolyhedralSurfaceType target = null;
            target = (net.opengis.gml.PolyhedralSurfaceType)get_store().find_element_user(POLYHEDRALSURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PolyhedralSurface" element
     */
    @Inject(optional=true) public void setPolyhedralSurface(net.opengis.gml.PolyhedralSurfaceType polyhedralSurface)
    {
        generatedSetterHelperImpl(polyhedralSurface, POLYHEDRALSURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PolyhedralSurface" element
     */
    public net.opengis.gml.PolyhedralSurfaceType addNewPolyhedralSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolyhedralSurfaceType target = null;
            target = (net.opengis.gml.PolyhedralSurfaceType)get_store().add_element_user(POLYHEDRALSURFACE$0);
            return target;
        }
    }
}
