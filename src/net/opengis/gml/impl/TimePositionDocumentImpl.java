/*
 * An XML document type.
 * Localname: timePosition
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimePositionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one timePosition(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimePositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TimePositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimePositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "timePosition");
    
    
    /**
     * Gets the "timePosition" element
     */
    public net.opengis.gml.TimePositionType getTimePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().find_element_user(TIMEPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timePosition" element
     */
    @Inject(optional=true) public void setTimePosition(net.opengis.gml.TimePositionType timePosition)
    {
        generatedSetterHelperImpl(timePosition, TIMEPOSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timePosition" element
     */
    public net.opengis.gml.TimePositionType addNewTimePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().add_element_user(TIMEPOSITION$0);
            return target;
        }
    }
}