/*
 * An XML document type.
 * Localname: passThroughOperationRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PassThroughOperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one passThroughOperationRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PassThroughOperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PassThroughOperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PassThroughOperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSTHROUGHOPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "passThroughOperationRef");
    
    
    /**
     * Gets the "passThroughOperationRef" element
     */
    public net.opengis.gml.PassThroughOperationRefType getPassThroughOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PassThroughOperationRefType target = null;
            target = (net.opengis.gml.PassThroughOperationRefType)get_store().find_element_user(PASSTHROUGHOPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "passThroughOperationRef" element
     */
    @Inject(optional=true) public void setPassThroughOperationRef(net.opengis.gml.PassThroughOperationRefType passThroughOperationRef)
    {
        generatedSetterHelperImpl(passThroughOperationRef, PASSTHROUGHOPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "passThroughOperationRef" element
     */
    public net.opengis.gml.PassThroughOperationRefType addNewPassThroughOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PassThroughOperationRefType target = null;
            target = (net.opengis.gml.PassThroughOperationRefType)get_store().add_element_user(PASSTHROUGHOPERATIONREF$0);
            return target;
        }
    }
}
