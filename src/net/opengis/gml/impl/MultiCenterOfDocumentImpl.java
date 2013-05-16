/*
 * An XML document type.
 * Localname: multiCenterOf
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiCenterOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiCenterOf(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiCenterOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiCenterOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCenterOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICENTEROF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiCenterOf");
    
    
    /**
     * Gets the "multiCenterOf" element
     */
    public net.opengis.gml.MultiPointPropertyType getMultiCenterOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointPropertyType target = null;
            target = (net.opengis.gml.MultiPointPropertyType)get_store().find_element_user(MULTICENTEROF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCenterOf" element
     */
    @Inject(optional=true) public void setMultiCenterOf(net.opengis.gml.MultiPointPropertyType multiCenterOf)
    {
        generatedSetterHelperImpl(multiCenterOf, MULTICENTEROF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCenterOf" element
     */
    public net.opengis.gml.MultiPointPropertyType addNewMultiCenterOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointPropertyType target = null;
            target = (net.opengis.gml.MultiPointPropertyType)get_store().add_element_user(MULTICENTEROF$0);
            return target;
        }
    }
}
