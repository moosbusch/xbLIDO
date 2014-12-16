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
 * An XML CoordType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CoordTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordType
{
    private static final long serialVersionUID = 1L;
    
    public CoordTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName X$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "X");
    private static final javax.xml.namespace.QName Y$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Y");
    private static final javax.xml.namespace.QName Z$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Z");
    
    
    /**
     * Gets the "X" element
     */
    public java.math.BigDecimal getX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "X" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(X$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "X" element
     */
     public void setX(java.math.BigDecimal x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(X$0);
            }
            target.setBigDecimalValue(x);
        }
    }
    
    /**
     * Sets (as xml) the "X" element
     */
    public void xsetX(org.apache.xmlbeans.XmlDecimal x)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(X$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(X$0);
            }
            target.set(x);
        }
    }
    
    /**
     * Gets the "Y" element
     */
    public java.math.BigDecimal getY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Y" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(Y$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Y" element
     */
    public boolean isSetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(Y$2) != 0;
        }
    }
    
    /**
     * Sets the "Y" element
     */
     public void setY(java.math.BigDecimal y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Y$2);
            }
            target.setBigDecimalValue(y);
        }
    }
    
    /**
     * Sets (as xml) the "Y" element
     */
    public void xsetY(org.apache.xmlbeans.XmlDecimal y)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(Y$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(Y$2);
            }
            target.set(y);
        }
    }
    
    /**
     * Unsets the "Y" element
     */
    public void unsetY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(Y$2, 0);
        }
    }
    
    /**
     * Gets the "Z" element
     */
    public java.math.BigDecimal getZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Z$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Z" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(Z$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Z" element
     */
    public boolean isSetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(Z$4) != 0;
        }
    }
    
    /**
     * Sets the "Z" element
     */
     public void setZ(java.math.BigDecimal z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Z$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Z$4);
            }
            target.setBigDecimalValue(z);
        }
    }
    
    /**
     * Sets (as xml) the "Z" element
     */
    public void xsetZ(org.apache.xmlbeans.XmlDecimal z)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(Z$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(Z$4);
            }
            target.set(z);
        }
    }
    
    /**
     * Unsets the "Z" element
     */
    public void unsetZ()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(Z$4, 0);
        }
    }
}
