/*
 * XML Type:  LabelStyleType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LabelStyleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML LabelStyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class LabelStyleTypeImpl extends net.opengis.gml.impl.BaseStyleDescriptorTypeImpl implements net.opengis.gml.LabelStyleType
{
    private static final long serialVersionUID = 1L;
    
    public LabelStyleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "style");
    private static final javax.xml.namespace.QName LABEL$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "label");
    
    
    /**
     * Gets the "style" element
     */
    public java.lang.String getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" element
     */
    public org.apache.xmlbeans.XmlString xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STYLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "style" element
     */
    @Inject(optional=true) public void setStyle(java.lang.String style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STYLE$0);
            }
            target.setStringValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" element
     */
    public void xsetStyle(org.apache.xmlbeans.XmlString style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STYLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STYLE$0);
            }
            target.set(style);
        }
    }
    
    /**
     * Gets the "label" element
     */
    public net.opengis.gml.LabelType getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LabelType target = null;
            target = (net.opengis.gml.LabelType)get_store().find_element_user(LABEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "label" element
     */
    @Inject(optional=true) public void setLabel(net.opengis.gml.LabelType label)
    {
        generatedSetterHelperImpl(label, LABEL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "label" element
     */
    public net.opengis.gml.LabelType addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LabelType target = null;
            target = (net.opengis.gml.LabelType)get_store().add_element_user(LABEL$2);
            return target;
        }
    }
}
