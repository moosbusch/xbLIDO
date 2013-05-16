/*
 * An XML document type.
 * Localname: ellipsoidID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EllipsoidIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ellipsoidID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EllipsoidIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EllipsoidIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidID");
    
    
    /**
     * Gets the "ellipsoidID" element
     */
    public net.opengis.gml.IdentifierType getEllipsoidID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(ELLIPSOIDID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoidID" element
     */
    @Inject(optional=true) public void setEllipsoidID(net.opengis.gml.IdentifierType ellipsoidID)
    {
        generatedSetterHelperImpl(ellipsoidID, ELLIPSOIDID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ellipsoidID" element
     */
    public net.opengis.gml.IdentifierType addNewEllipsoidID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(ELLIPSOIDID$0);
            return target;
        }
    }
}
