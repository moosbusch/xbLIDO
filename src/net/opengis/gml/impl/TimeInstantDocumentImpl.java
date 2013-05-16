/*
 * An XML document type.
 * Localname: TimeInstant
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeInstantDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimeInstant(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeInstantDocumentImpl extends net.opengis.gml.impl.TimeGeometricPrimitiveDocumentImpl implements net.opengis.gml.TimeInstantDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeInstantDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINSTANT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeInstant");
    
    
    /**
     * Gets the "TimeInstant" element
     */
    public net.opengis.gml.TimeInstantType getTimeInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantType target = null;
            target = (net.opengis.gml.TimeInstantType)get_store().find_element_user(TIMEINSTANT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeInstant" element
     */
    @Inject(optional=true) public void setTimeInstant(net.opengis.gml.TimeInstantType timeInstant)
    {
        generatedSetterHelperImpl(timeInstant, TIMEINSTANT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeInstant" element
     */
    public net.opengis.gml.TimeInstantType addNewTimeInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantType target = null;
            target = (net.opengis.gml.TimeInstantType)get_store().add_element_user(TIMEINSTANT$0);
            return target;
        }
    }
}
