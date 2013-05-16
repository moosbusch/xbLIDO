/*
 * An XML document type.
 * Localname: includesValue
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IncludesValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one includesValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IncludesValueDocumentImpl extends net.opengis.gml.impl.GeneralParameterValueDocumentImpl implements net.opengis.gml.IncludesValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludesValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesValue");
    
    
    /**
     * Gets the "includesValue" element
     */
    public net.opengis.gml.AbstractGeneralParameterValueType getIncludesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().find_element_user(INCLUDESVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includesValue" element
     */
    @Inject(optional=true) public void setIncludesValue(net.opengis.gml.AbstractGeneralParameterValueType includesValue)
    {
        generatedSetterHelperImpl(includesValue, INCLUDESVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includesValue" element
     */
    public net.opengis.gml.AbstractGeneralParameterValueType addNewIncludesValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().add_element_user(INCLUDESVALUE$0);
            return target;
        }
    }
}
