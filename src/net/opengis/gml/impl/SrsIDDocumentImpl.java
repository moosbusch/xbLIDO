/*
 * An XML document type.
 * Localname: srsID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SrsIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one srsID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SrsIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SrsIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public SrsIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRSID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "srsID");
    
    
    /**
     * Gets the "srsID" element
     */
    public net.opengis.gml.IdentifierType getSrsID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(SRSID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "srsID" element
     */
    @Inject(optional=true) public void setSrsID(net.opengis.gml.IdentifierType srsID)
    {
        generatedSetterHelperImpl(srsID, SRSID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "srsID" element
     */
    public net.opengis.gml.IdentifierType addNewSrsID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(SRSID$0);
            return target;
        }
    }
}
