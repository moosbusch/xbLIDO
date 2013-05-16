/*
 * An XML document type.
 * Localname: _GriddedSurface
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GriddedSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _GriddedSurface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GriddedSurfaceDocumentImpl extends net.opengis.gml.impl.ParametricCurveSurfaceDocumentImpl implements net.opengis.gml.GriddedSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public GriddedSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDDEDSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GriddedSurface");
    private static final org.apache.xmlbeans.QNameSet GRIDDEDSURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cone"),
    });
    
    
    /**
     * Gets the "_GriddedSurface" element
     */
    public net.opengis.gml.AbstractGriddedSurfaceType getGriddedSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGriddedSurfaceType target = null;
            target = (net.opengis.gml.AbstractGriddedSurfaceType)get_store().find_element_user(GRIDDEDSURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GriddedSurface" element
     */
    @Inject(optional=true) public void setGriddedSurface(net.opengis.gml.AbstractGriddedSurfaceType griddedSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGriddedSurfaceType target = null;
            target = (net.opengis.gml.AbstractGriddedSurfaceType)get_store().find_element_user(GRIDDEDSURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGriddedSurfaceType)get_store().add_element_user(GRIDDEDSURFACE$0);
            }
            target.set(griddedSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "_GriddedSurface" element
     */
    public net.opengis.gml.AbstractGriddedSurfaceType addNewGriddedSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGriddedSurfaceType target = null;
            target = (net.opengis.gml.AbstractGriddedSurfaceType)get_store().add_element_user(GRIDDEDSURFACE$0);
            return target;
        }
    }
}