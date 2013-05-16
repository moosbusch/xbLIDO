/*
 * An XML document type.
 * Localname: EllipsoidalCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EllipsoidalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one EllipsoidalCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EllipsoidalCSDocumentImpl extends net.opengis.gml.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.EllipsoidalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EllipsoidalCS");
    
    
    /**
     * Gets the "EllipsoidalCS" element
     */
    public net.opengis.gml.EllipsoidalCSType getEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidalCSType target = null;
            target = (net.opengis.gml.EllipsoidalCSType)get_store().find_element_user(ELLIPSOIDALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EllipsoidalCS" element
     */
    @Inject(optional=true) public void setEllipsoidalCS(net.opengis.gml.EllipsoidalCSType ellipsoidalCS)
    {
        generatedSetterHelperImpl(ellipsoidalCS, ELLIPSOIDALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EllipsoidalCS" element
     */
    public net.opengis.gml.EllipsoidalCSType addNewEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidalCSType target = null;
            target = (net.opengis.gml.EllipsoidalCSType)get_store().add_element_user(ELLIPSOIDALCS$0);
            return target;
        }
    }
}
