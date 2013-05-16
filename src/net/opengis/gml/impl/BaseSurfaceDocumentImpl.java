/*
 * An XML document type.
 * Localname: baseSurface
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BaseSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one baseSurface(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BaseSurfaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BaseSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "baseSurface");
    
    
    /**
     * Gets the "baseSurface" element
     */
    public net.opengis.gml.SurfacePropertyType getBaseSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(BASESURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseSurface" element
     */
    @Inject(optional=true) public void setBaseSurface(net.opengis.gml.SurfacePropertyType baseSurface)
    {
        generatedSetterHelperImpl(baseSurface, BASESURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseSurface" element
     */
    public net.opengis.gml.SurfacePropertyType addNewBaseSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(BASESURFACE$0);
            return target;
        }
    }
}
