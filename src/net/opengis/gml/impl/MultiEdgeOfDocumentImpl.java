/*
 * An XML document type.
 * Localname: multiEdgeOf
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiEdgeOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiEdgeOf(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiEdgeOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiEdgeOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiEdgeOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIEDGEOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiEdgeOf");
    
    
    /**
     * Gets the "multiEdgeOf" element
     */
    public net.opengis.gml.MultiCurvePropertyType getMultiEdgeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.MultiCurvePropertyType)get_store().find_element_user(MULTIEDGEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiEdgeOf" element
     */
    @Inject(optional=true) public void setMultiEdgeOf(net.opengis.gml.MultiCurvePropertyType multiEdgeOf)
    {
        generatedSetterHelperImpl(multiEdgeOf, MULTIEDGEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiEdgeOf" element
     */
    public net.opengis.gml.MultiCurvePropertyType addNewMultiEdgeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurvePropertyType target = null;
            target = (net.opengis.gml.MultiCurvePropertyType)get_store().add_element_user(MULTIEDGEOF$0);
            return target;
        }
    }
}
