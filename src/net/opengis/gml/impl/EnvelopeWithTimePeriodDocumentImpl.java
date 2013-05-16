/*
 * An XML document type.
 * Localname: EnvelopeWithTimePeriod
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EnvelopeWithTimePeriodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one EnvelopeWithTimePeriod(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EnvelopeWithTimePeriodDocumentImpl extends net.opengis.gml.impl.EnvelopeDocumentImpl implements net.opengis.gml.EnvelopeWithTimePeriodDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeWithTimePeriodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPEWITHTIMEPERIOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EnvelopeWithTimePeriod");
    
    
    /**
     * Gets the "EnvelopeWithTimePeriod" element
     */
    public net.opengis.gml.EnvelopeWithTimePeriodType getEnvelopeWithTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeWithTimePeriodType target = null;
            target = (net.opengis.gml.EnvelopeWithTimePeriodType)get_store().find_element_user(ENVELOPEWITHTIMEPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnvelopeWithTimePeriod" element
     */
    @Inject(optional=true) public void setEnvelopeWithTimePeriod(net.opengis.gml.EnvelopeWithTimePeriodType envelopeWithTimePeriod)
    {
        generatedSetterHelperImpl(envelopeWithTimePeriod, ENVELOPEWITHTIMEPERIOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EnvelopeWithTimePeriod" element
     */
    public net.opengis.gml.EnvelopeWithTimePeriodType addNewEnvelopeWithTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeWithTimePeriodType target = null;
            target = (net.opengis.gml.EnvelopeWithTimePeriodType)get_store().add_element_user(ENVELOPEWITHTIMEPERIOD$0);
            return target;
        }
    }
}
