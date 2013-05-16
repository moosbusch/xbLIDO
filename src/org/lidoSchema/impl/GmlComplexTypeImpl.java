/*
 * XML Type:  gmlComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.GmlComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML gmlComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class GmlComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.GmlComplexType
{
    private static final long serialVersionUID = 1L;
    
    public GmlComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point");
    private static final javax.xml.namespace.QName LINESTRING$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString");
    private static final javax.xml.namespace.QName POLYGON$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon");
    
    
    /**
     * Gets a List of "Point" elements
     */
    public java.util.List<net.opengis.gml.PointType> getPointList()
    {
        final class PointList extends java.util.AbstractList<net.opengis.gml.PointType>
        {
            @Override
            public net.opengis.gml.PointType get(int i)
                { return GmlComplexTypeImpl.this.getPointArray(i); }
            
            @Override
            public net.opengis.gml.PointType set(int i, net.opengis.gml.PointType o)
            {
                net.opengis.gml.PointType old = GmlComplexTypeImpl.this.getPointArray(i);
                GmlComplexTypeImpl.this.setPointArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointType o)
                { GmlComplexTypeImpl.this.insertNewPoint(i).set(o); }
            
            @Override
            public net.opengis.gml.PointType remove(int i)
            {
                net.opengis.gml.PointType old = GmlComplexTypeImpl.this.getPointArray(i);
                GmlComplexTypeImpl.this.removePoint(i);
                return old;
            }
            
            @Override
            public int size()
                { return GmlComplexTypeImpl.this.sizeOfPointArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PointList();
        }
    }
    
    /**
     * Gets array of all "Point" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.PointType[] getPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.PointType> targetList = new java.util.ArrayList<net.opengis.gml.PointType>();
            get_store().find_all_element_users(POINT$0, targetList);
            net.opengis.gml.PointType[] result = new net.opengis.gml.PointType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Point" element
     */
    public net.opengis.gml.PointType getPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Point" element
     */
    public int sizeOfPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINT$0);
        }
    }
    
    /**
     * Sets array of all "Point" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPointArray(net.opengis.gml.PointType[] pointArray)
    {
        check_orphaned();
        arraySetterHelper(pointArray, POINT$0);
    }
    
    /**
     * Sets ith "Point" element
     */
    @Inject(optional=true) public void setPointArray(int i, net.opengis.gml.PointType point)
    {
        generatedSetterHelperImpl(point, POINT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Point" element
     */
    public net.opengis.gml.PointType insertNewPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().insert_element_user(POINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Point" element
     */
    public net.opengis.gml.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Point" element
     */
    public void removePoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINT$0, i);
        }
    }
    
    /**
     * Gets a List of "LineString" elements
     */
    public java.util.List<net.opengis.gml.LineStringType> getLineStringList()
    {
        final class LineStringList extends java.util.AbstractList<net.opengis.gml.LineStringType>
        {
            @Override
            public net.opengis.gml.LineStringType get(int i)
                { return GmlComplexTypeImpl.this.getLineStringArray(i); }
            
            @Override
            public net.opengis.gml.LineStringType set(int i, net.opengis.gml.LineStringType o)
            {
                net.opengis.gml.LineStringType old = GmlComplexTypeImpl.this.getLineStringArray(i);
                GmlComplexTypeImpl.this.setLineStringArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.LineStringType o)
                { GmlComplexTypeImpl.this.insertNewLineString(i).set(o); }
            
            @Override
            public net.opengis.gml.LineStringType remove(int i)
            {
                net.opengis.gml.LineStringType old = GmlComplexTypeImpl.this.getLineStringArray(i);
                GmlComplexTypeImpl.this.removeLineString(i);
                return old;
            }
            
            @Override
            public int size()
                { return GmlComplexTypeImpl.this.sizeOfLineStringArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LineStringList();
        }
    }
    
    /**
     * Gets array of all "LineString" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.LineStringType[] getLineStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.LineStringType> targetList = new java.util.ArrayList<net.opengis.gml.LineStringType>();
            get_store().find_all_element_users(LINESTRING$2, targetList);
            net.opengis.gml.LineStringType[] result = new net.opengis.gml.LineStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LineString" element
     */
    public net.opengis.gml.LineStringType getLineStringArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().find_element_user(LINESTRING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LineString" element
     */
    public int sizeOfLineStringArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINESTRING$2);
        }
    }
    
    /**
     * Sets array of all "LineString" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setLineStringArray(net.opengis.gml.LineStringType[] lineStringArray)
    {
        check_orphaned();
        arraySetterHelper(lineStringArray, LINESTRING$2);
    }
    
    /**
     * Sets ith "LineString" element
     */
    @Inject(optional=true) public void setLineStringArray(int i, net.opengis.gml.LineStringType lineString)
    {
        generatedSetterHelperImpl(lineString, LINESTRING$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LineString" element
     */
    public net.opengis.gml.LineStringType insertNewLineString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().insert_element_user(LINESTRING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LineString" element
     */
    public net.opengis.gml.LineStringType addNewLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().add_element_user(LINESTRING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "LineString" element
     */
    public void removeLineString(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINESTRING$2, i);
        }
    }
    
    /**
     * Gets a List of "Polygon" elements
     */
    public java.util.List<net.opengis.gml.PolygonType> getPolygonList()
    {
        final class PolygonList extends java.util.AbstractList<net.opengis.gml.PolygonType>
        {
            @Override
            public net.opengis.gml.PolygonType get(int i)
                { return GmlComplexTypeImpl.this.getPolygonArray(i); }
            
            @Override
            public net.opengis.gml.PolygonType set(int i, net.opengis.gml.PolygonType o)
            {
                net.opengis.gml.PolygonType old = GmlComplexTypeImpl.this.getPolygonArray(i);
                GmlComplexTypeImpl.this.setPolygonArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PolygonType o)
                { GmlComplexTypeImpl.this.insertNewPolygon(i).set(o); }
            
            @Override
            public net.opengis.gml.PolygonType remove(int i)
            {
                net.opengis.gml.PolygonType old = GmlComplexTypeImpl.this.getPolygonArray(i);
                GmlComplexTypeImpl.this.removePolygon(i);
                return old;
            }
            
            @Override
            public int size()
                { return GmlComplexTypeImpl.this.sizeOfPolygonArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PolygonList();
        }
    }
    
    /**
     * Gets array of all "Polygon" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.PolygonType[] getPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.PolygonType> targetList = new java.util.ArrayList<net.opengis.gml.PolygonType>();
            get_store().find_all_element_users(POLYGON$4, targetList);
            net.opengis.gml.PolygonType[] result = new net.opengis.gml.PolygonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Polygon" element
     */
    public net.opengis.gml.PolygonType getPolygonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Polygon" element
     */
    public int sizeOfPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGON$4);
        }
    }
    
    /**
     * Sets array of all "Polygon" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPolygonArray(net.opengis.gml.PolygonType[] polygonArray)
    {
        check_orphaned();
        arraySetterHelper(polygonArray, POLYGON$4);
    }
    
    /**
     * Sets ith "Polygon" element
     */
    @Inject(optional=true) public void setPolygonArray(int i, net.opengis.gml.PolygonType polygon)
    {
        generatedSetterHelperImpl(polygon, POLYGON$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Polygon" element
     */
    public net.opengis.gml.PolygonType insertNewPolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().insert_element_user(POLYGON$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Polygon" element
     */
    public net.opengis.gml.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Polygon" element
     */
    public void removePolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGON$4, i);
        }
    }
}
