/*
 * An XML document type.
 * Localname: methodID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MethodIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one methodID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MethodIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MethodIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public MethodIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodID");
    
    
    /**
     * Gets the "methodID" element
     */
    public net.opengis.gml.IdentifierType getMethodID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(METHODID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "methodID" element
     */
    @Inject(optional=true) public void setMethodID(net.opengis.gml.IdentifierType methodID)
    {
        generatedSetterHelperImpl(methodID, METHODID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "methodID" element
     */
    public net.opengis.gml.IdentifierType addNewMethodID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(METHODID$0);
            return target;
        }
    }
}
