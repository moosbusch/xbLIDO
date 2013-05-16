/*
 * An XML document type.
 * Localname: modifiedCoordinate
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ModifiedCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one modifiedCoordinate(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ModifiedCoordinateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ModifiedCoordinateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModifiedCoordinateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODIFIEDCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "modifiedCoordinate");
    
    
    /**
     * Gets the "modifiedCoordinate" element
     */
    public java.math.BigInteger getModifiedCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDCOORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "modifiedCoordinate" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetModifiedCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MODIFIEDCOORDINATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "modifiedCoordinate" element
     */
    @Inject(optional=true) public void setModifiedCoordinate(java.math.BigInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDCOORDINATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIEDCOORDINATE$0);
            }
            target.setBigIntegerValue(modifiedCoordinate);
        }
    }
    
    /**
     * Sets (as xml) the "modifiedCoordinate" element
     */
    public void xsetModifiedCoordinate(org.apache.xmlbeans.XmlPositiveInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MODIFIEDCOORDINATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MODIFIEDCOORDINATE$0);
            }
            target.set(modifiedCoordinate);
        }
    }
}
