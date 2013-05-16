/*
 * An XML document type.
 * Localname: topologyStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopologyStyleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one topologyStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopologyStyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopologyStyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopologyStyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOLOGYSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topologyStyle");
    
    
    /**
     * Gets the "topologyStyle" element
     */
    public net.opengis.gml.TopologyStylePropertyType getTopologyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopologyStylePropertyType target = null;
            target = (net.opengis.gml.TopologyStylePropertyType)get_store().find_element_user(TOPOLOGYSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topologyStyle" element
     */
    @Inject(optional=true) public void setTopologyStyle(net.opengis.gml.TopologyStylePropertyType topologyStyle)
    {
        generatedSetterHelperImpl(topologyStyle, TOPOLOGYSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topologyStyle" element
     */
    public net.opengis.gml.TopologyStylePropertyType addNewTopologyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopologyStylePropertyType target = null;
            target = (net.opengis.gml.TopologyStylePropertyType)get_store().add_element_user(TOPOLOGYSTYLE$0);
            return target;
        }
    }
}
