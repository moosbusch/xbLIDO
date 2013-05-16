/*
 * An XML document type.
 * Localname: labelStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LabelStyleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one labelStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LabelStyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LabelStyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabelStyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELSTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "labelStyle");
    
    
    /**
     * Gets the "labelStyle" element
     */
    public net.opengis.gml.LabelStylePropertyType getLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LabelStylePropertyType target = null;
            target = (net.opengis.gml.LabelStylePropertyType)get_store().find_element_user(LABELSTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "labelStyle" element
     */
    @Inject(optional=true) public void setLabelStyle(net.opengis.gml.LabelStylePropertyType labelStyle)
    {
        generatedSetterHelperImpl(labelStyle, LABELSTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "labelStyle" element
     */
    public net.opengis.gml.LabelStylePropertyType addNewLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LabelStylePropertyType target = null;
            target = (net.opengis.gml.LabelStylePropertyType)get_store().add_element_user(LABELSTYLE$0);
            return target;
        }
    }
}
