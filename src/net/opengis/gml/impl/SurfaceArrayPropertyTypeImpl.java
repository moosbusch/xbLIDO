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
 * An XML SurfaceArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class SurfaceArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SurfaceArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public SurfaceArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface");
    private static final org.apache.xmlbeans.QNameSet SURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSurface"),
    });
    
    
    /**
     * Gets a List of "_Surface" elements
     */
    public java.util.List<net.opengis.gml.AbstractSurfaceType> getSurfaceList()
    {
        final class SurfaceList extends java.util.AbstractList<net.opengis.gml.AbstractSurfaceType>
        {
            @Override
            public net.opengis.gml.AbstractSurfaceType get(int i)
                { return SurfaceArrayPropertyTypeImpl.this.getSurfaceArray(i); }
            
            @Override
            public net.opengis.gml.AbstractSurfaceType set(int i, net.opengis.gml.AbstractSurfaceType o)
            {
                net.opengis.gml.AbstractSurfaceType old = SurfaceArrayPropertyTypeImpl.this.getSurfaceArray(i);
                SurfaceArrayPropertyTypeImpl.this.setSurfaceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractSurfaceType o)
                { SurfaceArrayPropertyTypeImpl.this.insertNewSurface(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractSurfaceType remove(int i)
            {
                net.opengis.gml.AbstractSurfaceType old = SurfaceArrayPropertyTypeImpl.this.getSurfaceArray(i);
                SurfaceArrayPropertyTypeImpl.this.removeSurface(i);
                return old;
            }
            
            @Override
            public int size()
                { return SurfaceArrayPropertyTypeImpl.this.sizeOfSurfaceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SurfaceList();
        }
    }
    
    /**
     * Gets array of all "_Surface" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractSurfaceType[] getSurfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractSurfaceType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractSurfaceType>();
            get_store().find_all_element_users(SURFACE$1, targetList);
            net.opengis.gml.AbstractSurfaceType[] result = new net.opengis.gml.AbstractSurfaceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Surface" element
     */
    public net.opengis.gml.AbstractSurfaceType getSurfaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().find_element_user(SURFACE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Surface" element
     */
    public int sizeOfSurfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACE$1);
        }
    }
    
    /**
     * Sets array of all "_Surface" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSurfaceArray(net.opengis.gml.AbstractSurfaceType[] surfaceArray)
    {
        check_orphaned();
        arraySetterHelper(surfaceArray, SURFACE$0, SURFACE$1);
    }
    
    /**
     * Sets ith "_Surface" element
     */
    @Inject(optional=true) public void setSurfaceArray(int i, net.opengis.gml.AbstractSurfaceType surface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().find_element_user(SURFACE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(surface);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Surface" element
     */
    public net.opengis.gml.AbstractSurfaceType insertNewSurface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().insert_element_user(SURFACE$1, SURFACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Surface" element
     */
    public net.opengis.gml.AbstractSurfaceType addNewSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractSurfaceType target = null;
            target = (net.opengis.gml.AbstractSurfaceType)get_store().add_element_user(SURFACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_Surface" element
     */
    public void removeSurface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACE$1, i);
        }
    }
}
