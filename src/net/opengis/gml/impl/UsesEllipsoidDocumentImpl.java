/*
 * An XML document type.
 * Localname: usesEllipsoid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesEllipsoidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesEllipsoid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesEllipsoidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesEllipsoidDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesEllipsoidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESELLIPSOID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesEllipsoid");
    
    
    /**
     * Gets the "usesEllipsoid" element
     */
    public net.opengis.gml.EllipsoidRefType getUsesEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidRefType target = null;
            target = (net.opengis.gml.EllipsoidRefType)get_store().find_element_user(USESELLIPSOID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEllipsoid" element
     */
    @Inject(optional=true) public void setUsesEllipsoid(net.opengis.gml.EllipsoidRefType usesEllipsoid)
    {
        generatedSetterHelperImpl(usesEllipsoid, USESELLIPSOID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEllipsoid" element
     */
    public net.opengis.gml.EllipsoidRefType addNewUsesEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidRefType target = null;
            target = (net.opengis.gml.EllipsoidRefType)get_store().add_element_user(USESELLIPSOID$0);
            return target;
        }
    }
}
