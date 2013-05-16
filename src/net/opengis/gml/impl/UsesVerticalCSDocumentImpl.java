/*
 * An XML document type.
 * Localname: usesVerticalCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesVerticalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesVerticalCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesVerticalCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesVerticalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesVerticalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESVERTICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesVerticalCS");
    
    
    /**
     * Gets the "usesVerticalCS" element
     */
    public net.opengis.gml.VerticalCSRefType getUsesVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCSRefType target = null;
            target = (net.opengis.gml.VerticalCSRefType)get_store().find_element_user(USESVERTICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesVerticalCS" element
     */
    @Inject(optional=true) public void setUsesVerticalCS(net.opengis.gml.VerticalCSRefType usesVerticalCS)
    {
        generatedSetterHelperImpl(usesVerticalCS, USESVERTICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesVerticalCS" element
     */
    public net.opengis.gml.VerticalCSRefType addNewUsesVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCSRefType target = null;
            target = (net.opengis.gml.VerticalCSRefType)get_store().add_element_user(USESVERTICALCS$0);
            return target;
        }
    }
}
