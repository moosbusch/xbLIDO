/*
 * An XML document type.
 * Localname: valueOfParameter
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ValueOfParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one valueOfParameter(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ValueOfParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValueOfParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueOfParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEOFPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueOfParameter");
    
    
    /**
     * Gets the "valueOfParameter" element
     */
    public net.opengis.gml.OperationParameterRefType getValueOfParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterRefType target = null;
            target = (net.opengis.gml.OperationParameterRefType)get_store().find_element_user(VALUEOFPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueOfParameter" element
     */
    @Inject(optional=true) public void setValueOfParameter(net.opengis.gml.OperationParameterRefType valueOfParameter)
    {
        generatedSetterHelperImpl(valueOfParameter, VALUEOFPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueOfParameter" element
     */
    public net.opengis.gml.OperationParameterRefType addNewValueOfParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterRefType target = null;
            target = (net.opengis.gml.OperationParameterRefType)get_store().add_element_user(VALUEOFPARAMETER$0);
            return target;
        }
    }
}
