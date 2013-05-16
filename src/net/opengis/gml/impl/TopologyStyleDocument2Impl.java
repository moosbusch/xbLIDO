/*
 * An XML document type.
 * Localname: TopologyStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopologyStyleDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TopologyStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopologyStyleDocument2Impl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.TopologyStyleDocument2
{
    private static final long serialVersionUID = 1L;
    
    public TopologyStyleDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOLOGYSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopologyStyle");
    
    
    /**
     * Gets the "TopologyStyle" element
     */
    public net.opengis.gml.TopologyStyleType getTopologyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopologyStyleType target = null;
            target = (net.opengis.gml.TopologyStyleType)get_store().find_element_user(TOPOLOGYSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopologyStyle" element
     */
    @Inject(optional=true) public void setTopologyStyle(net.opengis.gml.TopologyStyleType topologyStyle)
    {
        generatedSetterHelperImpl(topologyStyle, TOPOLOGYSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopologyStyle" element
     */
    public net.opengis.gml.TopologyStyleType addNewTopologyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopologyStyleType target = null;
            target = (net.opengis.gml.TopologyStyleType)get_store().add_element_user(TOPOLOGYSTYLE$0);
            return target;
        }
    }
}
