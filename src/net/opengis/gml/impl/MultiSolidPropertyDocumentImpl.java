/*
 * An XML document type.
 * Localname: multiSolidProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiSolidPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiSolidProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSolidPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiSolidPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLIDPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSolidProperty");
    
    
    /**
     * Gets the "multiSolidProperty" element
     */
    public net.opengis.gml.MultiSolidPropertyType getMultiSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidPropertyType target = null;
            target = (net.opengis.gml.MultiSolidPropertyType)get_store().find_element_user(MULTISOLIDPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiSolidProperty" element
     */
    @Inject(optional=true) public void setMultiSolidProperty(net.opengis.gml.MultiSolidPropertyType multiSolidProperty)
    {
        generatedSetterHelperImpl(multiSolidProperty, MULTISOLIDPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiSolidProperty" element
     */
    public net.opengis.gml.MultiSolidPropertyType addNewMultiSolidProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidPropertyType target = null;
            target = (net.opengis.gml.MultiSolidPropertyType)get_store().add_element_user(MULTISOLIDPROPERTY$0);
            return target;
        }
    }
}
