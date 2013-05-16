/*
 * XML Type:  GeometryStyleType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeometryStyleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML GeometryStyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeometryStyleTypeImpl extends net.opengis.gml.impl.BaseStyleDescriptorTypeImpl implements net.opengis.gml.GeometryStyleType
{
    private static final long serialVersionUID = 1L;
    
    public GeometryStyleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYMBOL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "symbol");
    private static final javax.xml.namespace.QName STYLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "style");
    private static final javax.xml.namespace.QName LABELSTYLE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "labelStyle");
    private static final javax.xml.namespace.QName GEOMETRYPROPERTY$6 = 
        new javax.xml.namespace.QName("", "geometryProperty");
    private static final javax.xml.namespace.QName GEOMETRYTYPE$8 = 
        new javax.xml.namespace.QName("", "geometryType");
    
    
    /**
     * Gets the "symbol" element
     */
    public net.opengis.gml.SymbolType getSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SymbolType target = null;
            target = (net.opengis.gml.SymbolType)get_store().find_element_user(SYMBOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "symbol" element
     */
    public boolean isSetSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYMBOL$0) != 0;
        }
    }
    
    /**
     * Sets the "symbol" element
     */
    @Inject(optional=true) public void setSymbol(net.opengis.gml.SymbolType symbol)
    {
        generatedSetterHelperImpl(symbol, SYMBOL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "symbol" element
     */
    public net.opengis.gml.SymbolType addNewSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SymbolType target = null;
            target = (net.opengis.gml.SymbolType)get_store().add_element_user(SYMBOL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "symbol" element
     */
    public void unsetSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYMBOL$0, 0);
        }
    }
    
    /**
     * Gets the "style" element
     */
    public java.lang.String getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLE$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STYLE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "style" element
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STYLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STYLE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STYLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STYLE$2);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" element
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$2, 0);
        }
    }
    
    /**
     * Gets the "labelStyle" element
     */
    public net.opengis.gml.LabelStylePropertyType getLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LabelStylePropertyType target = null;
            target = (net.opengis.gml.LabelStylePropertyType)get_store().find_element_user(LABELSTYLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "labelStyle" element
     */
    public boolean isSetLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABELSTYLE$4) != 0;
        }
    }
    
    /**
     * Sets the "labelStyle" element
     */
    @Inject(optional=true) public void setLabelStyle(net.opengis.gml.LabelStylePropertyType labelStyle)
    {
        generatedSetterHelperImpl(labelStyle, LABELSTYLE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.LabelStylePropertyType)get_store().add_element_user(LABELSTYLE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "labelStyle" element
     */
    public void unsetLabelStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABELSTYLE$4, 0);
        }
    }
    
    /**
     * Gets the "geometryProperty" attribute
     */
    public java.lang.String getGeometryProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOMETRYPROPERTY$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "geometryProperty" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGeometryProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOMETRYPROPERTY$6);
            return target;
        }
    }
    
    /**
     * True if has "geometryProperty" attribute
     */
    public boolean isSetGeometryProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GEOMETRYPROPERTY$6) != null;
        }
    }
    
    /**
     * Sets the "geometryProperty" attribute
     */
    @Inject(optional=true) public void setGeometryProperty(java.lang.String geometryProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOMETRYPROPERTY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOMETRYPROPERTY$6);
            }
            target.setStringValue(geometryProperty);
        }
    }
    
    /**
     * Sets (as xml) the "geometryProperty" attribute
     */
    public void xsetGeometryProperty(org.apache.xmlbeans.XmlString geometryProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOMETRYPROPERTY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOMETRYPROPERTY$6);
            }
            target.set(geometryProperty);
        }
    }
    
    /**
     * Unsets the "geometryProperty" attribute
     */
    public void unsetGeometryProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GEOMETRYPROPERTY$6);
        }
    }
    
    /**
     * Gets the "geometryType" attribute
     */
    public java.lang.String getGeometryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOMETRYTYPE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "geometryType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGeometryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOMETRYTYPE$8);
            return target;
        }
    }
    
    /**
     * True if has "geometryType" attribute
     */
    public boolean isSetGeometryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GEOMETRYTYPE$8) != null;
        }
    }
    
    /**
     * Sets the "geometryType" attribute
     */
    @Inject(optional=true) public void setGeometryType(java.lang.String geometryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOMETRYTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOMETRYTYPE$8);
            }
            target.setStringValue(geometryType);
        }
    }
    
    /**
     * Sets (as xml) the "geometryType" attribute
     */
    public void xsetGeometryType(org.apache.xmlbeans.XmlString geometryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOMETRYTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOMETRYTYPE$8);
            }
            target.set(geometryType);
        }
    }
    
    /**
     * Unsets the "geometryType" attribute
     */
    public void unsetGeometryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GEOMETRYTYPE$8);
        }
    }
}
