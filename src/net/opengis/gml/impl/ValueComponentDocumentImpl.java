/*
 * An XML document type.
 * Localname: valueComponent
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ValueComponentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one valueComponent(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ValueComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValueComponentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUECOMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueComponent");
    
    
    /**
     * Gets the "valueComponent" element
     */
    public net.opengis.gml.ValuePropertyType getValueComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValuePropertyType target = null;
            target = (net.opengis.gml.ValuePropertyType)get_store().find_element_user(VALUECOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueComponent" element
     */
    @Inject(optional=true) public void setValueComponent(net.opengis.gml.ValuePropertyType valueComponent)
    {
        generatedSetterHelperImpl(valueComponent, VALUECOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueComponent" element
     */
    public net.opengis.gml.ValuePropertyType addNewValueComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValuePropertyType target = null;
            target = (net.opengis.gml.ValuePropertyType)get_store().add_element_user(VALUECOMPONENT$0);
            return target;
        }
    }
}
