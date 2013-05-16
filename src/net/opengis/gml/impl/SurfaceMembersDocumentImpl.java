/*
 * An XML document type.
 * Localname: surfaceMembers
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SurfaceMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one surfaceMembers(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SurfaceMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SurfaceMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "surfaceMembers");
    
    
    /**
     * Gets the "surfaceMembers" element
     */
    public net.opengis.gml.SurfaceArrayPropertyType getSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.SurfaceArrayPropertyType)get_store().find_element_user(SURFACEMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "surfaceMembers" element
     */
    @Inject(optional=true) public void setSurfaceMembers(net.opengis.gml.SurfaceArrayPropertyType surfaceMembers)
    {
        generatedSetterHelperImpl(surfaceMembers, SURFACEMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceMembers" element
     */
    public net.opengis.gml.SurfaceArrayPropertyType addNewSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.SurfaceArrayPropertyType)get_store().add_element_user(SURFACEMEMBERS$0);
            return target;
        }
    }
}
