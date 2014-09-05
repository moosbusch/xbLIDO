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
 * A document containing one lidoWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class LidoWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.LidoWrapDocument
{
    private static final long serialVersionUID = 1L;

    public LidoWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName LIDOWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "lidoWrap");


    /**
     * Gets the "lidoWrap" element
     */
    public org.lidoSchema.LidoWrapDocument.LidoWrap getLidoWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.LidoWrapDocument.LidoWrap target = null;
            target = (org.lidoSchema.LidoWrapDocument.LidoWrap)get_store().find_element_user(LIDOWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "lidoWrap" element
     */
    @Inject(optional=true) public void setLidoWrap(org.lidoSchema.LidoWrapDocument.LidoWrap lidoWrap)
    {
        generatedSetterHelperImpl(lidoWrap, LIDOWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "lidoWrap" element
     */
    public org.lidoSchema.LidoWrapDocument.LidoWrap addNewLidoWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.LidoWrapDocument.LidoWrap target = null;
            target = (org.lidoSchema.LidoWrapDocument.LidoWrap)get_store().add_element_user(LIDOWRAP$0);
            return target;
        }
    }
    /**
     * An XML lidoWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class LidoWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.LidoWrapDocument.LidoWrap
    {
        private static final long serialVersionUID = 1L;

        public LidoWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName LIDO$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "lido");
        private static final javax.xml.namespace.QName RELATEDENCODING$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedencoding");


        /**
         * Gets a List of "lido" elements
         */
        public java.util.List<org.lidoSchema.LidoWrapDocument.LidoWrap.Lido> getLidoList()
        {
            final class LidoList extends java.util.AbstractList<org.lidoSchema.LidoWrapDocument.LidoWrap.Lido>
            {
                @Override
                public org.lidoSchema.LidoWrapDocument.LidoWrap.Lido get(int i)
                    { return LidoWrapImpl.this.getLidoArray(i); }

                @Override
                public org.lidoSchema.LidoWrapDocument.LidoWrap.Lido set(int i, org.lidoSchema.LidoWrapDocument.LidoWrap.Lido o)
                {
                    org.lidoSchema.LidoWrapDocument.LidoWrap.Lido old = LidoWrapImpl.this.getLidoArray(i);
                    LidoWrapImpl.this.setLidoArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.LidoWrapDocument.LidoWrap.Lido o)
                    { LidoWrapImpl.this.insertNewLido(i).set(o); }

                @Override
                public org.lidoSchema.LidoWrapDocument.LidoWrap.Lido remove(int i)
                {
                    org.lidoSchema.LidoWrapDocument.LidoWrap.Lido old = LidoWrapImpl.this.getLidoArray(i);
                    LidoWrapImpl.this.removeLido(i);
                    return old;
                }

                @Override
                public int size()
                    { return LidoWrapImpl.this.sizeOfLidoArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new LidoList();
            }
        }

        /**
         * Gets array of all "lido" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.LidoWrapDocument.LidoWrap.Lido[] getLidoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.LidoWrapDocument.LidoWrap.Lido> targetList = new java.util.ArrayList<org.lidoSchema.LidoWrapDocument.LidoWrap.Lido>();
                get_store().find_all_element_users(LIDO$0, targetList);
                org.lidoSchema.LidoWrapDocument.LidoWrap.Lido[] result = new org.lidoSchema.LidoWrapDocument.LidoWrap.Lido[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "lido" element
         */
        public org.lidoSchema.LidoWrapDocument.LidoWrap.Lido getLidoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.LidoWrapDocument.LidoWrap.Lido target = null;
                target = (org.lidoSchema.LidoWrapDocument.LidoWrap.Lido)get_store().find_element_user(LIDO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "lido" element
         */
        public int sizeOfLidoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIDO$0);
            }
        }

        /**
         * Sets array of all "lido" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setLidoArray(org.lidoSchema.LidoWrapDocument.LidoWrap.Lido[] lidoArray)
        {
            check_orphaned();
            arraySetterHelper(lidoArray, LIDO$0);
        }

        /**
         * Sets ith "lido" element
         */
        @Inject(optional=true) public void setLidoArray(int i, org.lidoSchema.LidoWrapDocument.LidoWrap.Lido lido)
        {
            generatedSetterHelperImpl(lido, LIDO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "lido" element
         */
        public org.lidoSchema.LidoWrapDocument.LidoWrap.Lido insertNewLido(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.LidoWrapDocument.LidoWrap.Lido target = null;
                target = (org.lidoSchema.LidoWrapDocument.LidoWrap.Lido)get_store().insert_element_user(LIDO$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "lido" element
         */
        public org.lidoSchema.LidoWrapDocument.LidoWrap.Lido addNewLido()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.LidoWrapDocument.LidoWrap.Lido target = null;
                target = (org.lidoSchema.LidoWrapDocument.LidoWrap.Lido)get_store().add_element_user(LIDO$0);
                return target;
            }
        }

        /**
         * Removes the ith "lido" element
         */
        public void removeLido(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIDO$0, i);
            }
        }

        /**
         * Gets the "relatedencoding" attribute
         */
        public java.lang.String getRelatedencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "relatedencoding" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelatedencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$2);
                return target;
            }
        }

        /**
         * True if has "relatedencoding" attribute
         */
        public boolean isSetRelatedencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELATEDENCODING$2) != null;
            }
        }

        /**
         * Sets the "relatedencoding" attribute
         */
        @Inject(optional=true) public void setRelatedencoding(java.lang.String relatedencoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATEDENCODING$2);
                }
                target.setStringValue(relatedencoding);
            }
        }

        /**
         * Sets (as xml) the "relatedencoding" attribute
         */
        public void xsetRelatedencoding(org.apache.xmlbeans.XmlString relatedencoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATEDENCODING$2);
                }
                target.set(relatedencoding);
            }
        }

        /**
         * Unsets the "relatedencoding" attribute
         */
        public void unsetRelatedencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELATEDENCODING$2);
            }
        }
        /**
         * An XML lido(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class LidoImpl extends org.lidoSchema.impl.LidoComplexTypeImpl implements org.lidoSchema.LidoWrapDocument.LidoWrap.Lido
        {
            private static final long serialVersionUID = 1L;

            public LidoImpl(org.apache.xmlbeans.SchemaType sType)
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
