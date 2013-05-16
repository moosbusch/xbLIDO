/*
 * An XML document type.
 * Localname: singleOperationRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SingleOperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one singleOperationRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SingleOperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SingleOperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public SingleOperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINGLEOPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "singleOperationRef");
    
    
    /**
     * Gets the "singleOperationRef" element
     */
    public net.opengis.gml.SingleOperationRefType getSingleOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SingleOperationRefType target = null;
            target = (net.opengis.gml.SingleOperationRefType)get_store().find_element_user(SINGLEOPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "singleOperationRef" element
     */
    @Inject(optional=true) public void setSingleOperationRef(net.opengis.gml.SingleOperationRefType singleOperationRef)
    {
        generatedSetterHelperImpl(singleOperationRef, SINGLEOPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "singleOperationRef" element
     */
    public net.opengis.gml.SingleOperationRefType addNewSingleOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SingleOperationRefType target = null;
            target = (net.opengis.gml.SingleOperationRefType)get_store().add_element_user(SINGLEOPERATIONREF$0);
            return target;
        }
    }
}
