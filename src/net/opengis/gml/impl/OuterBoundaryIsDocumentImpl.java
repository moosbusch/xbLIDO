/*
 * An XML document type.
 * Localname: outerBoundaryIs
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OuterBoundaryIsDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one outerBoundaryIs(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OuterBoundaryIsDocumentImpl extends net.opengis.gml.impl.ExteriorDocumentImpl implements net.opengis.gml.OuterBoundaryIsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OuterBoundaryIsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OUTERBOUNDARYIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "outerBoundaryIs");
    
    
    /**
     * Gets the "outerBoundaryIs" element
     */
    public net.opengis.gml.AbstractRingPropertyType getOuterBoundaryIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(OUTERBOUNDARYIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "outerBoundaryIs" element
     */
    @Inject(optional=true) public void setOuterBoundaryIs(net.opengis.gml.AbstractRingPropertyType outerBoundaryIs)
    {
        generatedSetterHelperImpl(outerBoundaryIs, OUTERBOUNDARYIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outerBoundaryIs" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewOuterBoundaryIs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(OUTERBOUNDARYIS$0);
            return target;
        }
    }
}
