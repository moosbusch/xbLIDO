/*
 * An XML document type.
 * Localname: userDefinedCSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UserDefinedCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one userDefinedCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UserDefinedCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UserDefinedCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserDefinedCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERDEFINEDCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "userDefinedCSRef");
    
    
    /**
     * Gets the "userDefinedCSRef" element
     */
    public net.opengis.gml.UserDefinedCSRefType getUserDefinedCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UserDefinedCSRefType target = null;
            target = (net.opengis.gml.UserDefinedCSRefType)get_store().find_element_user(USERDEFINEDCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "userDefinedCSRef" element
     */
    @Inject(optional=true) public void setUserDefinedCSRef(net.opengis.gml.UserDefinedCSRefType userDefinedCSRef)
    {
        generatedSetterHelperImpl(userDefinedCSRef, USERDEFINEDCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userDefinedCSRef" element
     */
    public net.opengis.gml.UserDefinedCSRefType addNewUserDefinedCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UserDefinedCSRefType target = null;
            target = (net.opengis.gml.UserDefinedCSRefType)get_store().add_element_user(USERDEFINEDCSREF$0);
            return target;
        }
    }
}
