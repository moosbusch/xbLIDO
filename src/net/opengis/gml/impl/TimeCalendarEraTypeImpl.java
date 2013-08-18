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
 * An XML TimeCalendarEraType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeCalendarEraTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.TimeCalendarEraType
{
    private static final long serialVersionUID = 1L;
    
    public TimeCalendarEraTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCEEVENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "referenceEvent");
    private static final javax.xml.namespace.QName REFERENCEDATE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "referenceDate");
    private static final javax.xml.namespace.QName JULIANREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "julianReference");
    private static final javax.xml.namespace.QName EPOCHOFUSE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "epochOfUse");
    
    
    /**
     * Gets the "referenceEvent" element
     */
    public net.opengis.gml.StringOrRefType getReferenceEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(REFERENCEEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "referenceEvent" element
     */
    @Inject(optional=true) public void setReferenceEvent(net.opengis.gml.StringOrRefType referenceEvent)
    {
        generatedSetterHelperImpl(referenceEvent, REFERENCEEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referenceEvent" element
     */
    public net.opengis.gml.StringOrRefType addNewReferenceEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(REFERENCEEVENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "referenceDate" element
     */
    public java.util.Calendar getReferenceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "referenceDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetReferenceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(REFERENCEDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "referenceDate" element
     */
    public boolean isSetReferenceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "referenceDate" element
     */
    @Inject(optional=true) public void setReferenceDate(java.util.Calendar referenceDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEDATE$2);
            }
            target.setCalendarValue(referenceDate);
        }
    }
    
    /**
     * Sets (as xml) the "referenceDate" element
     */
    public void xsetReferenceDate(org.apache.xmlbeans.XmlDate referenceDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(REFERENCEDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(REFERENCEDATE$2);
            }
            target.set(referenceDate);
        }
    }
    
    /**
     * Unsets the "referenceDate" element
     */
    public void unsetReferenceDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEDATE$2, 0);
        }
    }
    
    /**
     * Gets the "julianReference" element
     */
    public java.math.BigDecimal getJulianReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JULIANREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "julianReference" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetJulianReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(JULIANREFERENCE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "julianReference" element
     */
    @Inject(optional=true) public void setJulianReference(java.math.BigDecimal julianReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JULIANREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JULIANREFERENCE$4);
            }
            target.setBigDecimalValue(julianReference);
        }
    }
    
    /**
     * Sets (as xml) the "julianReference" element
     */
    public void xsetJulianReference(org.apache.xmlbeans.XmlDecimal julianReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(JULIANREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(JULIANREFERENCE$4);
            }
            target.set(julianReference);
        }
    }
    
    /**
     * Gets the "epochOfUse" element
     */
    public net.opengis.gml.TimePeriodPropertyType getEpochOfUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.TimePeriodPropertyType)get_store().find_element_user(EPOCHOFUSE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "epochOfUse" element
     */
    @Inject(optional=true) public void setEpochOfUse(net.opengis.gml.TimePeriodPropertyType epochOfUse)
    {
        generatedSetterHelperImpl(epochOfUse, EPOCHOFUSE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "epochOfUse" element
     */
    public net.opengis.gml.TimePeriodPropertyType addNewEpochOfUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePeriodPropertyType target = null;
            target = (net.opengis.gml.TimePeriodPropertyType)get_store().add_element_user(EPOCHOFUSE$6);
            return target;
        }
    }
}
