/*
 * XML Type:  MultiSurfaceDomainType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSurfaceDomainType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;

import com.google.inject.Inject;

/**
 * An XML MultiSurfaceDomainType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiSurfaceDomainTypeImpl extends net.opengis.gml.impl.DomainSetTypeImpl implements net.opengis.gml.MultiSurfaceDomainType
{
    private static final long serialVersionUID = 1L;

    public MultiSurfaceDomainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MULTISURFACE$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurface");


    /**
     * Gets the "MultiSurface" element
     */
    public net.opengis.gml.MultiSurfaceType getMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceType target = null;
            target = (net.opengis.gml.MultiSurfaceType)get_store().find_element_user(MULTISURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "MultiSurface" element
     */
    public boolean isSetMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTISURFACE$0) != 0;
        }
    }

    /**
     * Sets the "MultiSurface" element
     */
    @Inject(optional=true) public void setMultiSurface(net.opengis.gml.MultiSurfaceType multiSurface)
    {
        generatedSetterHelperImpl(multiSurface, MULTISURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MultiSurface" element
     */
    public net.opengis.gml.MultiSurfaceType addNewMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceType target = null;
            target = (net.opengis.gml.MultiSurfaceType)get_store().add_element_user(MULTISURFACE$0);
            return target;
        }
    }

    /**
     * Unsets the "MultiSurface" element
     */
    public void unsetMultiSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTISURFACE$0, 0);
        }
    }
}
