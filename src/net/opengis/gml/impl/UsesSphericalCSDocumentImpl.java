/*
 * An XML document type.
 * Localname: usesSphericalCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesSphericalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesSphericalCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesSphericalCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesSphericalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesSphericalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESSPHERICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesSphericalCS");
    
    
    /**
     * Gets the "usesSphericalCS" element
     */
    public net.opengis.gml.SphericalCSRefType getUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphericalCSRefType target = null;
            target = (net.opengis.gml.SphericalCSRefType)get_store().find_element_user(USESSPHERICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesSphericalCS" element
     */
    @Inject(optional=true) public void setUsesSphericalCS(net.opengis.gml.SphericalCSRefType usesSphericalCS)
    {
        generatedSetterHelperImpl(usesSphericalCS, USESSPHERICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesSphericalCS" element
     */
    public net.opengis.gml.SphericalCSRefType addNewUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphericalCSRefType target = null;
            target = (net.opengis.gml.SphericalCSRefType)get_store().add_element_user(USESSPHERICALCS$0);
            return target;
        }
    }
}
