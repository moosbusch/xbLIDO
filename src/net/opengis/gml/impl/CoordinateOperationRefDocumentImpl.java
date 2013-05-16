/*
 * An XML document type.
 * Localname: coordinateOperationRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateOperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one coordinateOperationRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateOperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordinateOperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateOperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEOPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationRef");
    
    
    /**
     * Gets the "coordinateOperationRef" element
     */
    public net.opengis.gml.CoordinateOperationRefType getCoordinateOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateOperationRefType target = null;
            target = (net.opengis.gml.CoordinateOperationRefType)get_store().find_element_user(COORDINATEOPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateOperationRef" element
     */
    @Inject(optional=true) public void setCoordinateOperationRef(net.opengis.gml.CoordinateOperationRefType coordinateOperationRef)
    {
        generatedSetterHelperImpl(coordinateOperationRef, COORDINATEOPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateOperationRef" element
     */
    public net.opengis.gml.CoordinateOperationRefType addNewCoordinateOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateOperationRefType target = null;
            target = (net.opengis.gml.CoordinateOperationRefType)get_store().add_element_user(COORDINATEOPERATIONREF$0);
            return target;
        }
    }
}
