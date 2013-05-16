/*
 * An XML document type.
 * Localname: surfaceArrayProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SurfaceArrayPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one surfaceArrayProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SurfaceArrayPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SurfaceArrayPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceArrayPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEARRAYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "surfaceArrayProperty");
    
    
    /**
     * Gets the "surfaceArrayProperty" element
     */
    public net.opengis.gml.SurfaceArrayPropertyType getSurfaceArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.SurfaceArrayPropertyType)get_store().find_element_user(SURFACEARRAYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "surfaceArrayProperty" element
     */
    @Inject(optional=true) public void setSurfaceArrayProperty(net.opengis.gml.SurfaceArrayPropertyType surfaceArrayProperty)
    {
        generatedSetterHelperImpl(surfaceArrayProperty, SURFACEARRAYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceArrayProperty" element
     */
    public net.opengis.gml.SurfaceArrayPropertyType addNewSurfaceArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.SurfaceArrayPropertyType)get_store().add_element_user(SURFACEARRAYPROPERTY$0);
            return target;
        }
    }
}
