/*
 * An XML document type.
 * Localname: MultiPointCoverage
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPointCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;

import com.google.inject.Inject;

/**
 * A document containing one MultiPointCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiPointCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.MultiPointCoverageDocument
{
    private static final long serialVersionUID = 1L;

    public MultiPointCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MULTIPOINTCOVERAGE$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage");


    /**
     * Gets the "MultiPointCoverage" element
     */
    public net.opengis.gml.MultiPointCoverageType getMultiPointCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointCoverageType target = null;
            target = (net.opengis.gml.MultiPointCoverageType)get_store().find_element_user(MULTIPOINTCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "MultiPointCoverage" element
     */
    @Inject(optional=true) public void setMultiPointCoverage(net.opengis.gml.MultiPointCoverageType multiPointCoverage)
    {
        generatedSetterHelperImpl(multiPointCoverage, MULTIPOINTCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MultiPointCoverage" element
     */
    public net.opengis.gml.MultiPointCoverageType addNewMultiPointCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointCoverageType target = null;
            target = (net.opengis.gml.MultiPointCoverageType)get_store().add_element_user(MULTIPOINTCOVERAGE$0);
            return target;
        }
    }
}
