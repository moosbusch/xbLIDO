/*
 * An XML document type.
 * Localname: usesOperation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesOperation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesOperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesOperation");
    
    
    /**
     * Gets the "usesOperation" element
     */
    public net.opengis.gml.OperationRefType getUsesOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationRefType target = null;
            target = (net.opengis.gml.OperationRefType)get_store().find_element_user(USESOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesOperation" element
     */
    @Inject(optional=true) public void setUsesOperation(net.opengis.gml.OperationRefType usesOperation)
    {
        generatedSetterHelperImpl(usesOperation, USESOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesOperation" element
     */
    public net.opengis.gml.OperationRefType addNewUsesOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationRefType target = null;
            target = (net.opengis.gml.OperationRefType)get_store().add_element_user(USESOPERATION$0);
            return target;
        }
    }
}
