/*
 * An XML document type.
 * Localname: IndexMap
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IndexMapDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one IndexMap(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IndexMapDocumentImpl extends net.opengis.gml.impl.GridFunctionDocumentImpl implements net.opengis.gml.IndexMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXMAP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "IndexMap");
    
    
    /**
     * Gets the "IndexMap" element
     */
    public net.opengis.gml.IndexMapType getIndexMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IndexMapType target = null;
            target = (net.opengis.gml.IndexMapType)get_store().find_element_user(INDEXMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IndexMap" element
     */
    @Inject(optional=true) public void setIndexMap(net.opengis.gml.IndexMapType indexMap)
    {
        generatedSetterHelperImpl(indexMap, INDEXMAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IndexMap" element
     */
    public net.opengis.gml.IndexMapType addNewIndexMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IndexMapType target = null;
            target = (net.opengis.gml.IndexMapType)get_store().add_element_user(INDEXMAP$0);
            return target;
        }
    }
}
