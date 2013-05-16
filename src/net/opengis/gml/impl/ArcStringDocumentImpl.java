/*
 * An XML document type.
 * Localname: ArcString
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ArcStringDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ArcString(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArcStringDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.ArcStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCSTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcString");
    private static final org.apache.xmlbeans.QNameSet ARCSTRING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Arc"),
    });
    
    
    /**
     * Gets the "ArcString" element
     */
    public net.opengis.gml.ArcStringType getArcString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringType target = null;
            target = (net.opengis.gml.ArcStringType)get_store().find_element_user(ARCSTRING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcString" element
     */
    @Inject(optional=true) public void setArcString(net.opengis.gml.ArcStringType arcString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringType target = null;
            target = (net.opengis.gml.ArcStringType)get_store().find_element_user(ARCSTRING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcStringType)get_store().add_element_user(ARCSTRING$0);
            }
            target.set(arcString);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcString" element
     */
    public net.opengis.gml.ArcStringType addNewArcString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcStringType target = null;
            target = (net.opengis.gml.ArcStringType)get_store().add_element_user(ARCSTRING$0);
            return target;
        }
    }
}
