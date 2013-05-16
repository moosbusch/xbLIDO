/*
 * XML Type:  PointArrayPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PointArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML PointArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PointArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PointArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public PointArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point");
    
    
    /**
     * Gets a List of "Point" elements
     */
    public java.util.List<net.opengis.gml.PointType> getPointList()
    {
        final class PointList extends java.util.AbstractList<net.opengis.gml.PointType>
        {
            @Override
            public net.opengis.gml.PointType get(int i)
                { return PointArrayPropertyTypeImpl.this.getPointArray(i); }
            
            @Override
            public net.opengis.gml.PointType set(int i, net.opengis.gml.PointType o)
            {
                net.opengis.gml.PointType old = PointArrayPropertyTypeImpl.this.getPointArray(i);
                PointArrayPropertyTypeImpl.this.setPointArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.PointType o)
                { PointArrayPropertyTypeImpl.this.insertNewPoint(i).set(o); }
            
            @Override
            public net.opengis.gml.PointType remove(int i)
            {
                net.opengis.gml.PointType old = PointArrayPropertyTypeImpl.this.getPointArray(i);
                PointArrayPropertyTypeImpl.this.removePoint(i);
                return old;
            }
            
            @Override
            public int size()
                { return PointArrayPropertyTypeImpl.this.sizeOfPointArray(); }
            
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
}
