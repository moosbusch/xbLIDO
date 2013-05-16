/*
 * An XML attribute type.
 * Localname: sortorder
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.SortorderAttribute
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one sortorder(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class SortorderAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.SortorderAttribute
{
    private static final long serialVersionUID = 1L;
    
    public SortorderAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SORTORDER$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");
    
    
    /**
     * Gets the "sortorder" attribute
     */
    public java.math.BigInteger getSortorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sortorder" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSortorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
            return target;
        }
    }
    
    /**
     * True if has "sortorder" attribute
     */
    public boolean isSetSortorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORTORDER$0) != null;
        }
    }
    
    /**
     * Sets the "sortorder" attribute
     */
    @Inject(optional=true) public void setSortorder(java.math.BigInteger sortorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
            }
            target.setBigIntegerValue(sortorder);
        }
    }
    
    /**
     * Sets (as xml) the "sortorder" attribute
     */
    public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
            }
            target.set(sortorder);
        }
    }
    
    /**
     * Unsets the "sortorder" attribute
     */
    public void unsetSortorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORTORDER$0);
        }
    }
}
