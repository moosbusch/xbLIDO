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
 * An XML AbstractFeatureType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractFeatureTypeImpl extends net.opengis.gml.impl.AbstractGMLTypeImpl implements net.opengis.gml.AbstractFeatureType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractFeatureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDEDBY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "boundedBy");
    private static final javax.xml.namespace.QName LOCATION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "location");
    private static final org.apache.xmlbeans.QNameSet LOCATION$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "priorityLocation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "location"),
    });
    
    
    /**
     * Gets the "boundedBy" element
     */
    public net.opengis.gml.BoundingShapeType getBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BoundingShapeType target = null;
            target = (net.opengis.gml.BoundingShapeType)get_store().find_element_user(BOUNDEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "boundedBy" element
     */
    public boolean isSetBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDEDBY$0) != 0;
        }
    }
    
    /**
     * Sets the "boundedBy" element
     */
     public void setBoundedBy(net.opengis.gml.BoundingShapeType boundedBy)
    {
        generatedSetterHelperImpl(boundedBy, BOUNDEDBY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "boundedBy" element
     */
    public net.opengis.gml.BoundingShapeType addNewBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BoundingShapeType target = null;
            target = (net.opengis.gml.BoundingShapeType)get_store().add_element_user(BOUNDEDBY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "boundedBy" element
     */
    public void unsetBoundedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDEDBY$0, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public net.opengis.gml.LocationPropertyType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().find_element_user(LOCATION$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$3) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
     public void setLocation(net.opengis.gml.LocationPropertyType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().find_element_user(LOCATION$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LocationPropertyType)get_store().add_element_user(LOCATION$2);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public net.opengis.gml.LocationPropertyType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LocationPropertyType target = null;
            target = (net.opengis.gml.LocationPropertyType)get_store().add_element_user(LOCATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$3, 0);
        }
    }
}
