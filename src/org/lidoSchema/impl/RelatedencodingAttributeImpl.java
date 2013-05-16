/*
 * An XML attribute type.
 * Localname: relatedencoding
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.RelatedencodingAttribute
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one relatedencoding(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class RelatedencodingAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RelatedencodingAttribute
{
    private static final long serialVersionUID = 1L;
    
    public RelatedencodingAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDENCODING$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedencoding");
    
    
    /**
     * Gets the "relatedencoding" attribute
     */
    public java.lang.String getRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relatedencoding" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$0);
            return target;
        }
    }
    
    /**
     * True if has "relatedencoding" attribute
     */
    public boolean isSetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATEDENCODING$0) != null;
        }
    }
    
    /**
     * Sets the "relatedencoding" attribute
     */
    @Inject(optional=true) public void setRelatedencoding(java.lang.String relatedencoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATEDENCODING$0);
            }
            target.setStringValue(relatedencoding);
        }
    }
    
    /**
     * Sets (as xml) the "relatedencoding" attribute
     */
    public void xsetRelatedencoding(org.apache.xmlbeans.XmlString relatedencoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATEDENCODING$0);
            }
            target.set(relatedencoding);
        }
    }
    
    /**
     * Unsets the "relatedencoding" attribute
     */
    public void unsetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATEDENCODING$0);
        }
    }
}
