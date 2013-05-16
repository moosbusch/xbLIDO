/*
 * An XML document type.
 * Localname: ConcatenatedOperation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ConcatenatedOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ConcatenatedOperation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ConcatenatedOperationDocumentImpl extends net.opengis.gml.impl.CoordinateOperationDocumentImpl implements net.opengis.gml.ConcatenatedOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConcatenatedOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCATENATEDOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConcatenatedOperation");
    
    
    /**
     * Gets the "ConcatenatedOperation" element
     */
    public net.opengis.gml.ConcatenatedOperationType getConcatenatedOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConcatenatedOperationType target = null;
            target = (net.opengis.gml.ConcatenatedOperationType)get_store().find_element_user(CONCATENATEDOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConcatenatedOperation" element
     */
    @Inject(optional=true) public void setConcatenatedOperation(net.opengis.gml.ConcatenatedOperationType concatenatedOperation)
    {
        generatedSetterHelperImpl(concatenatedOperation, CONCATENATEDOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConcatenatedOperation" element
     */
    public net.opengis.gml.ConcatenatedOperationType addNewConcatenatedOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConcatenatedOperationType target = null;
            target = (net.opengis.gml.ConcatenatedOperationType)get_store().add_element_user(CONCATENATEDOPERATION$0);
            return target;
        }
    }
}
