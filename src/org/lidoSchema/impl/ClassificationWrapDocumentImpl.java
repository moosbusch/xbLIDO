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
 * A document containing one classificationWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class ClassificationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ClassificationWrapDocument
{
    private static final long serialVersionUID = 1L;

    public ClassificationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName CLASSIFICATIONWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "classificationWrap");


    /**
     * Gets the "classificationWrap" element
     */
    public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap getClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ClassificationWrapDocument.ClassificationWrap target = null;
            target = (org.lidoSchema.ClassificationWrapDocument.ClassificationWrap)get_store().find_element_user(CLASSIFICATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "classificationWrap" element
     */
    @Inject(optional=true) public void setClassificationWrap(org.lidoSchema.ClassificationWrapDocument.ClassificationWrap classificationWrap)
    {
        generatedSetterHelperImpl(classificationWrap, CLASSIFICATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "classificationWrap" element
     */
    public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap addNewClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ClassificationWrapDocument.ClassificationWrap target = null;
            target = (org.lidoSchema.ClassificationWrapDocument.ClassificationWrap)get_store().add_element_user(CLASSIFICATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML classificationWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ClassificationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ClassificationWrapDocument.ClassificationWrap
    {
        private static final long serialVersionUID = 1L;

        public ClassificationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName CLASSIFICATION$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "classification");


        /**
         * Gets a List of "classification" elements
         */
        public java.util.List<org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification> getClassificationList()
        {
            final class ClassificationList extends java.util.AbstractList<org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification>
            {
                @Override
                public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification get(int i)
                    { return ClassificationWrapImpl.this.getClassificationArray(i); }

                @Override
                public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification set(int i, org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification o)
                {
                    org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification old = ClassificationWrapImpl.this.getClassificationArray(i);
                    ClassificationWrapImpl.this.setClassificationArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification o)
                    { ClassificationWrapImpl.this.insertNewClassification(i).set(o); }

                @Override
                public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification remove(int i)
                {
                    org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification old = ClassificationWrapImpl.this.getClassificationArray(i);
                    ClassificationWrapImpl.this.removeClassification(i);
                    return old;
                }

                @Override
                public int size()
                    { return ClassificationWrapImpl.this.sizeOfClassificationArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new ClassificationList();
            }
        }

        /**
         * Gets array of all "classification" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification[] getClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification> targetList = new java.util.ArrayList<org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification>();
                get_store().find_all_element_users(CLASSIFICATION$0, targetList);
                org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification[] result = new org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "classification" element
         */
        public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification getClassificationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification target = null;
                target = (org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification)get_store().find_element_user(CLASSIFICATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "classification" element
         */
        public int sizeOfClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATION$0);
            }
        }

        /**
         * Sets array of all "classification" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setClassificationArray(org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$0);
        }

        /**
         * Sets ith "classification" element
         */
        @Inject(optional=true) public void setClassificationArray(int i, org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "classification" element
         */
        public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification insertNewClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification target = null;
                target = (org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification)get_store().insert_element_user(CLASSIFICATION$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "classification" element
         */
        public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification addNewClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification target = null;
                target = (org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification)get_store().add_element_user(CLASSIFICATION$0);
                return target;
            }
        }

        /**
         * Removes the ith "classification" element
         */
        public void removeClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATION$0, i);
            }
        }
        /**
         * An XML classification(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class ClassificationImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.ClassificationWrapDocument.ClassificationWrap.Classification
        {
            private static final long serialVersionUID = 1L;

            public ClassificationImpl(org.apache.xmlbeans.SchemaType sType)
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
