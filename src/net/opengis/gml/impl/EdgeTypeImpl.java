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
 * An XML EdgeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class EdgeTypeImpl extends net.opengis.gml.impl.AbstractTopoPrimitiveTypeImpl implements net.opengis.gml.EdgeType
{
    private static final long serialVersionUID = 1L;
    
    public EdgeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDNODE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedNode");
    private static final javax.xml.namespace.QName DIRECTEDFACE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedFace");
    private static final javax.xml.namespace.QName CURVEPROPERTY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveProperty");
    
    
    /**
     * Gets a List of "directedNode" elements
     */
    public java.util.List<net.opengis.gml.DirectedNodePropertyType> getDirectedNodeList()
    {
        final class DirectedNodeList extends java.util.AbstractList<net.opengis.gml.DirectedNodePropertyType>
        {
            @Override
            public net.opengis.gml.DirectedNodePropertyType get(int i)
                { return EdgeTypeImpl.this.getDirectedNodeArray(i); }
            
            @Override
            public net.opengis.gml.DirectedNodePropertyType set(int i, net.opengis.gml.DirectedNodePropertyType o)
            {
                net.opengis.gml.DirectedNodePropertyType old = EdgeTypeImpl.this.getDirectedNodeArray(i);
                EdgeTypeImpl.this.setDirectedNodeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectedNodePropertyType o)
                { EdgeTypeImpl.this.insertNewDirectedNode(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectedNodePropertyType remove(int i)
            {
                net.opengis.gml.DirectedNodePropertyType old = EdgeTypeImpl.this.getDirectedNodeArray(i);
                EdgeTypeImpl.this.removeDirectedNode(i);
                return old;
            }
            
            @Override
            public int size()
                { return EdgeTypeImpl.this.sizeOfDirectedNodeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DirectedNodeList();
        }
    }
    
    /**
     * Gets array of all "directedNode" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.DirectedNodePropertyType[] getDirectedNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.DirectedNodePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.DirectedNodePropertyType>();
            get_store().find_all_element_users(DIRECTEDNODE$0, targetList);
            net.opengis.gml.DirectedNodePropertyType[] result = new net.opengis.gml.DirectedNodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedNode" element
     */
    public net.opengis.gml.DirectedNodePropertyType getDirectedNodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.DirectedNodePropertyType)get_store().find_element_user(DIRECTEDNODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedNode" element
     */
    public int sizeOfDirectedNodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDNODE$0);
        }
    }
    
    /**
     * Sets array of all "directedNode" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDirectedNodeArray(net.opengis.gml.DirectedNodePropertyType[] directedNodeArray)
    {
        check_orphaned();
        arraySetterHelper(directedNodeArray, DIRECTEDNODE$0);
    }
    
    /**
     * Sets ith "directedNode" element
     */
    @Inject(optional=true) public void setDirectedNodeArray(int i, net.opengis.gml.DirectedNodePropertyType directedNode)
    {
        generatedSetterHelperImpl(directedNode, DIRECTEDNODE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedNode" element
     */
    public net.opengis.gml.DirectedNodePropertyType insertNewDirectedNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.DirectedNodePropertyType)get_store().insert_element_user(DIRECTEDNODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedNode" element
     */
    public net.opengis.gml.DirectedNodePropertyType addNewDirectedNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.DirectedNodePropertyType)get_store().add_element_user(DIRECTEDNODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedNode" element
     */
    public void removeDirectedNode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDNODE$0, i);
        }
    }
    
    /**
     * Gets a List of "directedFace" elements
     */
    public java.util.List<net.opengis.gml.DirectedFacePropertyType> getDirectedFaceList()
    {
        final class DirectedFaceList extends java.util.AbstractList<net.opengis.gml.DirectedFacePropertyType>
        {
            @Override
            public net.opengis.gml.DirectedFacePropertyType get(int i)
                { return EdgeTypeImpl.this.getDirectedFaceArray(i); }
            
            @Override
            public net.opengis.gml.DirectedFacePropertyType set(int i, net.opengis.gml.DirectedFacePropertyType o)
            {
                net.opengis.gml.DirectedFacePropertyType old = EdgeTypeImpl.this.getDirectedFaceArray(i);
                EdgeTypeImpl.this.setDirectedFaceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DirectedFacePropertyType o)
                { EdgeTypeImpl.this.insertNewDirectedFace(i).set(o); }
            
            @Override
            public net.opengis.gml.DirectedFacePropertyType remove(int i)
            {
                net.opengis.gml.DirectedFacePropertyType old = EdgeTypeImpl.this.getDirectedFaceArray(i);
                EdgeTypeImpl.this.removeDirectedFace(i);
                return old;
            }
            
            @Override
            public int size()
                { return EdgeTypeImpl.this.sizeOfDirectedFaceArray(); }
            
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
            get_store().find_all_element_users(DIRECTEDFACE$2, targetList);
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
            target = (net.opengis.gml.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$2, i);
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
            return get_store().count_elements(DIRECTEDFACE$2);
        }
    }
    
    /**
     * Sets array of all "directedFace" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDirectedFaceArray(net.opengis.gml.DirectedFacePropertyType[] directedFaceArray)
    {
        check_orphaned();
        arraySetterHelper(directedFaceArray, DIRECTEDFACE$2);
    }
    
    /**
     * Sets ith "directedFace" element
     */
    @Inject(optional=true) public void setDirectedFaceArray(int i, net.opengis.gml.DirectedFacePropertyType directedFace)
    {
        generatedSetterHelperImpl(directedFace, DIRECTEDFACE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (net.opengis.gml.DirectedFacePropertyType)get_store().insert_element_user(DIRECTEDFACE$2, i);
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
            target = (net.opengis.gml.DirectedFacePropertyType)get_store().add_element_user(DIRECTEDFACE$2);
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
            get_store().remove_element(DIRECTEDFACE$2, i);
        }
    }
    
    /**
     * Gets the "curveProperty" element
     */
    public net.opengis.gml.CurvePropertyType getCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(CURVEPROPERTY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "curveProperty" element
     */
    public boolean isSetCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVEPROPERTY$4) != 0;
        }
    }
    
    /**
     * Sets the "curveProperty" element
     */
    @Inject(optional=true) public void setCurveProperty(net.opengis.gml.CurvePropertyType curveProperty)
    {
        generatedSetterHelperImpl(curveProperty, CURVEPROPERTY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveProperty" element
     */
    public net.opengis.gml.CurvePropertyType addNewCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(CURVEPROPERTY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "curveProperty" element
     */
    public void unsetCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVEPROPERTY$4, 0);
        }
    }
}
