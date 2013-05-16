/*
 * An XML attribute type.
 * Localname: politicalEntity
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.PoliticalEntityAttribute
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one politicalEntity(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class PoliticalEntityAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.PoliticalEntityAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PoliticalEntityAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLITICALENTITY$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "politicalEntity");
    
    
    /**
     * Gets the "politicalEntity" attribute
     */
    public java.lang.String getPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLITICALENTITY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "politicalEntity" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLITICALENTITY$0);
            return target;
        }
    }
    
    /**
     * True if has "politicalEntity" attribute
     */
    public boolean isSetPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POLITICALENTITY$0) != null;
        }
    }
    
    /**
     * Sets the "politicalEntity" attribute
     */
    @Inject(optional=true) public void setPoliticalEntity(java.lang.String politicalEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLITICALENTITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POLITICALENTITY$0);
            }
            target.setStringValue(politicalEntity);
        }
    }
    
    /**
     * Sets (as xml) the "politicalEntity" attribute
     */
    public void xsetPoliticalEntity(org.apache.xmlbeans.XmlString politicalEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLITICALENTITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POLITICALENTITY$0);
            }
            target.set(politicalEntity);
        }
    }
    
    /**
     * Unsets the "politicalEntity" attribute
     */
    public void unsetPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POLITICALENTITY$0);
        }
    }
}
