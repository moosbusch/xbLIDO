/*
 * An XML document type.
 * Localname: definitionMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DefinitionMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one definitionMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DefinitionMemberDocumentImpl extends net.opengis.gml.impl.DictionaryEntryDocumentImpl implements net.opengis.gml.DefinitionMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "definitionMember");
    
    
    /**
     * Gets the "definitionMember" element
     */
    public net.opengis.gml.DictionaryEntryType getDefinitionMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().find_element_user(DEFINITIONMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitionMember" element
     */
    @Inject(optional=true) public void setDefinitionMember(net.opengis.gml.DictionaryEntryType definitionMember)
    {
        generatedSetterHelperImpl(definitionMember, DEFINITIONMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definitionMember" element
     */
    public net.opengis.gml.DictionaryEntryType addNewDefinitionMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().add_element_user(DEFINITIONMEMBER$0);
            return target;
        }
    }
}
