/*
 * An XML document type.
 * Localname: parameterValue
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ParameterValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one parameterValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ParameterValueDocumentImpl extends net.opengis.gml.impl.GeneralParameterValueDocumentImpl implements net.opengis.gml.ParameterValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterValue");
    
    
    /**
     * Gets the "parameterValue" element
     */
    public net.opengis.gml.ParameterValueType getParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueType target = null;
            target = (net.opengis.gml.ParameterValueType)get_store().find_element_user(PARAMETERVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameterValue" element
     */
    @Inject(optional=true) public void setParameterValue(net.opengis.gml.ParameterValueType parameterValue)
    {
        generatedSetterHelperImpl(parameterValue, PARAMETERVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parameterValue" element
     */
    public net.opengis.gml.ParameterValueType addNewParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueType target = null;
            target = (net.opengis.gml.ParameterValueType)get_store().add_element_user(PARAMETERVALUE$0);
            return target;
        }
    }
}
