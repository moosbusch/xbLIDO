/*
 * An XML document type.
 * Localname: _TimeSlice
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeSliceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _TimeSlice(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeSliceDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.TimeSliceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeSliceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets the "_TimeSlice" element
     */
    public net.opengis.gml.AbstractTimeSliceType getTimeSlice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().find_element_user(TIMESLICE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeSlice" element
     */
    @Inject(optional=true) public void setTimeSlice(net.opengis.gml.AbstractTimeSliceType timeSlice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeSliceType target = null;
            target = (net.opengis.gml.AbstractTimeSliceType)get_store().find_element_user(TIMESLICE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeSliceType)get_store().add_element_user(TIMESLICE$0);
            }
            target.set(timeSlice);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeSlice" element
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
}
