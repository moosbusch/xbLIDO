/*
 * An XML document type.
 * Localname: _ParametricCurveSurface
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ParametricCurveSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _ParametricCurveSurface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ParametricCurveSurfaceDocumentImpl extends net.opengis.gml.impl.SurfacePatchDocumentImpl implements net.opengis.gml.ParametricCurveSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParametricCurveSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETRICCURVESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ParametricCurveSurface");
    private static final org.apache.xmlbeans.QNameSet PARAMETRICCURVESURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ParametricCurveSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GriddedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cylinder"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Sphere"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cone"),
    });
    
    
    /**
     * Gets the "_ParametricCurveSurface" element
     */
    public net.opengis.gml.AbstractParametricCurveSurfaceType getParametricCurveSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.AbstractParametricCurveSurfaceType)get_store().find_element_user(PARAMETRICCURVESURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_ParametricCurveSurface" element
     */
    @Inject(optional=true) public void setParametricCurveSurface(net.opengis.gml.AbstractParametricCurveSurfaceType parametricCurveSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.AbstractParametricCurveSurfaceType)get_store().find_element_user(PARAMETRICCURVESURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractParametricCurveSurfaceType)get_store().add_element_user(PARAMETRICCURVESURFACE$0);
            }
            target.set(parametricCurveSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "_ParametricCurveSurface" element
     */
    public net.opengis.gml.AbstractParametricCurveSurfaceType addNewParametricCurveSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractParametricCurveSurfaceType target = null;
            target = (net.opengis.gml.AbstractParametricCurveSurfaceType)get_store().add_element_user(PARAMETRICCURVESURFACE$0);
            return target;
        }
    }
}
