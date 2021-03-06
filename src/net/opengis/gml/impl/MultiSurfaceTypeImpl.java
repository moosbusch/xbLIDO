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
 * An XML MultiSurfaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiSurfaceTypeImpl extends net.opengis.gml.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.MultiSurfaceType
{
    private static final long serialVersionUID = 1L;

    public MultiSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName SURFACEMEMBER$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "surfaceMember");
    private static final javax.xml.namespace.QName SURFACEMEMBERS$2 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "surfaceMembers");


    /**
     * Gets a List of "surfaceMember" elements
     */
    public java.util.List<net.opengis.gml.SurfacePropertyType> getSurfaceMemberList()
    {
        final class SurfaceMemberList extends java.util.AbstractList<net.opengis.gml.SurfacePropertyType>
        {
            @Override
            public net.opengis.gml.SurfacePropertyType get(int i)
                { return MultiSurfaceTypeImpl.this.getSurfaceMemberArray(i); }

            @Override
            public net.opengis.gml.SurfacePropertyType set(int i, net.opengis.gml.SurfacePropertyType o)
            {
                net.opengis.gml.SurfacePropertyType old = MultiSurfaceTypeImpl.this.getSurfaceMemberArray(i);
                MultiSurfaceTypeImpl.this.setSurfaceMemberArray(i, o);
                return old;
            }

            @Override
            public void add(int i, net.opengis.gml.SurfacePropertyType o)
                { MultiSurfaceTypeImpl.this.insertNewSurfaceMember(i).set(o); }

            @Override
            public net.opengis.gml.SurfacePropertyType remove(int i)
            {
                net.opengis.gml.SurfacePropertyType old = MultiSurfaceTypeImpl.this.getSurfaceMemberArray(i);
                MultiSurfaceTypeImpl.this.removeSurfaceMember(i);
                return old;
            }

            @Override
            public int size()
                { return MultiSurfaceTypeImpl.this.sizeOfSurfaceMemberArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new SurfaceMemberList();
        }
    }

    /**
     * Gets array of all "surfaceMember" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.SurfacePropertyType[] getSurfaceMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.SurfacePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.SurfacePropertyType>();
            get_store().find_all_element_users(SURFACEMEMBER$0, targetList);
            net.opengis.gml.SurfacePropertyType[] result = new net.opengis.gml.SurfacePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "surfaceMember" element
     */
    public net.opengis.gml.SurfacePropertyType getSurfaceMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(SURFACEMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "surfaceMember" element
     */
    public int sizeOfSurfaceMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACEMEMBER$0);
        }
    }

    /**
     * Sets array of all "surfaceMember" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setSurfaceMemberArray(net.opengis.gml.SurfacePropertyType[] surfaceMemberArray)
    {
        check_orphaned();
        arraySetterHelper(surfaceMemberArray, SURFACEMEMBER$0);
    }

    /**
     * Sets ith "surfaceMember" element
     */
     public void setSurfaceMemberArray(int i, net.opengis.gml.SurfacePropertyType surfaceMember)
    {
        generatedSetterHelperImpl(surfaceMember, SURFACEMEMBER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "surfaceMember" element
     */
    public net.opengis.gml.SurfacePropertyType insertNewSurfaceMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().insert_element_user(SURFACEMEMBER$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "surfaceMember" element
     */
    public net.opengis.gml.SurfacePropertyType addNewSurfaceMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(SURFACEMEMBER$0);
            return target;
        }
    }

    /**
     * Removes the ith "surfaceMember" element
     */
    public void removeSurfaceMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACEMEMBER$0, i);
        }
    }

    /**
     * Gets the "surfaceMembers" element
     */
    public net.opengis.gml.SurfaceArrayPropertyType getSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.SurfaceArrayPropertyType)get_store().find_element_user(SURFACEMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "surfaceMembers" element
     */
    public boolean isSetSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACEMEMBERS$2) != 0;
        }
    }

    /**
     * Sets the "surfaceMembers" element
     */
     public void setSurfaceMembers(net.opengis.gml.SurfaceArrayPropertyType surfaceMembers)
    {
        generatedSetterHelperImpl(surfaceMembers, SURFACEMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "surfaceMembers" element
     */
    public net.opengis.gml.SurfaceArrayPropertyType addNewSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.SurfaceArrayPropertyType)get_store().add_element_user(SURFACEMEMBERS$2);
            return target;
        }
    }

    /**
     * Unsets the "surfaceMembers" element
     */
    public void unsetSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACEMEMBERS$2, 0);
        }
    }
}
