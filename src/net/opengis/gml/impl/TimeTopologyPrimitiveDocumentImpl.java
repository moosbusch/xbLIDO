/*
 * An XML document type.
 * Localname: _TimeTopologyPrimitive
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeTopologyPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _TimeTopologyPrimitive(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeTopologyPrimitiveDocumentImpl extends net.opengis.gml.impl.TimePrimitiveDocumentImpl implements net.opengis.gml.TimeTopologyPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeTopologyPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMETOPOLOGYPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeTopologyPrimitive");
    private static final org.apache.xmlbeans.QNameSet TIMETOPOLOGYPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeTopologyPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeEdge"),
    });
    
    
    /**
     * Gets the "_TimeTopologyPrimitive" element
     */
    public net.opengis.gml.AbstractTimeTopologyPrimitiveType getTimeTopologyPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeTopologyPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeTopologyPrimitiveType)get_store().find_element_user(TIMETOPOLOGYPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeTopologyPrimitive" element
     */
    @Inject(optional=true) public void setTimeTopologyPrimitive(net.opengis.gml.AbstractTimeTopologyPrimitiveType timeTopologyPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeTopologyPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeTopologyPrimitiveType)get_store().find_element_user(TIMETOPOLOGYPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeTopologyPrimitiveType)get_store().add_element_user(TIMETOPOLOGYPRIMITIVE$0);
            }
            target.set(timeTopologyPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeTopologyPrimitive" element
     */
    public net.opengis.gml.AbstractTimeTopologyPrimitiveType addNewTimeTopologyPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeTopologyPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeTopologyPrimitiveType)get_store().add_element_user(TIMETOPOLOGYPRIMITIVE$0);
            return target;
        }
    }
}
