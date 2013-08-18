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
 * An XML NodeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class NodeTypeImpl extends net.opengis.gml.impl.AbstractTopoPrimitiveTypeImpl implements net.opengis.gml.NodeType
{
    private static final long serialVersionUID = 1L;
    
    public NodeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDEDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedEdge");
    private static final javax.xml.namespace.QName POINTPROPERTY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointProperty");
    
    
    /**
     * Gets a List of "directedEdge" elements
     */
    public java.util.List<net.opengis.gml.DirectedEdgePropertyType> getDirectedEdgeList()
    {
        final class DirectedEdgeList extends java.util.AbstractList<net.opengis.gml.DirectedEdgePropertyType>
        {
            @Override
            public net.opengis.gml.DirectedEdgePropertyType get(int i)
                { return NodeTypeImpl.this.getDirectedEdgeArray(i); }
            
            @Override
            public net.opengis.gml.DirectedEdgePropertyType set(int i, net.opengis.gml.DirectedEdgePropertyType o)
            {
                net.opengis.gml.DirectedEdgePropertyType old = NodeTypeImpl.this.getDirectedEdgeArray(i);
                NodeTypeImpl.this.setDirectedEdgeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectedEdgePropertyType o)
                { NodeTypeImpl.this.insertNewDirectedEdge(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectedEdgePropertyType remove(int i)
            {
                net.opengis.gml.DirectedEdgePropertyType old = NodeTypeImpl.this.getDirectedEdgeArray(i);
                NodeTypeImpl.this.removeDirectedEdge(i);
                return old;
            }
            
            @Override
            public int size()
                { return NodeTypeImpl.this.sizeOfDirectedEdgeArray(); }
            
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
     * Gets the "pointProperty" element
     */
    public net.opengis.gml.PointPropertyType getPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTPROPERTY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pointProperty" element
     */
    public boolean isSetPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTPROPERTY$2) != 0;
        }
    }
    
    /**
     * Sets the "pointProperty" element
     */
    @Inject(optional=true) public void setPointProperty(net.opengis.gml.PointPropertyType pointProperty)
    {
        generatedSetterHelperImpl(pointProperty, POINTPROPERTY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointProperty" element
     */
    public net.opengis.gml.PointPropertyType addNewPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTPROPERTY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pointProperty" element
     */
    public void unsetPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTPROPERTY$2, 0);
        }
    }
}
