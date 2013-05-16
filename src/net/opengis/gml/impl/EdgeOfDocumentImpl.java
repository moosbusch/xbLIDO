/*
 * An XML document type.
 * Localname: edgeOf
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EdgeOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one edgeOf(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EdgeOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EdgeOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public EdgeOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDGEOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "edgeOf");
    
    
    /**
     * Gets the "edgeOf" element
     */
    public net.opengis.gml.CurvePropertyType getEdgeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(EDGEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "edgeOf" element
     */
    @Inject(optional=true) public void setEdgeOf(net.opengis.gml.CurvePropertyType edgeOf)
    {
        generatedSetterHelperImpl(edgeOf, EDGEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "edgeOf" element
     */
    public net.opengis.gml.CurvePropertyType addNewEdgeOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(EDGEOF$0);
            return target;
        }
    }
}
