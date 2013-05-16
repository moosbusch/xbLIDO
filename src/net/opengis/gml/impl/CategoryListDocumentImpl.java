/*
 * An XML document type.
 * Localname: CategoryList
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CategoryListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CategoryList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CategoryListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CategoryListDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CategoryList");
    
    
    /**
     * Gets the "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType getCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().find_element_user(CATEGORYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryList" element
     */
    @Inject(optional=true) public void setCategoryList(net.opengis.gml.CodeOrNullListType categoryList)
    {
        generatedSetterHelperImpl(categoryList, CATEGORYLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType addNewCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().add_element_user(CATEGORYLIST$0);
            return target;
        }
    }
}
