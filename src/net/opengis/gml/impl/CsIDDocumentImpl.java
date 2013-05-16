/*
 * An XML document type.
 * Localname: csID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CsIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one csID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CsIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CsIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public CsIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "csID");
    
    
    /**
     * Gets the "csID" element
     */
    public net.opengis.gml.IdentifierType getCsID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(CSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "csID" element
     */
    @Inject(optional=true) public void setCsID(net.opengis.gml.IdentifierType csID)
    {
        generatedSetterHelperImpl(csID, CSID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "csID" element
     */
    public net.opengis.gml.IdentifierType addNewCsID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(CSID$0);
            return target;
        }
    }
}
