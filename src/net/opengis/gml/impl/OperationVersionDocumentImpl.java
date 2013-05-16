/*
 * An XML document type.
 * Localname: operationVersion
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationVersionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one operationVersion(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OperationVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.OperationVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONVERSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "operationVersion");
    
    
    /**
     * Gets the "operationVersion" element
     */
    public java.lang.String getOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operationVersion" element
     */
    @Inject(optional=true) public void setOperationVersion(java.lang.String operationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONVERSION$0);
            }
            target.setStringValue(operationVersion);
        }
    }
    
    /**
     * Sets (as xml) the "operationVersion" element
     */
    public void xsetOperationVersion(org.apache.xmlbeans.XmlString operationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONVERSION$0);
            }
            target.set(operationVersion);
        }
    }
}
