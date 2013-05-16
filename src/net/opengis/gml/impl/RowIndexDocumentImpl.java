/*
 * An XML document type.
 * Localname: rowIndex
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RowIndexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one rowIndex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RowIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.RowIndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public RowIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROWINDEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rowIndex");
    
    
    /**
     * Gets the "rowIndex" element
     */
    public java.math.BigInteger getRowIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWINDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowIndex" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetRowIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROWINDEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rowIndex" element
     */
    @Inject(optional=true) public void setRowIndex(java.math.BigInteger rowIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWINDEX$0);
            }
            target.setBigIntegerValue(rowIndex);
        }
    }
    
    /**
     * Sets (as xml) the "rowIndex" element
     */
    public void xsetRowIndex(org.apache.xmlbeans.XmlPositiveInteger rowIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROWINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(ROWINDEX$0);
            }
            target.set(rowIndex);
        }
    }
}
