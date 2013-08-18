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
 * A document containing one decimalMinutes(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DecimalMinutesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DecimalMinutesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DecimalMinutesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECIMALMINUTES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "decimalMinutes");
    
    
    /**
     * Gets the "decimalMinutes" element
     */
    public java.math.BigDecimal getDecimalMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALMINUTES$0, 0);
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
            target = (net.opengis.gml.DecimalMinutesType)get_store().find_element_user(DECIMALMINUTES$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECIMALMINUTES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECIMALMINUTES$0);
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
            target = (net.opengis.gml.DecimalMinutesType)get_store().find_element_user(DECIMALMINUTES$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DecimalMinutesType)get_store().add_element_user(DECIMALMINUTES$0);
            }
            target.set(decimalMinutes);
        }
    }
}
