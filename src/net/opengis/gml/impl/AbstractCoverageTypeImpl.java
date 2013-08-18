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
 * An XML AbstractCoverageType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractCoverageTypeImpl extends net.opengis.gml.impl.AbstractFeatureTypeImpl implements net.opengis.gml.AbstractCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINSET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "domainSet");
    private static final org.apache.xmlbeans.QNameSet DOMAINSET$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiPointDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiCurveDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSolidDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "domainSet"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSurfaceDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rectifiedGridDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "gridDomain"),
    });
    private static final javax.xml.namespace.QName RANGESET$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rangeSet");
    private static final javax.xml.namespace.QName DIMENSION$4 = 
        new javax.xml.namespace.QName("", "dimension");
    
    
    /**
     * Gets the "domainSet" element
     */
    public net.opengis.gml.DomainSetType getDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DomainSetType target = null;
            target = (net.opengis.gml.DomainSetType)get_store().find_element_user(DOMAINSET$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "domainSet" element
     */
    @Inject(optional=true) public void setDomainSet(net.opengis.gml.DomainSetType domainSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DomainSetType target = null;
            target = (net.opengis.gml.DomainSetType)get_store().find_element_user(DOMAINSET$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DomainSetType)get_store().add_element_user(DOMAINSET$0);
            }
            target.set(domainSet);
        }
    }
    
    /**
     * Appends and returns a new empty "domainSet" element
     */
    public net.opengis.gml.DomainSetType addNewDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DomainSetType target = null;
            target = (net.opengis.gml.DomainSetType)get_store().add_element_user(DOMAINSET$0);
            return target;
        }
    }
    
    /**
     * Gets the "rangeSet" element
     */
    public net.opengis.gml.RangeSetType getRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeSetType target = null;
            target = (net.opengis.gml.RangeSetType)get_store().find_element_user(RANGESET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeSet" element
     */
    @Inject(optional=true) public void setRangeSet(net.opengis.gml.RangeSetType rangeSet)
    {
        generatedSetterHelperImpl(rangeSet, RANGESET$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeSet" element
     */
    public net.opengis.gml.RangeSetType addNewRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeSetType target = null;
            target = (net.opengis.gml.RangeSetType)get_store().add_element_user(RANGESET$2);
            return target;
        }
    }
    
    /**
     * Gets the "dimension" attribute
     */
    public java.math.BigInteger getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimension" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DIMENSION$4);
            return target;
        }
    }
    
    /**
     * True if has "dimension" attribute
     */
    public boolean isSetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIMENSION$4) != null;
        }
    }
    
    /**
     * Sets the "dimension" attribute
     */
    @Inject(optional=true) public void setDimension(java.math.BigInteger dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSION$4);
            }
            target.setBigIntegerValue(dimension);
        }
    }
    
    /**
     * Sets (as xml) the "dimension" attribute
     */
    public void xsetDimension(org.apache.xmlbeans.XmlPositiveInteger dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DIMENSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(DIMENSION$4);
            }
            target.set(dimension);
        }
    }
    
    /**
     * Unsets the "dimension" attribute
     */
    public void unsetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIMENSION$4);
        }
    }
}
