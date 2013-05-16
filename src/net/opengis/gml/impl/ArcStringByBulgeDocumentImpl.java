/*
 * An XML document type.
 * Localname: ArcStringByBulge
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ArcStringByBulgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ArcStringByBulge(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArcStringByBulgeDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.ArcStringByBulgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcStringByBulgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCSTRINGBYBULGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcStringByBulge");
    private static final org.apache.xmlbeans.QNameSet ARCSTRINGBYBULGE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcByBulge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcStringByBulge"),
    });
    
    
    /**
     * Gets the "ArcStringByBulge" element
     */
    public net.opengis.gml.ArcStringByBulgeType getArcStringByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.ArcStringByBulgeType)get_store().find_element_user(ARCSTRINGBYBULGE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcStringByBulge" element
     */
    @Inject(optional=true) public void setArcStringByBulge(net.opengis.gml.ArcStringByBulgeType arcStringByBulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.ArcStringByBulgeType)get_store().find_element_user(ARCSTRINGBYBULGE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcStringByBulgeType)get_store().add_element_user(ARCSTRINGBYBULGE$0);
            }
            target.set(arcStringByBulge);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcStringByBulge" element
     */
    public net.opengis.gml.ArcStringByBulgeType addNewArcStringByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.ArcStringByBulgeType)get_store().add_element_user(ARCSTRINGBYBULGE$0);
            return target;
        }
    }
}
