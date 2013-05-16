/*
 * An XML document type.
 * Localname: DefinitionCollection
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DefinitionCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one DefinitionCollection(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DefinitionCollectionDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.DefinitionCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionCollection");
    
    
    /**
     * Gets the "DefinitionCollection" element
     */
    public net.opengis.gml.DictionaryType getDefinitionCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryType target = null;
            target = (net.opengis.gml.DictionaryType)get_store().find_element_user(DEFINITIONCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DefinitionCollection" element
     */
    @Inject(optional=true) public void setDefinitionCollection(net.opengis.gml.DictionaryType definitionCollection)
    {
        generatedSetterHelperImpl(definitionCollection, DEFINITIONCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DefinitionCollection" element
     */
    public net.opengis.gml.DictionaryType addNewDefinitionCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryType target = null;
            target = (net.opengis.gml.DictionaryType)get_store().add_element_user(DEFINITIONCOLLECTION$0);
            return target;
        }
    }
}
