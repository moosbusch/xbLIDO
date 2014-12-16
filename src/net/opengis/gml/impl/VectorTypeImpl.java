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
 * An XML VectorType(@http://www.opengis.net/gml).
 *
 * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
 */
public class VectorTypeImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements net.opengis.gml.VectorType
{
    private static final long serialVersionUID = 1L;
    
    public VectorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected VectorTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName SRSNAME$0 = 
        new javax.xml.namespace.QName("", "srsName");
    private static final javax.xml.namespace.QName SRSDIMENSION$2 = 
        new javax.xml.namespace.QName("", "srsDimension");
    private static final javax.xml.namespace.QName AXISLABELS$4 = 
        new javax.xml.namespace.QName("", "axisLabels");
    private static final javax.xml.namespace.QName UOMLABELS$6 = 
        new javax.xml.namespace.QName("", "uomLabels");
    
    
    /**
     * Gets the "srsName" attribute
     */
    public java.lang.String getSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "srsName" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "srsName" attribute
     */
    public boolean isSetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRSNAME$0) != null;
        }
    }
    
    /**
     * Sets the "srsName" attribute
     */
     public void setSrsName(java.lang.String srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSNAME$0);
            }
            target.setStringValue(srsName);
        }
    }
    
    /**
     * Sets (as xml) the "srsName" attribute
     */
    public void xsetSrsName(org.apache.xmlbeans.XmlAnyURI srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SRSNAME$0);
            }
            target.set(srsName);
        }
    }
    
    /**
     * Unsets the "srsName" attribute
     */
    public void unsetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRSNAME$0);
        }
    }
    
    /**
     * Gets the "srsDimension" attribute
     */
    public java.math.BigInteger getSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSDIMENSION$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "srsDimension" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SRSDIMENSION$2);
            return target;
        }
    }
    
    /**
     * True if has "srsDimension" attribute
     */
    public boolean isSetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRSDIMENSION$2) != null;
        }
    }
    
    /**
     * Sets the "srsDimension" attribute
     */
     public void setSrsDimension(java.math.BigInteger srsDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSDIMENSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSDIMENSION$2);
            }
            target.setBigIntegerValue(srsDimension);
        }
    }
    
    /**
     * Sets (as xml) the "srsDimension" attribute
     */
    public void xsetSrsDimension(org.apache.xmlbeans.XmlPositiveInteger srsDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SRSDIMENSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(SRSDIMENSION$2);
            }
            target.set(srsDimension);
        }
    }
    
    /**
     * Unsets the "srsDimension" attribute
     */
    public void unsetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRSDIMENSION$2);
        }
    }
    
    /**
     * Gets the "axisLabels" attribute
     */
    public java.util.List getAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXISLABELS$4);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "axisLabels" attribute
     */
    public net.opengis.gml.NCNameList xgetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NCNameList target = null;
            target = (net.opengis.gml.NCNameList)get_store().find_attribute_user(AXISLABELS$4);
            return target;
        }
    }
    
    /**
     * True if has "axisLabels" attribute
     */
    public boolean isSetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AXISLABELS$4) != null;
        }
    }
    
    /**
     * Sets the "axisLabels" attribute
     */
     public void setAxisLabels(java.util.List axisLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXISLABELS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXISLABELS$4);
            }
            target.setListValue(axisLabels);
        }
    }
    
    /**
     * Sets (as xml) the "axisLabels" attribute
     */
    public void xsetAxisLabels(net.opengis.gml.NCNameList axisLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NCNameList target = null;
            target = (net.opengis.gml.NCNameList)get_store().find_attribute_user(AXISLABELS$4);
            if (target == null)
            {
                target = (net.opengis.gml.NCNameList)get_store().add_attribute_user(AXISLABELS$4);
            }
            target.set(axisLabels);
        }
    }
    
    /**
     * Unsets the "axisLabels" attribute
     */
    public void unsetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AXISLABELS$4);
        }
    }
    
    /**
     * Gets the "uomLabels" attribute
     */
    public java.util.List getUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOMLABELS$6);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "uomLabels" attribute
     */
    public net.opengis.gml.NCNameList xgetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NCNameList target = null;
            target = (net.opengis.gml.NCNameList)get_store().find_attribute_user(UOMLABELS$6);
            return target;
        }
    }
    
    /**
     * True if has "uomLabels" attribute
     */
    public boolean isSetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UOMLABELS$6) != null;
        }
    }
    
    /**
     * Sets the "uomLabels" attribute
     */
     public void setUomLabels(java.util.List uomLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOMLABELS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOMLABELS$6);
            }
            target.setListValue(uomLabels);
        }
    }
    
    /**
     * Sets (as xml) the "uomLabels" attribute
     */
    public void xsetUomLabels(net.opengis.gml.NCNameList uomLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NCNameList target = null;
            target = (net.opengis.gml.NCNameList)get_store().find_attribute_user(UOMLABELS$6);
            if (target == null)
            {
                target = (net.opengis.gml.NCNameList)get_store().add_attribute_user(UOMLABELS$6);
            }
            target.set(uomLabels);
        }
    }
    
    /**
     * Unsets the "uomLabels" attribute
     */
    public void unsetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UOMLABELS$6);
        }
    }
}
