/*
 * An XML document type.
 * Localname: CategoryExtent
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CategoryExtentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CategoryExtent(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CategoryExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CategoryExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CategoryExtent");
    
    
    /**
     * Gets the "CategoryExtent" element
     */
    public net.opengis.gml.CategoryExtentType getCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CategoryExtentType target = null;
            target = (net.opengis.gml.CategoryExtentType)get_store().find_element_user(CATEGORYEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryExtent" element
     */
    @Inject(optional=true) public void setCategoryExtent(net.opengis.gml.CategoryExtentType categoryExtent)
    {
        generatedSetterHelperImpl(categoryExtent, CATEGORYEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryExtent" element
     */
    public net.opengis.gml.CategoryExtentType addNewCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CategoryExtentType target = null;
            target = (net.opengis.gml.CategoryExtentType)get_store().add_element_user(CATEGORYEXTENT$0);
            return target;
        }
    }
}
