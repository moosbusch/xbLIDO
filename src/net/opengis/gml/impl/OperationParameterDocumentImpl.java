/*
 * An XML document type.
 * Localname: OperationParameter
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one OperationParameter(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OperationParameterDocumentImpl extends net.opengis.gml.impl.GeneralOperationParameterDocumentImpl implements net.opengis.gml.OperationParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameter");
    
    
    /**
     * Gets the "OperationParameter" element
     */
    public net.opengis.gml.OperationParameterType getOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterType target = null;
            target = (net.opengis.gml.OperationParameterType)get_store().find_element_user(OPERATIONPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OperationParameter" element
     */
    @Inject(optional=true) public void setOperationParameter(net.opengis.gml.OperationParameterType operationParameter)
    {
        generatedSetterHelperImpl(operationParameter, OPERATIONPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationParameter" element
     */
    public net.opengis.gml.OperationParameterType addNewOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterType target = null;
            target = (net.opengis.gml.OperationParameterType)get_store().add_element_user(OPERATIONPARAMETER$0);
            return target;
        }
    }
}
