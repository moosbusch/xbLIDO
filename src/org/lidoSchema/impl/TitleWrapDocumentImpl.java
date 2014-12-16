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
 * A document containing one titleWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class TitleWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.TitleWrapDocument
{
    private static final long serialVersionUID = 1L;

    public TitleWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName TITLEWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "titleWrap");


    /**
     * Gets the "titleWrap" element
     */
    public org.lidoSchema.TitleWrapDocument.TitleWrap getTitleWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TitleWrapDocument.TitleWrap target = null;
            target = (org.lidoSchema.TitleWrapDocument.TitleWrap)get_store().find_element_user(TITLEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "titleWrap" element
     */
     public void setTitleWrap(org.lidoSchema.TitleWrapDocument.TitleWrap titleWrap)
    {
        generatedSetterHelperImpl(titleWrap, TITLEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "titleWrap" element
     */
    public org.lidoSchema.TitleWrapDocument.TitleWrap addNewTitleWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TitleWrapDocument.TitleWrap target = null;
            target = (org.lidoSchema.TitleWrapDocument.TitleWrap)get_store().add_element_user(TITLEWRAP$0);
            return target;
        }
    }
    /**
     * An XML titleWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class TitleWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.TitleWrapDocument.TitleWrap
    {
        private static final long serialVersionUID = 1L;

        public TitleWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName TITLESET$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "titleSet");


        /**
         * Gets a List of "titleSet" elements
         */
        public java.util.List<org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet> getTitleSetList()
        {
            final class TitleSetList extends java.util.AbstractList<org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet>
            {
                @Override
                public org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet get(int i)
                    { return TitleWrapImpl.this.getTitleSetArray(i); }

                @Override
                public org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet set(int i, org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet o)
                {
                    org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet old = TitleWrapImpl.this.getTitleSetArray(i);
                    TitleWrapImpl.this.setTitleSetArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet o)
                    { TitleWrapImpl.this.insertNewTitleSet(i).set(o); }

                @Override
                public org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet remove(int i)
                {
                    org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet old = TitleWrapImpl.this.getTitleSetArray(i);
                    TitleWrapImpl.this.removeTitleSet(i);
                    return old;
                }

                @Override
                public int size()
                    { return TitleWrapImpl.this.sizeOfTitleSetArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new TitleSetList();
            }
        }

        /**
         * Gets array of all "titleSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet[] getTitleSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet> targetList = new java.util.ArrayList<org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet>();
                get_store().find_all_element_users(TITLESET$0, targetList);
                org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet[] result = new org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "titleSet" element
         */
        public org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet getTitleSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet target = null;
                target = (org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet)get_store().find_element_user(TITLESET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "titleSet" element
         */
        public int sizeOfTitleSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLESET$0);
            }
        }

        /**
         * Sets array of all "titleSet" element  WARNING: This method is not atomicaly synchronized.
         */
         public void setTitleSetArray(org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet[] titleSetArray)
        {
            check_orphaned();
            arraySetterHelper(titleSetArray, TITLESET$0);
        }

        /**
         * Sets ith "titleSet" element
         */
         public void setTitleSetArray(int i, org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet titleSet)
        {
            generatedSetterHelperImpl(titleSet, TITLESET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "titleSet" element
         */
        public org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet insertNewTitleSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet target = null;
                target = (org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet)get_store().insert_element_user(TITLESET$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "titleSet" element
         */
        public org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet addNewTitleSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet target = null;
                target = (org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet)get_store().add_element_user(TITLESET$0);
                return target;
            }
        }

        /**
         * Removes the ith "titleSet" element
         */
        public void removeTitleSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLESET$0, i);
            }
        }
        /**
         * An XML titleSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class TitleSetImpl extends org.lidoSchema.impl.AppellationComplexTypeImpl implements org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet
        {
            private static final long serialVersionUID = 1L;

            public TitleSetImpl(org.apache.xmlbeans.SchemaType sType)
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
             public void setType(java.lang.String type)
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
             public void setSortorder(java.math.BigInteger sortorder)
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
