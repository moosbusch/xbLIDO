/*
 * An XML document type.
 * Localname: OrientableSurface
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OrientableSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one OrientableSurface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OrientableSurfaceDocumentImpl extends net.opengis.gml.impl.SurfaceDocumentImpl implements net.opengis.gml.OrientableSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrientableSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIENTABLESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableSurface");
    
    
    /**
     * Gets the "OrientableSurface" element
     */
    public net.opengis.gml.OrientableSurfaceType getOrientableSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OrientableSurfaceType target = null;
            target = (net.opengis.gml.OrientableSurfaceType)get_store().find_element_user(ORIENTABLESURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrientableSurface" element
     */
    @Inject(optional=true) public void setOrientableSurface(net.opengis.gml.OrientableSurfaceType orientableSurface)
    {
        generatedSetterHelperImpl(orientableSurface, ORIENTABLESURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OrientableSurface" element
     */
    public net.opengis.gml.OrientableSurfaceType addNewOrientableSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OrientableSurfaceType target = null;
            target = (net.opengis.gml.OrientableSurfaceType)get_store().add_element_user(ORIENTABLESURFACE$0);
            return target;
        }
    }
}
