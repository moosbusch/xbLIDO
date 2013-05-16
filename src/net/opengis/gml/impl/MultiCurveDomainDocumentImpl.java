/*
 * An XML document type.
 * Localname: multiCurveDomain
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiCurveDomainDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiCurveDomain(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiCurveDomainDocumentImpl extends net.opengis.gml.impl.DomainSetDocumentImpl implements net.opengis.gml.MultiCurveDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurveDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICURVEDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiCurveDomain");
    
    
    /**
     * Gets the "multiCurveDomain" element
     */
    public net.opengis.gml.MultiCurveDomainType getMultiCurveDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurveDomainType target = null;
            target = (net.opengis.gml.MultiCurveDomainType)get_store().find_element_user(MULTICURVEDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCurveDomain" element
     */
    @Inject(optional=true) public void setMultiCurveDomain(net.opengis.gml.MultiCurveDomainType multiCurveDomain)
    {
        generatedSetterHelperImpl(multiCurveDomain, MULTICURVEDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCurveDomain" element
     */
    public net.opengis.gml.MultiCurveDomainType addNewMultiCurveDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurveDomainType target = null;
            target = (net.opengis.gml.MultiCurveDomainType)get_store().add_element_user(MULTICURVEDOMAIN$0);
            return target;
        }
    }
}
