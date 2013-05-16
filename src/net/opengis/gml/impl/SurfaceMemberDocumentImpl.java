/*
 * An XML document type.
 * Localname: surfaceMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SurfaceMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one surfaceMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SurfaceMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SurfaceMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "surfaceMember");
    
    
    /**
     * Gets the "surfaceMember" element
     */
    public net.opengis.gml.SurfacePropertyType getSurfaceMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(SURFACEMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "surfaceMember" element
     */
    @Inject(optional=true) public void setSurfaceMember(net.opengis.gml.SurfacePropertyType surfaceMember)
    {
        generatedSetterHelperImpl(surfaceMember, SURFACEMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceMember" element
     */
    public net.opengis.gml.SurfacePropertyType addNewSurfaceMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(SURFACEMEMBER$0);
            return target;
        }
    }
}
