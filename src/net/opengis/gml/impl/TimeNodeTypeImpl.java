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
 * An XML TimeNodeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TimeNodeTypeImpl extends net.opengis.gml.impl.AbstractTimeTopologyPrimitiveTypeImpl implements net.opengis.gml.TimeNodeType
{
    private static final long serialVersionUID = 1L;
    
    public TimeNodeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREVIOUSEDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "previousEdge");
    private static final javax.xml.namespace.QName NEXTEDGE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "nextEdge");
    private static final javax.xml.namespace.QName POSITION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "position");
    
    
    /**
     * Gets a List of "previousEdge" elements
     */
    public java.util.List<net.opengis.gml.TimeEdgePropertyType> getPreviousEdgeList()
    {
        final class PreviousEdgeList extends java.util.AbstractList<net.opengis.gml.TimeEdgePropertyType>
        {
            @Override
            public net.opengis.gml.TimeEdgePropertyType get(int i)
                { return TimeNodeTypeImpl.this.getPreviousEdgeArray(i); }
            
            @Override
            public net.opengis.gml.TimeEdgePropertyType set(int i, net.opengis.gml.TimeEdgePropertyType o)
            {
                net.opengis.gml.TimeEdgePropertyType old = TimeNodeTypeImpl.this.getPreviousEdgeArray(i);
                TimeNodeTypeImpl.this.setPreviousEdgeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TimeEdgePropertyType o)
                { TimeNodeTypeImpl.this.insertNewPreviousEdge(i).set(o); }
            
            @Override
            public net.opengis.gml.TimeEdgePropertyType remove(int i)
            {
                net.opengis.gml.TimeEdgePropertyType old = TimeNodeTypeImpl.this.getPreviousEdgeArray(i);
                TimeNodeTypeImpl.this.removePreviousEdge(i);
                return old;
            }
            
            @Override
            public int size()
                { return TimeNodeTypeImpl.this.sizeOfPreviousEdgeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PreviousEdgeList();
        }
    }
    
    /**
     * Gets array of all "previousEdge" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimeEdgePropertyType[] getPreviousEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimeEdgePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.TimeEdgePropertyType>();
            get_store().find_all_element_users(PREVIOUSEDGE$0, targetList);
            net.opengis.gml.TimeEdgePropertyType[] result = new net.opengis.gml.TimeEdgePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "previousEdge" element
     */
    public net.opengis.gml.TimeEdgePropertyType getPreviousEdgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.TimeEdgePropertyType)get_store().find_element_user(PREVIOUSEDGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "previousEdge" element
     */
    public int sizeOfPreviousEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUSEDGE$0);
        }
    }
    
    /**
     * Sets array of all "previousEdge" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPreviousEdgeArray(net.opengis.gml.TimeEdgePropertyType[] previousEdgeArray)
    {
        check_orphaned();
        arraySetterHelper(previousEdgeArray, PREVIOUSEDGE$0);
    }
    
    /**
     * Sets ith "previousEdge" element
     */
    @Inject(optional=true) public void setPreviousEdgeArray(int i, net.opengis.gml.TimeEdgePropertyType previousEdge)
    {
        generatedSetterHelperImpl(previousEdge, PREVIOUSEDGE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "previousEdge" element
     */
    public net.opengis.gml.TimeEdgePropertyType insertNewPreviousEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.TimeEdgePropertyType)get_store().insert_element_user(PREVIOUSEDGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "previousEdge" element
     */
    public net.opengis.gml.TimeEdgePropertyType addNewPreviousEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.TimeEdgePropertyType)get_store().add_element_user(PREVIOUSEDGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "previousEdge" element
     */
    public void removePreviousEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUSEDGE$0, i);
        }
    }
    
    /**
     * Gets a List of "nextEdge" elements
     */
    public java.util.List<net.opengis.gml.TimeEdgePropertyType> getNextEdgeList()
    {
        final class NextEdgeList extends java.util.AbstractList<net.opengis.gml.TimeEdgePropertyType>
        {
            @Override
            public net.opengis.gml.TimeEdgePropertyType get(int i)
                { return TimeNodeTypeImpl.this.getNextEdgeArray(i); }
            
            @Override
            public net.opengis.gml.TimeEdgePropertyType set(int i, net.opengis.gml.TimeEdgePropertyType o)
            {
                net.opengis.gml.TimeEdgePropertyType old = TimeNodeTypeImpl.this.getNextEdgeArray(i);
                TimeNodeTypeImpl.this.setNextEdgeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.TimeEdgePropertyType o)
                { TimeNodeTypeImpl.this.insertNewNextEdge(i).set(o); }
            
            @Override
            public net.opengis.gml.TimeEdgePropertyType remove(int i)
            {
                net.opengis.gml.TimeEdgePropertyType old = TimeNodeTypeImpl.this.getNextEdgeArray(i);
                TimeNodeTypeImpl.this.removeNextEdge(i);
                return old;
            }
            
            @Override
            public int size()
                { return TimeNodeTypeImpl.this.sizeOfNextEdgeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NextEdgeList();
        }
    }
    
    /**
     * Gets array of all "nextEdge" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.TimeEdgePropertyType[] getNextEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.TimeEdgePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.TimeEdgePropertyType>();
            get_store().find_all_element_users(NEXTEDGE$2, targetList);
            net.opengis.gml.TimeEdgePropertyType[] result = new net.opengis.gml.TimeEdgePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nextEdge" element
     */
    public net.opengis.gml.TimeEdgePropertyType getNextEdgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.TimeEdgePropertyType)get_store().find_element_user(NEXTEDGE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nextEdge" element
     */
    public int sizeOfNextEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXTEDGE$2);
        }
    }
    
    /**
     * Sets array of all "nextEdge" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNextEdgeArray(net.opengis.gml.TimeEdgePropertyType[] nextEdgeArray)
    {
        check_orphaned();
        arraySetterHelper(nextEdgeArray, NEXTEDGE$2);
    }
    
    /**
     * Sets ith "nextEdge" element
     */
    @Inject(optional=true) public void setNextEdgeArray(int i, net.opengis.gml.TimeEdgePropertyType nextEdge)
    {
        generatedSetterHelperImpl(nextEdge, NEXTEDGE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nextEdge" element
     */
    public net.opengis.gml.TimeEdgePropertyType insertNewNextEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.TimeEdgePropertyType)get_store().insert_element_user(NEXTEDGE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nextEdge" element
     */
    public net.opengis.gml.TimeEdgePropertyType addNewNextEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeEdgePropertyType target = null;
            target = (net.opengis.gml.TimeEdgePropertyType)get_store().add_element_user(NEXTEDGE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "nextEdge" element
     */
    public void removeNextEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXTEDGE$2, i);
        }
    }
    
    /**
     * Gets the "position" element
     */
    public net.opengis.gml.TimeInstantPropertyType getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.TimeInstantPropertyType)get_store().find_element_user(POSITION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$4) != 0;
        }
    }
    
    /**
     * Sets the "position" element
     */
    @Inject(optional=true) public void setPosition(net.opengis.gml.TimeInstantPropertyType position)
    {
        generatedSetterHelperImpl(position, POSITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "position" element
     */
    public net.opengis.gml.TimeInstantPropertyType addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeInstantPropertyType target = null;
            target = (net.opengis.gml.TimeInstantPropertyType)get_store().add_element_user(POSITION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$4, 0);
        }
    }
}
