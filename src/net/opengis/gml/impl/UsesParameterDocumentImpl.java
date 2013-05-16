/*
 * An XML document type.
 * Localname: usesParameter
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesParameter(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesParameter");
    
    
    /**
     * Gets the "usesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType getUsesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().find_element_user(USESPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesParameter" element
     */
    @Inject(optional=true) public void setUsesParameter(net.opengis.gml.AbstractGeneralOperationParameterRefType usesParameter)
    {
        generatedSetterHelperImpl(usesParameter, USESPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType addNewUsesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().add_element_user(USESPARAMETER$0);
            return target;
        }
    }
}
