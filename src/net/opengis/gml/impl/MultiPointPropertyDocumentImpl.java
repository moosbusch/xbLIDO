/*
 * An XML document type.
 * Localname: multiPointProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPointPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiPointProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiPointPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiPointPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOINTPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiPointProperty");
    
    
    /**
     * Gets the "multiPointProperty" element
     */
    public net.opengis.gml.MultiPointPropertyType getMultiPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointPropertyType target = null;
            target = (net.opengis.gml.MultiPointPropertyType)get_store().find_element_user(MULTIPOINTPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiPointProperty" element
     */
    @Inject(optional=true) public void setMultiPointProperty(net.opengis.gml.MultiPointPropertyType multiPointProperty)
    {
        generatedSetterHelperImpl(multiPointProperty, MULTIPOINTPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiPointProperty" element
     */
    public net.opengis.gml.MultiPointPropertyType addNewMultiPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointPropertyType target = null;
            target = (net.opengis.gml.MultiPointPropertyType)get_store().add_element_user(MULTIPOINTPROPERTY$0);
            return target;
        }
    }
}
