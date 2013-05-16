/*
 * An XML document type.
 * Localname: RectifiedGridCoverage
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RectifiedGridCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one RectifiedGridCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RectifiedGridCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.RectifiedGridCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTIFIEDGRIDCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGridCoverage");
    
    
    /**
     * Gets the "RectifiedGridCoverage" element
     */
    public net.opengis.gml.RectifiedGridCoverageType getRectifiedGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectifiedGridCoverageType target = null;
            target = (net.opengis.gml.RectifiedGridCoverageType)get_store().find_element_user(RECTIFIEDGRIDCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RectifiedGridCoverage" element
     */
    @Inject(optional=true) public void setRectifiedGridCoverage(net.opengis.gml.RectifiedGridCoverageType rectifiedGridCoverage)
    {
        generatedSetterHelperImpl(rectifiedGridCoverage, RECTIFIEDGRIDCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RectifiedGridCoverage" element
     */
    public net.opengis.gml.RectifiedGridCoverageType addNewRectifiedGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectifiedGridCoverageType target = null;
            target = (net.opengis.gml.RectifiedGridCoverageType)get_store().add_element_user(RECTIFIEDGRIDCOVERAGE$0);
            return target;
        }
    }
}
