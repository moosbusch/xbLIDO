/*
 * An XML document type.
 * Localname: columnIndex
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ColumnIndexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one columnIndex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ColumnIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ColumnIndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public ColumnIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNINDEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "columnIndex");
    
    
    /**
     * Gets the "columnIndex" element
     */
    public java.math.BigInteger getColumnIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNINDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "columnIndex" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetColumnIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(COLUMNINDEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "columnIndex" element
     */
    @Inject(optional=true) public void setColumnIndex(java.math.BigInteger columnIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNINDEX$0);
            }
            target.setBigIntegerValue(columnIndex);
        }
    }
    
    /**
     * Sets (as xml) the "columnIndex" element
     */
    public void xsetColumnIndex(org.apache.xmlbeans.XmlPositiveInteger columnIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(COLUMNINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(COLUMNINDEX$0);
            }
            target.set(columnIndex);
        }
    }
}
