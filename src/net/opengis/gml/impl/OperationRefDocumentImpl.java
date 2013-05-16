/*
 * An XML document type.
 * Localname: operationRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one operationRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.OperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "operationRef");
    
    
    /**
     * Gets the "operationRef" element
     */
    public net.opengis.gml.OperationRefType getOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationRefType target = null;
            target = (net.opengis.gml.OperationRefType)get_store().find_element_user(OPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationRef" element
     */
    @Inject(optional=true) public void setOperationRef(net.opengis.gml.OperationRefType operationRef)
    {
        generatedSetterHelperImpl(operationRef, OPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "operationRef" element
     */
    public net.opengis.gml.OperationRefType addNewOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationRefType target = null;
            target = (net.opengis.gml.OperationRefType)get_store().add_element_user(OPERATIONREF$0);
            return target;
        }
    }
}
