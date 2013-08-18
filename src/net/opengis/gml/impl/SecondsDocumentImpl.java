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
 * A document containing one seconds(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SecondsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SecondsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecondsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECONDS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "seconds");
    
    
    /**
     * Gets the "seconds" element
     */
    public java.math.BigDecimal getSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDS$0, 0);
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
            target = (net.opengis.gml.ArcSecondsType)get_store().find_element_user(SECONDS$0, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECONDS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECONDS$0);
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
            target = (net.opengis.gml.ArcSecondsType)get_store().find_element_user(SECONDS$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcSecondsType)get_store().add_element_user(SECONDS$0);
            }
            target.set(seconds);
        }
    }
}
