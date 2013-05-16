/*
 * An XML document type.
 * Localname: UserDefinedCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UserDefinedCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one UserDefinedCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UserDefinedCSDocumentImpl extends net.opengis.gml.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.UserDefinedCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserDefinedCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERDEFINEDCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UserDefinedCS");
    
    
    /**
     * Gets the "UserDefinedCS" element
     */
    public net.opengis.gml.UserDefinedCSType getUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UserDefinedCSType target = null;
            target = (net.opengis.gml.UserDefinedCSType)get_store().find_element_user(USERDEFINEDCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UserDefinedCS" element
     */
    @Inject(optional=true) public void setUserDefinedCS(net.opengis.gml.UserDefinedCSType userDefinedCS)
    {
        generatedSetterHelperImpl(userDefinedCS, USERDEFINEDCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UserDefinedCS" element
     */
    public net.opengis.gml.UserDefinedCSType addNewUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UserDefinedCSType target = null;
            target = (net.opengis.gml.UserDefinedCSType)get_store().add_element_user(USERDEFINEDCS$0);
            return target;
        }
    }
}
