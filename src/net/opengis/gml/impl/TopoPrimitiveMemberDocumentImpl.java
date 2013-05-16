/*
 * An XML document type.
 * Localname: topoPrimitiveMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoPrimitiveMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one topoPrimitiveMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoPrimitiveMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoPrimitiveMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPrimitiveMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPRIMITIVEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topoPrimitiveMember");
    
    
    /**
     * Gets the "topoPrimitiveMember" element
     */
    public net.opengis.gml.TopoPrimitiveMemberType getTopoPrimitiveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.TopoPrimitiveMemberType)get_store().find_element_user(TOPOPRIMITIVEMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoPrimitiveMember" element
     */
    @Inject(optional=true) public void setTopoPrimitiveMember(net.opengis.gml.TopoPrimitiveMemberType topoPrimitiveMember)
    {
        generatedSetterHelperImpl(topoPrimitiveMember, TOPOPRIMITIVEMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoPrimitiveMember" element
     */
    public net.opengis.gml.TopoPrimitiveMemberType addNewTopoPrimitiveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.TopoPrimitiveMemberType)get_store().add_element_user(TOPOPRIMITIVEMEMBER$0);
            return target;
        }
    }
}
