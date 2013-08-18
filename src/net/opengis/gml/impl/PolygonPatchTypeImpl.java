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
 * An XML PolygonPatchType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PolygonPatchTypeImpl extends net.opengis.gml.impl.AbstractSurfacePatchTypeImpl implements net.opengis.gml.PolygonPatchType
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPatchTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "exterior");
    private static final org.apache.xmlbeans.QNameSet EXTERIOR$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "outerBoundaryIs"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "exterior"),
    });
    private static final javax.xml.namespace.QName INTERIOR$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "interior");
    private static final org.apache.xmlbeans.QNameSet INTERIOR$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "innerBoundaryIs"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "interior"),
    });
    private static final javax.xml.namespace.QName INTERPOLATION$4 = 
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
     * True if has "exterior" element
     */
    public boolean isSetExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERIOR$1) != 0;
        }
    }
    
    /**
     * Sets the "exterior" element
     */
    @Inject(optional=true) public void setExterior(net.opengis.gml.AbstractRingPropertyType exterior)
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
     * Unsets the "exterior" element
     */
    public void unsetExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERIOR$1, 0);
        }
    }
    
    /**
     * Gets a List of "interior" elements
     */
    public java.util.List<net.opengis.gml.AbstractRingPropertyType> getInteriorList()
    {
        final class InteriorList extends java.util.AbstractList<net.opengis.gml.AbstractRingPropertyType>
        {
            @Override
            public net.opengis.gml.AbstractRingPropertyType get(int i)
                { return PolygonPatchTypeImpl.this.getInteriorArray(i); }
            
            @Override
            public net.opengis.gml.AbstractRingPropertyType set(int i, net.opengis.gml.AbstractRingPropertyType o)
            {
                net.opengis.gml.AbstractRingPropertyType old = PolygonPatchTypeImpl.this.getInteriorArray(i);
                PolygonPatchTypeImpl.this.setInteriorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractRingPropertyType o)
                { PolygonPatchTypeImpl.this.insertNewInterior(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractRingPropertyType remove(int i)
            {
                net.opengis.gml.AbstractRingPropertyType old = PolygonPatchTypeImpl.this.getInteriorArray(i);
                PolygonPatchTypeImpl.this.removeInterior(i);
                return old;
            }
            
            @Override
            public int size()
                { return PolygonPatchTypeImpl.this.sizeOfInteriorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InteriorList();
        }
    }
    
    /**
     * Gets array of all "interior" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractRingPropertyType[] getInteriorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractRingPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractRingPropertyType>();
            get_store().find_all_element_users(INTERIOR$3, targetList);
            net.opengis.gml.AbstractRingPropertyType[] result = new net.opengis.gml.AbstractRingPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType getInteriorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "interior" element
     */
    public int sizeOfInteriorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERIOR$3);
        }
    }
    
    /**
     * Sets array of all "interior" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setInteriorArray(net.opengis.gml.AbstractRingPropertyType[] interiorArray)
    {
        check_orphaned();
        arraySetterHelper(interiorArray, INTERIOR$2, INTERIOR$3);
    }
    
    /**
     * Sets ith "interior" element
     */
    @Inject(optional=true) public void setInteriorArray(int i, net.opengis.gml.AbstractRingPropertyType interior)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().find_element_user(INTERIOR$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interior);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType insertNewInterior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().insert_element_user(INTERIOR$3, INTERIOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interior" element
     */
    public net.opengis.gml.AbstractRingPropertyType addNewInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractRingPropertyType target = null;
            target = (net.opengis.gml.AbstractRingPropertyType)get_store().add_element_user(INTERIOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "interior" element
     */
    public void removeInterior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERIOR$3, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$4);
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
            target = (net.opengis.gml.SurfaceInterpolationType)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (net.opengis.gml.SurfaceInterpolationType)get_default_attribute_value(INTERPOLATION$4);
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
            return get_store().find_attribute_user(INTERPOLATION$4) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
    @Inject(optional=true) public void setInterpolation(net.opengis.gml.SurfaceInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$4);
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
            target = (net.opengis.gml.SurfaceInterpolationType)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (net.opengis.gml.SurfaceInterpolationType)get_store().add_attribute_user(INTERPOLATION$4);
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
            get_store().remove_attribute(INTERPOLATION$4);
        }
    }
}
