/*
 * An XML document type.
 * Localname: integerValue
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IntegerValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one integerValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IntegerValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IntegerValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntegerValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGERVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "integerValue");
    
    
    /**
     * Gets the "integerValue" element
     */
    public java.math.BigInteger getIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerValue" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INTEGERVALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "integerValue" element
     */
    @Inject(optional=true) public void setIntegerValue(java.math.BigInteger integerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERVALUE$0);
            }
            target.setBigIntegerValue(integerValue);
        }
    }
    
    /**
     * Sets (as xml) the "integerValue" element
     */
    public void xsetIntegerValue(org.apache.xmlbeans.XmlPositiveInteger integerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INTEGERVALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(INTEGERVALUE$0);
            }
            target.set(integerValue);
        }
    }
}
