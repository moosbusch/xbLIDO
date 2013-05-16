/*
 * An XML document type.
 * Localname: _CRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _CRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CRSDocumentImpl extends net.opengis.gml.impl.ReferenceSystemDocumentImpl implements net.opengis.gml.CRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public CRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CRS");
    private static final org.apache.xmlbeans.QNameSet CRS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeographicCRS"),
    });
    
    
    /**
     * Gets the "_CRS" element
     */
    public net.opengis.gml.AbstractReferenceSystemType getCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractReferenceSystemType)get_store().find_element_user(CRS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_CRS" element
     */
    @Inject(optional=true) public void setCRS(net.opengis.gml.AbstractReferenceSystemType crs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractReferenceSystemType)get_store().find_element_user(CRS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractReferenceSystemType)get_store().add_element_user(CRS$0);
            }
            target.set(crs);
        }
    }
    
    /**
     * Appends and returns a new empty "_CRS" element
     */
    public net.opengis.gml.AbstractReferenceSystemType addNewCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractReferenceSystemType)get_store().add_element_user(CRS$0);
            return target;
        }
    }
}
