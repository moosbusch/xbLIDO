/*
 * An XML document type.
 * Localname: includesParameter
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IncludesParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one includesParameter(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IncludesParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IncludesParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludesParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesParameter");
    
    
    /**
     * Gets the "includesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType getIncludesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().find_element_user(INCLUDESPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includesParameter" element
     */
    @Inject(optional=true) public void setIncludesParameter(net.opengis.gml.AbstractGeneralOperationParameterRefType includesParameter)
    {
        generatedSetterHelperImpl(includesParameter, INCLUDESPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType addNewIncludesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().add_element_user(INCLUDESPARAMETER$0);
            return target;
        }
    }
}
