/*
 * An XML document type.
 * Localname: graphStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GraphStyleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one graphStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GraphStyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GraphStyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public GraphStyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRAPHSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "graphStyle");
    
    
    /**
     * Gets the "graphStyle" element
     */
    public net.opengis.gml.GraphStylePropertyType getGraphStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GraphStylePropertyType target = null;
            target = (net.opengis.gml.GraphStylePropertyType)get_store().find_element_user(GRAPHSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "graphStyle" element
     */
    @Inject(optional=true) public void setGraphStyle(net.opengis.gml.GraphStylePropertyType graphStyle)
    {
        generatedSetterHelperImpl(graphStyle, GRAPHSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "graphStyle" element
     */
    public net.opengis.gml.GraphStylePropertyType addNewGraphStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GraphStylePropertyType target = null;
            target = (net.opengis.gml.GraphStylePropertyType)get_store().add_element_user(GRAPHSTYLE$0);
            return target;
        }
    }
}
