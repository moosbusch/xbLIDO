/*
 * An XML document type.
 * Localname: BSpline
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BSplineDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one BSpline(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BSplineDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.BSplineDocument
{
    private static final long serialVersionUID = 1L;
    
    public BSplineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BSPLINE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BSpline");
    private static final org.apache.xmlbeans.QNameSet BSPLINE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Bezier"),
    });
    
    
    /**
     * Gets the "BSpline" element
     */
    public net.opengis.gml.BSplineType getBSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BSplineType target = null;
            target = (net.opengis.gml.BSplineType)get_store().find_element_user(BSPLINE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BSpline" element
     */
    @Inject(optional=true) public void setBSpline(net.opengis.gml.BSplineType bSpline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BSplineType target = null;
            target = (net.opengis.gml.BSplineType)get_store().find_element_user(BSPLINE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.BSplineType)get_store().add_element_user(BSPLINE$0);
            }
            target.set(bSpline);
        }
    }
    
    /**
     * Appends and returns a new empty "BSpline" element
     */
    public net.opengis.gml.BSplineType addNewBSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BSplineType target = null;
            target = (net.opengis.gml.BSplineType)get_store().add_element_user(BSPLINE$0);
            return target;
        }
    }
}
