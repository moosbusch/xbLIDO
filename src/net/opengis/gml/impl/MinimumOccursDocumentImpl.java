/*
 * An XML document type.
 * Localname: minimumOccurs
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MinimumOccursDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one minimumOccurs(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MinimumOccursDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MinimumOccursDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinimumOccursDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIMUMOCCURS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "minimumOccurs");
    
    
    /**
     * Gets the "minimumOccurs" element
     */
    public java.math.BigInteger getMinimumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMOCCURS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimumOccurs" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMinimumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MINIMUMOCCURS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minimumOccurs" element
     */
    @Inject(optional=true) public void setMinimumOccurs(java.math.BigInteger minimumOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMOCCURS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMOCCURS$0);
            }
            target.setBigIntegerValue(minimumOccurs);
        }
    }
    
    /**
     * Sets (as xml) the "minimumOccurs" element
     */
    public void xsetMinimumOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minimumOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MINIMUMOCCURS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(MINIMUMOCCURS$0);
            }
            target.set(minimumOccurs);
        }
    }
}
