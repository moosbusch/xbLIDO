/*
 * An XML document type.
 * Localname: definitionRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DefinitionRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one definitionRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DefinitionRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DefinitionRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "definitionRef");
    
    
    /**
     * Gets the "definitionRef" element
     */
    public net.opengis.gml.ReferenceType getDefinitionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().find_element_user(DEFINITIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitionRef" element
     */
    @Inject(optional=true) public void setDefinitionRef(net.opengis.gml.ReferenceType definitionRef)
    {
        generatedSetterHelperImpl(definitionRef, DEFINITIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definitionRef" element
     */
    public net.opengis.gml.ReferenceType addNewDefinitionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().add_element_user(DEFINITIONREF$0);
            return target;
        }
    }
}
