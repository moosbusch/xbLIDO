/*
 * An XML document type.
 * Localname: methodFormula
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MethodFormulaDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one methodFormula(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MethodFormulaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MethodFormulaDocument
{
    private static final long serialVersionUID = 1L;
    
    public MethodFormulaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODFORMULA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodFormula");
    
    
    /**
     * Gets the "methodFormula" element
     */
    public net.opengis.gml.CodeType getMethodFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(METHODFORMULA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "methodFormula" element
     */
    @Inject(optional=true) public void setMethodFormula(net.opengis.gml.CodeType methodFormula)
    {
        generatedSetterHelperImpl(methodFormula, METHODFORMULA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "methodFormula" element
     */
    public net.opengis.gml.CodeType addNewMethodFormula()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(METHODFORMULA$0);
            return target;
        }
    }
}
