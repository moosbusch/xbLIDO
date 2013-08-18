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
 * An XML TopoVolumeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TopoVolumeTypeImpl extends net.opengis.gml.impl.AbstractTopologyTypeImpl implements net.opengis.gml.TopoVolumeType
{
    private static final long serialVersionUID = 1L;
    
    public TopoVolumeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDTOPOSOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedTopoSolid");
    
    
    /**
     * Gets a List of "directedTopoSolid" elements
     */
    public java.util.List<net.opengis.gml.DirectedTopoSolidPropertyType> getDirectedTopoSolidList()
    {
        final class DirectedTopoSolidList extends java.util.AbstractList<net.opengis.gml.DirectedTopoSolidPropertyType>
        {
            @Override
            public net.opengis.gml.DirectedTopoSolidPropertyType get(int i)
                { return TopoVolumeTypeImpl.this.getDirectedTopoSolidArray(i); }
            
            @Override
            public net.opengis.gml.DirectedTopoSolidPropertyType set(int i, net.opengis.gml.DirectedTopoSolidPropertyType o)
            {
                net.opengis.gml.DirectedTopoSolidPropertyType old = TopoVolumeTypeImpl.this.getDirectedTopoSolidArray(i);
                TopoVolumeTypeImpl.this.setDirectedTopoSolidArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectedTopoSolidPropertyType o)
                { TopoVolumeTypeImpl.this.insertNewDirectedTopoSolid(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectedTopoSolidPropertyType remove(int i)
            {
                net.opengis.gml.DirectedTopoSolidPropertyType old = TopoVolumeTypeImpl.this.getDirectedTopoSolidArray(i);
                TopoVolumeTypeImpl.this.removeDirectedTopoSolid(i);
                return old;
            }
            
            @Override
            public int size()
                { return TopoVolumeTypeImpl.this.sizeOfDirectedTopoSolidArray(); }
            
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
            get_store().find_all_element_users(DIRECTEDTOPOSOLID$0, targetList);
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
            target = (net.opengis.gml.DirectedTopoSolidPropertyType)get_store().find_element_user(DIRECTEDTOPOSOLID$0, i);
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
            return get_store().count_elements(DIRECTEDTOPOSOLID$0);
        }
    }
    
    /**
     * Sets array of all "directedTopoSolid" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDirectedTopoSolidArray(net.opengis.gml.DirectedTopoSolidPropertyType[] directedTopoSolidArray)
    {
        check_orphaned();
        arraySetterHelper(directedTopoSolidArray, DIRECTEDTOPOSOLID$0);
    }
    
    /**
     * Sets ith "directedTopoSolid" element
     */
    @Inject(optional=true) public void setDirectedTopoSolidArray(int i, net.opengis.gml.DirectedTopoSolidPropertyType directedTopoSolid)
    {
        generatedSetterHelperImpl(directedTopoSolid, DIRECTEDTOPOSOLID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (net.opengis.gml.DirectedTopoSolidPropertyType)get_store().insert_element_user(DIRECTEDTOPOSOLID$0, i);
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
            target = (net.opengis.gml.DirectedTopoSolidPropertyType)get_store().add_element_user(DIRECTEDTOPOSOLID$0);
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
            get_store().remove_element(DIRECTEDTOPOSOLID$0, i);
        }
    }
}
