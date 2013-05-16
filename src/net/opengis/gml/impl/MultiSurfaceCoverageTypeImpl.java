/*
 * XML Type:  MultiSurfaceCoverageType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSurfaceCoverageType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;

import com.google.inject.Inject;
/**
 * An XML MultiSurfaceCoverageType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiSurfaceCoverageTypeImpl extends net.opengis.gml.impl.AbstractDiscreteCoverageTypeImpl implements net.opengis.gml.MultiSurfaceCoverageType
{
    private static final long serialVersionUID = 1L;

    public MultiSurfaceCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MULTISURFACEDOMAIN$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSurfaceDomain");


    /**
     * Gets the "multiSurfaceDomain" element
     */
    public net.opengis.gml.MultiSurfaceDomainType getMultiSurfaceDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceDomainType target = null;
            target = (net.opengis.gml.MultiSurfaceDomainType)get_store().find_element_user(MULTISURFACEDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "multiSurfaceDomain" element
     */
    @Inject(optional=true) public void setMultiSurfaceDomain(net.opengis.gml.MultiSurfaceDomainType multiSurfaceDomain)
    {
        generatedSetterHelperImpl(multiSurfaceDomain, MULTISURFACEDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "multiSurfaceDomain" element
     */
    public net.opengis.gml.MultiSurfaceDomainType addNewMultiSurfaceDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceDomainType target = null;
            target = (net.opengis.gml.MultiSurfaceDomainType)get_store().add_element_user(MULTISURFACEDOMAIN$0);
            return target;
        }
    }
}
