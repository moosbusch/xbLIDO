/*
 * An XML document type.
 * Localname: solidProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SolidPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one solidProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SolidPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SolidPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "solidProperty");
    
    
    /**
     * Gets the "solidProperty" element
     */
    public net.opengis.gml.SolidPropertyType getSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().find_element_user(SOLIDPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solidProperty" element
     */
    @Inject(optional=true) public void setSolidProperty(net.opengis.gml.SolidPropertyType solidProperty)
    {
        generatedSetterHelperImpl(solidProperty, SOLIDPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidProperty" element
     */
    public net.opengis.gml.SolidPropertyType addNewSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidPropertyType target = null;
            target = (net.opengis.gml.SolidPropertyType)get_store().add_element_user(SOLIDPROPERTY$0);
            return target;
        }
    }
}
