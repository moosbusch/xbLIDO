/*
 * An XML document type.
 * Localname: TimeNode
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeNodeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one TimeNode(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeNodeDocumentImpl extends net.opengis.gml.impl.TimeTopologyPrimitiveDocumentImpl implements net.opengis.gml.TimeNodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeNodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMENODE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeNode");
    
    
    /**
     * Gets the "TimeNode" element
     */
    public net.opengis.gml.TimeNodeType getTimeNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodeType target = null;
            target = (net.opengis.gml.TimeNodeType)get_store().find_element_user(TIMENODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeNode" element
     */
    @Inject(optional=true) public void setTimeNode(net.opengis.gml.TimeNodeType timeNode)
    {
        generatedSetterHelperImpl(timeNode, TIMENODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TimeNode" element
     */
    public net.opengis.gml.TimeNodeType addNewTimeNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodeType target = null;
            target = (net.opengis.gml.TimeNodeType)get_store().add_element_user(TIMENODE$0);
            return target;
        }
    }
}
