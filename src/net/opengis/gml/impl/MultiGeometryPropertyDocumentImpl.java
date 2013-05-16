/*
 * An XML document type.
 * Localname: multiGeometryProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiGeometryPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiGeometryProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiGeometryPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiGeometryPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiGeometryPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIGEOMETRYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiGeometryProperty");
    
    
    /**
     * Gets the "multiGeometryProperty" element
     */
    public net.opengis.gml.MultiGeometryPropertyType getMultiGeometryProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiGeometryPropertyType target = null;
            target = (net.opengis.gml.MultiGeometryPropertyType)get_store().find_element_user(MULTIGEOMETRYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiGeometryProperty" element
     */
    @Inject(optional=true) public void setMultiGeometryProperty(net.opengis.gml.MultiGeometryPropertyType multiGeometryProperty)
    {
        generatedSetterHelperImpl(multiGeometryProperty, MULTIGEOMETRYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiGeometryProperty" element
     */
    public net.opengis.gml.MultiGeometryPropertyType addNewMultiGeometryProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiGeometryPropertyType target = null;
            target = (net.opengis.gml.MultiGeometryPropertyType)get_store().add_element_user(MULTIGEOMETRYPROPERTY$0);
            return target;
        }
    }
}
