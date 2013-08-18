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
 * An XML FeatureStyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class FeatureStyleTypeImpl extends net.opengis.gml.impl.AbstractGMLTypeImpl implements net.opengis.gml.FeatureStyleType
{
    private static final long serialVersionUID = 1L;
    
    public FeatureStyleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURECONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "featureConstraint");
    private static final javax.xml.namespace.QName GEOMETRYSTYLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "geometryStyle");
    private static final javax.xml.namespace.QName TOPOLOGYSTYLE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topologyStyle");
    private static final javax.xml.namespace.QName LABELSTYLE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "labelStyle");
    private static final javax.xml.namespace.QName FEATURETYPE$8 = 
        new javax.xml.namespace.QName("", "featureType");
    private static final javax.xml.namespace.QName BASETYPE$10 = 
        new javax.xml.namespace.QName("", "baseType");
    private static final javax.xml.namespace.QName QUERYGRAMMAR$12 = 
        new javax.xml.namespace.QName("", "queryGrammar");
    
    
    /**
     * Gets the "featureConstraint" element
     */
    public java.lang.String getFeatureConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURECONSTRAINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "featureConstraint" element
     */
    public org.apache.xmlbeans.XmlString xgetFeatureConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURECONSTRAINT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "featureConstraint" element
     */
    public boolean isSetFeatureConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURECONSTRAINT$0) != 0;
        }
    }
    
    /**
     * Sets the "featureConstraint" element
     */
    @Inject(optional=true) public void setFeatureConstraint(java.lang.String featureConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURECONSTRAINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATURECONSTRAINT$0);
            }
            target.setStringValue(featureConstraint);
        }
    }
    
    /**
     * Sets (as xml) the "featureConstraint" element
     */
    public void xsetFeatureConstraint(org.apache.xmlbeans.XmlString featureConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURECONSTRAINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FEATURECONSTRAINT$0);
            }
            target.set(featureConstraint);
        }
    }
    
    /**
     * Unsets the "featureConstraint" element
     */
    public void unsetFeatureConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURECONSTRAINT$0, 0);
        }
    }
    
    /**
     * Gets a List of "geometryStyle" elements
     */
    public java.util.List<net.opengis.gml.GeometryStylePropertyType> getGeometryStyleList()
    {
        final class GeometryStyleList extends java.util.AbstractList<net.opengis.gml.GeometryStylePropertyType>
        {
            @Override
            public net.opengis.gml.GeometryStylePropertyType get(int i)
                { return FeatureStyleTypeImpl.this.getGeometryStyleArray(i); }
            
            @Override
            public net.opengis.gml.GeometryStylePropertyType set(int i, net.opengis.gml.GeometryStylePropertyType o)
            {
                net.opengis.gml.GeometryStylePropertyType old = FeatureStyleTypeImpl.this.getGeometryStyleArray(i);
                FeatureStyleTypeImpl.this.setGeometryStyleArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.GeometryStylePropertyType o)
                { FeatureStyleTypeImpl.this.insertNewGeometryStyle(i).set(o); }
            
            @Override
            public net.opengis.gml.GeometryStylePropertyType remove(int i)
            {
                net.opengis.gml.GeometryStylePropertyType old = FeatureStyleTypeImpl.this.getGeometryStyleArray(i);
                FeatureStyleTypeImpl.this.removeGeometryStyle(i);
                return old;
            }
            
            @Override
            public int size()
                { return FeatureStyleTypeImpl.this.sizeOfGeometryStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GeometryStyleList();
        }
    }
    
    /**
     * Gets array of all "geometryStyle" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.GeometryStylePropertyType[] getGeometryStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.GeometryStylePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.GeometryStylePropertyType>();
            get_store().find_all_element_users(GEOMETRYSTYLE$2, targetList);
            net.opengis.gml.GeometryStylePropertyType[] result = new net.opengis.gml.GeometryStylePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geometryStyle" element
     */
    public net.opengis.gml.GeometryStylePropertyType getGeometryStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryStylePropertyType target = null;
            target = (net.opengis.gml.GeometryStylePropertyType)get_store().find_element_user(GEOMETRYSTYLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geometryStyle" element
     */
    public int sizeOfGeometryStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRYSTYLE$2);
        }
    }
    
    /**
     * Sets array of all "geometryStyle" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setGeometryStyleArray(net.opengis.gml.GeometryStylePropertyType[] geometryStyleArray)
    {
        check_orphaned();
        arraySetterHelper(geometryStyleArray, GEOMETRYSTYLE$2);
    }
    
    /**
     * Sets ith "geometryStyle" element
     */
    @Inject(optional=true) public void setGeometryStyleArray(int i, net.opengis.gml.GeometryStylePropertyType geometryStyle)
    {
        generatedSetterHelperImpl(geometryStyle, GEOMETRYSTYLE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geometryStyle" element
     */
    public net.opengis.gml.GeometryStylePropertyType insertNewGeometryStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryStylePropertyType target = null;
            target = (net.opengis.gml.GeometryStylePropertyType)get_store().insert_element_user(GEOMETRYSTYLE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geometryStyle" element
     */
    public net.opengis.gml.GeometryStylePropertyType addNewGeometryStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometryStylePropertyType target = null;
            target = (net.opengis.gml.GeometryStylePropertyType)get_store().add_element_user(GEOMETRYSTYLE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "geometryStyle" element
     */
    public void removeGeometryStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRYSTYLE$2, i);
        }
    }
    
    /**
     * Gets a List of "topologyStyle" elements
     */
    public java.util.List<net.opengis.gml.TopologyStylePropertyType> getTopologyStyleList()
    {
        final class TopologyStyleList extends java.util.AbstractList<net.opengis.gml.TopologyStylePropertyType>
        {
            @Override
            public net.opengis.gml.TopologyStylePropertyType get(int i)
                { return FeatureStyleTypeImpl.this.getTopologyStyleArray(i); }
            
            @Override
            public net.opengis.gml.TopologyStylePropertyType set(int i, net.opengis.gml.TopologyStylePropertyType o)
            {
                net.opengis.gml.TopologyStylePropertyType old = FeatureStyleTypeImpl.this.getTopologyStyleArray(i);
                FeatureStyleTypeImpl.this.setTopologyStyleArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TopologyStylePropertyType o)
                { FeatureStyleTypeImpl.this.insertNewTopologyStyle(i).set(o); }
            
            @Override
            public net.opengis.gml.TopologyStylePropertyType remove(int i)
            {
                net.opengis.gml.TopologyStylePropertyType old = FeatureStyleTypeImpl.this.getTopologyStyleArray(i);
                FeatureStyleTypeImpl.this.removeTopologyStyle(i);
                return old;
            }
            
            @Override
            public int size()
                { return FeatureStyleTypeImpl.this.sizeOfTopologyStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TopologyStyleList();
        }
    }
    
    /**
     * Gets array of all "topologyStyle" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TopologyStylePropertyType[] getTopologyStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TopologyStylePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.TopologyStylePropertyType>();
            get_store().find_all_element_users(TOPOLOGYSTYLE$4, targetList);
            net.opengis.gml.TopologyStylePropertyType[] result = new net.opengis.gml.TopologyStylePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "topologyStyle" element
     */
    public net.opengis.gml.TopologyStylePropertyType getTopologyStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopologyStylePropertyType target = null;
            target = (net.opengis.gml.TopologyStylePropertyType)get_store().find_element_user(TOPOLOGYSTYLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "topologyStyle" element
     */
    public int sizeOfTopologyStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPOLOGYSTYLE$4);
        }
    }
    
    /**
     * Sets array of all "topologyStyle" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTopologyStyleArray(net.opengis.gml.TopologyStylePropertyType[] topologyStyleArray)
    {
        check_orphaned();
        arraySetterHelper(topologyStyleArray, TOPOLOGYSTYLE$4);
    }
    
    /**
     * Sets ith "topologyStyle" element
     */
    @Inject(optional=true) public void setTopologyStyleArray(int i, net.opengis.gml.TopologyStylePropertyType topologyStyle)
    {
        generatedSetterHelperImpl(topologyStyle, TOPOLOGYSTYLE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topologyStyle" element
     */
    public net.opengis.gml.TopologyStylePropertyType insertNewTopologyStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopologyStylePropertyType target = null;
            target = (net.opengis.gml.TopologyStylePropertyType)get_store().insert_element_user(TOPOLOGYSTYLE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topologyStyle" element
     */
    public net.opengis.gml.TopologyStylePropertyType addNewTopologyStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopologyStylePropertyType target = null;
            target = (net.opengis.gml.TopologyStylePropertyType)get_store().add_element_user(TOPOLOGYSTYLE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "topologyStyle" element
     */
    public void removeTopologyStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPOLOGYSTYLE$4, i);
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
            target = (net.opengis.gml.LabelStylePropertyType)get_store().find_element_user(LABELSTYLE$6, 0);
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
            return get_store().count_elements(LABELSTYLE$6) != 0;
        }
    }
    
    /**
     * Sets the "labelStyle" element
     */
    @Inject(optional=true) public void setLabelStyle(net.opengis.gml.LabelStylePropertyType labelStyle)
    {
        generatedSetterHelperImpl(labelStyle, LABELSTYLE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.LabelStylePropertyType)get_store().add_element_user(LABELSTYLE$6);
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
            get_store().remove_element(LABELSTYLE$6, 0);
        }
    }
    
    /**
     * Gets the "featureType" attribute
     */
    public java.lang.String getFeatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURETYPE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "featureType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFeatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATURETYPE$8);
            return target;
        }
    }
    
    /**
     * True if has "featureType" attribute
     */
    public boolean isSetFeatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FEATURETYPE$8) != null;
        }
    }
    
    /**
     * Sets the "featureType" attribute
     */
    @Inject(optional=true) public void setFeatureType(java.lang.String featureType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURETYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FEATURETYPE$8);
            }
            target.setStringValue(featureType);
        }
    }
    
    /**
     * Sets (as xml) the "featureType" attribute
     */
    public void xsetFeatureType(org.apache.xmlbeans.XmlString featureType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATURETYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FEATURETYPE$8);
            }
            target.set(featureType);
        }
    }
    
    /**
     * Unsets the "featureType" attribute
     */
    public void unsetFeatureType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FEATURETYPE$8);
        }
    }
    
    /**
     * Gets the "baseType" attribute
     */
    public java.lang.String getBaseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASETYPE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "baseType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBaseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BASETYPE$10);
            return target;
        }
    }
    
    /**
     * True if has "baseType" attribute
     */
    public boolean isSetBaseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASETYPE$10) != null;
        }
    }
    
    /**
     * Sets the "baseType" attribute
     */
    @Inject(optional=true) public void setBaseType(java.lang.String baseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASETYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASETYPE$10);
            }
            target.setStringValue(baseType);
        }
    }
    
    /**
     * Sets (as xml) the "baseType" attribute
     */
    public void xsetBaseType(org.apache.xmlbeans.XmlString baseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BASETYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BASETYPE$10);
            }
            target.set(baseType);
        }
    }
    
    /**
     * Unsets the "baseType" attribute
     */
    public void unsetBaseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASETYPE$10);
        }
    }
    
    /**
     * Gets the "queryGrammar" attribute
     */
    public net.opengis.gml.QueryGrammarEnumeration.Enum getQueryGrammar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYGRAMMAR$12);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.QueryGrammarEnumeration.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryGrammar" attribute
     */
    public net.opengis.gml.QueryGrammarEnumeration xgetQueryGrammar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QueryGrammarEnumeration target = null;
            target = (net.opengis.gml.QueryGrammarEnumeration)get_store().find_attribute_user(QUERYGRAMMAR$12);
            return target;
        }
    }
    
    /**
     * True if has "queryGrammar" attribute
     */
    public boolean isSetQueryGrammar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUERYGRAMMAR$12) != null;
        }
    }
    
    /**
     * Sets the "queryGrammar" attribute
     */
    @Inject(optional=true) public void setQueryGrammar(net.opengis.gml.QueryGrammarEnumeration.Enum queryGrammar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYGRAMMAR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERYGRAMMAR$12);
            }
            target.setEnumValue(queryGrammar);
        }
    }
    
    /**
     * Sets (as xml) the "queryGrammar" attribute
     */
    public void xsetQueryGrammar(net.opengis.gml.QueryGrammarEnumeration queryGrammar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QueryGrammarEnumeration target = null;
            target = (net.opengis.gml.QueryGrammarEnumeration)get_store().find_attribute_user(QUERYGRAMMAR$12);
            if (target == null)
            {
                target = (net.opengis.gml.QueryGrammarEnumeration)get_store().add_attribute_user(QUERYGRAMMAR$12);
            }
            target.set(queryGrammar);
        }
    }
    
    /**
     * Unsets the "queryGrammar" attribute
     */
    public void unsetQueryGrammar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUERYGRAMMAR$12);
        }
    }
}
