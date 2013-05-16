/*
 * An XML document type.
 * Localname: Sphere
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SphereDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Sphere(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SphereDocumentImpl extends net.opengis.gml.impl.GriddedSurfaceDocumentImpl implements net.opengis.gml.SphereDocument
{
    private static final long serialVersionUID = 1L;
    
    public SphereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPHERE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Sphere");
    
    
    /**
     * Gets the "Sphere" element
     */
    public net.opengis.gml.SphereType getSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphereType target = null;
            target = (net.opengis.gml.SphereType)get_store().find_element_user(SPHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sphere" element
     */
    @Inject(optional=true) public void setSphere(net.opengis.gml.SphereType sphere)
    {
        generatedSetterHelperImpl(sphere, SPHERE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Sphere" element
     */
    public net.opengis.gml.SphereType addNewSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphereType target = null;
            target = (net.opengis.gml.SphereType)get_store().add_element_user(SPHERE$0);
            return target;
        }
    }
}
