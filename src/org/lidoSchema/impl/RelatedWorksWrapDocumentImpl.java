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
package org.lidoSchema.impl;  

/**
 * A document containing one relatedWorksWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class RelatedWorksWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RelatedWorksWrapDocument
{
    private static final long serialVersionUID = 1L;

    public RelatedWorksWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName RELATEDWORKSWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedWorksWrap");


    /**
     * Gets the "relatedWorksWrap" element
     */
    public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap getRelatedWorksWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
            target = (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().find_element_user(RELATEDWORKSWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "relatedWorksWrap" element
     */
     public void setRelatedWorksWrap(org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap relatedWorksWrap)
    {
        generatedSetterHelperImpl(relatedWorksWrap, RELATEDWORKSWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "relatedWorksWrap" element
     */
    public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap addNewRelatedWorksWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
            target = (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().add_element_user(RELATEDWORKSWRAP$0);
            return target;
        }
    }
    /**
     * An XML relatedWorksWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class RelatedWorksWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap
    {
        private static final long serialVersionUID = 1L;

        public RelatedWorksWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName RELATEDWORKSET$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedWorkSet");


        /**
         * Gets a List of "relatedWorkSet" elements
         */
        public java.util.List<org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet> getRelatedWorkSetList()
        {
            final class RelatedWorkSetList extends java.util.AbstractList<org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet>
            {
                @Override
                public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet get(int i)
                    { return RelatedWorksWrapImpl.this.getRelatedWorkSetArray(i); }

                @Override
                public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet set(int i, org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet o)
                {
                    org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet old = RelatedWorksWrapImpl.this.getRelatedWorkSetArray(i);
                    RelatedWorksWrapImpl.this.setRelatedWorkSetArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet o)
                    { RelatedWorksWrapImpl.this.insertNewRelatedWorkSet(i).set(o); }

                @Override
                public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet remove(int i)
                {
                    org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet old = RelatedWorksWrapImpl.this.getRelatedWorkSetArray(i);
                    RelatedWorksWrapImpl.this.removeRelatedWorkSet(i);
                    return old;
                }

                @Override
                public int size()
                    { return RelatedWorksWrapImpl.this.sizeOfRelatedWorkSetArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new RelatedWorkSetList();
            }
        }

        /**
         * Gets array of all "relatedWorkSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet[] getRelatedWorkSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet> targetList = new java.util.ArrayList<org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet>();
                get_store().find_all_element_users(RELATEDWORKSET$0, targetList);
                org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet[] result = new org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "relatedWorkSet" element
         */
        public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet getRelatedWorkSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet target = null;
                target = (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet)get_store().find_element_user(RELATEDWORKSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "relatedWorkSet" element
         */
        public int sizeOfRelatedWorkSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDWORKSET$0);
            }
        }

        /**
         * Sets array of all "relatedWorkSet" element  WARNING: This method is not atomicaly synchronized.
         */
         public void setRelatedWorkSetArray(org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet[] relatedWorkSetArray)
        {
            check_orphaned();
            arraySetterHelper(relatedWorkSetArray, RELATEDWORKSET$0);
        }

        /**
         * Sets ith "relatedWorkSet" element
         */
         public void setRelatedWorkSetArray(int i, org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet relatedWorkSet)
        {
            generatedSetterHelperImpl(relatedWorkSet, RELATEDWORKSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "relatedWorkSet" element
         */
        public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet insertNewRelatedWorkSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet target = null;
                target = (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet)get_store().insert_element_user(RELATEDWORKSET$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "relatedWorkSet" element
         */
        public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet addNewRelatedWorkSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet target = null;
                target = (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet)get_store().add_element_user(RELATEDWORKSET$0);
                return target;
            }
        }

        /**
         * Removes the ith "relatedWorkSet" element
         */
        public void removeRelatedWorkSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDWORKSET$0, i);
            }
        }
        /**
         * An XML relatedWorkSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class RelatedWorkSetImpl extends org.lidoSchema.impl.RelatedWorkSetComplexTypeImpl implements org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet
        {
            private static final long serialVersionUID = 1L;

            public RelatedWorkSetImpl(org.apache.xmlbeans.SchemaType sType)
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
             public void setSortorder(java.math.BigInteger sortorder)
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
