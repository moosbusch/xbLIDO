/*
 * XML Type:  MultiPointDomainType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPointDomainType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;

import com.google.inject.Inject;
/**
 * An XML MultiPointDomainType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiPointDomainTypeImpl extends net.opengis.gml.impl.DomainSetTypeImpl implements net.opengis.gml.MultiPointDomainType
{
    private static final long serialVersionUID = 1L;

    public MultiPointDomainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MULTIPOINT$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPoint");


    /**
     * Gets the "MultiPoint" element
     */
    public net.opengis.gml.MultiPointType getMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointType target = null;
            target = (net.opengis.gml.MultiPointType)get_store().find_element_user(MULTIPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "MultiPoint" element
     */
    public boolean isSetMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTIPOINT$0) != 0;
        }
    }

    /**
     * Sets the "MultiPoint" element
     */
    @Inject(optional=true) public void setMultiPoint(net.opengis.gml.MultiPointType multiPoint)
    {
        generatedSetterHelperImpl(multiPoint, MULTIPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MultiPoint" element
     */
    public net.opengis.gml.MultiPointType addNewMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointType target = null;
            target = (net.opengis.gml.MultiPointType)get_store().add_element_user(MULTIPOINT$0);
            return target;
        }
    }

    /**
     * Unsets the "MultiPoint" element
     */
    public void unsetMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTIPOINT$0, 0);
        }
    }
}
