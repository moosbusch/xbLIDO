/*
 * An XML document type.
 * Localname: TimeOrdinalReferenceSystem
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeOrdinalReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimeOrdinalReferenceSystem(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeOrdinalReferenceSystemDocumentImpl extends net.opengis.gml.impl.TimeReferenceSystemDocumentImpl implements net.opengis.gml.TimeOrdinalReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeOrdinalReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEORDINALREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeOrdinalReferenceSystem");
    
    
    /**
     * Gets the "TimeOrdinalReferenceSystem" element
     */
    public net.opengis.gml.TimeOrdinalReferenceSystemType getTimeOrdinalReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalReferenceSystemType target = null;
            target = (net.opengis.gml.TimeOrdinalReferenceSystemType)get_store().find_element_user(TIMEORDINALREFERENCESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeOrdinalReferenceSystem" element
     */
    @Inject(optional=true) public void setTimeOrdinalReferenceSystem(net.opengis.gml.TimeOrdinalReferenceSystemType timeOrdinalReferenceSystem)
    {
        generatedSetterHelperImpl(timeOrdinalReferenceSystem, TIMEORDINALREFERENCESYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeOrdinalReferenceSystem" element
     */
    public net.opengis.gml.TimeOrdinalReferenceSystemType addNewTimeOrdinalReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeOrdinalReferenceSystemType target = null;
            target = (net.opengis.gml.TimeOrdinalReferenceSystemType)get_store().add_element_user(TIMEORDINALREFERENCESYSTEM$0);
            return target;
        }
    }
}
