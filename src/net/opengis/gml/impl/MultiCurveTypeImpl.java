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

import com.google.inject.Inject;

/**
 * An XML MultiCurveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiCurveTypeImpl extends net.opengis.gml.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.MultiCurveType
{
    private static final long serialVersionUID = 1L;

    public MultiCurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName CURVEMEMBER$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveMember");
    private static final javax.xml.namespace.QName CURVEMEMBERS$2 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "curveMembers");


    /**
     * Gets a List of "curveMember" elements
     */
    public java.util.List<net.opengis.gml.CurvePropertyType> getCurveMemberList()
    {
        final class CurveMemberList extends java.util.AbstractList<net.opengis.gml.CurvePropertyType>
        {
            @Override
            public net.opengis.gml.CurvePropertyType get(int i)
                { return MultiCurveTypeImpl.this.getCurveMemberArray(i); }

            @Override
            public net.opengis.gml.CurvePropertyType set(int i, net.opengis.gml.CurvePropertyType o)
            {
                net.opengis.gml.CurvePropertyType old = MultiCurveTypeImpl.this.getCurveMemberArray(i);
                MultiCurveTypeImpl.this.setCurveMemberArray(i, o);
                return old;
            }

            @Override
            public void add(int i, net.opengis.gml.CurvePropertyType o)
                { MultiCurveTypeImpl.this.insertNewCurveMember(i).set(o); }

            @Override
            public net.opengis.gml.CurvePropertyType remove(int i)
            {
                net.opengis.gml.CurvePropertyType old = MultiCurveTypeImpl.this.getCurveMemberArray(i);
                MultiCurveTypeImpl.this.removeCurveMember(i);
                return old;
            }

            @Override
            public int size()
                { return MultiCurveTypeImpl.this.sizeOfCurveMemberArray(); }

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

    /**
     * Gets the "curveMembers" element
     */
    public net.opengis.gml.CurveArrayPropertyType getCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.CurveArrayPropertyType)get_store().find_element_user(CURVEMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "curveMembers" element
     */
    public boolean isSetCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVEMEMBERS$2) != 0;
        }
    }

    /**
     * Sets the "curveMembers" element
     */
    @Inject(optional=true) public void setCurveMembers(net.opengis.gml.CurveArrayPropertyType curveMembers)
    {
        generatedSetterHelperImpl(curveMembers, CURVEMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "curveMembers" element
     */
    public net.opengis.gml.CurveArrayPropertyType addNewCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.CurveArrayPropertyType)get_store().add_element_user(CURVEMEMBERS$2);
            return target;
        }
    }

    /**
     * Unsets the "curveMembers" element
     */
    public void unsetCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVEMEMBERS$2, 0);
        }
    }
}
