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
 * An XML TopoSurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TopoSurfaceTypeImpl extends net.opengis.gml.impl.AbstractTopologyTypeImpl implements net.opengis.gml.TopoSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public TopoSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedFace");
    
    
    /**
     * Gets a List of "directedFace" elements
     */
    public java.util.List<net.opengis.gml.DirectedFacePropertyType> getDirectedFaceList()
    {
        final class DirectedFaceList extends java.util.AbstractList<net.opengis.gml.DirectedFacePropertyType>
        {
            @Override
            public net.opengis.gml.DirectedFacePropertyType get(int i)
                { return TopoSurfaceTypeImpl.this.getDirectedFaceArray(i); }
            
            @Override
            public net.opengis.gml.DirectedFacePropertyType set(int i, net.opengis.gml.DirectedFacePropertyType o)
            {
                net.opengis.gml.DirectedFacePropertyType old = TopoSurfaceTypeImpl.this.getDirectedFaceArray(i);
                TopoSurfaceTypeImpl.this.setDirectedFaceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectedFacePropertyType o)
                { TopoSurfaceTypeImpl.this.insertNewDirectedFace(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectedFacePropertyType remove(int i)
            {
                net.opengis.gml.DirectedFacePropertyType old = TopoSurfaceTypeImpl.this.getDirectedFaceArray(i);
                TopoSurfaceTypeImpl.this.removeDirectedFace(i);
                return old;
            }
            
            @Override
            public int size()
                { return TopoSurfaceTypeImpl.this.sizeOfDirectedFaceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DirectedFaceList();
        }
    }
    
    /**
     * Gets array of all "directedFace" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.DirectedFacePropertyType[] getDirectedFaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.DirectedFacePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.DirectedFacePropertyType>();
            get_store().find_all_element_users(DIRECTEDFACE$0, targetList);
            net.opengis.gml.DirectedFacePropertyType[] result = new net.opengis.gml.DirectedFacePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedFace" element
     */
    public net.opengis.gml.DirectedFacePropertyType getDirectedFaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedFace" element
     */
    public int sizeOfDirectedFaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDFACE$0);
        }
    }
    
    /**
     * Sets array of all "directedFace" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setDirectedFaceArray(net.opengis.gml.DirectedFacePropertyType[] directedFaceArray)
    {
        check_orphaned();
        arraySetterHelper(directedFaceArray, DIRECTEDFACE$0);
    }
    
    /**
     * Sets ith "directedFace" element
     */
     public void setDirectedFaceArray(int i, net.opengis.gml.DirectedFacePropertyType directedFace)
    {
        generatedSetterHelperImpl(directedFace, DIRECTEDFACE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedFace" element
     */
    public net.opengis.gml.DirectedFacePropertyType insertNewDirectedFace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.DirectedFacePropertyType)get_store().insert_element_user(DIRECTEDFACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedFace" element
     */
    public net.opengis.gml.DirectedFacePropertyType addNewDirectedFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.DirectedFacePropertyType)get_store().add_element_user(DIRECTEDFACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedFace" element
     */
    public void removeDirectedFace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDFACE$0, i);
        }
    }
}
