/*
 * An XML document type.
 * Localname: MovingObjectStatus
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MovingObjectStatusDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MovingObjectStatus(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MovingObjectStatusDocumentImpl extends net.opengis.gml.impl.TimeSliceDocumentImpl implements net.opengis.gml.MovingObjectStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public MovingObjectStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVINGOBJECTSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MovingObjectStatus");
    
    
    /**
     * Gets the "MovingObjectStatus" element
     */
    public net.opengis.gml.MovingObjectStatusType getMovingObjectStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MovingObjectStatusType target = null;
            target = (net.opengis.gml.MovingObjectStatusType)get_store().find_element_user(MOVINGOBJECTSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MovingObjectStatus" element
     */
    @Inject(optional=true) public void setMovingObjectStatus(net.opengis.gml.MovingObjectStatusType movingObjectStatus)
    {
        generatedSetterHelperImpl(movingObjectStatus, MOVINGOBJECTSTATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MovingObjectStatus" element
     */
    public net.opengis.gml.MovingObjectStatusType addNewMovingObjectStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MovingObjectStatusType target = null;
            target = (net.opengis.gml.MovingObjectStatusType)get_store().add_element_user(MOVINGOBJECTSTATUS$0);
            return target;
        }
    }
}
