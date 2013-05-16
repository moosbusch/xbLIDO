/*
 * An XML document type.
 * Localname: _ImplicitGeometry
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ImplicitGeometryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _ImplicitGeometry(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ImplicitGeometryDocumentImpl extends net.opengis.gml.impl.GeometryDocumentImpl implements net.opengis.gml.ImplicitGeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImplicitGeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLICITGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ImplicitGeometry");
    private static final org.apache.xmlbeans.QNameSet IMPLICITGEOMETRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Grid"),
    });
    
    
    /**
     * Gets the "_ImplicitGeometry" element
     */
    public net.opengis.gml.AbstractGeometryType getImplicitGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().find_element_user(IMPLICITGEOMETRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_ImplicitGeometry" element
     */
    @Inject(optional=true) public void setImplicitGeometry(net.opengis.gml.AbstractGeometryType implicitGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().find_element_user(IMPLICITGEOMETRY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeometryType)get_store().add_element_user(IMPLICITGEOMETRY$0);
            }
            target.set(implicitGeometry);
        }
    }
    
    /**
     * Appends and returns a new empty "_ImplicitGeometry" element
     */
    public net.opengis.gml.AbstractGeometryType addNewImplicitGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().add_element_user(IMPLICITGEOMETRY$0);
            return target;
        }
    }
}
