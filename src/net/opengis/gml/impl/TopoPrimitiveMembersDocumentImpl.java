/*
 * An XML document type.
 * Localname: topoPrimitiveMembers
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoPrimitiveMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one topoPrimitiveMembers(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoPrimitiveMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoPrimitiveMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPrimitiveMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPRIMITIVEMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topoPrimitiveMembers");
    
    
    /**
     * Gets the "topoPrimitiveMembers" element
     */
    public net.opengis.gml.TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveArrayAssociationType target = null;
            target = (net.opengis.gml.TopoPrimitiveArrayAssociationType)get_store().find_element_user(TOPOPRIMITIVEMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoPrimitiveMembers" element
     */
    @Inject(optional=true) public void setTopoPrimitiveMembers(net.opengis.gml.TopoPrimitiveArrayAssociationType topoPrimitiveMembers)
    {
        generatedSetterHelperImpl(topoPrimitiveMembers, TOPOPRIMITIVEMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoPrimitiveMembers" element
     */
    public net.opengis.gml.TopoPrimitiveArrayAssociationType addNewTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveArrayAssociationType target = null;
            target = (net.opengis.gml.TopoPrimitiveArrayAssociationType)get_store().add_element_user(TOPOPRIMITIVEMEMBERS$0);
            return target;
        }
    }
}
