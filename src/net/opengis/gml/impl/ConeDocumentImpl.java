/*
 * An XML document type.
 * Localname: Cone
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ConeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Cone(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ConeDocumentImpl extends net.opengis.gml.impl.GriddedSurfaceDocumentImpl implements net.opengis.gml.ConeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Cone");
    
    
    /**
     * Gets the "Cone" element
     */
    public net.opengis.gml.ConeType getCone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConeType target = null;
            target = (net.opengis.gml.ConeType)get_store().find_element_user(CONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Cone" element
     */
    @Inject(optional=true) public void setCone(net.opengis.gml.ConeType cone)
    {
        generatedSetterHelperImpl(cone, CONE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Cone" element
     */
    public net.opengis.gml.ConeType addNewCone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConeType target = null;
            target = (net.opengis.gml.ConeType)get_store().add_element_user(CONE$0);
            return target;
        }
    }
}
