/*
 * XML Type:  OperationParameterBaseType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationParameterBaseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML OperationParameterBaseType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class OperationParameterBaseTypeImpl extends net.opengis.gml.impl.AbstractGeneralOperationParameterTypeImpl implements net.opengis.gml.OperationParameterBaseType
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterName");
    
    
    /**
     * Gets the "parameterName" element
     */
    public net.opengis.gml.CodeType getParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(PARAMETERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameterName" element
     */
    @Inject(optional=true) public void setParameterName(net.opengis.gml.CodeType parameterName)
    {
        generatedSetterHelperImpl(parameterName, PARAMETERNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parameterName" element
     */
    public net.opengis.gml.CodeType addNewParameterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(PARAMETERNAME$0);
            return target;
        }
    }
}
