/*
 * An XML document type.
 * Localname: surfaceProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SurfacePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one surfaceProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SurfacePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SurfacePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfacePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "surfaceProperty");
    
    
    /**
     * Gets the "surfaceProperty" element
     */
    public net.opengis.gml.SurfacePropertyType getSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(SURFACEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "surfaceProperty" element
     */
    @Inject(optional=true) public void setSurfaceProperty(net.opengis.gml.SurfacePropertyType surfaceProperty)
    {
        generatedSetterHelperImpl(surfaceProperty, SURFACEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceProperty" element
     */
    public net.opengis.gml.SurfacePropertyType addNewSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(SURFACEPROPERTY$0);
            return target;
        }
    }
}
