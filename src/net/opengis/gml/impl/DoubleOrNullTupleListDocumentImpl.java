/*
 * An XML document type.
 * Localname: doubleOrNullTupleList
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DoubleOrNullTupleListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one doubleOrNullTupleList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DoubleOrNullTupleListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DoubleOrNullTupleListDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoubleOrNullTupleListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOUBLEORNULLTUPLELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "doubleOrNullTupleList");
    
    
    /**
     * Gets the "doubleOrNullTupleList" element
     */
    public java.util.List getDoubleOrNullTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNULLTUPLELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "doubleOrNullTupleList" element
     */
    public net.opengis.gml.DoubleOrNullList xgetDoubleOrNullTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DoubleOrNullList target = null;
            target = (net.opengis.gml.DoubleOrNullList)get_store().find_element_user(DOUBLEORNULLTUPLELIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "doubleOrNullTupleList" element
     */
    @Inject(optional=true) public void setDoubleOrNullTupleList(java.util.List doubleOrNullTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNULLTUPLELIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEORNULLTUPLELIST$0);
            }
            target.setListValue(doubleOrNullTupleList);
        }
    }
    
    /**
     * Sets (as xml) the "doubleOrNullTupleList" element
     */
    public void xsetDoubleOrNullTupleList(net.opengis.gml.DoubleOrNullList doubleOrNullTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DoubleOrNullList target = null;
            target = (net.opengis.gml.DoubleOrNullList)get_store().find_element_user(DOUBLEORNULLTUPLELIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DoubleOrNullList)get_store().add_element_user(DOUBLEORNULLTUPLELIST$0);
            }
            target.set(doubleOrNullTupleList);
        }
    }
}