/*
 * An XML document type.
 * Localname: _TimeReferenceSystem
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _TimeReferenceSystem(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeReferenceSystemDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.TimeReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeReferenceSystem");
    private static final org.apache.xmlbeans.QNameSet TIMEREFERENCESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeReferenceSystem"),
    });
    
    
    /**
     * Gets the "_TimeReferenceSystem" element
     */
    public net.opengis.gml.AbstractTimeReferenceSystemType getTimeReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractTimeReferenceSystemType)get_store().find_element_user(TIMEREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeReferenceSystem" element
     */
    @Inject(optional=true) public void setTimeReferenceSystem(net.opengis.gml.AbstractTimeReferenceSystemType timeReferenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractTimeReferenceSystemType)get_store().find_element_user(TIMEREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeReferenceSystemType)get_store().add_element_user(TIMEREFERENCESYSTEM$0);
            }
            target.set(timeReferenceSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeReferenceSystem" element
     */
    public net.opengis.gml.AbstractTimeReferenceSystemType addNewTimeReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractTimeReferenceSystemType)get_store().add_element_user(TIMEREFERENCESYSTEM$0);
            return target;
        }
    }
}
