/*
 * An XML document type.
 * Localname: validArea
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ValidAreaDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one validArea(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ValidAreaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValidAreaDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidAreaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDAREA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "validArea");
    
    
    /**
     * Gets the "validArea" element
     */
    public net.opengis.gml.ExtentType getValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ExtentType target = null;
            target = (net.opengis.gml.ExtentType)get_store().find_element_user(VALIDAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validArea" element
     */
    @Inject(optional=true) public void setValidArea(net.opengis.gml.ExtentType validArea)
    {
        generatedSetterHelperImpl(validArea, VALIDAREA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validArea" element
     */
    public net.opengis.gml.ExtentType addNewValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ExtentType target = null;
            target = (net.opengis.gml.ExtentType)get_store().add_element_user(VALIDAREA$0);
            return target;
        }
    }
}
