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
package net.opengis.gml.impl; 
/**
 * An XML DynamicFeatureType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DynamicFeatureTypeImpl extends net.opengis.gml.impl.AbstractFeatureTypeImpl implements net.opengis.gml.DynamicFeatureType
{
    private static final long serialVersionUID = 1L;
    
    public DynamicFeatureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "validTime");
    private static final javax.xml.namespace.QName HISTORY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "history");
    private static final org.apache.xmlbeans.QNameSet HISTORY$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "track"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "history"),
    });
    private static final javax.xml.namespace.QName DATASOURCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dataSource");
    
    
    /**
     * Gets the "validTime" element
     */
    public net.opengis.gml.TimePrimitivePropertyType getValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.TimePrimitivePropertyType)get_store().find_element_user(VALIDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "validTime" element
     */
    public boolean isSetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "validTime" element
     */
     public void setValidTime(net.opengis.gml.TimePrimitivePropertyType validTime)
    {
        generatedSetterHelperImpl(validTime, VALIDTIME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    public net.opengis.gml.TimePrimitivePropertyType addNewValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.TimePrimitivePropertyType)get_store().add_element_user(VALIDTIME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "validTime" element
     */
    public void unsetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDTIME$0, 0);
        }
    }
    
    /**
     * Gets the "history" element
     */
    public net.opengis.gml.HistoryPropertyType getHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().find_element_user(HISTORY$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "history" element
     */
    public boolean isSetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HISTORY$3) != 0;
        }
    }
    
    /**
     * Sets the "history" element
     */
     public void setHistory(net.opengis.gml.HistoryPropertyType history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().find_element_user(HISTORY$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.HistoryPropertyType)get_store().add_element_user(HISTORY$2);
            }
            target.set(history);
        }
    }
    
    /**
     * Appends and returns a new empty "history" element
     */
    public net.opengis.gml.HistoryPropertyType addNewHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().add_element_user(HISTORY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "history" element
     */
    public void unsetHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HISTORY$3, 0);
        }
    }
    
    /**
     * Gets the "dataSource" element
     */
    public net.opengis.gml.StringOrRefType getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(DATASOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataSource" element
     */
    public boolean isSetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASOURCE$4) != 0;
        }
    }
    
    /**
     * Sets the "dataSource" element
     */
     public void setDataSource(net.opengis.gml.StringOrRefType dataSource)
    {
        generatedSetterHelperImpl(dataSource, DATASOURCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSource" element
     */
    public net.opengis.gml.StringOrRefType addNewDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(DATASOURCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "dataSource" element
     */
    public void unsetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASOURCE$4, 0);
        }
    }
}
