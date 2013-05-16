/*
 * An XML document type.
 * Localname: innerBoundaryIs
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.InnerBoundaryIsDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one innerBoundaryIs(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class InnerBoundaryIsDocumentImpl extends net.opengis.gml.impl.InteriorDocumentImpl implements net.opengis.gml.InnerBoundaryIsDocument
{
    private static final long serialVersionUID = 1L;
    
    public InnerBoundaryIsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INNERBOUNDARYIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "innerBoundaryIs");
    
    
    /**
     * Gets the "innerBoundaryIs" element
     */
    public net.opengis.gml.AbstractRingPropertyType getInnerBoundaryIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INNERBOUNDARYIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "innerBoundaryIs" element
     */
    @Inject(optional=true) public void setInnerBoundaryIs(net.opengis.gml.AbstractRingPropertyType innerBoundaryIs)
    {
        generatedSetterHelperImpl(innerBoundaryIs, INNERBOUNDARYIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "innerBoundaryIs" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewInnerBoundaryIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(INNERBOUNDARYIS$0);
            return target;
        }
    }
}
