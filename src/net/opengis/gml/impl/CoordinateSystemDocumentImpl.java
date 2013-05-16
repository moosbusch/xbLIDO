/*
 * An XML document type.
 * Localname: _CoordinateSystem
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _CoordinateSystem(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateSystemDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.CoordinateSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateSystem");
    private static final org.apache.xmlbeans.QNameSet COORDINATESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCS"),
    });
    
    
    /**
     * Gets the "_CoordinateSystem" element
     */
    public net.opengis.gml.AbstractCoordinateSystemType getCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateSystemType target = null;
            target = (net.opengis.gml.AbstractCoordinateSystemType)get_store().find_element_user(COORDINATESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_CoordinateSystem" element
     */
    @Inject(optional=true) public void setCoordinateSystem(net.opengis.gml.AbstractCoordinateSystemType coordinateSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateSystemType target = null;
            target = (net.opengis.gml.AbstractCoordinateSystemType)get_store().find_element_user(COORDINATESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractCoordinateSystemType)get_store().add_element_user(COORDINATESYSTEM$0);
            }
            target.set(coordinateSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "_CoordinateSystem" element
     */
    public net.opengis.gml.AbstractCoordinateSystemType addNewCoordinateSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateSystemType target = null;
            target = (net.opengis.gml.AbstractCoordinateSystemType)get_store().add_element_user(COORDINATESYSTEM$0);
            return target;
        }
    }
}
