/*
 * An XML document type.
 * Localname: integerValueList
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IntegerValueListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one integerValueList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IntegerValueListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IntegerValueListDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntegerValueListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGERVALUELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "integerValueList");
    
    
    /**
     * Gets the "integerValueList" element
     */
    public java.util.List getIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerValueList" element
     */
    public net.opengis.gml.IntegerList xgetIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(INTEGERVALUELIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "integerValueList" element
     */
    @Inject(optional=true) public void setIntegerValueList(java.util.List integerValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUELIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERVALUELIST$0);
            }
            target.setListValue(integerValueList);
        }
    }
    
    /**
     * Sets (as xml) the "integerValueList" element
     */
    public void xsetIntegerValueList(net.opengis.gml.IntegerList integerValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(INTEGERVALUELIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IntegerList)get_store().add_element_user(INTEGERVALUELIST$0);
            }
            target.set(integerValueList);
        }
    }
}
