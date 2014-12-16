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
 * An XML GeocentricCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeocentricCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.GeocentricCRSType
{
    private static final long serialVersionUID = 1L;
    
    public GeocentricCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESCARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesCartesianCS");
    private static final javax.xml.namespace.QName USESSPHERICALCS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesSphericalCS");
    private static final javax.xml.namespace.QName USESGEODETICDATUM$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesGeodeticDatum");
    
    
    /**
     * Gets the "usesCartesianCS" element
     */
    public net.opengis.gml.CartesianCSRefType getUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSRefType target = null;
            target = (net.opengis.gml.CartesianCSRefType)get_store().find_element_user(USESCARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesCartesianCS" element
     */
    public boolean isSetUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESCARTESIANCS$0) != 0;
        }
    }
    
    /**
     * Sets the "usesCartesianCS" element
     */
     public void setUsesCartesianCS(net.opengis.gml.CartesianCSRefType usesCartesianCS)
    {
        generatedSetterHelperImpl(usesCartesianCS, USESCARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCartesianCS" element
     */
    public net.opengis.gml.CartesianCSRefType addNewUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSRefType target = null;
            target = (net.opengis.gml.CartesianCSRefType)get_store().add_element_user(USESCARTESIANCS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "usesCartesianCS" element
     */
    public void unsetUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESCARTESIANCS$0, 0);
        }
    }
    
    /**
     * Gets the "usesSphericalCS" element
     */
    public net.opengis.gml.SphericalCSRefType getUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphericalCSRefType target = null;
            target = (net.opengis.gml.SphericalCSRefType)get_store().find_element_user(USESSPHERICALCS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesSphericalCS" element
     */
    public boolean isSetUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESSPHERICALCS$2) != 0;
        }
    }
    
    /**
     * Sets the "usesSphericalCS" element
     */
     public void setUsesSphericalCS(net.opengis.gml.SphericalCSRefType usesSphericalCS)
    {
        generatedSetterHelperImpl(usesSphericalCS, USESSPHERICALCS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesSphericalCS" element
     */
    public net.opengis.gml.SphericalCSRefType addNewUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SphericalCSRefType target = null;
            target = (net.opengis.gml.SphericalCSRefType)get_store().add_element_user(USESSPHERICALCS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "usesSphericalCS" element
     */
    public void unsetUsesSphericalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESSPHERICALCS$2, 0);
        }
    }
    
    /**
     * Gets the "usesGeodeticDatum" element
     */
    public net.opengis.gml.GeodeticDatumRefType getUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().find_element_user(USESGEODETICDATUM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesGeodeticDatum" element
     */
     public void setUsesGeodeticDatum(net.opengis.gml.GeodeticDatumRefType usesGeodeticDatum)
    {
        generatedSetterHelperImpl(usesGeodeticDatum, USESGEODETICDATUM$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesGeodeticDatum" element
     */
    public net.opengis.gml.GeodeticDatumRefType addNewUsesGeodeticDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeodeticDatumRefType target = null;
            target = (net.opengis.gml.GeodeticDatumRefType)get_store().add_element_user(USESGEODETICDATUM$4);
            return target;
        }
    }
}
