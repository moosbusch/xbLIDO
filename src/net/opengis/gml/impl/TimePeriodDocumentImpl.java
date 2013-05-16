/*
 * An XML document type.
 * Localname: TimePeriod
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimePeriodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimePeriod(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimePeriodDocumentImpl extends net.opengis.gml.impl.TimeGeometricPrimitiveDocumentImpl implements net.opengis.gml.TimePeriodDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEPERIOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimePeriod");
    
    
    /**
     * Gets the "TimePeriod" element
     */
    public net.opengis.gml.TimePeriodType getTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodType target = null;
            target = (net.opengis.gml.TimePeriodType)get_store().find_element_user(TIMEPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimePeriod" element
     */
    @Inject(optional=true) public void setTimePeriod(net.opengis.gml.TimePeriodType timePeriod)
    {
        generatedSetterHelperImpl(timePeriod, TIMEPERIOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimePeriod" element
     */
    public net.opengis.gml.TimePeriodType addNewTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodType target = null;
            target = (net.opengis.gml.TimePeriodType)get_store().add_element_user(TIMEPERIOD$0);
            return target;
        }
    }
}
