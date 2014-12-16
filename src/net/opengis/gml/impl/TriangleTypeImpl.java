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
 * An XML TriangleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TriangleTypeImpl extends net.opengis.gml.impl.AbstractSurfacePatchTypeImpl implements net.opengis.gml.TriangleType
{
    private static final long serialVersionUID = 1L;
    
    public TriangleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "exterior");
    private static final org.apache.xmlbeans.QNameSet EXTERIOR$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "outerBoundaryIs"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "exterior"),
    });
    private static final javax.xml.namespace.QName INTERPOLATION$2 = 
        new javax.xml.namespace.QName("", "interpolation");
    
    
    /**
     * Gets the "exterior" element
     */
    public net.opengis.gml.AbstractRingPropertyType getExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exterior" element
     */
     public void setExterior(net.opengis.gml.AbstractRingPropertyType exterior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(EXTERIOR$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            }
            target.set(exterior);
        }
    }
    
    /**
     * Appends and returns a new empty "exterior" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(EXTERIOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "interpolation" attribute
     */
    public net.opengis.gml.SurfaceInterpolationType.Enum getInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.SurfaceInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "interpolation" attribute
     */
    public net.opengis.gml.SurfaceInterpolationType xgetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceInterpolationType target = null;
            target = (net.opengis.gml.SurfaceInterpolationType)get_store().find_attribute_user(INTERPOLATION$2);
            if (target == null)
            {
                target = (net.opengis.gml.SurfaceInterpolationType)get_default_attribute_value(INTERPOLATION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "interpolation" attribute
     */
    public boolean isSetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERPOLATION$2) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
     public void setInterpolation(net.opengis.gml.SurfaceInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$2);
            }
            target.setEnumValue(interpolation);
        }
    }
    
    /**
     * Sets (as xml) the "interpolation" attribute
     */
    public void xsetInterpolation(net.opengis.gml.SurfaceInterpolationType interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceInterpolationType target = null;
            target = (net.opengis.gml.SurfaceInterpolationType)get_store().find_attribute_user(INTERPOLATION$2);
            if (target == null)
            {
                target = (net.opengis.gml.SurfaceInterpolationType)get_store().add_attribute_user(INTERPOLATION$2);
            }
            target.set(interpolation);
        }
    }
    
    /**
     * Unsets the "interpolation" attribute
     */
    public void unsetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERPOLATION$2);
        }
    }
}
