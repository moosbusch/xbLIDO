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
 * An XML RingType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class RingTypeImpl extends net.opengis.gml.impl.AbstractRingTypeImpl implements net.opengis.gml.RingType
{
    private static final long serialVersionUID = 1L;
    
    public RingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveMember");
    
    
    /**
     * Gets a List of "curveMember" elements
     */
    public java.util.List<net.opengis.gml.CurvePropertyType> getCurveMemberList()
    {
        final class CurveMemberList extends java.util.AbstractList<net.opengis.gml.CurvePropertyType>
        {
            @Override
            public net.opengis.gml.CurvePropertyType get(int i)
                { return RingTypeImpl.this.getCurveMemberArray(i); }
            
            @Override
            public net.opengis.gml.CurvePropertyType set(int i, net.opengis.gml.CurvePropertyType o)
            {
                net.opengis.gml.CurvePropertyType old = RingTypeImpl.this.getCurveMemberArray(i);
                RingTypeImpl.this.setCurveMemberArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CurvePropertyType o)
                { RingTypeImpl.this.insertNewCurveMember(i).set(o); }
            
            @Override
            public net.opengis.gml.CurvePropertyType remove(int i)
            {
                net.opengis.gml.CurvePropertyType old = RingTypeImpl.this.getCurveMemberArray(i);
                RingTypeImpl.this.removeCurveMember(i);
                return old;
            }
            
            @Override
            public int size()
                { return RingTypeImpl.this.sizeOfCurveMemberArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CurveMemberList();
        }
    }
    
    /**
     * Gets array of all "curveMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CurvePropertyType[] getCurveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CurvePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.CurvePropertyType>();
            get_store().find_all_element_users(CURVEMEMBER$0, targetList);
            net.opengis.gml.CurvePropertyType[] result = new net.opengis.gml.CurvePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "curveMember" element
     */
    public net.opengis.gml.CurvePropertyType getCurveMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().find_element_user(CURVEMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "curveMember" element
     */
    public int sizeOfCurveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVEMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "curveMember" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCurveMemberArray(net.opengis.gml.CurvePropertyType[] curveMemberArray)
    {
        check_orphaned();
        arraySetterHelper(curveMemberArray, CURVEMEMBER$0);
    }
    
    /**
     * Sets ith "curveMember" element
     */
    @Inject(optional=true) public void setCurveMemberArray(int i, net.opengis.gml.CurvePropertyType curveMember)
    {
        generatedSetterHelperImpl(curveMember, CURVEMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "curveMember" element
     */
    public net.opengis.gml.CurvePropertyType insertNewCurveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().insert_element_user(CURVEMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "curveMember" element
     */
    public net.opengis.gml.CurvePropertyType addNewCurveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurvePropertyType target = null;
            target = (net.opengis.gml.CurvePropertyType)get_store().add_element_user(CURVEMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "curveMember" element
     */
    public void removeCurveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVEMEMBER$0, i);
        }
    }
}
