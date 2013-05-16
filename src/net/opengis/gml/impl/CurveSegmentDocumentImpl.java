/*
 * An XML document type.
 * Localname: _CurveSegment
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveSegmentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _CurveSegment(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CurveSegmentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CurveSegmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveSegmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVESEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CurveSegment");
    private static final org.apache.xmlbeans.QNameSet CURVESEGMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineStringSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CubicSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Geodesic"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CurveSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OffsetCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Clothoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Arc"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcByBulge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Bezier"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodesicString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcStringByBulge"),
    });
    
    
    /**
     * Gets the "_CurveSegment" element
     */
    public net.opengis.gml.AbstractCurveSegmentType getCurveSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().find_element_user(CURVESEGMENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_CurveSegment" element
     */
    @Inject(optional=true) public void setCurveSegment(net.opengis.gml.AbstractCurveSegmentType curveSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().find_element_user(CURVESEGMENT$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractCurveSegmentType)get_store().add_element_user(CURVESEGMENT$0);
            }
            target.set(curveSegment);
        }
    }
    
    /**
     * Appends and returns a new empty "_CurveSegment" element
     */
    public net.opengis.gml.AbstractCurveSegmentType addNewCurveSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().add_element_user(CURVESEGMENT$0);
            return target;
        }
    }
}
