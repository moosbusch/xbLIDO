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
import org.moosbusch.museum.inject.lido.annotation.SortOrder;
/**
 * A document containing one objectWorkTypeWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class ObjectWorkTypeWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectWorkTypeWrapDocument
{
    private static final long serialVersionUID = 1L;

    public ObjectWorkTypeWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName OBJECTWORKTYPEWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectWorkTypeWrap");


    /**
     * Gets the "objectWorkTypeWrap" element
     */
    public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
            target = (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().find_element_user(OBJECTWORKTYPEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "objectWorkTypeWrap" element
     */
    @Inject(optional=true) public void setObjectWorkTypeWrap(org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap)
    {
        generatedSetterHelperImpl(objectWorkTypeWrap, OBJECTWORKTYPEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "objectWorkTypeWrap" element
     */
    public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
            target = (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().add_element_user(OBJECTWORKTYPEWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectWorkTypeWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ObjectWorkTypeWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap
    {
        private static final long serialVersionUID = 1L;

        public ObjectWorkTypeWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName OBJECTWORKTYPE$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "objectWorkType");


        /**
         * Gets a List of "objectWorkType" elements
         */
        public java.util.List<org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType> getObjectWorkTypeList()
        {
            final class ObjectWorkTypeList extends java.util.AbstractList<org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType>
            {
                @Override
                public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType get(int i)
                    { return ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i); }

                @Override
                public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType set(int i, org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType o)
                {
                    org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType old = ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i);
                    ObjectWorkTypeWrapImpl.this.setObjectWorkTypeArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType o)
                    { ObjectWorkTypeWrapImpl.this.insertNewObjectWorkType(i).set(o); }

                @Override
                public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType remove(int i)
                {
                    org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType old = ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i);
                    ObjectWorkTypeWrapImpl.this.removeObjectWorkType(i);
                    return old;
                }

                @Override
                public int size()
                    { return ObjectWorkTypeWrapImpl.this.sizeOfObjectWorkTypeArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new ObjectWorkTypeList();
            }
        }

        /**
         * Gets array of all "objectWorkType" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType[] getObjectWorkTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType> targetList = new java.util.ArrayList<org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType>();
                get_store().find_all_element_users(OBJECTWORKTYPE$0, targetList);
                org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType[] result = new org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "objectWorkType" element
         */
        public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType getObjectWorkTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType target = null;
                target = (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType)get_store().find_element_user(OBJECTWORKTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "objectWorkType" element
         */
        public int sizeOfObjectWorkTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTWORKTYPE$0);
            }
        }

        /**
         * Sets array of all "objectWorkType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setObjectWorkTypeArray(org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType[] objectWorkTypeArray)
        {
            check_orphaned();
            arraySetterHelper(objectWorkTypeArray, OBJECTWORKTYPE$0);
        }

        /**
         * Sets ith "objectWorkType" element
         */
        @Inject(optional=true) public void setObjectWorkTypeArray(int i, org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType objectWorkType)
        {
            generatedSetterHelperImpl(objectWorkType, OBJECTWORKTYPE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectWorkType" element
         */
        public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType insertNewObjectWorkType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType target = null;
                target = (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType)get_store().insert_element_user(OBJECTWORKTYPE$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "objectWorkType" element
         */
        public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType addNewObjectWorkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType target = null;
                target = (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType)get_store().add_element_user(OBJECTWORKTYPE$0);
                return target;
            }
        }

        /**
         * Removes the ith "objectWorkType" element
         */
        public void removeObjectWorkType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTWORKTYPE$0, i);
            }
        }
        /**
         * An XML objectWorkType(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class ObjectWorkTypeImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType
        {
            private static final long serialVersionUID = 1L;

            public ObjectWorkTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }

            private static final javax.xml.namespace.QName TYPE$0 =
                new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
            private static final javax.xml.namespace.QName SORTORDER$2 =
                new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


            /**
             * Gets the "type" attribute
             */
            public java.lang.String getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }

            /**
             * Gets (as xml) the "type" attribute
             */
            public org.apache.xmlbeans.XmlString xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                    return target;
                }
            }

            /**
             * True if has "type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$0) != null;
                }
            }

            /**
             * Sets the "type" attribute
             */
            @Inject(optional=true) public void setType(java.lang.String type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                    }
                    target.setStringValue(type);
                }
            }

            /**
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(org.apache.xmlbeans.XmlString type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                    }
                    target.set(type);
                }
            }

            /**
             * Unsets the "type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$0);
                }
            }

            /**
             * Gets the "sortorder" attribute
             */
            public java.math.BigInteger getSortorder()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
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
                    return get_store().find_attribute_user(SORTORDER$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$2);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$2);
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
                    get_store().remove_attribute(SORTORDER$2);
                }
            }
        }
    }
}
