/*
 * An XML document type.
 * Localname: groupID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GroupIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one groupID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GroupIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GroupIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "groupID");
    
    
    /**
     * Gets the "groupID" element
     */
    public net.opengis.gml.IdentifierType getGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(GROUPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "groupID" element
     */
    @Inject(optional=true) public void setGroupID(net.opengis.gml.IdentifierType groupID)
    {
        generatedSetterHelperImpl(groupID, GROUPID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "groupID" element
     */
    public net.opengis.gml.IdentifierType addNewGroupID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(GROUPID$0);
            return target;
        }
    }
}
