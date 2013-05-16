/*
 * An XML document type.
 * Localname: multiCoverage
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiCoverageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiCoverage");
    
    
    /**
     * Gets the "multiCoverage" element
     */
    public net.opengis.gml.MultiSurfacePropertyType getMultiCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.MultiSurfacePropertyType)get_store().find_element_user(MULTICOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCoverage" element
     */
    @Inject(optional=true) public void setMultiCoverage(net.opengis.gml.MultiSurfacePropertyType multiCoverage)
    {
        generatedSetterHelperImpl(multiCoverage, MULTICOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCoverage" element
     */
    public net.opengis.gml.MultiSurfacePropertyType addNewMultiCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.MultiSurfacePropertyType)get_store().add_element_user(MULTICOVERAGE$0);
            return target;
        }
    }
}
