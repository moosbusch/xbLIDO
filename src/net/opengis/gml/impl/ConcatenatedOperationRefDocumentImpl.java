/*
 * An XML document type.
 * Localname: concatenatedOperationRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ConcatenatedOperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one concatenatedOperationRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ConcatenatedOperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ConcatenatedOperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConcatenatedOperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCATENATEDOPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "concatenatedOperationRef");
    
    
    /**
     * Gets the "concatenatedOperationRef" element
     */
    public net.opengis.gml.ConcatenatedOperationRefType getConcatenatedOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConcatenatedOperationRefType target = null;
            target = (net.opengis.gml.ConcatenatedOperationRefType)get_store().find_element_user(CONCATENATEDOPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "concatenatedOperationRef" element
     */
    @Inject(optional=true) public void setConcatenatedOperationRef(net.opengis.gml.ConcatenatedOperationRefType concatenatedOperationRef)
    {
        generatedSetterHelperImpl(concatenatedOperationRef, CONCATENATEDOPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "concatenatedOperationRef" element
     */
    public net.opengis.gml.ConcatenatedOperationRefType addNewConcatenatedOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConcatenatedOperationRefType target = null;
            target = (net.opengis.gml.ConcatenatedOperationRefType)get_store().add_element_user(CONCATENATEDOPERATIONREF$0);
            return target;
        }
    }
}
