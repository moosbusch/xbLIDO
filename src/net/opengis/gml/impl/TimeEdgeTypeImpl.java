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
 * An XML TimeEdgeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeEdgeTypeImpl extends net.opengis.gml.impl.AbstractTimeTopologyPrimitiveTypeImpl implements net.opengis.gml.TimeEdgeType
{
    private static final long serialVersionUID = 1L;
    
    public TimeEdgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "end");
    private static final javax.xml.namespace.QName EXTENT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "extent");
    
    
    /**
     * Gets the "start" element
     */
    public net.opengis.gml.TimeNodePropertyType getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodePropertyType target = null;
            target = (net.opengis.gml.TimeNodePropertyType)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "start" element
     */
    @Inject(optional=true) public void setStart(net.opengis.gml.TimeNodePropertyType start)
    {
        generatedSetterHelperImpl(start, START$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "start" element
     */
    public net.opengis.gml.TimeNodePropertyType addNewStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodePropertyType target = null;
            target = (net.opengis.gml.TimeNodePropertyType)get_store().add_element_user(START$0);
            return target;
        }
    }
    
    /**
     * Gets the "end" element
     */
    public net.opengis.gml.TimeNodePropertyType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodePropertyType target = null;
            target = (net.opengis.gml.TimeNodePropertyType)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "end" element
     */
    @Inject(optional=true) public void setEnd(net.opengis.gml.TimeNodePropertyType end)
    {
        generatedSetterHelperImpl(end, END$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public net.opengis.gml.TimeNodePropertyType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeNodePropertyType target = null;
            target = (net.opengis.gml.TimeNodePropertyType)get_store().add_element_user(END$2);
            return target;
        }
    }
    
    /**
     * Gets the "extent" element
     */
    public net.opengis.gml.TimePeriodPropertyType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.TimePeriodPropertyType)get_store().find_element_user(EXTENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extent" element
     */
    public boolean isSetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENT$4) != 0;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    @Inject(optional=true) public void setExtent(net.opengis.gml.TimePeriodPropertyType extent)
    {
        generatedSetterHelperImpl(extent, EXTENT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public net.opengis.gml.TimePeriodPropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.TimePeriodPropertyType)get_store().add_element_user(EXTENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "extent" element
     */
    public void unsetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENT$4, 0);
        }
    }
}
