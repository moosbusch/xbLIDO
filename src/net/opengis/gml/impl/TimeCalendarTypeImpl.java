/*
 * XML Type:  TimeCalendarType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeCalendarType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TimeCalendarType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeCalendarTypeImpl extends net.opengis.gml.impl.AbstractTimeReferenceSystemTypeImpl implements net.opengis.gml.TimeCalendarType
{
    private static final long serialVersionUID = 1L;
    
    public TimeCalendarTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCEFRAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "referenceFrame");
    
    
    /**
     * Gets a List of "referenceFrame" elements
     */
    public java.util.List<net.opengis.gml.TimeCalendarEraPropertyType> getReferenceFrameList()
    {
        final class ReferenceFrameList extends java.util.AbstractList<net.opengis.gml.TimeCalendarEraPropertyType>
        {
            @Override
            public net.opengis.gml.TimeCalendarEraPropertyType get(int i)
                { return TimeCalendarTypeImpl.this.getReferenceFrameArray(i); }
            
            @Override
            public net.opengis.gml.TimeCalendarEraPropertyType set(int i, net.opengis.gml.TimeCalendarEraPropertyType o)
            {
                net.opengis.gml.TimeCalendarEraPropertyType old = TimeCalendarTypeImpl.this.getReferenceFrameArray(i);
                TimeCalendarTypeImpl.this.setReferenceFrameArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TimeCalendarEraPropertyType o)
                { TimeCalendarTypeImpl.this.insertNewReferenceFrame(i).set(o); }
            
            @Override
            public net.opengis.gml.TimeCalendarEraPropertyType remove(int i)
            {
                net.opengis.gml.TimeCalendarEraPropertyType old = TimeCalendarTypeImpl.this.getReferenceFrameArray(i);
                TimeCalendarTypeImpl.this.removeReferenceFrame(i);
                return old;
            }
            
            @Override
            public int size()
                { return TimeCalendarTypeImpl.this.sizeOfReferenceFrameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReferenceFrameList();
        }
    }
    
    /**
     * Gets array of all "referenceFrame" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimeCalendarEraPropertyType[] getReferenceFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimeCalendarEraPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.TimeCalendarEraPropertyType>();
            get_store().find_all_element_users(REFERENCEFRAME$0, targetList);
            net.opengis.gml.TimeCalendarEraPropertyType[] result = new net.opengis.gml.TimeCalendarEraPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "referenceFrame" element
     */
    public net.opengis.gml.TimeCalendarEraPropertyType getReferenceFrameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarEraPropertyType target = null;
            target = (net.opengis.gml.TimeCalendarEraPropertyType)get_store().find_element_user(REFERENCEFRAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "referenceFrame" element
     */
    public int sizeOfReferenceFrameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEFRAME$0);
        }
    }
    
    /**
     * Sets array of all "referenceFrame" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setReferenceFrameArray(net.opengis.gml.TimeCalendarEraPropertyType[] referenceFrameArray)
    {
        check_orphaned();
        arraySetterHelper(referenceFrameArray, REFERENCEFRAME$0);
    }
    
    /**
     * Sets ith "referenceFrame" element
     */
    @Inject(optional=true) public void setReferenceFrameArray(int i, net.opengis.gml.TimeCalendarEraPropertyType referenceFrame)
    {
        generatedSetterHelperImpl(referenceFrame, REFERENCEFRAME$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "referenceFrame" element
     */
    public net.opengis.gml.TimeCalendarEraPropertyType insertNewReferenceFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarEraPropertyType target = null;
            target = (net.opengis.gml.TimeCalendarEraPropertyType)get_store().insert_element_user(REFERENCEFRAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "referenceFrame" element
     */
    public net.opengis.gml.TimeCalendarEraPropertyType addNewReferenceFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarEraPropertyType target = null;
            target = (net.opengis.gml.TimeCalendarEraPropertyType)get_store().add_element_user(REFERENCEFRAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "referenceFrame" element
     */
    public void removeReferenceFrame(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEFRAME$0, i);
        }
    }
}
