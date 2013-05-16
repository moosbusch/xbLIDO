/*
 * XML Type:  CurveArrayPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CurveArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CurveArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CurveArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public CurveArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve");
    private static final org.apache.xmlbeans.QNameSet CURVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Curve"),
    });
    
    
    /**
     * Gets a List of "_Curve" elements
     */
    public java.util.List<net.opengis.gml.AbstractCurveType> getCurveList()
    {
        final class CurveList extends java.util.AbstractList<net.opengis.gml.AbstractCurveType>
        {
            @Override
            public net.opengis.gml.AbstractCurveType get(int i)
                { return CurveArrayPropertyTypeImpl.this.getCurveArray(i); }
            
            @Override
            public net.opengis.gml.AbstractCurveType set(int i, net.opengis.gml.AbstractCurveType o)
            {
                net.opengis.gml.AbstractCurveType old = CurveArrayPropertyTypeImpl.this.getCurveArray(i);
                CurveArrayPropertyTypeImpl.this.setCurveArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractCurveType o)
                { CurveArrayPropertyTypeImpl.this.insertNewCurve(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractCurveType remove(int i)
            {
                net.opengis.gml.AbstractCurveType old = CurveArrayPropertyTypeImpl.this.getCurveArray(i);
                CurveArrayPropertyTypeImpl.this.removeCurve(i);
                return old;
            }
            
            @Override
            public int size()
                { return CurveArrayPropertyTypeImpl.this.sizeOfCurveArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CurveList();
        }
    }
    
    /**
     * Gets array of all "_Curve" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractCurveType[] getCurveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractCurveType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractCurveType>();
            get_store().find_all_element_users(CURVE$1, targetList);
            net.opengis.gml.AbstractCurveType[] result = new net.opengis.gml.AbstractCurveType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Curve" element
     */
    public net.opengis.gml.AbstractCurveType getCurveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().find_element_user(CURVE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Curve" element
     */
    public int sizeOfCurveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVE$1);
        }
    }
    
    /**
     * Sets array of all "_Curve" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCurveArray(net.opengis.gml.AbstractCurveType[] curveArray)
    {
        check_orphaned();
        arraySetterHelper(curveArray, CURVE$0, CURVE$1);
    }
    
    /**
     * Sets ith "_Curve" element
     */
    @Inject(optional=true) public void setCurveArray(int i, net.opengis.gml.AbstractCurveType curve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().find_element_user(CURVE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(curve);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Curve" element
     */
    public net.opengis.gml.AbstractCurveType insertNewCurve(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().insert_element_user(CURVE$1, CURVE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Curve" element
     */
    public net.opengis.gml.AbstractCurveType addNewCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().add_element_user(CURVE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_Curve" element
     */
    public void removeCurve(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVE$1, i);
        }
    }
}
