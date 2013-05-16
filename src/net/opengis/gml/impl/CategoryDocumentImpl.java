/*
 * An XML document type.
 * Localname: Category
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Category(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Category");
    
    
    /**
     * Gets the "Category" element
     */
    public net.opengis.gml.CodeType getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Category" element
     */
    @Inject(optional=true) public void setCategory(net.opengis.gml.CodeType category)
    {
        generatedSetterHelperImpl(category, CATEGORY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Category" element
     */
    public net.opengis.gml.CodeType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
}
