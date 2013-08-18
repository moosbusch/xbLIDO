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
 * An XML TrackType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TrackTypeImpl extends net.opengis.gml.impl.HistoryPropertyTypeImpl implements net.opengis.gml.TrackType
{
    private static final long serialVersionUID = 1L;
    
    public TrackTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOVINGOBJECTSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MovingObjectStatus");
    
    
    /**
     * Gets a List of "MovingObjectStatus" elements
     */
    public java.util.List<net.opengis.gml.MovingObjectStatusType> getMovingObjectStatusList()
    {
        final class MovingObjectStatusList extends java.util.AbstractList<net.opengis.gml.MovingObjectStatusType>
        {
            @Override
            public net.opengis.gml.MovingObjectStatusType get(int i)
                { return TrackTypeImpl.this.getMovingObjectStatusArray(i); }
            
            @Override
            public net.opengis.gml.MovingObjectStatusType set(int i, net.opengis.gml.MovingObjectStatusType o)
            {
                net.opengis.gml.MovingObjectStatusType old = TrackTypeImpl.this.getMovingObjectStatusArray(i);
                TrackTypeImpl.this.setMovingObjectStatusArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.MovingObjectStatusType o)
                { TrackTypeImpl.this.insertNewMovingObjectStatus(i).set(o); }
            
            @Override
            public net.opengis.gml.MovingObjectStatusType remove(int i)
            {
                net.opengis.gml.MovingObjectStatusType old = TrackTypeImpl.this.getMovingObjectStatusArray(i);
                TrackTypeImpl.this.removeMovingObjectStatus(i);
                return old;
            }
            
            @Override
            public int size()
                { return TrackTypeImpl.this.sizeOfMovingObjectStatusArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MovingObjectStatusList();
        }
    }
    
    /**
     * Gets array of all "MovingObjectStatus" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.MovingObjectStatusType[] getMovingObjectStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.MovingObjectStatusType> targetList = new java.util.ArrayList<net.opengis.gml.MovingObjectStatusType>();
            get_store().find_all_element_users(MOVINGOBJECTSTATUS$0, targetList);
            net.opengis.gml.MovingObjectStatusType[] result = new net.opengis.gml.MovingObjectStatusType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MovingObjectStatus" element
     */
    public net.opengis.gml.MovingObjectStatusType getMovingObjectStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MovingObjectStatusType target = null;
            target = (net.opengis.gml.MovingObjectStatusType)get_store().find_element_user(MOVINGOBJECTSTATUS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MovingObjectStatus" element
     */
    public int sizeOfMovingObjectStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVINGOBJECTSTATUS$0);
        }
    }
    
    /**
     * Sets array of all "MovingObjectStatus" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMovingObjectStatusArray(net.opengis.gml.MovingObjectStatusType[] movingObjectStatusArray)
    {
        check_orphaned();
        arraySetterHelper(movingObjectStatusArray, MOVINGOBJECTSTATUS$0);
    }
    
    /**
     * Sets ith "MovingObjectStatus" element
     */
    @Inject(optional=true) public void setMovingObjectStatusArray(int i, net.opengis.gml.MovingObjectStatusType movingObjectStatus)
    {
        generatedSetterHelperImpl(movingObjectStatus, MOVINGOBJECTSTATUS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MovingObjectStatus" element
     */
    public net.opengis.gml.MovingObjectStatusType insertNewMovingObjectStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MovingObjectStatusType target = null;
            target = (net.opengis.gml.MovingObjectStatusType)get_store().insert_element_user(MOVINGOBJECTSTATUS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MovingObjectStatus" element
     */
    public net.opengis.gml.MovingObjectStatusType addNewMovingObjectStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MovingObjectStatusType target = null;
            target = (net.opengis.gml.MovingObjectStatusType)get_store().add_element_user(MOVINGOBJECTSTATUS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MovingObjectStatus" element
     */
    public void removeMovingObjectStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVINGOBJECTSTATUS$0, i);
        }
    }
}
