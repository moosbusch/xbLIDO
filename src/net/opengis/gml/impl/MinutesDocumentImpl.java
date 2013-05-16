/*
 * An XML document type.
 * Localname: minutes
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MinutesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one minutes(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MinutesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MinutesDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinutesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINUTES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "minutes");
    
    
    /**
     * Gets the "minutes" element
     */
    public int getMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minutes" element
     */
    public net.opengis.gml.ArcMinutesType xgetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcMinutesType target = null;
            target = (net.opengis.gml.ArcMinutesType)get_store().find_element_user(MINUTES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minutes" element
     */
    @Inject(optional=true) public void setMinutes(int minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTES$0);
            }
            target.setIntValue(minutes);
        }
    }
    
    /**
     * Sets (as xml) the "minutes" element
     */
    public void xsetMinutes(net.opengis.gml.ArcMinutesType minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcMinutesType target = null;
            target = (net.opengis.gml.ArcMinutesType)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcMinutesType)get_store().add_element_user(MINUTES$0);
            }
            target.set(minutes);
        }
    }
}
