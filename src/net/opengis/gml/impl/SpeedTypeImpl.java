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
 * An XML SpeedType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.SpeedType.
 */
public class SpeedTypeImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements net.opengis.gml.SpeedType
{
    private static final long serialVersionUID = 1L;
    
    public SpeedTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected SpeedTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName UOM$0 = 
        new javax.xml.namespace.QName("", "uom");
    
    
    /**
     * Gets the "uom" attribute
     */
    public java.lang.String getUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(UOM$0);
            return target;
        }
    }
    
    /**
     * Sets the "uom" attribute
     */
     public void setUom(java.lang.String uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOM$0);
            }
            target.setStringValue(uom);
        }
    }
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    public void xsetUom(org.apache.xmlbeans.XmlAnyURI uom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(UOM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(UOM$0);
            }
            target.set(uom);
        }
    }
}
