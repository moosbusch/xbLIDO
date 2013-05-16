/*
 * An XML document type.
 * Localname: GridCoverage
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GridCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one GridCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GridCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.GridCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public GridCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage");
    
    
    /**
     * Gets the "GridCoverage" element
     */
    public net.opengis.gml.GridCoverageType getGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridCoverageType target = null;
            target = (net.opengis.gml.GridCoverageType)get_store().find_element_user(GRIDCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GridCoverage" element
     */
    @Inject(optional=true) public void setGridCoverage(net.opengis.gml.GridCoverageType gridCoverage)
    {
        generatedSetterHelperImpl(gridCoverage, GRIDCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GridCoverage" element
     */
    public net.opengis.gml.GridCoverageType addNewGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridCoverageType target = null;
            target = (net.opengis.gml.GridCoverageType)get_store().add_element_user(GRIDCOVERAGE$0);
            return target;
        }
    }
}
