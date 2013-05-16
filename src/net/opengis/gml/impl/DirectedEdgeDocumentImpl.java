/*
 * An XML document type.
 * Localname: directedEdge
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DirectedEdgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one directedEdge(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectedEdgeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DirectedEdgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedEdgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDEDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedEdge");
    
    
    /**
     * Gets the "directedEdge" element
     */
    public net.opengis.gml.DirectedEdgePropertyType getDirectedEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.DirectedEdgePropertyType)get_store().find_element_user(DIRECTEDEDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "directedEdge" element
     */
    @Inject(optional=true) public void setDirectedEdge(net.opengis.gml.DirectedEdgePropertyType directedEdge)
    {
        generatedSetterHelperImpl(directedEdge, DIRECTEDEDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "directedEdge" element
     */
    public net.opengis.gml.DirectedEdgePropertyType addNewDirectedEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.DirectedEdgePropertyType)get_store().add_element_user(DIRECTEDEDGE$0);
            return target;
        }
    }
}
