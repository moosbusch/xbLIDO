/*
 * An XML document type.
 * Localname: CountExtent
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CountExtentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CountExtent(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CountExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CountExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CountExtent");
    
    
    /**
     * Gets the "CountExtent" element
     */
    public java.util.List getCountExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountExtent" element
     */
    public net.opengis.gml.CountExtentType xgetCountExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CountExtentType target = null;
            target = (net.opengis.gml.CountExtentType)get_store().find_element_user(COUNTEXTENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CountExtent" element
     */
    @Inject(optional=true) public void setCountExtent(java.util.List countExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTEXTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTEXTENT$0);
            }
            target.setListValue(countExtent);
        }
    }
    
    /**
     * Sets (as xml) the "CountExtent" element
     */
    public void xsetCountExtent(net.opengis.gml.CountExtentType countExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CountExtentType target = null;
            target = (net.opengis.gml.CountExtentType)get_store().find_element_user(COUNTEXTENT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CountExtentType)get_store().add_element_user(COUNTEXTENT$0);
            }
            target.set(countExtent);
        }
    }
}
