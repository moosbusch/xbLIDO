/*
 * An XML document type.
 * Localname: PassThroughOperation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PassThroughOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one PassThroughOperation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PassThroughOperationDocumentImpl extends net.opengis.gml.impl.SingleOperationDocumentImpl implements net.opengis.gml.PassThroughOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public PassThroughOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSTHROUGHOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PassThroughOperation");
    
    
    /**
     * Gets the "PassThroughOperation" element
     */
    public net.opengis.gml.PassThroughOperationType getPassThroughOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PassThroughOperationType target = null;
            target = (net.opengis.gml.PassThroughOperationType)get_store().find_element_user(PASSTHROUGHOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PassThroughOperation" element
     */
    @Inject(optional=true) public void setPassThroughOperation(net.opengis.gml.PassThroughOperationType passThroughOperation)
    {
        generatedSetterHelperImpl(passThroughOperation, PASSTHROUGHOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PassThroughOperation" element
     */
    public net.opengis.gml.PassThroughOperationType addNewPassThroughOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PassThroughOperationType target = null;
            target = (net.opengis.gml.PassThroughOperationType)get_store().add_element_user(PASSTHROUGHOPERATION$0);
            return target;
        }
    }
}
