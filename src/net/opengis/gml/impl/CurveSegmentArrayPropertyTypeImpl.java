/*
 * XML Type:  CurveSegmentArrayPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveSegmentArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CurveSegmentArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CurveSegmentArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CurveSegmentArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public CurveSegmentArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVESEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CurveSegment");
    private static final org.apache.xmlbeans.QNameSet CURVESEGMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CubicSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineStringSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Geodesic"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcByCenterPoint"),
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
     * Gets a List of "_CurveSegment" elements
     */
    public java.util.List<net.opengis.gml.AbstractCurveSegmentType> getCurveSegmentList()
    {
        final class CurveSegmentList extends java.util.AbstractList<net.opengis.gml.AbstractCurveSegmentType>
        {
            @Override
            public net.opengis.gml.AbstractCurveSegmentType get(int i)
                { return CurveSegmentArrayPropertyTypeImpl.this.getCurveSegmentArray(i); }
            
            @Override
            public net.opengis.gml.AbstractCurveSegmentType set(int i, net.opengis.gml.AbstractCurveSegmentType o)
            {
                net.opengis.gml.AbstractCurveSegmentType old = CurveSegmentArrayPropertyTypeImpl.this.getCurveSegmentArray(i);
                CurveSegmentArrayPropertyTypeImpl.this.setCurveSegmentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractCurveSegmentType o)
                { CurveSegmentArrayPropertyTypeImpl.this.insertNewCurveSegment(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractCurveSegmentType remove(int i)
            {
                net.opengis.gml.AbstractCurveSegmentType old = CurveSegmentArrayPropertyTypeImpl.this.getCurveSegmentArray(i);
                CurveSegmentArrayPropertyTypeImpl.this.removeCurveSegment(i);
                return old;
            }
            
            @Override
            public int size()
                { return CurveSegmentArrayPropertyTypeImpl.this.sizeOfCurveSegmentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CurveSegmentList();
        }
    }
    
    /**
     * Gets array of all "_CurveSegment" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractCurveSegmentType[] getCurveSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractCurveSegmentType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractCurveSegmentType>();
            get_store().find_all_element_users(CURVESEGMENT$1, targetList);
            net.opengis.gml.AbstractCurveSegmentType[] result = new net.opengis.gml.AbstractCurveSegmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_CurveSegment" element
     */
    public net.opengis.gml.AbstractCurveSegmentType getCurveSegmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().find_element_user(CURVESEGMENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_CurveSegment" element
     */
    public int sizeOfCurveSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVESEGMENT$1);
        }
    }
    
    /**
     * Sets array of all "_CurveSegment" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCurveSegmentArray(net.opengis.gml.AbstractCurveSegmentType[] curveSegmentArray)
    {
        check_orphaned();
        arraySetterHelper(curveSegmentArray, CURVESEGMENT$0, CURVESEGMENT$1);
    }
    
    /**
     * Sets ith "_CurveSegment" element
     */
    @Inject(optional=true) public void setCurveSegmentArray(int i, net.opengis.gml.AbstractCurveSegmentType curveSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().find_element_user(CURVESEGMENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(curveSegment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_CurveSegment" element
     */
    public net.opengis.gml.AbstractCurveSegmentType insertNewCurveSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().insert_element_user(CURVESEGMENT$1, CURVESEGMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_CurveSegment" element
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
    
    /**
     * Removes the ith "_CurveSegment" element
     */
    public void removeCurveSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVESEGMENT$1, i);
        }
    }
}
