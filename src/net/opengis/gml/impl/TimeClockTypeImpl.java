/*
 * XML Type:  TimeClockType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeClockType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TimeClockType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeClockTypeImpl extends net.opengis.gml.impl.AbstractTimeReferenceSystemTypeImpl implements net.opengis.gml.TimeClockType
{
    private static final long serialVersionUID = 1L;
    
    public TimeClockTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCEEVENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "referenceEvent");
    private static final javax.xml.namespace.QName REFERENCETIME$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "referenceTime");
    private static final javax.xml.namespace.QName UTCREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "utcReference");
    private static final javax.xml.namespace.QName DATEBASIS$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dateBasis");
    
    
    /**
     * Gets the "referenceEvent" element
     */
    public net.opengis.gml.StringOrRefType getReferenceEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(REFERENCEEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "referenceEvent" element
     */
    @Inject(optional=true) public void setReferenceEvent(net.opengis.gml.StringOrRefType referenceEvent)
    {
        generatedSetterHelperImpl(referenceEvent, REFERENCEEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referenceEvent" element
     */
    public net.opengis.gml.StringOrRefType addNewReferenceEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(REFERENCEEVENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "referenceTime" element
     */
    public java.util.Calendar getReferenceTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCETIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "referenceTime" element
     */
    public org.apache.xmlbeans.XmlTime xgetReferenceTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(REFERENCETIME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "referenceTime" element
     */
    @Inject(optional=true) public void setReferenceTime(java.util.Calendar referenceTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCETIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCETIME$2);
            }
            target.setCalendarValue(referenceTime);
        }
    }
    
    /**
     * Sets (as xml) the "referenceTime" element
     */
    public void xsetReferenceTime(org.apache.xmlbeans.XmlTime referenceTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(REFERENCETIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(REFERENCETIME$2);
            }
            target.set(referenceTime);
        }
    }
    
    /**
     * Gets the "utcReference" element
     */
    public java.util.Calendar getUtcReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UTCREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "utcReference" element
     */
    public org.apache.xmlbeans.XmlTime xgetUtcReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(UTCREFERENCE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "utcReference" element
     */
    @Inject(optional=true) public void setUtcReference(java.util.Calendar utcReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UTCREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UTCREFERENCE$4);
            }
            target.setCalendarValue(utcReference);
        }
    }
    
    /**
     * Sets (as xml) the "utcReference" element
     */
    public void xsetUtcReference(org.apache.xmlbeans.XmlTime utcReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(UTCREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(UTCREFERENCE$4);
            }
            target.set(utcReference);
        }
    }
    
    /**
     * Gets a List of "dateBasis" elements
     */
    public java.util.List<net.opengis.gml.TimeCalendarPropertyType> getDateBasisList()
    {
        final class DateBasisList extends java.util.AbstractList<net.opengis.gml.TimeCalendarPropertyType>
        {
            @Override
            public net.opengis.gml.TimeCalendarPropertyType get(int i)
                { return TimeClockTypeImpl.this.getDateBasisArray(i); }
            
            @Override
            public net.opengis.gml.TimeCalendarPropertyType set(int i, net.opengis.gml.TimeCalendarPropertyType o)
            {
                net.opengis.gml.TimeCalendarPropertyType old = TimeClockTypeImpl.this.getDateBasisArray(i);
                TimeClockTypeImpl.this.setDateBasisArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TimeCalendarPropertyType o)
                { TimeClockTypeImpl.this.insertNewDateBasis(i).set(o); }
            
            @Override
            public net.opengis.gml.TimeCalendarPropertyType remove(int i)
            {
                net.opengis.gml.TimeCalendarPropertyType old = TimeClockTypeImpl.this.getDateBasisArray(i);
                TimeClockTypeImpl.this.removeDateBasis(i);
                return old;
            }
            
            @Override
            public int size()
                { return TimeClockTypeImpl.this.sizeOfDateBasisArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DateBasisList();
        }
    }
    
    /**
     * Gets array of all "dateBasis" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimeCalendarPropertyType[] getDateBasisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimeCalendarPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.TimeCalendarPropertyType>();
            get_store().find_all_element_users(DATEBASIS$6, targetList);
            net.opengis.gml.TimeCalendarPropertyType[] result = new net.opengis.gml.TimeCalendarPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dateBasis" element
     */
    public net.opengis.gml.TimeCalendarPropertyType getDateBasisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarPropertyType target = null;
            target = (net.opengis.gml.TimeCalendarPropertyType)get_store().find_element_user(DATEBASIS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dateBasis" element
     */
    public int sizeOfDateBasisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEBASIS$6);
        }
    }
    
    /**
     * Sets array of all "dateBasis" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDateBasisArray(net.opengis.gml.TimeCalendarPropertyType[] dateBasisArray)
    {
        check_orphaned();
        arraySetterHelper(dateBasisArray, DATEBASIS$6);
    }
    
    /**
     * Sets ith "dateBasis" element
     */
    @Inject(optional=true) public void setDateBasisArray(int i, net.opengis.gml.TimeCalendarPropertyType dateBasis)
    {
        generatedSetterHelperImpl(dateBasis, DATEBASIS$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateBasis" element
     */
    public net.opengis.gml.TimeCalendarPropertyType insertNewDateBasis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarPropertyType target = null;
            target = (net.opengis.gml.TimeCalendarPropertyType)get_store().insert_element_user(DATEBASIS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateBasis" element
     */
    public net.opengis.gml.TimeCalendarPropertyType addNewDateBasis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarPropertyType target = null;
            target = (net.opengis.gml.TimeCalendarPropertyType)get_store().add_element_user(DATEBASIS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "dateBasis" element
     */
    public void removeDateBasis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEBASIS$6, i);
        }
    }
}
