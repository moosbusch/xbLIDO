/*
 * XML Type:  MultiPointCoverageType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPointCoverageType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML MultiPointCoverageType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiPointCoverageTypeImpl extends net.opengis.gml.impl.AbstractDiscreteCoverageTypeImpl implements net.opengis.gml.MultiPointCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOINTDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiPointDomain");
    
    
    /**
     * Gets the "multiPointDomain" element
     */
    public net.opengis.gml.MultiPointDomainType getMultiPointDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointDomainType target = null;
            target = (net.opengis.gml.MultiPointDomainType)get_store().find_element_user(MULTIPOINTDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiPointDomain" element
     */
    @Inject(optional=true) public void setMultiPointDomain(net.opengis.gml.MultiPointDomainType multiPointDomain)
    {
        generatedSetterHelperImpl(multiPointDomain, MULTIPOINTDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiPointDomain" element
     */
    public net.opengis.gml.MultiPointDomainType addNewMultiPointDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointDomainType target = null;
            target = (net.opengis.gml.MultiPointDomainType)get_store().add_element_user(MULTIPOINTDOMAIN$0);
            return target;
        }
    }
}
