/*
 * XML Type:  CovarianceElementType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CovarianceElementType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CovarianceElementType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CovarianceElementTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CovarianceElementType
{
    private static final long serialVersionUID = 1L;
    
    public CovarianceElementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROWINDEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rowIndex");
    private static final javax.xml.namespace.QName COLUMNINDEX$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "columnIndex");
    private static final javax.xml.namespace.QName COVARIANCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "covariance");
    
    
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
    
    /**
     * Gets the "columnIndex" element
     */
    public java.math.BigInteger getColumnIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNINDEX$2, 0);
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
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(COLUMNINDEX$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNINDEX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNINDEX$2);
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
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(COLUMNINDEX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(COLUMNINDEX$2);
            }
            target.set(columnIndex);
        }
    }
    
    /**
     * Gets the "covariance" element
     */
    public double getCovariance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVARIANCE$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "covariance" element
     */
    public org.apache.xmlbeans.XmlDouble xgetCovariance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(COVARIANCE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "covariance" element
     */
    @Inject(optional=true) public void setCovariance(double covariance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVARIANCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COVARIANCE$4);
            }
            target.setDoubleValue(covariance);
        }
    }
    
    /**
     * Sets (as xml) the "covariance" element
     */
    public void xsetCovariance(org.apache.xmlbeans.XmlDouble covariance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(COVARIANCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(COVARIANCE$4);
            }
            target.set(covariance);
        }
    }
}
