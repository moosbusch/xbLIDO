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
 * An XML FormulaType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class FormulaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.FormulaType
{
    private static final long serialVersionUID = 1L;
    
    public FormulaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName A$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "a");
    private static final javax.xml.namespace.QName B$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "b");
    private static final javax.xml.namespace.QName C$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "c");
    private static final javax.xml.namespace.QName D$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "d");
    
    
    /**
     * Gets the "a" element
     */
    public double getA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "a" element
     */
    public org.apache.xmlbeans.XmlDouble xgetA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(A$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "a" element
     */
    public boolean isSetA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(A$0) != 0;
        }
    }
    
    /**
     * Sets the "a" element
     */
     public void setA(double a)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(A$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(A$0);
            }
            target.setDoubleValue(a);
        }
    }
    
    /**
     * Sets (as xml) the "a" element
     */
    public void xsetA(org.apache.xmlbeans.XmlDouble a)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(A$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(A$0);
            }
            target.set(a);
        }
    }
    
    /**
     * Unsets the "a" element
     */
    public void unsetA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(A$0, 0);
        }
    }
    
    /**
     * Gets the "b" element
     */
    public double getB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(B$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "b" element
     */
    public org.apache.xmlbeans.XmlDouble xgetB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(B$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "b" element
     */
     public void setB(double b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(B$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(B$2);
            }
            target.setDoubleValue(b);
        }
    }
    
    /**
     * Sets (as xml) the "b" element
     */
    public void xsetB(org.apache.xmlbeans.XmlDouble b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(B$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(B$2);
            }
            target.set(b);
        }
    }
    
    /**
     * Gets the "c" element
     */
    public double getC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(C$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "c" element
     */
    public org.apache.xmlbeans.XmlDouble xgetC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(C$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "c" element
     */
     public void setC(double c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(C$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(C$4);
            }
            target.setDoubleValue(c);
        }
    }
    
    /**
     * Sets (as xml) the "c" element
     */
    public void xsetC(org.apache.xmlbeans.XmlDouble c)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(C$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(C$4);
            }
            target.set(c);
        }
    }
    
    /**
     * Gets the "d" element
     */
    public double getD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(D$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "d" element
     */
    public org.apache.xmlbeans.XmlDouble xgetD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(D$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "d" element
     */
    public boolean isSetD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(D$6) != 0;
        }
    }
    
    /**
     * Sets the "d" element
     */
     public void setD(double d)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(D$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(D$6);
            }
            target.setDoubleValue(d);
        }
    }
    
    /**
     * Sets (as xml) the "d" element
     */
    public void xsetD(org.apache.xmlbeans.XmlDouble d)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(D$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(D$6);
            }
            target.set(d);
        }
    }
    
    /**
     * Unsets the "d" element
     */
    public void unsetD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(D$6, 0);
        }
    }
}
