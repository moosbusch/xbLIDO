/*
 * An XML document type.
 * Localname: Edge
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EdgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Edge(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EdgeDocumentImpl extends net.opengis.gml.impl.TopoPrimitiveDocumentImpl implements net.opengis.gml.EdgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EdgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Edge");
    
    
    /**
     * Gets the "Edge" element
     */
    public net.opengis.gml.EdgeType getEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EdgeType target = null;
            target = (net.opengis.gml.EdgeType)get_store().find_element_user(EDGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Edge" element
     */
    @Inject(optional=true) public void setEdge(net.opengis.gml.EdgeType edge)
    {
        generatedSetterHelperImpl(edge, EDGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Edge" element
     */
    public net.opengis.gml.EdgeType addNewEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EdgeType target = null;
            target = (net.opengis.gml.EdgeType)get_store().add_element_user(EDGE$0);
            return target;
        }
    }
}
