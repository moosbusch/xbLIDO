/*
 * An XML document type.
 * Localname: ProjectedCRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ProjectedCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ProjectedCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ProjectedCRSDocumentImpl extends net.opengis.gml.impl.GeneralDerivedCRSDocumentImpl implements net.opengis.gml.ProjectedCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProjectedCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECTEDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS");
    
    
    /**
     * Gets the "ProjectedCRS" element
     */
    public net.opengis.gml.ProjectedCRSType getProjectedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ProjectedCRSType target = null;
            target = (net.opengis.gml.ProjectedCRSType)get_store().find_element_user(PROJECTEDCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProjectedCRS" element
     */
    @Inject(optional=true) public void setProjectedCRS(net.opengis.gml.ProjectedCRSType projectedCRS)
    {
        generatedSetterHelperImpl(projectedCRS, PROJECTEDCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProjectedCRS" element
     */
    public net.opengis.gml.ProjectedCRSType addNewProjectedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ProjectedCRSType target = null;
            target = (net.opengis.gml.ProjectedCRSType)get_store().add_element_user(PROJECTEDCRS$0);
            return target;
        }
    }
}
