/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TopologyStyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TopologyStyleTypeImpl extends net.opengis.gml.impl.BaseStyleDescriptorTypeImpl implements net.opengis.gml.TopologyStyleType
{
    private static final long serialVersionUID = 1L;
    
    public TopologyStyleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYMBOL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "symbol");
    private static final javax.xml.namespace.QName STYLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "style");
    private static final javax.xml.namespace.QName LABELSTYLE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "labelStyle");
    private static final javax.xml.namespace.QName TOPOLOGYPROPERTY$6 = 
        new javax.xml.namespace.QName("", "topologyProperty");
    private static final javax.xml.namespace.QName TOPOLOGYTYPE$8 = 
        new javax.xml.namespace.QName("", "topologyType");
    
    
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
     * Gets the "topologyProperty" attribute
     */
    public java.lang.String getTopologyProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPOLOGYPROPERTY$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topologyProperty" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTopologyProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOPOLOGYPROPERTY$6);
            return target;
        }
    }
    
    /**
     * True if has "topologyProperty" attribute
     */
    public boolean isSetTopologyProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPOLOGYPROPERTY$6) != null;
        }
    }
    
    /**
     * Sets the "topologyProperty" attribute
     */
    @Inject(optional=true) public void setTopologyProperty(java.lang.String topologyProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPOLOGYPROPERTY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPOLOGYPROPERTY$6);
            }
            target.setStringValue(topologyProperty);
        }
    }
    
    /**
     * Sets (as xml) the "topologyProperty" attribute
     */
    public void xsetTopologyProperty(org.apache.xmlbeans.XmlString topologyProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOPOLOGYPROPERTY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOPOLOGYPROPERTY$6);
            }
            target.set(topologyProperty);
        }
    }
    
    /**
     * Unsets the "topologyProperty" attribute
     */
    public void unsetTopologyProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPOLOGYPROPERTY$6);
        }
    }
    
    /**
     * Gets the "topologyType" attribute
     */
    public java.lang.String getTopologyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPOLOGYTYPE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "topologyType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTopologyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOPOLOGYTYPE$8);
            return target;
        }
    }
    
    /**
     * True if has "topologyType" attribute
     */
    public boolean isSetTopologyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPOLOGYTYPE$8) != null;
        }
    }
    
    /**
     * Sets the "topologyType" attribute
     */
    @Inject(optional=true) public void setTopologyType(java.lang.String topologyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPOLOGYTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPOLOGYTYPE$8);
            }
            target.setStringValue(topologyType);
        }
    }
    
    /**
     * Sets (as xml) the "topologyType" attribute
     */
    public void xsetTopologyType(org.apache.xmlbeans.XmlString topologyType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOPOLOGYTYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOPOLOGYTYPE$8);
            }
            target.set(topologyType);
        }
    }
    
    /**
     * Unsets the "topologyType" attribute
     */
    public void unsetTopologyType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPOLOGYTYPE$8);
        }
    }
}
