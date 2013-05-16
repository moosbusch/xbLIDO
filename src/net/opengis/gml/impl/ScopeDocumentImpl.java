/*
 * An XML document type.
 * Localname: scope
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ScopeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one scope(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ScopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ScopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "scope");
    
    
    /**
     * Gets the "scope" element
     */
    public java.lang.String getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" element
     */
    public org.apache.xmlbeans.XmlString xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    @Inject(optional=true) public void setScope(java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$0);
            }
            target.setStringValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" element
     */
    public void xsetScope(org.apache.xmlbeans.XmlString scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPE$0);
            }
            target.set(scope);
        }
    }
}
