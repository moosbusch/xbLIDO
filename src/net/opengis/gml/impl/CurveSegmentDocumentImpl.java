/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
