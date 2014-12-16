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
 * An XML TimeCoordinateSystemType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeCoordinateSystemTypeImpl extends net.opengis.gml.impl.AbstractTimeReferenceSystemTypeImpl implements net.opengis.gml.TimeCoordinateSystemType
{
    private static final long serialVersionUID = 1L;
    
    public TimeCoordinateSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "originPosition");
    private static final javax.xml.namespace.QName ORIGIN$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "origin");
    private static final javax.xml.namespace.QName INTERVAL$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "interval");
    
    
    /**
     * Gets the "originPosition" element
     */
    public net.opengis.gml.TimePositionType getOriginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().find_element_user(ORIGINPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originPosition" element
     */
    public boolean isSetOriginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINPOSITION$0) != 0;
        }
    }
    
    /**
     * Sets the "originPosition" element
     */
     public void setOriginPosition(net.opengis.gml.TimePositionType originPosition)
    {
        generatedSetterHelperImpl(originPosition, ORIGINPOSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "originPosition" element
     */
    public net.opengis.gml.TimePositionType addNewOriginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().add_element_user(ORIGINPOSITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "originPosition" element
     */
    public void unsetOriginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINPOSITION$0, 0);
        }
    }
    
    /**
     * Gets the "origin" element
     */
    public net.opengis.gml.TimeInstantPropertyType getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.TimeInstantPropertyType)get_store().find_element_user(ORIGIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "origin" element
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGIN$2) != 0;
        }
    }
    
    /**
     * Sets the "origin" element
     */
     public void setOrigin(net.opengis.gml.TimeInstantPropertyType origin)
    {
        generatedSetterHelperImpl(origin, ORIGIN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public net.opengis.gml.TimeInstantPropertyType addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.TimeInstantPropertyType)get_store().add_element_user(ORIGIN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "origin" element
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGIN$2, 0);
        }
    }
    
    /**
     * Gets the "interval" element
     */
    public net.opengis.gml.TimeIntervalLengthType getInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.TimeIntervalLengthType)get_store().find_element_user(INTERVAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interval" element
     */
     public void setInterval(net.opengis.gml.TimeIntervalLengthType interval)
    {
        generatedSetterHelperImpl(interval, INTERVAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "interval" element
     */
    public net.opengis.gml.TimeIntervalLengthType addNewInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.TimeIntervalLengthType)get_store().add_element_user(INTERVAL$4);
            return target;
        }
    }
}
