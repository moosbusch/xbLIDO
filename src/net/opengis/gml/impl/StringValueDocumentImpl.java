/*
 * An XML document type.
 * Localname: stringValue
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.StringValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one stringValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class StringValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.StringValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGVALUE1$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "stringValue");
    
    
    /**
     * Gets the "stringValue" element
     */
    public java.lang.String getStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stringValue" element
     */
    public org.apache.xmlbeans.XmlString xgetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "stringValue" element
     */
    @Inject(optional=true) public void setStringValue1(java.lang.String stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGVALUE1$0);
            }
            target.setStringValue(stringValue1);
        }
    }
    
    /**
     * Sets (as xml) the "stringValue" element
     */
    public void xsetStringValue1(org.apache.xmlbeans.XmlString stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGVALUE1$0);
            }
            target.set(stringValue1);
        }
    }
}
