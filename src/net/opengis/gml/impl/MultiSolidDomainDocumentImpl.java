/*
 * An XML document type.
 * Localname: multiSolidDomain
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSolidDomainDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiSolidDomain(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSolidDomainDocumentImpl extends net.opengis.gml.impl.DomainSetDocumentImpl implements net.opengis.gml.MultiSolidDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLIDDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSolidDomain");
    
    
    /**
     * Gets the "multiSolidDomain" element
     */
    public net.opengis.gml.MultiSolidDomainType getMultiSolidDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidDomainType target = null;
            target = (net.opengis.gml.MultiSolidDomainType)get_store().find_element_user(MULTISOLIDDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiSolidDomain" element
     */
    @Inject(optional=true) public void setMultiSolidDomain(net.opengis.gml.MultiSolidDomainType multiSolidDomain)
    {
        generatedSetterHelperImpl(multiSolidDomain, MULTISOLIDDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiSolidDomain" element
     */
    public net.opengis.gml.MultiSolidDomainType addNewMultiSolidDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidDomainType target = null;
            target = (net.opengis.gml.MultiSolidDomainType)get_store().add_element_user(MULTISOLIDDOMAIN$0);
            return target;
        }
    }
}
