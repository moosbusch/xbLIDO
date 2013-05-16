/*
 * An XML document type.
 * Localname: _CoordinateReferenceSystem
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _CoordinateReferenceSystem(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateReferenceSystemDocumentImpl extends net.opengis.gml.impl.CRSDocumentImpl implements net.opengis.gml.CoordinateReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateReferenceSystem");
    private static final org.apache.xmlbeans.QNameSet COORDINATEREFERENCESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS"),
    });
    
    
    /**
     * Gets the "_CoordinateReferenceSystem" element
     */
    public net.opengis.gml.AbstractReferenceSystemType getCoordinateReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractReferenceSystemType)get_store().find_element_user(COORDINATEREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_CoordinateReferenceSystem" element
     */
    @Inject(optional=true) public void setCoordinateReferenceSystem(net.opengis.gml.AbstractReferenceSystemType coordinateReferenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractReferenceSystemType)get_store().find_element_user(COORDINATEREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractReferenceSystemType)get_store().add_element_user(COORDINATEREFERENCESYSTEM$0);
            }
            target.set(coordinateReferenceSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "_CoordinateReferenceSystem" element
     */
    public net.opengis.gml.AbstractReferenceSystemType addNewCoordinateReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractReferenceSystemType target = null;
            target = (net.opengis.gml.AbstractReferenceSystemType)get_store().add_element_user(COORDINATEREFERENCESYSTEM$0);
            return target;
        }
    }
}
