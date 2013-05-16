/*
 * An XML document type.
 * Localname: Style
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.StyleDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Style(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class StyleDocument2Impl extends net.opengis.gml.impl.StyleDocumentImpl implements net.opengis.gml.StyleDocument2
{
    private static final long serialVersionUID = 1L;
    
    public StyleDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Style");
    
    
    /**
     * Gets the "Style" element
     */
    public net.opengis.gml.StyleType getStyle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StyleType target = null;
            target = (net.opengis.gml.StyleType)get_store().find_element_user(STYLE2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Style" element
     */
    @Inject(optional=true) public void setStyle2(net.opengis.gml.StyleType style2)
    {
        generatedSetterHelperImpl(style2, STYLE2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Style" element
     */
    public net.opengis.gml.StyleType addNewStyle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StyleType target = null;
            target = (net.opengis.gml.StyleType)get_store().add_element_user(STYLE2$0);
            return target;
        }
    }
}
