/*
 * An XML document type.
 * Localname: members
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one members(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public MembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "members");
    
    
    /**
     * Gets the "members" element
     */
    public net.opengis.gml.ArrayAssociationType getMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArrayAssociationType target = null;
            target = (net.opengis.gml.ArrayAssociationType)get_store().find_element_user(MEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "members" element
     */
    @Inject(optional=true) public void setMembers(net.opengis.gml.ArrayAssociationType members)
    {
        generatedSetterHelperImpl(members, MEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "members" element
     */
    public net.opengis.gml.ArrayAssociationType addNewMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArrayAssociationType target = null;
            target = (net.opengis.gml.ArrayAssociationType)get_store().add_element_user(MEMBERS$0);
            return target;
        }
    }
}
