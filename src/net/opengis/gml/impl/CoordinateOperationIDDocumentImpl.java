/*
 * An XML document type.
 * Localname: coordinateOperationID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateOperationIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one coordinateOperationID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateOperationIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordinateOperationIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateOperationIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEOPERATIONID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationID");
    
    
    /**
     * Gets the "coordinateOperationID" element
     */
    public net.opengis.gml.IdentifierType getCoordinateOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(COORDINATEOPERATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateOperationID" element
     */
    @Inject(optional=true) public void setCoordinateOperationID(net.opengis.gml.IdentifierType coordinateOperationID)
    {
        generatedSetterHelperImpl(coordinateOperationID, COORDINATEOPERATIONID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateOperationID" element
     */
    public net.opengis.gml.IdentifierType addNewCoordinateOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(COORDINATEOPERATIONID$0);
            return target;
        }
    }
}
