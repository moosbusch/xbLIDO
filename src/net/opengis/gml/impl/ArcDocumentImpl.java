/*
 * An XML document type.
 * Localname: Arc
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ArcDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Arc(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArcDocumentImpl extends net.opengis.gml.impl.ArcStringDocumentImpl implements net.opengis.gml.ArcDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARC$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Arc");
    private static final org.apache.xmlbeans.QNameSet ARC$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Arc"),
    });
    
    
    /**
     * Gets the "Arc" element
     */
    public net.opengis.gml.ArcType getArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcType target = null;
            target = (net.opengis.gml.ArcType)get_store().find_element_user(ARC$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Arc" element
     */
    @Inject(optional=true) public void setArc(net.opengis.gml.ArcType arc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcType target = null;
            target = (net.opengis.gml.ArcType)get_store().find_element_user(ARC$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcType)get_store().add_element_user(ARC$0);
            }
            target.set(arc);
        }
    }
    
    /**
     * Appends and returns a new empty "Arc" element
     */
    public net.opengis.gml.ArcType addNewArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcType target = null;
            target = (net.opengis.gml.ArcType)get_store().add_element_user(ARC$0);
            return target;
        }
    }
}
