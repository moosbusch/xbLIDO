/*
 * An XML document type.
 * Localname: coordinateOperationName
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateOperationNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one coordinateOperationName(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateOperationNameDocumentImpl extends net.opengis.gml.impl.NameDocumentImpl implements net.opengis.gml.CoordinateOperationNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateOperationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEOPERATIONNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationName");
    
    
    /**
     * Gets the "coordinateOperationName" element
     */
    public net.opengis.gml.CodeType getCoordinateOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(COORDINATEOPERATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateOperationName" element
     */
    @Inject(optional=true) public void setCoordinateOperationName(net.opengis.gml.CodeType coordinateOperationName)
    {
        generatedSetterHelperImpl(coordinateOperationName, COORDINATEOPERATIONNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateOperationName" element
     */
    public net.opengis.gml.CodeType addNewCoordinateOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(COORDINATEOPERATIONNAME$0);
            return target;
        }
    }
}
