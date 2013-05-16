/*
 * An XML document type.
 * Localname: PolygonPatch
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolygonPatchDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one PolygonPatch(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PolygonPatchDocumentImpl extends net.opengis.gml.impl.SurfacePatchDocumentImpl implements net.opengis.gml.PolygonPatchDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPatchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONPATCH$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolygonPatch");
    
    
    /**
     * Gets the "PolygonPatch" element
     */
    public net.opengis.gml.PolygonPatchType getPolygonPatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchType target = null;
            target = (net.opengis.gml.PolygonPatchType)get_store().find_element_user(POLYGONPATCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PolygonPatch" element
     */
    @Inject(optional=true) public void setPolygonPatch(net.opengis.gml.PolygonPatchType polygonPatch)
    {
        generatedSetterHelperImpl(polygonPatch, POLYGONPATCH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PolygonPatch" element
     */
    public net.opengis.gml.PolygonPatchType addNewPolygonPatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchType target = null;
            target = (net.opengis.gml.PolygonPatchType)get_store().add_element_user(POLYGONPATCH$0);
            return target;
        }
    }
}
