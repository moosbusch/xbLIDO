/*
 * An XML document type.
 * Localname: _TimeGeometricPrimitive
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeGeometricPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _TimeGeometricPrimitive(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TimeGeometricPrimitiveDocumentImpl extends net.opengis.gml.impl.TimePrimitiveDocumentImpl implements net.opengis.gml.TimeGeometricPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeGeometricPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEGEOMETRICPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive");
    private static final org.apache.xmlbeans.QNameSet TIMEGEOMETRICPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeInstant"),
    });
    
    
    /**
     * Gets the "_TimeGeometricPrimitive" element
     */
    public net.opengis.gml.AbstractTimeGeometricPrimitiveType getTimeGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeGeometricPrimitiveType)get_store().find_element_user(TIMEGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TimeGeometricPrimitive" element
     */
    @Inject(optional=true) public void setTimeGeometricPrimitive(net.opengis.gml.AbstractTimeGeometricPrimitiveType timeGeometricPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeGeometricPrimitiveType)get_store().find_element_user(TIMEGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTimeGeometricPrimitiveType)get_store().add_element_user(TIMEGEOMETRICPRIMITIVE$0);
            }
            target.set(timeGeometricPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "_TimeGeometricPrimitive" element
     */
    public net.opengis.gml.AbstractTimeGeometricPrimitiveType addNewTimeGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTimeGeometricPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTimeGeometricPrimitiveType)get_store().add_element_user(TIMEGEOMETRICPRIMITIVE$0);
            return target;
        }
    }
}
