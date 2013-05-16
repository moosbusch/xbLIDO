/*
 * An XML document type.
 * Localname: usesValue
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesValue");
    
    
    /**
     * Gets the "usesValue" element
     */
    public net.opengis.gml.ParameterValueType getUsesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueType target = null;
            target = (net.opengis.gml.ParameterValueType)get_store().find_element_user(USESVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesValue" element
     */
    @Inject(optional=true) public void setUsesValue(net.opengis.gml.ParameterValueType usesValue)
    {
        generatedSetterHelperImpl(usesValue, USESVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesValue" element
     */
    public net.opengis.gml.ParameterValueType addNewUsesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueType target = null;
            target = (net.opengis.gml.ParameterValueType)get_store().add_element_user(USESVALUE$0);
            return target;
        }
    }
}
