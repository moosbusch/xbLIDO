/*
 * An XML document type.
 * Localname: TimeCalendarEra
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeCalendarEraDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimeCalendarEra(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeCalendarEraDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.TimeCalendarEraDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeCalendarEraDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECALENDARERA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendarEra");
    
    
    /**
     * Gets the "TimeCalendarEra" element
     */
    public net.opengis.gml.TimeCalendarEraType getTimeCalendarEra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarEraType target = null;
            target = (net.opengis.gml.TimeCalendarEraType)get_store().find_element_user(TIMECALENDARERA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeCalendarEra" element
     */
    @Inject(optional=true) public void setTimeCalendarEra(net.opengis.gml.TimeCalendarEraType timeCalendarEra)
    {
        generatedSetterHelperImpl(timeCalendarEra, TIMECALENDARERA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeCalendarEra" element
     */
    public net.opengis.gml.TimeCalendarEraType addNewTimeCalendarEra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCalendarEraType target = null;
            target = (net.opengis.gml.TimeCalendarEraType)get_store().add_element_user(TIMECALENDARERA$0);
            return target;
        }
    }
}
