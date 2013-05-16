/*
 * An XML document type.
 * Localname: OperationMethod
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationMethodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one OperationMethod(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OperationMethodDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.OperationMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationMethod");
    
    
    /**
     * Gets the "OperationMethod" element
     */
    public net.opengis.gml.OperationMethodType getOperationMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationMethodType target = null;
            target = (net.opengis.gml.OperationMethodType)get_store().find_element_user(OPERATIONMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OperationMethod" element
     */
    @Inject(optional=true) public void setOperationMethod(net.opengis.gml.OperationMethodType operationMethod)
    {
        generatedSetterHelperImpl(operationMethod, OPERATIONMETHOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationMethod" element
     */
    public net.opengis.gml.OperationMethodType addNewOperationMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationMethodType target = null;
            target = (net.opengis.gml.OperationMethodType)get_store().add_element_user(OPERATIONMETHOD$0);
            return target;
        }
    }
}
