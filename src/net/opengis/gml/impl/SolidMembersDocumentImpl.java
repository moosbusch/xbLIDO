/*
 * An XML document type.
 * Localname: solidMembers
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SolidMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one solidMembers(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SolidMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SolidMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "solidMembers");
    
    
    /**
     * Gets the "solidMembers" element
     */
    public net.opengis.gml.SolidArrayPropertyType getSolidMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.SolidArrayPropertyType)get_store().find_element_user(SOLIDMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solidMembers" element
     */
    @Inject(optional=true) public void setSolidMembers(net.opengis.gml.SolidArrayPropertyType solidMembers)
    {
        generatedSetterHelperImpl(solidMembers, SOLIDMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidMembers" element
     */
    public net.opengis.gml.SolidArrayPropertyType addNewSolidMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.SolidArrayPropertyType)get_store().add_element_user(SOLIDMEMBERS$0);
            return target;
        }
    }
}
