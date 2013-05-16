/*
 * An XML document type.
 * Localname: _Solid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _Solid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SolidDocumentImpl extends net.opengis.gml.impl.GeometricPrimitiveDocumentImpl implements net.opengis.gml.SolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Solid");
    private static final org.apache.xmlbeans.QNameSet SOLID$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Solid"),
    });
    
    
    /**
     * Gets the "_Solid" element
     */
    public net.opengis.gml.AbstractSolidType getSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSolidType target = null;
            target = (net.opengis.gml.AbstractSolidType)get_store().find_element_user(SOLID$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Solid" element
     */
    @Inject(optional=true) public void setSolid(net.opengis.gml.AbstractSolidType solid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSolidType target = null;
            target = (net.opengis.gml.AbstractSolidType)get_store().find_element_user(SOLID$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractSolidType)get_store().add_element_user(SOLID$0);
            }
            target.set(solid);
        }
    }
    
    /**
     * Appends and returns a new empty "_Solid" element
     */
    public net.opengis.gml.AbstractSolidType addNewSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSolidType target = null;
            target = (net.opengis.gml.AbstractSolidType)get_store().add_element_user(SOLID$0);
            return target;
        }
    }
}
