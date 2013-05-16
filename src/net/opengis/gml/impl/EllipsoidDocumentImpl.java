/*
 * An XML document type.
 * Localname: Ellipsoid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EllipsoidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Ellipsoid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EllipsoidDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.EllipsoidDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ellipsoid");
    
    
    /**
     * Gets the "Ellipsoid" element
     */
    public net.opengis.gml.EllipsoidType getEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidType target = null;
            target = (net.opengis.gml.EllipsoidType)get_store().find_element_user(ELLIPSOID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ellipsoid" element
     */
    @Inject(optional=true) public void setEllipsoid(net.opengis.gml.EllipsoidType ellipsoid)
    {
        generatedSetterHelperImpl(ellipsoid, ELLIPSOID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Ellipsoid" element
     */
    public net.opengis.gml.EllipsoidType addNewEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidType target = null;
            target = (net.opengis.gml.EllipsoidType)get_store().add_element_user(ELLIPSOID$0);
            return target;
        }
    }
}
