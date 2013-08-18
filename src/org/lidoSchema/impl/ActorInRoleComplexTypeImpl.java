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
package org.lidoSchema.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
/**
 * An XML actorInRoleComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ActorInRoleComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ActorInRoleComplexType
{
    private static final long serialVersionUID = 1L;

    public ActorInRoleComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ACTOR$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "actor");
    private static final javax.xml.namespace.QName ROLEACTOR$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "roleActor");
    private static final javax.xml.namespace.QName ATTRIBUTIONQUALIFIERACTOR$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "attributionQualifierActor");
    private static final javax.xml.namespace.QName EXTENTACTOR$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "extentActor");


    /**
     * Gets the "actor" element
     */
    public org.lidoSchema.ActorComplexType getActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorComplexType target = null;
            target = (org.lidoSchema.ActorComplexType)get_store().find_element_user(ACTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "actor" element
     */
    @Inject(optional=true) public void setActor(org.lidoSchema.ActorComplexType actor)
    {
        generatedSetterHelperImpl(actor, ACTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "actor" element
     */
    public org.lidoSchema.ActorComplexType addNewActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorComplexType target = null;
            target = (org.lidoSchema.ActorComplexType)get_store().add_element_user(ACTOR$0);
            return target;
        }
    }

    /**
     * Gets a List of "roleActor" elements
     */
    public java.util.List<org.lidoSchema.ActorInRoleComplexType.RoleActor> getRoleActorList()
    {
        final class RoleActorList extends java.util.AbstractList<org.lidoSchema.ActorInRoleComplexType.RoleActor>
        {
            @Override
            public org.lidoSchema.ActorInRoleComplexType.RoleActor get(int i)
                { return ActorInRoleComplexTypeImpl.this.getRoleActorArray(i); }

            @Override
            public org.lidoSchema.ActorInRoleComplexType.RoleActor set(int i, org.lidoSchema.ActorInRoleComplexType.RoleActor o)
            {
                org.lidoSchema.ActorInRoleComplexType.RoleActor old = ActorInRoleComplexTypeImpl.this.getRoleActorArray(i);
                ActorInRoleComplexTypeImpl.this.setRoleActorArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ActorInRoleComplexType.RoleActor o)
                { ActorInRoleComplexTypeImpl.this.insertNewRoleActor(i).set(o); }

            @Override
            public org.lidoSchema.ActorInRoleComplexType.RoleActor remove(int i)
            {
                org.lidoSchema.ActorInRoleComplexType.RoleActor old = ActorInRoleComplexTypeImpl.this.getRoleActorArray(i);
                ActorInRoleComplexTypeImpl.this.removeRoleActor(i);
                return old;
            }

            @Override
            public int size()
                { return ActorInRoleComplexTypeImpl.this.sizeOfRoleActorArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new RoleActorList();
        }
    }

    /**
     * Gets array of all "roleActor" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ActorInRoleComplexType.RoleActor[] getRoleActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ActorInRoleComplexType.RoleActor> targetList = new java.util.ArrayList<org.lidoSchema.ActorInRoleComplexType.RoleActor>();
            get_store().find_all_element_users(ROLEACTOR$2, targetList);
            org.lidoSchema.ActorInRoleComplexType.RoleActor[] result = new org.lidoSchema.ActorInRoleComplexType.RoleActor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "roleActor" element
     */
    public org.lidoSchema.ActorInRoleComplexType.RoleActor getRoleActorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorInRoleComplexType.RoleActor target = null;
            target = (org.lidoSchema.ActorInRoleComplexType.RoleActor)get_store().find_element_user(ROLEACTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "roleActor" element
     */
    public int sizeOfRoleActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLEACTOR$2);
        }
    }

    /**
     * Sets array of all "roleActor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRoleActorArray(org.lidoSchema.ActorInRoleComplexType.RoleActor[] roleActorArray)
    {
        check_orphaned();
        arraySetterHelper(roleActorArray, ROLEACTOR$2);
    }

    /**
     * Sets ith "roleActor" element
     */
    @Inject(optional=true) public void setRoleActorArray(int i, org.lidoSchema.ActorInRoleComplexType.RoleActor roleActor)
    {
        generatedSetterHelperImpl(roleActor, ROLEACTOR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "roleActor" element
     */
    public org.lidoSchema.ActorInRoleComplexType.RoleActor insertNewRoleActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorInRoleComplexType.RoleActor target = null;
            target = (org.lidoSchema.ActorInRoleComplexType.RoleActor)get_store().insert_element_user(ROLEACTOR$2, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "roleActor" element
     */
    public org.lidoSchema.ActorInRoleComplexType.RoleActor addNewRoleActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorInRoleComplexType.RoleActor target = null;
            target = (org.lidoSchema.ActorInRoleComplexType.RoleActor)get_store().add_element_user(ROLEACTOR$2);
            return target;
        }
    }

    /**
     * Removes the ith "roleActor" element
     */
    public void removeRoleActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLEACTOR$2, i);
        }
    }

    /**
     * Gets a List of "attributionQualifierActor" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getAttributionQualifierActorList()
    {
        final class AttributionQualifierActorList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return ActorInRoleComplexTypeImpl.this.getAttributionQualifierActorArray(i); }

            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = ActorInRoleComplexTypeImpl.this.getAttributionQualifierActorArray(i);
                ActorInRoleComplexTypeImpl.this.setAttributionQualifierActorArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { ActorInRoleComplexTypeImpl.this.insertNewAttributionQualifierActor(i).set(o); }

            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = ActorInRoleComplexTypeImpl.this.getAttributionQualifierActorArray(i);
                ActorInRoleComplexTypeImpl.this.removeAttributionQualifierActor(i);
                return old;
            }

            @Override
            public int size()
                { return ActorInRoleComplexTypeImpl.this.sizeOfAttributionQualifierActorArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new AttributionQualifierActorList();
        }
    }

    /**
     * Gets array of all "attributionQualifierActor" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getAttributionQualifierActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(ATTRIBUTIONQUALIFIERACTOR$4, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "attributionQualifierActor" element
     */
    public org.lidoSchema.TextComplexType getAttributionQualifierActorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "attributionQualifierActor" element
     */
    public int sizeOfAttributionQualifierActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTIONQUALIFIERACTOR$4);
        }
    }

    /**
     * Sets array of all "attributionQualifierActor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setAttributionQualifierActorArray(org.lidoSchema.TextComplexType[] attributionQualifierActorArray)
    {
        check_orphaned();
        arraySetterHelper(attributionQualifierActorArray, ATTRIBUTIONQUALIFIERACTOR$4);
    }

    /**
     * Sets ith "attributionQualifierActor" element
     */
    @Inject(optional=true) public void setAttributionQualifierActorArray(int i, org.lidoSchema.TextComplexType attributionQualifierActor)
    {
        generatedSetterHelperImpl(attributionQualifierActor, ATTRIBUTIONQUALIFIERACTOR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributionQualifierActor" element
     */
    public org.lidoSchema.TextComplexType insertNewAttributionQualifierActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(ATTRIBUTIONQUALIFIERACTOR$4, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "attributionQualifierActor" element
     */
    public org.lidoSchema.TextComplexType addNewAttributionQualifierActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(ATTRIBUTIONQUALIFIERACTOR$4);
            return target;
        }
    }

    /**
     * Removes the ith "attributionQualifierActor" element
     */
    public void removeAttributionQualifierActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTIONQUALIFIERACTOR$4, i);
        }
    }

    /**
     * Gets a List of "extentActor" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getExtentActorList()
    {
        final class ExtentActorList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return ActorInRoleComplexTypeImpl.this.getExtentActorArray(i); }

            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = ActorInRoleComplexTypeImpl.this.getExtentActorArray(i);
                ActorInRoleComplexTypeImpl.this.setExtentActorArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { ActorInRoleComplexTypeImpl.this.insertNewExtentActor(i).set(o); }

            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = ActorInRoleComplexTypeImpl.this.getExtentActorArray(i);
                ActorInRoleComplexTypeImpl.this.removeExtentActor(i);
                return old;
            }

            @Override
            public int size()
                { return ActorInRoleComplexTypeImpl.this.sizeOfExtentActorArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new ExtentActorList();
        }
    }

    /**
     * Gets array of all "extentActor" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getExtentActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(EXTENTACTOR$6, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "extentActor" element
     */
    public org.lidoSchema.TextComplexType getExtentActorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(EXTENTACTOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "extentActor" element
     */
    public int sizeOfExtentActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENTACTOR$6);
        }
    }

    /**
     * Sets array of all "extentActor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setExtentActorArray(org.lidoSchema.TextComplexType[] extentActorArray)
    {
        check_orphaned();
        arraySetterHelper(extentActorArray, EXTENTACTOR$6);
    }

    /**
     * Sets ith "extentActor" element
     */
    @Inject(optional=true) public void setExtentActorArray(int i, org.lidoSchema.TextComplexType extentActor)
    {
        generatedSetterHelperImpl(extentActor, EXTENTACTOR$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "extentActor" element
     */
    public org.lidoSchema.TextComplexType insertNewExtentActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(EXTENTACTOR$6, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "extentActor" element
     */
    public org.lidoSchema.TextComplexType addNewExtentActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(EXTENTACTOR$6);
            return target;
        }
    }

    /**
     * Removes the ith "extentActor" element
     */
    public void removeExtentActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENTACTOR$6, i);
        }
    }
    /**
     * An XML roleActor(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class RoleActorImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.ActorInRoleComplexType.RoleActor
    {
        private static final long serialVersionUID = 1L;

        public RoleActorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SORTORDER$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }

        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }

        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }

        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }

        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
}
