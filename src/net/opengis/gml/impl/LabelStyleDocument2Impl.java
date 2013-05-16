/*
 * An XML document type.
 * Localname: LabelStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LabelStyleDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one LabelStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LabelStyleDocument2Impl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.LabelStyleDocument2
{
    private static final long serialVersionUID = 1L;
    
    public LabelStyleDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LabelStyle");
    
    
    /**
     * Gets the "LabelStyle" element
     */
    public net.opengis.gml.LabelStyleType getLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LabelStyleType target = null;
            target = (net.opengis.gml.LabelStyleType)get_store().find_element_user(LABELSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LabelStyle" element
     */
    @Inject(optional=true) public void setLabelStyle(net.opengis.gml.LabelStyleType labelStyle)
    {
        generatedSetterHelperImpl(labelStyle, LABELSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LabelStyle" element
     */
    public net.opengis.gml.LabelStyleType addNewLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LabelStyleType target = null;
            target = (net.opengis.gml.LabelStyleType)get_store().add_element_user(LABELSTYLE$0);
            return target;
        }
    }
}
