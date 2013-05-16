/*
 * An XML document type.
 * Localname: usesMethod
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesMethodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesMethod(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesMethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesMethod");
    
    
    /**
     * Gets the "usesMethod" element
     */
    public net.opengis.gml.OperationMethodRefType getUsesMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationMethodRefType target = null;
            target = (net.opengis.gml.OperationMethodRefType)get_store().find_element_user(USESMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesMethod" element
     */
    @Inject(optional=true) public void setUsesMethod(net.opengis.gml.OperationMethodRefType usesMethod)
    {
        generatedSetterHelperImpl(usesMethod, USESMETHOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesMethod" element
     */
    public net.opengis.gml.OperationMethodRefType addNewUsesMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationMethodRefType target = null;
            target = (net.opengis.gml.OperationMethodRefType)get_store().add_element_user(USESMETHOD$0);
            return target;
        }
    }
}
