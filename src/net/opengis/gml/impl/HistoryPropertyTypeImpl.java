/*
 * XML Type:  HistoryPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.HistoryPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML HistoryPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class HistoryPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.HistoryPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public HistoryPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESLICE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeSlice");
    private static final org.apache.xmlbeans.QNameSet TIMESLICE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeSlice"),
    });
    
    
    /**
     * Gets a List of "_TimeSlice" elements
     */
    public java.util.List<net.opengis.gml.AbstractTimeSliceType> getTimeSliceList()
    {
        final class TimeSliceList extends java.util.AbstractList<net.opengis.gml.AbstractTimeSliceType>
        {
            @Override
            public net.opengis.gml.AbstractTimeSliceType get(int i)
                { return HistoryPropertyTypeImpl.this.getTimeSliceArray(i); }
            
            @Override
            public net.opengis.gml.AbstractTimeSliceType set(int i, net.opengis.gml.AbstractTimeSliceType o)
            {
                net.opengis.gml.AbstractTimeSliceType old = HistoryPropertyTypeImpl.this.getTimeSliceArray(i);
                HistoryPropertyTypeImpl.this.setTimeSliceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractTimeSliceType o)
                { HistoryPropertyTypeImpl.this.insertNewTimeSlice(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractTimeSliceType remove(int i)
            {
                net.opengis.gml.AbstractTimeSliceType old = HistoryPropertyTypeImpl.this.getTimeSliceArray(i);
                HistoryPropertyTypeImpl.this.removeTimeSlice(i);
                return old;
            }
            
            @Override
            public int size()
                { return HistoryPropertyTypeImpl.this.sizeOfTimeSliceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TimeSliceList();
        }
    }
    
    /**
     * Gets array of all "_TimeSlice" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractTimeSliceType[] getTimeSliceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractTimeSliceType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractTimeSliceType>();
            get_store().find_all_element_users(TIMESLICE$1, targetList);
            net.opengis.gml.AbstractTimeSliceType[] result = new net.opengis.gml.AbstractTimeSliceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_TimeSlice" element
     */
    public net.opengis.gml.AbstractTimeSliceType getTimeSliceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().find_element_user(TIMESLICE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_TimeSlice" element
     */
    public int sizeOfTimeSliceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESLICE$1);
        }
    }
    
    /**
     * Sets array of all "_TimeSlice" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTimeSliceArray(net.opengis.gml.AbstractTimeSliceType[] timeSliceArray)
    {
        check_orphaned();
        arraySetterHelper(timeSliceArray, TIMESLICE$0, TIMESLICE$1);
    }
    
    /**
     * Sets ith "_TimeSlice" element
     */
    @Inject(optional=true) public void setTimeSliceArray(int i, net.opengis.gml.AbstractTimeSliceType timeSlice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().find_element_user(TIMESLICE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timeSlice);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_TimeSlice" element
     */
    public net.opengis.gml.AbstractTimeSliceType insertNewTimeSlice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().insert_element_user(TIMESLICE$1, TIMESLICE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_TimeSlice" element
     */
    public net.opengis.gml.AbstractTimeSliceType addNewTimeSlice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().add_element_user(TIMESLICE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_TimeSlice" element
     */
    public void removeTimeSlice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESLICE$1, i);
        }
    }
}
