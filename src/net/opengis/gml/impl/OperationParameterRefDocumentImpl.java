/*
 * An XML document type.
 * Localname: operationParameterRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationParameterRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one operationParameterRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OperationParameterRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.OperationParameterRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONPARAMETERREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "operationParameterRef");
    
    
    /**
     * Gets the "operationParameterRef" element
     */
    public net.opengis.gml.OperationParameterRefType getOperationParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterRefType target = null;
            target = (net.opengis.gml.OperationParameterRefType)get_store().find_element_user(OPERATIONPARAMETERREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationParameterRef" element
     */
    @Inject(optional=true) public void setOperationParameterRef(net.opengis.gml.OperationParameterRefType operationParameterRef)
    {
        generatedSetterHelperImpl(operationParameterRef, OPERATIONPARAMETERREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operationParameterRef" element
     */
    public net.opengis.gml.OperationParameterRefType addNewOperationParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterRefType target = null;
            target = (net.opengis.gml.OperationParameterRefType)get_store().add_element_user(OPERATIONPARAMETERREF$0);
            return target;
        }
    }
}
