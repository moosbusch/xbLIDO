/*
 * An XML document type.
 * Localname: _TimePrimitive
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimePrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _TimePrimitive(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimePrimitiveDocumentImpl extends net.opengis.gml.impl.TimeObjectDocumentImpl implements net.opengis.gml.TimePrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimePrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimePrimitive");
    private static final org.apache.xmlbeans.QNameSet TIMEPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeTopologyPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeInstant"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeEdge"),
    });
    
    
    /**
     * Gets the "_TimePrimitive" element
     */
    public net.opengis.gml.AbstractTimePrimitiveType getTimePrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimePrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimePrimitiveType)get_store().find_element_user(TIMEPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimePrimitive" element
     */
    @Inject(optional=true) public void setTimePrimitive(net.opengis.gml.AbstractTimePrimitiveType timePrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimePrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimePrimitiveType)get_store().find_element_user(TIMEPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimePrimitiveType)get_store().add_element_user(TIMEPRIMITIVE$0);
            }
            target.set(timePrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimePrimitive" element
     */
    public net.opengis.gml.AbstractTimePrimitiveType addNewTimePrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimePrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimePrimitiveType)get_store().add_element_user(TIMEPRIMITIVE$0);
            return target;
        }
    }
}
