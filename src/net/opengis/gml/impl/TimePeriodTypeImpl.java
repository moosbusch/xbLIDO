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
 * An XML TimePeriodType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimePeriodTypeImpl extends net.opengis.gml.impl.AbstractTimeGeometricPrimitiveTypeImpl implements net.opengis.gml.TimePeriodType
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEGINPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "beginPosition");
    private static final javax.xml.namespace.QName BEGIN$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "begin");
    private static final javax.xml.namespace.QName ENDPOSITION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "endPosition");
    private static final javax.xml.namespace.QName END$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "end");
    private static final javax.xml.namespace.QName DURATION$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "duration");
    private static final javax.xml.namespace.QName TIMEINTERVAL$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "timeInterval");
    
    
    /**
     * Gets the "beginPosition" element
     */
    public net.opengis.gml.TimePositionType getBeginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().find_element_user(BEGINPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "beginPosition" element
     */
    public boolean isSetBeginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGINPOSITION$0) != 0;
        }
    }
    
    /**
     * Sets the "beginPosition" element
     */
     public void setBeginPosition(net.opengis.gml.TimePositionType beginPosition)
    {
        generatedSetterHelperImpl(beginPosition, BEGINPOSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "beginPosition" element
     */
    public net.opengis.gml.TimePositionType addNewBeginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().add_element_user(BEGINPOSITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "beginPosition" element
     */
    public void unsetBeginPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGINPOSITION$0, 0);
        }
    }
    
    /**
     * Gets the "begin" element
     */
    public net.opengis.gml.TimeInstantPropertyType getBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.TimeInstantPropertyType)get_store().find_element_user(BEGIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "begin" element
     */
    public boolean isSetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEGIN$2) != 0;
        }
    }
    
    /**
     * Sets the "begin" element
     */
     public void setBegin(net.opengis.gml.TimeInstantPropertyType begin)
    {
        generatedSetterHelperImpl(begin, BEGIN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "begin" element
     */
    public net.opengis.gml.TimeInstantPropertyType addNewBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.TimeInstantPropertyType)get_store().add_element_user(BEGIN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "begin" element
     */
    public void unsetBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEGIN$2, 0);
        }
    }
    
    /**
     * Gets the "endPosition" element
     */
    public net.opengis.gml.TimePositionType getEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().find_element_user(ENDPOSITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "endPosition" element
     */
    public boolean isSetEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOSITION$4) != 0;
        }
    }
    
    /**
     * Sets the "endPosition" element
     */
     public void setEndPosition(net.opengis.gml.TimePositionType endPosition)
    {
        generatedSetterHelperImpl(endPosition, ENDPOSITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "endPosition" element
     */
    public net.opengis.gml.TimePositionType addNewEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePositionType target = null;
            target = (net.opengis.gml.TimePositionType)get_store().add_element_user(ENDPOSITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "endPosition" element
     */
    public void unsetEndPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOSITION$4, 0);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public net.opengis.gml.TimeInstantPropertyType getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.TimeInstantPropertyType)get_store().find_element_user(END$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "end" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$6) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
     public void setEnd(net.opengis.gml.TimeInstantPropertyType end)
    {
        generatedSetterHelperImpl(end, END$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "end" element
     */
    public net.opengis.gml.TimeInstantPropertyType addNewEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.TimeInstantPropertyType)get_store().add_element_user(END$6);
            return target;
        }
    }
    
    /**
     * Unsets the "end" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$6, 0);
        }
    }
    
    /**
     * Gets the "duration" element
     */
    public org.apache.xmlbeans.GDuration getDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "duration" element
     */
    public org.apache.xmlbeans.XmlDuration xgetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "duration" element
     */
    public boolean isSetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DURATION$8) != 0;
        }
    }
    
    /**
     * Sets the "duration" element
     */
     public void setDuration(org.apache.xmlbeans.GDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DURATION$8);
            }
            target.setGDurationValue(duration);
        }
    }
    
    /**
     * Sets (as xml) the "duration" element
     */
    public void xsetDuration(org.apache.xmlbeans.XmlDuration duration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(DURATION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(DURATION$8);
            }
            target.set(duration);
        }
    }
    
    /**
     * Unsets the "duration" element
     */
    public void unsetDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DURATION$8, 0);
        }
    }
    
    /**
     * Gets the "timeInterval" element
     */
    public net.opengis.gml.TimeIntervalLengthType getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.TimeIntervalLengthType)get_store().find_element_user(TIMEINTERVAL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeInterval" element
     */
    public boolean isSetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEINTERVAL$10) != 0;
        }
    }
    
    /**
     * Sets the "timeInterval" element
     */
     public void setTimeInterval(net.opengis.gml.TimeIntervalLengthType timeInterval)
    {
        generatedSetterHelperImpl(timeInterval, TIMEINTERVAL$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timeInterval" element
     */
    public net.opengis.gml.TimeIntervalLengthType addNewTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIntervalLengthType target = null;
            target = (net.opengis.gml.TimeIntervalLengthType)get_store().add_element_user(TIMEINTERVAL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "timeInterval" element
     */
    public void unsetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEINTERVAL$10, 0);
        }
    }
}
