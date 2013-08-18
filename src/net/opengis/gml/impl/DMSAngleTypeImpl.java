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
 * An XML DMSAngleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DMSAngleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DMSAngleType
{
    private static final long serialVersionUID = 1L;
    
    public DMSAngleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEGREES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "degrees");
    private static final javax.xml.namespace.QName DECIMALMINUTES$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "decimalMinutes");
    private static final javax.xml.namespace.QName MINUTES$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "minutes");
    private static final javax.xml.namespace.QName SECONDS$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "seconds");
    
    
    /**
     * Gets the "degrees" element
     */
    public net.opengis.gml.DegreesType getDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DegreesType target = null;
            target = (net.opengis.gml.DegreesType)get_store().find_element_user(DEGREES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "degrees" element
     */
    @Inject(optional=true) public void setDegrees(net.opengis.gml.DegreesType degrees)
    {
        generatedSetterHelperImpl(degrees, DEGREES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "degrees" element
     */
    public net.opengis.gml.DegreesType addNewDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DegreesType target = null;
            target = (net.opengis.gml.DegreesType)get_store().add_element_user(DEGREES$0);
            return target;
        }
    }
    
    /**
     * Gets the "decimalMinutes" element
     */
    public java.math.BigDecimal getDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALMINUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimalMinutes" element
     */
    public net.opengis.gml.DecimalMinutesType xgetDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DecimalMinutesType target = null;
            target = (net.opengis.gml.DecimalMinutesType)get_store().find_element_user(DECIMALMINUTES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "decimalMinutes" element
     */
    public boolean isSetDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECIMALMINUTES$2) != 0;
        }
    }
    
    /**
     * Sets the "decimalMinutes" element
     */
    @Inject(optional=true) public void setDecimalMinutes(java.math.BigDecimal decimalMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALMINUTES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMALMINUTES$2);
            }
            target.setBigDecimalValue(decimalMinutes);
        }
    }
    
    /**
     * Sets (as xml) the "decimalMinutes" element
     */
    public void xsetDecimalMinutes(net.opengis.gml.DecimalMinutesType decimalMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DecimalMinutesType target = null;
            target = (net.opengis.gml.DecimalMinutesType)get_store().find_element_user(DECIMALMINUTES$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DecimalMinutesType)get_store().add_element_user(DECIMALMINUTES$2);
            }
            target.set(decimalMinutes);
        }
    }
    
    /**
     * Unsets the "decimalMinutes" element
     */
    public void unsetDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECIMALMINUTES$2, 0);
        }
    }
    
    /**
     * Gets the "minutes" element
     */
    public int getMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minutes" element
     */
    public net.opengis.gml.ArcMinutesType xgetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcMinutesType target = null;
            target = (net.opengis.gml.ArcMinutesType)get_store().find_element_user(MINUTES$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "minutes" element
     */
    public boolean isSetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINUTES$4) != 0;
        }
    }
    
    /**
     * Sets the "minutes" element
     */
    @Inject(optional=true) public void setMinutes(int minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTES$4);
            }
            target.setIntValue(minutes);
        }
    }
    
    /**
     * Sets (as xml) the "minutes" element
     */
    public void xsetMinutes(net.opengis.gml.ArcMinutesType minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcMinutesType target = null;
            target = (net.opengis.gml.ArcMinutesType)get_store().find_element_user(MINUTES$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcMinutesType)get_store().add_element_user(MINUTES$4);
            }
            target.set(minutes);
        }
    }
    
    /**
     * Unsets the "minutes" element
     */
    public void unsetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINUTES$4, 0);
        }
    }
    
    /**
     * Gets the "seconds" element
     */
    public java.math.BigDecimal getSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "seconds" element
     */
    public net.opengis.gml.ArcSecondsType xgetSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcSecondsType target = null;
            target = (net.opengis.gml.ArcSecondsType)get_store().find_element_user(SECONDS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "seconds" element
     */
    public boolean isSetSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECONDS$6) != 0;
        }
    }
    
    /**
     * Sets the "seconds" element
     */
    @Inject(optional=true) public void setSeconds(java.math.BigDecimal seconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDS$6);
            }
            target.setBigDecimalValue(seconds);
        }
    }
    
    /**
     * Sets (as xml) the "seconds" element
     */
    public void xsetSeconds(net.opengis.gml.ArcSecondsType seconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcSecondsType target = null;
            target = (net.opengis.gml.ArcSecondsType)get_store().find_element_user(SECONDS$6, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcSecondsType)get_store().add_element_user(SECONDS$6);
            }
            target.set(seconds);
        }
    }
    
    /**
     * Unsets the "seconds" element
     */
    public void unsetSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECONDS$6, 0);
        }
    }
}
