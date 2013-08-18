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
 * An XML ClothoidType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ClothoidTypeImpl extends net.opengis.gml.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.ClothoidType
{
    private static final long serialVersionUID = 1L;
    
    public ClothoidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFLOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "refLocation");
    private static final javax.xml.namespace.QName SCALEFACTOR$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "scaleFactor");
    private static final javax.xml.namespace.QName STARTPARAMETER$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "startParameter");
    private static final javax.xml.namespace.QName ENDPARAMETER$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "endParameter");
    
    
    /**
     * Gets the "refLocation" element
     */
    public net.opengis.gml.ClothoidType.RefLocation getRefLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ClothoidType.RefLocation target = null;
            target = (net.opengis.gml.ClothoidType.RefLocation)get_store().find_element_user(REFLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refLocation" element
     */
    @Inject(optional=true) public void setRefLocation(net.opengis.gml.ClothoidType.RefLocation refLocation)
    {
        generatedSetterHelperImpl(refLocation, REFLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "refLocation" element
     */
    public net.opengis.gml.ClothoidType.RefLocation addNewRefLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ClothoidType.RefLocation target = null;
            target = (net.opengis.gml.ClothoidType.RefLocation)get_store().add_element_user(REFLOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "scaleFactor" element
     */
    public java.math.BigDecimal getScaleFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALEFACTOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "scaleFactor" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetScaleFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SCALEFACTOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scaleFactor" element
     */
    @Inject(optional=true) public void setScaleFactor(java.math.BigDecimal scaleFactor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCALEFACTOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCALEFACTOR$2);
            }
            target.setBigDecimalValue(scaleFactor);
        }
    }
    
    /**
     * Sets (as xml) the "scaleFactor" element
     */
    public void xsetScaleFactor(org.apache.xmlbeans.XmlDecimal scaleFactor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(SCALEFACTOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(SCALEFACTOR$2);
            }
            target.set(scaleFactor);
        }
    }
    
    /**
     * Gets the "startParameter" element
     */
    public double getStartParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPARAMETER$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "startParameter" element
     */
    public org.apache.xmlbeans.XmlDouble xgetStartParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(STARTPARAMETER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startParameter" element
     */
    @Inject(optional=true) public void setStartParameter(double startParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTPARAMETER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTPARAMETER$4);
            }
            target.setDoubleValue(startParameter);
        }
    }
    
    /**
     * Sets (as xml) the "startParameter" element
     */
    public void xsetStartParameter(org.apache.xmlbeans.XmlDouble startParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(STARTPARAMETER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(STARTPARAMETER$4);
            }
            target.set(startParameter);
        }
    }
    
    /**
     * Gets the "endParameter" element
     */
    public double getEndParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPARAMETER$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "endParameter" element
     */
    public org.apache.xmlbeans.XmlDouble xgetEndParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ENDPARAMETER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endParameter" element
     */
    @Inject(optional=true) public void setEndParameter(double endParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPARAMETER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPARAMETER$6);
            }
            target.setDoubleValue(endParameter);
        }
    }
    
    /**
     * Sets (as xml) the "endParameter" element
     */
    public void xsetEndParameter(org.apache.xmlbeans.XmlDouble endParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(ENDPARAMETER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(ENDPARAMETER$6);
            }
            target.set(endParameter);
        }
    }
    /**
     * An XML refLocation(@http://www.opengis.net/gml).
     *
     * This is a complex type.
     */
    public static class RefLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ClothoidType.RefLocation
    {
        private static final long serialVersionUID = 1L;
        
        public RefLocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AFFINEPLACEMENT$0 = 
            new javax.xml.namespace.QName("http://www.opengis.net/gml", "AffinePlacement");
        
        
        /**
         * Gets the "AffinePlacement" element
         */
        public net.opengis.gml.AffinePlacementType getAffinePlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.AffinePlacementType target = null;
                target = (net.opengis.gml.AffinePlacementType)get_store().find_element_user(AFFINEPLACEMENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AffinePlacement" element
         */
        @Inject(optional=true) public void setAffinePlacement(net.opengis.gml.AffinePlacementType affinePlacement)
        {
            generatedSetterHelperImpl(affinePlacement, AFFINEPLACEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "AffinePlacement" element
         */
        public net.opengis.gml.AffinePlacementType addNewAffinePlacement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.AffinePlacementType target = null;
                target = (net.opengis.gml.AffinePlacementType)get_store().add_element_user(AFFINEPLACEMENT$0);
                return target;
            }
        }
    }
}
