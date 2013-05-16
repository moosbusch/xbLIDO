/*
 * An XML document type.
 * Localname: targetDimensions
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TargetDimensionsDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one targetDimensions(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TargetDimensionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TargetDimensionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TargetDimensionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETDIMENSIONS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "targetDimensions");
    
    
    /**
     * Gets the "targetDimensions" element
     */
    public java.math.BigInteger getTargetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDIMENSIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetDimensions" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetTargetDimensions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(TARGETDIMENSIONS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetDimensions" element
     */
    @Inject(optional=true) public void setTargetDimensions(java.math.BigInteger targetDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETDIMENSIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETDIMENSIONS$0);
            }
            target.setBigIntegerValue(targetDimensions);
        }
    }
    
    /**
     * Sets (as xml) the "targetDimensions" element
     */
    public void xsetTargetDimensions(org.apache.xmlbeans.XmlPositiveInteger targetDimensions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(TARGETDIMENSIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(TARGETDIMENSIONS$0);
            }
            target.set(targetDimensions);
        }
    }
}
