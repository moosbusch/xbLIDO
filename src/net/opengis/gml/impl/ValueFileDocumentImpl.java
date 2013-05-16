/*
 * An XML document type.
 * Localname: valueFile
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ValueFileDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one valueFile(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ValueFileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValueFileDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueFileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEFILE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueFile");
    
    
    /**
     * Gets the "valueFile" element
     */
    public java.lang.String getValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEFILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueFile" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(VALUEFILE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "valueFile" element
     */
    @Inject(optional=true) public void setValueFile(java.lang.String valueFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEFILE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUEFILE$0);
            }
            target.setStringValue(valueFile);
        }
    }
    
    /**
     * Sets (as xml) the "valueFile" element
     */
    public void xsetValueFile(org.apache.xmlbeans.XmlAnyURI valueFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(VALUEFILE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(VALUEFILE$0);
            }
            target.set(valueFile);
        }
    }
}
