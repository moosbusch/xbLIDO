/*
 * An XML document type.
 * Localname: polygonProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolygonPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one polygonProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PolygonPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PolygonPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polygonProperty");
    
    
    /**
     * Gets the "polygonProperty" element
     */
    public net.opengis.gml.PolygonPropertyType getPolygonProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().find_element_user(POLYGONPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polygonProperty" element
     */
    @Inject(optional=true) public void setPolygonProperty(net.opengis.gml.PolygonPropertyType polygonProperty)
    {
        generatedSetterHelperImpl(polygonProperty, POLYGONPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "polygonProperty" element
     */
    public net.opengis.gml.PolygonPropertyType addNewPolygonProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPropertyType target = null;
            target = (net.opengis.gml.PolygonPropertyType)get_store().add_element_user(POLYGONPROPERTY$0);
            return target;
        }
    }
}
