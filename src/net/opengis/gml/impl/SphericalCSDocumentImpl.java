/*
 * An XML document type.
 * Localname: SphericalCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SphericalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one SphericalCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SphericalCSDocumentImpl extends net.opengis.gml.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.SphericalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public SphericalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPHERICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "SphericalCS");
    
    
    /**
     * Gets the "SphericalCS" element
     */
    public net.opengis.gml.SphericalCSType getSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphericalCSType target = null;
            target = (net.opengis.gml.SphericalCSType)get_store().find_element_user(SPHERICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SphericalCS" element
     */
    @Inject(optional=true) public void setSphericalCS(net.opengis.gml.SphericalCSType sphericalCS)
    {
        generatedSetterHelperImpl(sphericalCS, SPHERICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SphericalCS" element
     */
    public net.opengis.gml.SphericalCSType addNewSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphericalCSType target = null;
            target = (net.opengis.gml.SphericalCSType)get_store().add_element_user(SPHERICALCS$0);
            return target;
        }
    }
}
