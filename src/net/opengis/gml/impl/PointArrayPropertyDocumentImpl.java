/*
 * An XML document type.
 * Localname: pointArrayProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PointArrayPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one pointArrayProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PointArrayPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PointArrayPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointArrayPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTARRAYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointArrayProperty");
    
    
    /**
     * Gets the "pointArrayProperty" element
     */
    public net.opengis.gml.PointArrayPropertyType getPointArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointArrayPropertyType target = null;
            target = (net.opengis.gml.PointArrayPropertyType)get_store().find_element_user(POINTARRAYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointArrayProperty" element
     */
    @Inject(optional=true) public void setPointArrayProperty(net.opengis.gml.PointArrayPropertyType pointArrayProperty)
    {
        generatedSetterHelperImpl(pointArrayProperty, POINTARRAYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointArrayProperty" element
     */
    public net.opengis.gml.PointArrayPropertyType addNewPointArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointArrayPropertyType target = null;
            target = (net.opengis.gml.PointArrayPropertyType)get_store().add_element_user(POINTARRAYPROPERTY$0);
            return target;
        }
    }
}
