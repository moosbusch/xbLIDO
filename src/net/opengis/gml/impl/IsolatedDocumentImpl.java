/*
 * An XML document type.
 * Localname: isolated
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IsolatedDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one isolated(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IsolatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IsolatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsolatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISOLATED$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "isolated");
    
    
    /**
     * Gets the "isolated" element
     */
    public net.opengis.gml.IsolatedPropertyType getIsolated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsolatedPropertyType target = null;
            target = (net.opengis.gml.IsolatedPropertyType)get_store().find_element_user(ISOLATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "isolated" element
     */
    @Inject(optional=true) public void setIsolated(net.opengis.gml.IsolatedPropertyType isolated)
    {
        generatedSetterHelperImpl(isolated, ISOLATED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "isolated" element
     */
    public net.opengis.gml.IsolatedPropertyType addNewIsolated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsolatedPropertyType target = null;
            target = (net.opengis.gml.IsolatedPropertyType)get_store().add_element_user(ISOLATED$0);
            return target;
        }
    }
}
