/*
 * XML Type:  TriangulatedSurfaceType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TriangulatedSurfaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TriangulatedSurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TriangulatedSurfaceTypeImpl extends net.opengis.gml.impl.SurfaceTypeImpl implements net.opengis.gml.TriangulatedSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public TriangulatedSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIANGLEPATCHES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "trianglePatches");
    
    
    /**
     * Gets the "trianglePatches" element
     */
    public net.opengis.gml.TrianglePatchArrayPropertyType getTrianglePatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TrianglePatchArrayPropertyType target = null;
            target = (net.opengis.gml.TrianglePatchArrayPropertyType)get_store().find_element_user(TRIANGLEPATCHES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "trianglePatches" element
     */
    @Inject(optional=true) public void setTrianglePatches(net.opengis.gml.TrianglePatchArrayPropertyType trianglePatches)
    {
        generatedSetterHelperImpl(trianglePatches, TRIANGLEPATCHES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "trianglePatches" element
     */
    public net.opengis.gml.TrianglePatchArrayPropertyType addNewTrianglePatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TrianglePatchArrayPropertyType target = null;
            target = (net.opengis.gml.TrianglePatchArrayPropertyType)get_store().add_element_user(TRIANGLEPATCHES$0);
            return target;
        }
    }
}
