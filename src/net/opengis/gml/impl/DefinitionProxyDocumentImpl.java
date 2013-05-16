/*
 * An XML document type.
 * Localname: DefinitionProxy
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DefinitionProxyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one DefinitionProxy(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DefinitionProxyDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.DefinitionProxyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionProxyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONPROXY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionProxy");
    
    
    /**
     * Gets the "DefinitionProxy" element
     */
    public net.opengis.gml.DefinitionProxyType getDefinitionProxy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DefinitionProxyType target = null;
            target = (net.opengis.gml.DefinitionProxyType)get_store().find_element_user(DEFINITIONPROXY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DefinitionProxy" element
     */
    @Inject(optional=true) public void setDefinitionProxy(net.opengis.gml.DefinitionProxyType definitionProxy)
    {
        generatedSetterHelperImpl(definitionProxy, DEFINITIONPROXY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DefinitionProxy" element
     */
    public net.opengis.gml.DefinitionProxyType addNewDefinitionProxy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DefinitionProxyType target = null;
            target = (net.opengis.gml.DefinitionProxyType)get_store().add_element_user(DEFINITIONPROXY$0);
            return target;
        }
    }
}
