/*
 * An XML document type.
 * Localname: TimeCoordinateSystem
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeCoordinateSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimeCoordinateSystem(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeCoordinateSystemDocumentImpl extends net.opengis.gml.impl.TimeReferenceSystemDocumentImpl implements net.opengis.gml.TimeCoordinateSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeCoordinateSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECOORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCoordinateSystem");
    
    
    /**
     * Gets the "TimeCoordinateSystem" element
     */
    public net.opengis.gml.TimeCoordinateSystemType getTimeCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCoordinateSystemType target = null;
            target = (net.opengis.gml.TimeCoordinateSystemType)get_store().find_element_user(TIMECOORDINATESYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeCoordinateSystem" element
     */
    @Inject(optional=true) public void setTimeCoordinateSystem(net.opengis.gml.TimeCoordinateSystemType timeCoordinateSystem)
    {
        generatedSetterHelperImpl(timeCoordinateSystem, TIMECOORDINATESYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeCoordinateSystem" element
     */
    public net.opengis.gml.TimeCoordinateSystemType addNewTimeCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeCoordinateSystemType target = null;
            target = (net.opengis.gml.TimeCoordinateSystemType)get_store().add_element_user(TIMECOORDINATESYSTEM$0);
            return target;
        }
    }
}
