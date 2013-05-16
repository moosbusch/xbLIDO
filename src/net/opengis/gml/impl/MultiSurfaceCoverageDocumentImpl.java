/*
 * An XML document type.
 * Localname: MultiSurfaceCoverage
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSurfaceCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MultiSurfaceCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSurfaceCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.MultiSurfaceCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSurfaceCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISURFACECOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurfaceCoverage");
    
    
    /**
     * Gets the "MultiSurfaceCoverage" element
     */
    public net.opengis.gml.MultiSurfaceCoverageType getMultiSurfaceCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceCoverageType target = null;
            target = (net.opengis.gml.MultiSurfaceCoverageType)get_store().find_element_user(MULTISURFACECOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiSurfaceCoverage" element
     */
    @Inject(optional=true) public void setMultiSurfaceCoverage(net.opengis.gml.MultiSurfaceCoverageType multiSurfaceCoverage)
    {
        generatedSetterHelperImpl(multiSurfaceCoverage, MULTISURFACECOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiSurfaceCoverage" element
     */
    public net.opengis.gml.MultiSurfaceCoverageType addNewMultiSurfaceCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfaceCoverageType target = null;
            target = (net.opengis.gml.MultiSurfaceCoverageType)get_store().add_element_user(MULTISURFACECOVERAGE$0);
            return target;
        }
    }
}
