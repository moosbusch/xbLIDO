/*
 * An XML document type.
 * Localname: TimeCalendar
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeCalendarDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimeCalendar(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeCalendarDocumentImpl extends net.opengis.gml.impl.TimeReferenceSystemDocumentImpl implements net.opengis.gml.TimeCalendarDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeCalendarDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECALENDAR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendar");
    
    
    /**
     * Gets the "TimeCalendar" element
     */
    public net.opengis.gml.TimeCalendarType getTimeCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarType target = null;
            target = (net.opengis.gml.TimeCalendarType)get_store().find_element_user(TIMECALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeCalendar" element
     */
    @Inject(optional=true) public void setTimeCalendar(net.opengis.gml.TimeCalendarType timeCalendar)
    {
        generatedSetterHelperImpl(timeCalendar, TIMECALENDAR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeCalendar" element
     */
    public net.opengis.gml.TimeCalendarType addNewTimeCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarType target = null;
            target = (net.opengis.gml.TimeCalendarType)get_store().add_element_user(TIMECALENDAR$0);
            return target;
        }
    }
}
