/*
 * An XML document type.
 * Localname: usesCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesCS");
    
    
    /**
     * Gets the "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType getUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().find_element_user(USESCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesCS" element
     */
    @Inject(optional=true) public void setUsesCS(net.opengis.gml.CoordinateSystemRefType usesCS)
    {
        generatedSetterHelperImpl(usesCS, USESCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType addNewUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().add_element_user(USESCS$0);
            return target;
        }
    }
}
