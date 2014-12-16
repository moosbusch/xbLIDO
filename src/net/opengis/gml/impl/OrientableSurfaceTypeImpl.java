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
 * An XML OrientableSurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class OrientableSurfaceTypeImpl extends net.opengis.gml.impl.AbstractSurfaceTypeImpl implements net.opengis.gml.OrientableSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public OrientableSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASESURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "baseSurface");
    private static final javax.xml.namespace.QName ORIENTATION$2 = 
        new javax.xml.namespace.QName("", "orientation");
    
    
    /**
     * Gets the "baseSurface" element
     */
    public net.opengis.gml.SurfacePropertyType getBaseSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(BASESURFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseSurface" element
     */
     public void setBaseSurface(net.opengis.gml.SurfacePropertyType baseSurface)
    {
        generatedSetterHelperImpl(baseSurface, BASESURFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseSurface" element
     */
    public net.opengis.gml.SurfacePropertyType addNewBaseSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(BASESURFACE$0);
            return target;
        }
    }
    
    /**
     * Gets the "orientation" attribute
     */
    public net.opengis.gml.SignType.Enum getOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORIENTATION$2);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.SignType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "orientation" attribute
     */
    public net.opengis.gml.SignType xgetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SignType target = null;
            target = (net.opengis.gml.SignType)get_store().find_attribute_user(ORIENTATION$2);
            if (target == null)
            {
                target = (net.opengis.gml.SignType)get_default_attribute_value(ORIENTATION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "orientation" attribute
     */
    public boolean isSetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIENTATION$2) != null;
        }
    }
    
    /**
     * Sets the "orientation" attribute
     */
     public void setOrientation(net.opengis.gml.SignType.Enum orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATION$2);
            }
            target.setEnumValue(orientation);
        }
    }
    
    /**
     * Sets (as xml) the "orientation" attribute
     */
    public void xsetOrientation(net.opengis.gml.SignType orientation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SignType target = null;
            target = (net.opengis.gml.SignType)get_store().find_attribute_user(ORIENTATION$2);
            if (target == null)
            {
                target = (net.opengis.gml.SignType)get_store().add_attribute_user(ORIENTATION$2);
            }
            target.set(orientation);
        }
    }
    
    /**
     * Unsets the "orientation" attribute
     */
    public void unsetOrientation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIENTATION$2);
        }
    }
}
