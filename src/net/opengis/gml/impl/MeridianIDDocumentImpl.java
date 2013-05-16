/*
 * An XML document type.
 * Localname: meridianID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MeridianIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one meridianID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MeridianIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MeridianIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeridianIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MERIDIANID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "meridianID");
    
    
    /**
     * Gets the "meridianID" element
     */
    public net.opengis.gml.IdentifierType getMeridianID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(MERIDIANID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "meridianID" element
     */
    @Inject(optional=true) public void setMeridianID(net.opengis.gml.IdentifierType meridianID)
    {
        generatedSetterHelperImpl(meridianID, MERIDIANID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "meridianID" element
     */
    public net.opengis.gml.IdentifierType addNewMeridianID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(MERIDIANID$0);
            return target;
        }
    }
}
