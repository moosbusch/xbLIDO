/*
 * An XML document type.
 * Localname: defaultStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DefaultStyleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one defaultStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DefaultStyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DefaultStyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefaultStyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "defaultStyle");
    
    
    /**
     * Gets the "defaultStyle" element
     */
    public net.opengis.gml.DefaultStylePropertyType getDefaultStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DefaultStylePropertyType target = null;
            target = (net.opengis.gml.DefaultStylePropertyType)get_store().find_element_user(DEFAULTSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "defaultStyle" element
     */
    @Inject(optional=true) public void setDefaultStyle(net.opengis.gml.DefaultStylePropertyType defaultStyle)
    {
        generatedSetterHelperImpl(defaultStyle, DEFAULTSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "defaultStyle" element
     */
    public net.opengis.gml.DefaultStylePropertyType addNewDefaultStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DefaultStylePropertyType target = null;
            target = (net.opengis.gml.DefaultStylePropertyType)get_store().add_element_user(DEFAULTSTYLE$0);
            return target;
        }
    }
}
