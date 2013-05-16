/*
 * An XML document type.
 * Localname: MultiSolidCoverage
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSolidCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MultiSolidCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSolidCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.MultiSolidCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLIDCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage");
    
    
    /**
     * Gets the "MultiSolidCoverage" element
     */
    public net.opengis.gml.MultiSolidCoverageType getMultiSolidCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidCoverageType target = null;
            target = (net.opengis.gml.MultiSolidCoverageType)get_store().find_element_user(MULTISOLIDCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiSolidCoverage" element
     */
    @Inject(optional=true) public void setMultiSolidCoverage(net.opengis.gml.MultiSolidCoverageType multiSolidCoverage)
    {
        generatedSetterHelperImpl(multiSolidCoverage, MULTISOLIDCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiSolidCoverage" element
     */
    public net.opengis.gml.MultiSolidCoverageType addNewMultiSolidCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidCoverageType target = null;
            target = (net.opengis.gml.MultiSolidCoverageType)get_store().add_element_user(MULTISOLIDCOVERAGE$0);
            return target;
        }
    }
}
