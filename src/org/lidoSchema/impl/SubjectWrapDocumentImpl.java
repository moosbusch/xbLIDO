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
 * A document containing one subjectWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class SubjectWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.SubjectWrapDocument
{
    private static final long serialVersionUID = 1L;

    public SubjectWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName SUBJECTWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectWrap");


    /**
     * Gets the "subjectWrap" element
     */
    public org.lidoSchema.SubjectWrapDocument.SubjectWrap getSubjectWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectWrapDocument.SubjectWrap target = null;
            target = (org.lidoSchema.SubjectWrapDocument.SubjectWrap)get_store().find_element_user(SUBJECTWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "subjectWrap" element
     */
    @Inject(optional=true) public void setSubjectWrap(org.lidoSchema.SubjectWrapDocument.SubjectWrap subjectWrap)
    {
        generatedSetterHelperImpl(subjectWrap, SUBJECTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "subjectWrap" element
     */
    public org.lidoSchema.SubjectWrapDocument.SubjectWrap addNewSubjectWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.SubjectWrapDocument.SubjectWrap target = null;
            target = (org.lidoSchema.SubjectWrapDocument.SubjectWrap)get_store().add_element_user(SUBJECTWRAP$0);
            return target;
        }
    }
    /**
     * An XML subjectWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class SubjectWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.SubjectWrapDocument.SubjectWrap
    {
        private static final long serialVersionUID = 1L;

        public SubjectWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName SUBJECTSET$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectSet");


        /**
         * Gets a List of "subjectSet" elements
         */
        public java.util.List<org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet> getSubjectSetList()
        {
            final class SubjectSetList extends java.util.AbstractList<org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet>
            {
                @Override
                public org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet get(int i)
                    { return SubjectWrapImpl.this.getSubjectSetArray(i); }

                @Override
                public org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet set(int i, org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet o)
                {
                    org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet old = SubjectWrapImpl.this.getSubjectSetArray(i);
                    SubjectWrapImpl.this.setSubjectSetArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet o)
                    { SubjectWrapImpl.this.insertNewSubjectSet(i).set(o); }

                @Override
                public org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet remove(int i)
                {
                    org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet old = SubjectWrapImpl.this.getSubjectSetArray(i);
                    SubjectWrapImpl.this.removeSubjectSet(i);
                    return old;
                }

                @Override
                public int size()
                    { return SubjectWrapImpl.this.sizeOfSubjectSetArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new SubjectSetList();
            }
        }

        /**
         * Gets array of all "subjectSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet[] getSubjectSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet> targetList = new java.util.ArrayList<org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet>();
                get_store().find_all_element_users(SUBJECTSET$0, targetList);
                org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet[] result = new org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "subjectSet" element
         */
        public org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet getSubjectSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet target = null;
                target = (org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet)get_store().find_element_user(SUBJECTSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "subjectSet" element
         */
        public int sizeOfSubjectSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBJECTSET$0);
            }
        }

        /**
         * Sets array of all "subjectSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setSubjectSetArray(org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet[] subjectSetArray)
        {
            check_orphaned();
            arraySetterHelper(subjectSetArray, SUBJECTSET$0);
        }

        /**
         * Sets ith "subjectSet" element
         */
        @Inject(optional=true) public void setSubjectSetArray(int i, org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet subjectSet)
        {
            generatedSetterHelperImpl(subjectSet, SUBJECTSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "subjectSet" element
         */
        public org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet insertNewSubjectSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet target = null;
                target = (org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet)get_store().insert_element_user(SUBJECTSET$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "subjectSet" element
         */
        public org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet addNewSubjectSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet target = null;
                target = (org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet)get_store().add_element_user(SUBJECTSET$0);
                return target;
            }
        }

        /**
         * Removes the ith "subjectSet" element
         */
        public void removeSubjectSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBJECTSET$0, i);
            }
        }
        /**
         * An XML subjectSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class SubjectSetImpl extends org.lidoSchema.impl.SubjectSetComplexTypeImpl implements org.lidoSchema.SubjectWrapDocument.SubjectWrap.SubjectSet
        {
            private static final long serialVersionUID = 1L;

            public SubjectSetImpl(org.apache.xmlbeans.SchemaType sType)
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
}
