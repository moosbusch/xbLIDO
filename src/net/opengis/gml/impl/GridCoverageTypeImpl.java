/*
 * XML Type:  GridCoverageType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GridCoverageType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML GridCoverageType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GridCoverageTypeImpl extends net.opengis.gml.impl.AbstractDiscreteCoverageTypeImpl implements net.opengis.gml.GridCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public GridCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "gridDomain");
    
    
    /**
     * Gets the "gridDomain" element
     */
    public net.opengis.gml.GridDomainType getGridDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridDomainType target = null;
            target = (net.opengis.gml.GridDomainType)get_store().find_element_user(GRIDDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gridDomain" element
     */
    @Inject(optional=true) public void setGridDomain(net.opengis.gml.GridDomainType gridDomain)
    {
        generatedSetterHelperImpl(gridDomain, GRIDDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "gridDomain" element
     */
    public net.opengis.gml.GridDomainType addNewGridDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridDomainType target = null;
            target = (net.opengis.gml.GridDomainType)get_store().add_element_user(GRIDDOMAIN$0);
            return target;
        }
    }
}
