/*
 * An XML document type.
 * Localname: member
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one member(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public MemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "member");
    
    
    /**
     * Gets the "member" element
     */
    public net.opengis.gml.AssociationType getMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().find_element_user(MEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "member" element
     */
    @Inject(optional=true) public void setMember(net.opengis.gml.AssociationType member)
    {
        generatedSetterHelperImpl(member, MEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "member" element
     */
    public net.opengis.gml.AssociationType addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().add_element_user(MEMBER$0);
            return target;
        }
    }
}
