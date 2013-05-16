/*
 * An XML document type.
 * Localname: solidMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SolidMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one solidMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SolidMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SolidMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "solidMember");
    
    
    /**
     * Gets the "solidMember" element
     */
    public net.opengis.gml.SolidPropertyType getSolidMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().find_element_user(SOLIDMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solidMember" element
     */
    @Inject(optional=true) public void setSolidMember(net.opengis.gml.SolidPropertyType solidMember)
    {
        generatedSetterHelperImpl(solidMember, SOLIDMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidMember" element
     */
    public net.opengis.gml.SolidPropertyType addNewSolidMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().add_element_user(SOLIDMEMBER$0);
            return target;
        }
    }
}
