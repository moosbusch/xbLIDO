/*
 * An XML document type.
 * Localname: TimeOrdinalEra
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeOrdinalEraDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimeOrdinalEra(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeOrdinalEraDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TimeOrdinalEraDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeOrdinalEraDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEORDINALERA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeOrdinalEra");
    
    
    /**
     * Gets the "TimeOrdinalEra" element
     */
    public net.opengis.gml.TimeOrdinalEraType getTimeOrdinalEra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalEraType target = null;
            target = (net.opengis.gml.TimeOrdinalEraType)get_store().find_element_user(TIMEORDINALERA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeOrdinalEra" element
     */
    @Inject(optional=true) public void setTimeOrdinalEra(net.opengis.gml.TimeOrdinalEraType timeOrdinalEra)
    {
        generatedSetterHelperImpl(timeOrdinalEra, TIMEORDINALERA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeOrdinalEra" element
     */
    public net.opengis.gml.TimeOrdinalEraType addNewTimeOrdinalEra()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalEraType target = null;
            target = (net.opengis.gml.TimeOrdinalEraType)get_store().add_element_user(TIMEORDINALERA$0);
            return target;
        }
    }
}
