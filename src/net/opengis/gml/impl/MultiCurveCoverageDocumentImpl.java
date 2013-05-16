/*
 * An XML document type.
 * Localname: MultiCurveCoverage
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiCurveCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MultiCurveCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiCurveCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.MultiCurveCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurveCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICURVECOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurveCoverage");
    
    
    /**
     * Gets the "MultiCurveCoverage" element
     */
    public net.opengis.gml.MultiCurveCoverageType getMultiCurveCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurveCoverageType target = null;
            target = (net.opengis.gml.MultiCurveCoverageType)get_store().find_element_user(MULTICURVECOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiCurveCoverage" element
     */
    @Inject(optional=true) public void setMultiCurveCoverage(net.opengis.gml.MultiCurveCoverageType multiCurveCoverage)
    {
        generatedSetterHelperImpl(multiCurveCoverage, MULTICURVECOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiCurveCoverage" element
     */
    public net.opengis.gml.MultiCurveCoverageType addNewMultiCurveCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurveCoverageType target = null;
            target = (net.opengis.gml.MultiCurveCoverageType)get_store().add_element_user(MULTICURVECOVERAGE$0);
            return target;
        }
    }
}
