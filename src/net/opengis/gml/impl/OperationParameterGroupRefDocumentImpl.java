/*
 * An XML document type.
 * Localname: operationParameterGroupRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationParameterGroupRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one operationParameterGroupRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OperationParameterGroupRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.OperationParameterGroupRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterGroupRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONPARAMETERGROUPREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "operationParameterGroupRef");
    
    
    /**
     * Gets the "operationParameterGroupRef" element
     */
    public net.opengis.gml.OperationParameterRefType getOperationParameterGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterRefType target = null;
            target = (net.opengis.gml.OperationParameterRefType)get_store().find_element_user(OPERATIONPARAMETERGROUPREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationParameterGroupRef" element
     */
    @Inject(optional=true) public void setOperationParameterGroupRef(net.opengis.gml.OperationParameterRefType operationParameterGroupRef)
    {
        generatedSetterHelperImpl(operationParameterGroupRef, OPERATIONPARAMETERGROUPREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operationParameterGroupRef" element
     */
    public net.opengis.gml.OperationParameterRefType addNewOperationParameterGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterRefType target = null;
            target = (net.opengis.gml.OperationParameterRefType)get_store().add_element_user(OPERATIONPARAMETERGROUPREF$0);
            return target;
        }
    }
}
