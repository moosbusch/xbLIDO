/*
 * An XML document type.
 * Localname: CubicSpline
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CubicSplineDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CubicSpline(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CubicSplineDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.CubicSplineDocument
{
    private static final long serialVersionUID = 1L;
    
    public CubicSplineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUBICSPLINE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CubicSpline");
    
    
    /**
     * Gets the "CubicSpline" element
     */
    public net.opengis.gml.CubicSplineType getCubicSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CubicSplineType target = null;
            target = (net.opengis.gml.CubicSplineType)get_store().find_element_user(CUBICSPLINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CubicSpline" element
     */
    @Inject(optional=true) public void setCubicSpline(net.opengis.gml.CubicSplineType cubicSpline)
    {
        generatedSetterHelperImpl(cubicSpline, CUBICSPLINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CubicSpline" element
     */
    public net.opengis.gml.CubicSplineType addNewCubicSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CubicSplineType target = null;
            target = (net.opengis.gml.CubicSplineType)get_store().add_element_user(CUBICSPLINE$0);
            return target;
        }
    }
}
