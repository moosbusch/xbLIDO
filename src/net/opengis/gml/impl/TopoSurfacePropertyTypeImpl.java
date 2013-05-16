/*
 * XML Type:  TopoSurfacePropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoSurfacePropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TopoSurfacePropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TopoSurfacePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoSurfacePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public TopoSurfacePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSurface");
    
    
    /**
     * Gets the "TopoSurface" element
     */
    public net.opengis.gml.TopoSurfaceType getTopoSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoSurfaceType target = null;
            target = (net.opengis.gml.TopoSurfaceType)get_store().find_element_user(TOPOSURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoSurface" element
     */
    @Inject(optional=true) public void setTopoSurface(net.opengis.gml.TopoSurfaceType topoSurface)
    {
        generatedSetterHelperImpl(topoSurface, TOPOSURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoSurface" element
     */
    public net.opengis.gml.TopoSurfaceType addNewTopoSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoSurfaceType target = null;
            target = (net.opengis.gml.TopoSurfaceType)get_store().add_element_user(TOPOSURFACE$0);
            return target;
        }
    }
}
