/*
 * XML Type:  AbstractTimeReferenceSystemType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractTimeReferenceSystemType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML AbstractTimeReferenceSystemType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractTimeReferenceSystemTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.AbstractTimeReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINOFVALIDITY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "domainOfValidity");
    
    
    /**
     * Gets the "domainOfValidity" element
     */
    public java.lang.String getDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domainOfValidity" element
     */
    public org.apache.xmlbeans.XmlString xgetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "domainOfValidity" element
     */
    public boolean isSetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINOFVALIDITY$0) != 0;
        }
    }
    
    /**
     * Sets the "domainOfValidity" element
     */
    @Inject(optional=true) public void setDomainOfValidity(java.lang.String domainOfValidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINOFVALIDITY$0);
            }
            target.setStringValue(domainOfValidity);
        }
    }
    
    /**
     * Sets (as xml) the "domainOfValidity" element
     */
    public void xsetDomainOfValidity(org.apache.xmlbeans.XmlString domainOfValidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINOFVALIDITY$0);
            }
            target.set(domainOfValidity);
        }
    }
    
    /**
     * Unsets the "domainOfValidity" element
     */
    public void unsetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINOFVALIDITY$0, 0);
        }
    }
}
