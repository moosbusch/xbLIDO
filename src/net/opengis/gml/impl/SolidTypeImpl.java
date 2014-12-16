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
 * An XML SolidType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class SolidTypeImpl extends net.opengis.gml.impl.AbstractSolidTypeImpl implements net.opengis.gml.SolidType
{
    private static final long serialVersionUID = 1L;
    
    public SolidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERIOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "exterior");
    private static final javax.xml.namespace.QName INTERIOR$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "interior");
    
    
    /**
     * Gets the "exterior" element
     */
    public net.opengis.gml.SurfacePropertyType getExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(EXTERIOR$0, 0);
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
            return get_store().count_elements(EXTERIOR$0) != 0;
        }
    }
    
    /**
     * Sets the "exterior" element
     */
     public void setExterior(net.opengis.gml.SurfacePropertyType exterior)
    {
        generatedSetterHelperImpl(exterior, EXTERIOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exterior" element
     */
    public net.opengis.gml.SurfacePropertyType addNewExterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(EXTERIOR$0);
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
            get_store().remove_element(EXTERIOR$0, 0);
        }
    }
    
    /**
     * Gets a List of "interior" elements
     */
    public java.util.List<net.opengis.gml.SurfacePropertyType> getInteriorList()
    {
        final class InteriorList extends java.util.AbstractList<net.opengis.gml.SurfacePropertyType>
        {
            @Override
            public net.opengis.gml.SurfacePropertyType get(int i)
                { return SolidTypeImpl.this.getInteriorArray(i); }
            
            @Override
            public net.opengis.gml.SurfacePropertyType set(int i, net.opengis.gml.SurfacePropertyType o)
            {
                net.opengis.gml.SurfacePropertyType old = SolidTypeImpl.this.getInteriorArray(i);
                SolidTypeImpl.this.setInteriorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.SurfacePropertyType o)
                { SolidTypeImpl.this.insertNewInterior(i).set(o); }
            
            @Override
            public net.opengis.gml.SurfacePropertyType remove(int i)
            {
                net.opengis.gml.SurfacePropertyType old = SolidTypeImpl.this.getInteriorArray(i);
                SolidTypeImpl.this.removeInterior(i);
                return old;
            }
            
            @Override
            public int size()
                { return SolidTypeImpl.this.sizeOfInteriorArray(); }
            
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
    public net.opengis.gml.SurfacePropertyType[] getInteriorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.SurfacePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.SurfacePropertyType>();
            get_store().find_all_element_users(INTERIOR$2, targetList);
            net.opengis.gml.SurfacePropertyType[] result = new net.opengis.gml.SurfacePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interior" element
     */
    public net.opengis.gml.SurfacePropertyType getInteriorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(INTERIOR$2, i);
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
            return get_store().count_elements(INTERIOR$2);
        }
    }
    
    /**
     * Sets array of all "interior" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setInteriorArray(net.opengis.gml.SurfacePropertyType[] interiorArray)
    {
        check_orphaned();
        arraySetterHelper(interiorArray, INTERIOR$2);
    }
    
    /**
     * Sets ith "interior" element
     */
     public void setInteriorArray(int i, net.opengis.gml.SurfacePropertyType interior)
    {
        generatedSetterHelperImpl(interior, INTERIOR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interior" element
     */
    public net.opengis.gml.SurfacePropertyType insertNewInterior(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().insert_element_user(INTERIOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interior" element
     */
    public net.opengis.gml.SurfacePropertyType addNewInterior()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(INTERIOR$2);
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
            get_store().remove_element(INTERIOR$2, i);
        }
    }
}
