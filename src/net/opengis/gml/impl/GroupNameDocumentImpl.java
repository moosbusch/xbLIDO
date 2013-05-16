/*
 * An XML document type.
 * Localname: groupName
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GroupNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one groupName(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GroupNameDocumentImpl extends net.opengis.gml.impl.NameDocumentImpl implements net.opengis.gml.GroupNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "groupName");
    
    
    /**
     * Gets the "groupName" element
     */
    public net.opengis.gml.CodeType getGroupName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(GROUPNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "groupName" element
     */
    @Inject(optional=true) public void setGroupName(net.opengis.gml.CodeType groupName)
    {
        generatedSetterHelperImpl(groupName, GROUPNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "groupName" element
     */
    public net.opengis.gml.CodeType addNewGroupName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(GROUPNAME$0);
            return target;
        }
    }
}
