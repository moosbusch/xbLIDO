/*
 * XML Type:  OperationMethodBaseType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationMethodBaseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML OperationMethodBaseType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class OperationMethodBaseTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.OperationMethodBaseType
{
    private static final long serialVersionUID = 1L;
    
    public OperationMethodBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodName");
    
    
    /**
     * Gets the "methodName" element
     */
    public net.opengis.gml.CodeType getMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(METHODNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "methodName" element
     */
    @Inject(optional=true) public void setMethodName(net.opengis.gml.CodeType methodName)
    {
        generatedSetterHelperImpl(methodName, METHODNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "methodName" element
     */
    public net.opengis.gml.CodeType addNewMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(METHODNAME$0);
            return target;
        }
    }
}
