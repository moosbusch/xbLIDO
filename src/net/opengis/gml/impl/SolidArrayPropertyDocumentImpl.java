/*
 * An XML document type.
 * Localname: solidArrayProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SolidArrayPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one solidArrayProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SolidArrayPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SolidArrayPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidArrayPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDARRAYPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "solidArrayProperty");
    
    
    /**
     * Gets the "solidArrayProperty" element
     */
    public net.opengis.gml.SolidArrayPropertyType getSolidArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.SolidArrayPropertyType)get_store().find_element_user(SOLIDARRAYPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solidArrayProperty" element
     */
    @Inject(optional=true) public void setSolidArrayProperty(net.opengis.gml.SolidArrayPropertyType solidArrayProperty)
    {
        generatedSetterHelperImpl(solidArrayProperty, SOLIDARRAYPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidArrayProperty" element
     */
    public net.opengis.gml.SolidArrayPropertyType addNewSolidArrayProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.SolidArrayPropertyType)get_store().add_element_user(SOLIDARRAYPROPERTY$0);
            return target;
        }
    }
}
