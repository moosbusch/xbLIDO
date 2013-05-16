/*
 * An XML document type.
 * Localname: _ContinuousCoverage
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ContinuousCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _ContinuousCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ContinuousCoverageDocumentImpl extends net.opengis.gml.impl.CoverageDocumentImpl implements net.opengis.gml.ContinuousCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContinuousCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTINUOUSCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ContinuousCoverage");
    
    
    /**
     * Gets the "_ContinuousCoverage" element
     */
    public net.opengis.gml.AbstractContinuousCoverageType getContinuousCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractContinuousCoverageType target = null;
            target = (net.opengis.gml.AbstractContinuousCoverageType)get_store().find_element_user(CONTINUOUSCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_ContinuousCoverage" element
     */
    @Inject(optional=true) public void setContinuousCoverage(net.opengis.gml.AbstractContinuousCoverageType continuousCoverage)
    {
        generatedSetterHelperImpl(continuousCoverage, CONTINUOUSCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "_ContinuousCoverage" element
     */
    public net.opengis.gml.AbstractContinuousCoverageType addNewContinuousCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractContinuousCoverageType target = null;
            target = (net.opengis.gml.AbstractContinuousCoverageType)get_store().add_element_user(CONTINUOUSCOVERAGE$0);
            return target;
        }
    }
}
