/*
 * An XML document type.
 * Localname: rectifiedGridDomain
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RectifiedGridDomainDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one rectifiedGridDomain(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RectifiedGridDomainDocumentImpl extends net.opengis.gml.impl.DomainSetDocumentImpl implements net.opengis.gml.RectifiedGridDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTIFIEDGRIDDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rectifiedGridDomain");
    
    
    /**
     * Gets the "rectifiedGridDomain" element
     */
    public net.opengis.gml.RectifiedGridDomainType getRectifiedGridDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectifiedGridDomainType target = null;
            target = (net.opengis.gml.RectifiedGridDomainType)get_store().find_element_user(RECTIFIEDGRIDDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rectifiedGridDomain" element
     */
    @Inject(optional=true) public void setRectifiedGridDomain(net.opengis.gml.RectifiedGridDomainType rectifiedGridDomain)
    {
        generatedSetterHelperImpl(rectifiedGridDomain, RECTIFIEDGRIDDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rectifiedGridDomain" element
     */
    public net.opengis.gml.RectifiedGridDomainType addNewRectifiedGridDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectifiedGridDomainType target = null;
            target = (net.opengis.gml.RectifiedGridDomainType)get_store().add_element_user(RECTIFIEDGRIDDOMAIN$0);
            return target;
        }
    }
}
