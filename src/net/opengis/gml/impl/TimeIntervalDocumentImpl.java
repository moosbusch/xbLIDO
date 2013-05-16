/*
 * An XML document type.
 * Localname: timeInterval
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeIntervalDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one timeInterval(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeIntervalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TimeIntervalDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeIntervalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINTERVAL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "timeInterval");
    
    
    /**
     * Gets the "timeInterval" element
     */
    public net.opengis.gml.TimeIntervalLengthType getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.TimeIntervalLengthType)get_store().find_element_user(TIMEINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timeInterval" element
     */
    @Inject(optional=true) public void setTimeInterval(net.opengis.gml.TimeIntervalLengthType timeInterval)
    {
        generatedSetterHelperImpl(timeInterval, TIMEINTERVAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeInterval" element
     */
    public net.opengis.gml.TimeIntervalLengthType addNewTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.TimeIntervalLengthType)get_store().add_element_user(TIMEINTERVAL$0);
            return target;
        }
    }
}
