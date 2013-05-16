/*
 * An XML document type.
 * Localname: projectedCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ProjectedCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one projectedCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ProjectedCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ProjectedCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProjectedCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECTEDCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "projectedCRSRef");
    
    
    /**
     * Gets the "projectedCRSRef" element
     */
    public net.opengis.gml.ProjectedCRSRefType getProjectedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ProjectedCRSRefType target = null;
            target = (net.opengis.gml.ProjectedCRSRefType)get_store().find_element_user(PROJECTEDCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "projectedCRSRef" element
     */
    @Inject(optional=true) public void setProjectedCRSRef(net.opengis.gml.ProjectedCRSRefType projectedCRSRef)
    {
        generatedSetterHelperImpl(projectedCRSRef, PROJECTEDCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "projectedCRSRef" element
     */
    public net.opengis.gml.ProjectedCRSRefType addNewProjectedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ProjectedCRSRefType target = null;
            target = (net.opengis.gml.ProjectedCRSRefType)get_store().add_element_user(PROJECTEDCRSREF$0);
            return target;
        }
    }
}
