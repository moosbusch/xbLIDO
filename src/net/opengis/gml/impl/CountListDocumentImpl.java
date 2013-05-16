/*
 * An XML document type.
 * Localname: CountList
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CountListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CountList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CountListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CountListDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CountList");
    
    
    /**
     * Gets the "CountList" element
     */
    public java.util.List getCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountList" element
     */
    public net.opengis.gml.IntegerOrNullList xgetCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().find_element_user(COUNTLIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CountList" element
     */
    @Inject(optional=true) public void setCountList(java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTLIST$0);
            }
            target.setListValue(countList);
        }
    }
    
    /**
     * Sets (as xml) the "CountList" element
     */
    public void xsetCountList(net.opengis.gml.IntegerOrNullList countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().find_element_user(COUNTLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IntegerOrNullList)get_store().add_element_user(COUNTLIST$0);
            }
            target.set(countList);
        }
    }
}
