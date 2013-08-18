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
 * An XML StyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class StyleTypeImpl extends net.opengis.gml.impl.AbstractStyleTypeImpl implements net.opengis.gml.StyleType
{
    private static final long serialVersionUID = 1L;
    
    public StyleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURESTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "featureStyle");
    private static final javax.xml.namespace.QName GRAPHSTYLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "graphStyle");
    
    
    /**
     * Gets a List of "featureStyle" elements
     */
    public java.util.List<net.opengis.gml.FeatureStylePropertyType> getFeatureStyleList()
    {
        final class FeatureStyleList extends java.util.AbstractList<net.opengis.gml.FeatureStylePropertyType>
        {
            @Override
            public net.opengis.gml.FeatureStylePropertyType get(int i)
                { return StyleTypeImpl.this.getFeatureStyleArray(i); }
            
            @Override
            public net.opengis.gml.FeatureStylePropertyType set(int i, net.opengis.gml.FeatureStylePropertyType o)
            {
                net.opengis.gml.FeatureStylePropertyType old = StyleTypeImpl.this.getFeatureStyleArray(i);
                StyleTypeImpl.this.setFeatureStyleArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.FeatureStylePropertyType o)
                { StyleTypeImpl.this.insertNewFeatureStyle(i).set(o); }
            
            @Override
            public net.opengis.gml.FeatureStylePropertyType remove(int i)
            {
                net.opengis.gml.FeatureStylePropertyType old = StyleTypeImpl.this.getFeatureStyleArray(i);
                StyleTypeImpl.this.removeFeatureStyle(i);
                return old;
            }
            
            @Override
            public int size()
                { return StyleTypeImpl.this.sizeOfFeatureStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FeatureStyleList();
        }
    }
    
    /**
     * Gets array of all "featureStyle" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.FeatureStylePropertyType[] getFeatureStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.FeatureStylePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.FeatureStylePropertyType>();
            get_store().find_all_element_users(FEATURESTYLE$0, targetList);
            net.opengis.gml.FeatureStylePropertyType[] result = new net.opengis.gml.FeatureStylePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "featureStyle" element
     */
    public net.opengis.gml.FeatureStylePropertyType getFeatureStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureStylePropertyType target = null;
            target = (net.opengis.gml.FeatureStylePropertyType)get_store().find_element_user(FEATURESTYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "featureStyle" element
     */
    public int sizeOfFeatureStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURESTYLE$0);
        }
    }
    
    /**
     * Sets array of all "featureStyle" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setFeatureStyleArray(net.opengis.gml.FeatureStylePropertyType[] featureStyleArray)
    {
        check_orphaned();
        arraySetterHelper(featureStyleArray, FEATURESTYLE$0);
    }
    
    /**
     * Sets ith "featureStyle" element
     */
    @Inject(optional=true) public void setFeatureStyleArray(int i, net.opengis.gml.FeatureStylePropertyType featureStyle)
    {
        generatedSetterHelperImpl(featureStyle, FEATURESTYLE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureStyle" element
     */
    public net.opengis.gml.FeatureStylePropertyType insertNewFeatureStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureStylePropertyType target = null;
            target = (net.opengis.gml.FeatureStylePropertyType)get_store().insert_element_user(FEATURESTYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureStyle" element
     */
    public net.opengis.gml.FeatureStylePropertyType addNewFeatureStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureStylePropertyType target = null;
            target = (net.opengis.gml.FeatureStylePropertyType)get_store().add_element_user(FEATURESTYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "featureStyle" element
     */
    public void removeFeatureStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURESTYLE$0, i);
        }
    }
    
    /**
     * Gets the "graphStyle" element
     */
    public net.opengis.gml.GraphStylePropertyType getGraphStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GraphStylePropertyType target = null;
            target = (net.opengis.gml.GraphStylePropertyType)get_store().find_element_user(GRAPHSTYLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "graphStyle" element
     */
    public boolean isSetGraphStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAPHSTYLE$2) != 0;
        }
    }
    
    /**
     * Sets the "graphStyle" element
     */
    @Inject(optional=true) public void setGraphStyle(net.opengis.gml.GraphStylePropertyType graphStyle)
    {
        generatedSetterHelperImpl(graphStyle, GRAPHSTYLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "graphStyle" element
     */
    public net.opengis.gml.GraphStylePropertyType addNewGraphStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GraphStylePropertyType target = null;
            target = (net.opengis.gml.GraphStylePropertyType)get_store().add_element_user(GRAPHSTYLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "graphStyle" element
     */
    public void unsetGraphStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAPHSTYLE$2, 0);
        }
    }
}
