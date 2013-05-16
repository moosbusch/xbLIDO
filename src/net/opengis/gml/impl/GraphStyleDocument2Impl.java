/*
 * An XML document type.
 * Localname: GraphStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GraphStyleDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one GraphStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GraphStyleDocument2Impl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.GraphStyleDocument2
{
    private static final long serialVersionUID = 1L;
    
    public GraphStyleDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRAPHSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GraphStyle");
    
    
    /**
     * Gets the "GraphStyle" element
     */
    public net.opengis.gml.GraphStyleType getGraphStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GraphStyleType target = null;
            target = (net.opengis.gml.GraphStyleType)get_store().find_element_user(GRAPHSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GraphStyle" element
     */
    @Inject(optional=true) public void setGraphStyle(net.opengis.gml.GraphStyleType graphStyle)
    {
        generatedSetterHelperImpl(graphStyle, GRAPHSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GraphStyle" element
     */
    public net.opengis.gml.GraphStyleType addNewGraphStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GraphStyleType target = null;
            target = (net.opengis.gml.GraphStyleType)get_store().add_element_user(GRAPHSTYLE$0);
            return target;
        }
    }
}
