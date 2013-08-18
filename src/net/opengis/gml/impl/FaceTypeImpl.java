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
 * An XML FaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class FaceTypeImpl extends net.opengis.gml.impl.AbstractTopoPrimitiveTypeImpl implements net.opengis.gml.FaceType
{
    private static final long serialVersionUID = 1L;
    
    public FaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDEDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedEdge");
    private static final javax.xml.namespace.QName DIRECTEDTOPOSOLID$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedTopoSolid");
    private static final javax.xml.namespace.QName SURFACEPROPERTY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "surfaceProperty");
    
    
    /**
     * Gets a List of "directedEdge" elements
     */
    public java.util.List<net.opengis.gml.DirectedEdgePropertyType> getDirectedEdgeList()
    {
        final class DirectedEdgeList extends java.util.AbstractList<net.opengis.gml.DirectedEdgePropertyType>
        {
            @Override
            public net.opengis.gml.DirectedEdgePropertyType get(int i)
                { return FaceTypeImpl.this.getDirectedEdgeArray(i); }
            
            @Override
            public net.opengis.gml.DirectedEdgePropertyType set(int i, net.opengis.gml.DirectedEdgePropertyType o)
            {
                net.opengis.gml.DirectedEdgePropertyType old = FaceTypeImpl.this.getDirectedEdgeArray(i);
                FaceTypeImpl.this.setDirectedEdgeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectedEdgePropertyType o)
                { FaceTypeImpl.this.insertNewDirectedEdge(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectedEdgePropertyType remove(int i)
            {
                net.opengis.gml.DirectedEdgePropertyType old = FaceTypeImpl.this.getDirectedEdgeArray(i);
                FaceTypeImpl.this.removeDirectedEdge(i);
                return old;
            }
            
            @Override
            public int size()
                { return FaceTypeImpl.this.sizeOfDirectedEdgeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DirectedEdgeList();
        }
    }
    
    /**
     * Gets array of all "directedEdge" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.DirectedEdgePropertyType[] getDirectedEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.DirectedEdgePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.DirectedEdgePropertyType>();
            get_store().find_all_element_users(DIRECTEDEDGE$0, targetList);
            net.opengis.gml.DirectedEdgePropertyType[] result = new net.opengis.gml.DirectedEdgePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedEdge" element
     */
    public net.opengis.gml.DirectedEdgePropertyType getDirectedEdgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.DirectedEdgePropertyType)get_store().find_element_user(DIRECTEDEDGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedEdge" element
     */
    public int sizeOfDirectedEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDEDGE$0);
        }
    }
    
    /**
     * Sets array of all "directedEdge" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDirectedEdgeArray(net.opengis.gml.DirectedEdgePropertyType[] directedEdgeArray)
    {
        check_orphaned();
        arraySetterHelper(directedEdgeArray, DIRECTEDEDGE$0);
    }
    
    /**
     * Sets ith "directedEdge" element
     */
    @Inject(optional=true) public void setDirectedEdgeArray(int i, net.opengis.gml.DirectedEdgePropertyType directedEdge)
    {
        generatedSetterHelperImpl(directedEdge, DIRECTEDEDGE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedEdge" element
     */
    public net.opengis.gml.DirectedEdgePropertyType insertNewDirectedEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.DirectedEdgePropertyType)get_store().insert_element_user(DIRECTEDEDGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedEdge" element
     */
    public net.opengis.gml.DirectedEdgePropertyType addNewDirectedEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.DirectedEdgePropertyType)get_store().add_element_user(DIRECTEDEDGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedEdge" element
     */
    public void removeDirectedEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDEDGE$0, i);
        }
    }
    
    /**
     * Gets a List of "directedTopoSolid" elements
     */
    public java.util.List<net.opengis.gml.DirectedTopoSolidPropertyType> getDirectedTopoSolidList()
    {
        final class DirectedTopoSolidList extends java.util.AbstractList<net.opengis.gml.DirectedTopoSolidPropertyType>
        {
            @Override
            public net.opengis.gml.DirectedTopoSolidPropertyType get(int i)
                { return FaceTypeImpl.this.getDirectedTopoSolidArray(i); }
            
            @Override
            public net.opengis.gml.DirectedTopoSolidPropertyType set(int i, net.opengis.gml.DirectedTopoSolidPropertyType o)
            {
                net.opengis.gml.DirectedTopoSolidPropertyType old = FaceTypeImpl.this.getDirectedTopoSolidArray(i);
                FaceTypeImpl.this.setDirectedTopoSolidArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectedTopoSolidPropertyType o)
                { FaceTypeImpl.this.insertNewDirectedTopoSolid(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectedTopoSolidPropertyType remove(int i)
            {
                net.opengis.gml.DirectedTopoSolidPropertyType old = FaceTypeImpl.this.getDirectedTopoSolidArray(i);
                FaceTypeImpl.this.removeDirectedTopoSolid(i);
                return old;
            }
            
            @Override
            public int size()
                { return FaceTypeImpl.this.sizeOfDirectedTopoSolidArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DirectedTopoSolidList();
        }
    }
    
    /**
     * Gets array of all "directedTopoSolid" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.DirectedTopoSolidPropertyType[] getDirectedTopoSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.DirectedTopoSolidPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.DirectedTopoSolidPropertyType>();
            get_store().find_all_element_users(DIRECTEDTOPOSOLID$2, targetList);
            net.opengis.gml.DirectedTopoSolidPropertyType[] result = new net.opengis.gml.DirectedTopoSolidPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedTopoSolid" element
     */
    public net.opengis.gml.DirectedTopoSolidPropertyType getDirectedTopoSolidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.DirectedTopoSolidPropertyType)get_store().find_element_user(DIRECTEDTOPOSOLID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedTopoSolid" element
     */
    public int sizeOfDirectedTopoSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDTOPOSOLID$2);
        }
    }
    
    /**
     * Sets array of all "directedTopoSolid" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDirectedTopoSolidArray(net.opengis.gml.DirectedTopoSolidPropertyType[] directedTopoSolidArray)
    {
        check_orphaned();
        arraySetterHelper(directedTopoSolidArray, DIRECTEDTOPOSOLID$2);
    }
    
    /**
     * Sets ith "directedTopoSolid" element
     */
    @Inject(optional=true) public void setDirectedTopoSolidArray(int i, net.opengis.gml.DirectedTopoSolidPropertyType directedTopoSolid)
    {
        generatedSetterHelperImpl(directedTopoSolid, DIRECTEDTOPOSOLID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedTopoSolid" element
     */
    public net.opengis.gml.DirectedTopoSolidPropertyType insertNewDirectedTopoSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.DirectedTopoSolidPropertyType)get_store().insert_element_user(DIRECTEDTOPOSOLID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedTopoSolid" element
     */
    public net.opengis.gml.DirectedTopoSolidPropertyType addNewDirectedTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.DirectedTopoSolidPropertyType)get_store().add_element_user(DIRECTEDTOPOSOLID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedTopoSolid" element
     */
    public void removeDirectedTopoSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDTOPOSOLID$2, i);
        }
    }
    
    /**
     * Gets the "surfaceProperty" element
     */
    public net.opengis.gml.SurfacePropertyType getSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(SURFACEPROPERTY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "surfaceProperty" element
     */
    public boolean isSetSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACEPROPERTY$4) != 0;
        }
    }
    
    /**
     * Sets the "surfaceProperty" element
     */
    @Inject(optional=true) public void setSurfaceProperty(net.opengis.gml.SurfacePropertyType surfaceProperty)
    {
        generatedSetterHelperImpl(surfaceProperty, SURFACEPROPERTY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceProperty" element
     */
    public net.opengis.gml.SurfacePropertyType addNewSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(SURFACEPROPERTY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "surfaceProperty" element
     */
    public void unsetSurfaceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACEPROPERTY$4, 0);
        }
    }
}
