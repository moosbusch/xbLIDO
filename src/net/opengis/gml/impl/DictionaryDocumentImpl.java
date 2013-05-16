/*
 * An XML document type.
 * Localname: Dictionary
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Dictionary(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DictionaryDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.DictionaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DICTIONARY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Dictionary");
    
    
    /**
     * Gets the "Dictionary" element
     */
    public net.opengis.gml.DictionaryType getDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryType target = null;
            target = (net.opengis.gml.DictionaryType)get_store().find_element_user(DICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Dictionary" element
     */
    @Inject(optional=true) public void setDictionary(net.opengis.gml.DictionaryType dictionary)
    {
        generatedSetterHelperImpl(dictionary, DICTIONARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Dictionary" element
     */
    public net.opengis.gml.DictionaryType addNewDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryType target = null;
            target = (net.opengis.gml.DictionaryType)get_store().add_element_user(DICTIONARY$0);
            return target;
        }
    }
}
