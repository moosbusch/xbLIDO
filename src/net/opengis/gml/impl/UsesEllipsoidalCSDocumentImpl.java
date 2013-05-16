/*
 * An XML document type.
 * Localname: usesEllipsoidalCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesEllipsoidalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesEllipsoidalCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesEllipsoidalCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesEllipsoidalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesEllipsoidalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESELLIPSOIDALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesEllipsoidalCS");
    
    
    /**
     * Gets the "usesEllipsoidalCS" element
     */
    public net.opengis.gml.EllipsoidalCSRefType getUsesEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidalCSRefType target = null;
            target = (net.opengis.gml.EllipsoidalCSRefType)get_store().find_element_user(USESELLIPSOIDALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEllipsoidalCS" element
     */
    @Inject(optional=true) public void setUsesEllipsoidalCS(net.opengis.gml.EllipsoidalCSRefType usesEllipsoidalCS)
    {
        generatedSetterHelperImpl(usesEllipsoidalCS, USESELLIPSOIDALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEllipsoidalCS" element
     */
    public net.opengis.gml.EllipsoidalCSRefType addNewUsesEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidalCSRefType target = null;
            target = (net.opengis.gml.EllipsoidalCSRefType)get_store().add_element_user(USESELLIPSOIDALCS$0);
            return target;
        }
    }
}
