/*
 * XML Type:  TemporalDatumType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TemporalDatumType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TemporalDatumType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TemporalDatumTypeImpl extends net.opengis.gml.impl.TemporalDatumBaseTypeImpl implements net.opengis.gml.TemporalDatumType
{
    private static final long serialVersionUID = 1L;
    
    public TemporalDatumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "origin");
    
    
    /**
     * Gets the "origin" element
     */
    public java.util.Calendar getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "origin" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORIGIN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    @Inject(optional=true) public void setOrigin(java.util.Calendar origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGIN$0);
            }
            target.setCalendarValue(origin);
        }
    }
    
    /**
     * Sets (as xml) the "origin" element
     */
    public void xsetOrigin(org.apache.xmlbeans.XmlDateTime origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ORIGIN$0);
            }
            target.set(origin);
        }
    }
}
