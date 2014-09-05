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
 * A document containing one recordWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class RecordWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RecordWrapDocument
{
    private static final long serialVersionUID = 1L;

    public RecordWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName RECORDWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "recordWrap");


    /**
     * Gets the "recordWrap" element
     */
    public org.lidoSchema.RecordWrapDocument.RecordWrap getRecordWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RecordWrapDocument.RecordWrap target = null;
            target = (org.lidoSchema.RecordWrapDocument.RecordWrap)get_store().find_element_user(RECORDWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "recordWrap" element
     */
    @Inject(optional=true) public void setRecordWrap(org.lidoSchema.RecordWrapDocument.RecordWrap recordWrap)
    {
        generatedSetterHelperImpl(recordWrap, RECORDWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "recordWrap" element
     */
    public org.lidoSchema.RecordWrapDocument.RecordWrap addNewRecordWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RecordWrapDocument.RecordWrap target = null;
            target = (org.lidoSchema.RecordWrapDocument.RecordWrap)get_store().add_element_user(RECORDWRAP$0);
            return target;
        }
    }
    /**
     * An XML recordWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class RecordWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RecordWrapDocument.RecordWrap
    {
        private static final long serialVersionUID = 1L;

        public RecordWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName RECORDID$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "recordID");
        private static final javax.xml.namespace.QName RECORDTYPE$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "recordType");
        private static final javax.xml.namespace.QName RECORDSOURCE$4 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "recordSource");
        private static final javax.xml.namespace.QName RECORDRIGHTS$6 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "recordRights");
        private static final javax.xml.namespace.QName RECORDINFOSET$8 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "recordInfoSet");


        /**
         * Gets a List of "recordID" elements
         */
        public java.util.List<org.lidoSchema.IdentifierComplexType> getRecordIDList()
        {
            final class RecordIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
            {
                @Override
                public org.lidoSchema.IdentifierComplexType get(int i)
                    { return RecordWrapImpl.this.getRecordIDArray(i); }

                @Override
                public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
                {
                    org.lidoSchema.IdentifierComplexType old = RecordWrapImpl.this.getRecordIDArray(i);
                    RecordWrapImpl.this.setRecordIDArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.IdentifierComplexType o)
                    { RecordWrapImpl.this.insertNewRecordID(i).set(o); }

                @Override
                public org.lidoSchema.IdentifierComplexType remove(int i)
                {
                    org.lidoSchema.IdentifierComplexType old = RecordWrapImpl.this.getRecordIDArray(i);
                    RecordWrapImpl.this.removeRecordID(i);
                    return old;
                }

                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordIDArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new RecordIDList();
            }
        }

        /**
         * Gets array of all "recordID" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.IdentifierComplexType[] getRecordIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
                get_store().find_all_element_users(RECORDID$0, targetList);
                org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "recordID" element
         */
        public org.lidoSchema.IdentifierComplexType getRecordIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.IdentifierComplexType target = null;
                target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(RECORDID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "recordID" element
         */
        public int sizeOfRecordIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDID$0);
            }
        }

        /**
         * Sets array of all "recordID" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRecordIDArray(org.lidoSchema.IdentifierComplexType[] recordIDArray)
        {
            check_orphaned();
            arraySetterHelper(recordIDArray, RECORDID$0);
        }

        /**
         * Sets ith "recordID" element
         */
        @Inject(optional=true) public void setRecordIDArray(int i, org.lidoSchema.IdentifierComplexType recordID)
        {
            generatedSetterHelperImpl(recordID, RECORDID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordID" element
         */
        public org.lidoSchema.IdentifierComplexType insertNewRecordID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.IdentifierComplexType target = null;
                target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(RECORDID$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "recordID" element
         */
        public org.lidoSchema.IdentifierComplexType addNewRecordID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.IdentifierComplexType target = null;
                target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(RECORDID$0);
                return target;
            }
        }

        /**
         * Removes the ith "recordID" element
         */
        public void removeRecordID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDID$0, i);
            }
        }

        /**
         * Gets the "recordType" element
         */
        public org.lidoSchema.ConceptComplexType getRecordType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ConceptComplexType target = null;
                target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(RECORDTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }

        /**
         * Sets the "recordType" element
         */
        @Inject(optional=true) public void setRecordType(org.lidoSchema.ConceptComplexType recordType)
        {
            generatedSetterHelperImpl(recordType, RECORDTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "recordType" element
         */
        public org.lidoSchema.ConceptComplexType addNewRecordType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ConceptComplexType target = null;
                target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(RECORDTYPE$2);
                return target;
            }
        }

        /**
         * Gets a List of "recordSource" elements
         */
        public java.util.List<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource> getRecordSourceList()
        {
            final class RecordSourceList extends java.util.AbstractList<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource>
            {
                @Override
                public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource get(int i)
                    { return RecordWrapImpl.this.getRecordSourceArray(i); }

                @Override
                public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource set(int i, org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource o)
                {
                    org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource old = RecordWrapImpl.this.getRecordSourceArray(i);
                    RecordWrapImpl.this.setRecordSourceArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource o)
                    { RecordWrapImpl.this.insertNewRecordSource(i).set(o); }

                @Override
                public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource remove(int i)
                {
                    org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource old = RecordWrapImpl.this.getRecordSourceArray(i);
                    RecordWrapImpl.this.removeRecordSource(i);
                    return old;
                }

                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordSourceArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new RecordSourceList();
            }
        }

        /**
         * Gets array of all "recordSource" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource[] getRecordSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource> targetList = new java.util.ArrayList<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource>();
                get_store().find_all_element_users(RECORDSOURCE$4, targetList);
                org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource[] result = new org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "recordSource" element
         */
        public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource getRecordSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource target = null;
                target = (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource)get_store().find_element_user(RECORDSOURCE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "recordSource" element
         */
        public int sizeOfRecordSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDSOURCE$4);
            }
        }

        /**
         * Sets array of all "recordSource" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRecordSourceArray(org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource[] recordSourceArray)
        {
            check_orphaned();
            arraySetterHelper(recordSourceArray, RECORDSOURCE$4);
        }

        /**
         * Sets ith "recordSource" element
         */
        @Inject(optional=true) public void setRecordSourceArray(int i, org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource recordSource)
        {
            generatedSetterHelperImpl(recordSource, RECORDSOURCE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordSource" element
         */
        public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource insertNewRecordSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource target = null;
                target = (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource)get_store().insert_element_user(RECORDSOURCE$4, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "recordSource" element
         */
        public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource addNewRecordSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource target = null;
                target = (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource)get_store().add_element_user(RECORDSOURCE$4);
                return target;
            }
        }

        /**
         * Removes the ith "recordSource" element
         */
        public void removeRecordSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDSOURCE$4, i);
            }
        }

        /**
         * Gets a List of "recordRights" elements
         */
        public java.util.List<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights> getRecordRightsList()
        {
            final class RecordRightsList extends java.util.AbstractList<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights>
            {
                @Override
                public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights get(int i)
                    { return RecordWrapImpl.this.getRecordRightsArray(i); }

                @Override
                public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights set(int i, org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights o)
                {
                    org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights old = RecordWrapImpl.this.getRecordRightsArray(i);
                    RecordWrapImpl.this.setRecordRightsArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights o)
                    { RecordWrapImpl.this.insertNewRecordRights(i).set(o); }

                @Override
                public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights remove(int i)
                {
                    org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights old = RecordWrapImpl.this.getRecordRightsArray(i);
                    RecordWrapImpl.this.removeRecordRights(i);
                    return old;
                }

                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordRightsArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new RecordRightsList();
            }
        }

        /**
         * Gets array of all "recordRights" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights[] getRecordRightsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights> targetList = new java.util.ArrayList<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights>();
                get_store().find_all_element_users(RECORDRIGHTS$6, targetList);
                org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights[] result = new org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "recordRights" element
         */
        public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights getRecordRightsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights target = null;
                target = (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights)get_store().find_element_user(RECORDRIGHTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "recordRights" element
         */
        public int sizeOfRecordRightsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDRIGHTS$6);
            }
        }

        /**
         * Sets array of all "recordRights" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRecordRightsArray(org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights[] recordRightsArray)
        {
            check_orphaned();
            arraySetterHelper(recordRightsArray, RECORDRIGHTS$6);
        }

        /**
         * Sets ith "recordRights" element
         */
        @Inject(optional=true) public void setRecordRightsArray(int i, org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights recordRights)
        {
            generatedSetterHelperImpl(recordRights, RECORDRIGHTS$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordRights" element
         */
        public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights insertNewRecordRights(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights target = null;
                target = (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights)get_store().insert_element_user(RECORDRIGHTS$6, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "recordRights" element
         */
        public org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights addNewRecordRights()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights target = null;
                target = (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights)get_store().add_element_user(RECORDRIGHTS$6);
                return target;
            }
        }

        /**
         * Removes the ith "recordRights" element
         */
        public void removeRecordRights(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDRIGHTS$6, i);
            }
        }

        /**
         * Gets a List of "recordInfoSet" elements
         */
        public java.util.List<org.lidoSchema.RecordInfoSetComplexType> getRecordInfoSetList()
        {
            final class RecordInfoSetList extends java.util.AbstractList<org.lidoSchema.RecordInfoSetComplexType>
            {
                @Override
                public org.lidoSchema.RecordInfoSetComplexType get(int i)
                    { return RecordWrapImpl.this.getRecordInfoSetArray(i); }

                @Override
                public org.lidoSchema.RecordInfoSetComplexType set(int i, org.lidoSchema.RecordInfoSetComplexType o)
                {
                    org.lidoSchema.RecordInfoSetComplexType old = RecordWrapImpl.this.getRecordInfoSetArray(i);
                    RecordWrapImpl.this.setRecordInfoSetArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.RecordInfoSetComplexType o)
                    { RecordWrapImpl.this.insertNewRecordInfoSet(i).set(o); }

                @Override
                public org.lidoSchema.RecordInfoSetComplexType remove(int i)
                {
                    org.lidoSchema.RecordInfoSetComplexType old = RecordWrapImpl.this.getRecordInfoSetArray(i);
                    RecordWrapImpl.this.removeRecordInfoSet(i);
                    return old;
                }

                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordInfoSetArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new RecordInfoSetList();
            }
        }

        /**
         * Gets array of all "recordInfoSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.RecordInfoSetComplexType[] getRecordInfoSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.RecordInfoSetComplexType> targetList = new java.util.ArrayList<org.lidoSchema.RecordInfoSetComplexType>();
                get_store().find_all_element_users(RECORDINFOSET$8, targetList);
                org.lidoSchema.RecordInfoSetComplexType[] result = new org.lidoSchema.RecordInfoSetComplexType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "recordInfoSet" element
         */
        public org.lidoSchema.RecordInfoSetComplexType getRecordInfoSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordInfoSetComplexType target = null;
                target = (org.lidoSchema.RecordInfoSetComplexType)get_store().find_element_user(RECORDINFOSET$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "recordInfoSet" element
         */
        public int sizeOfRecordInfoSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINFOSET$8);
            }
        }

        /**
         * Sets array of all "recordInfoSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRecordInfoSetArray(org.lidoSchema.RecordInfoSetComplexType[] recordInfoSetArray)
        {
            check_orphaned();
            arraySetterHelper(recordInfoSetArray, RECORDINFOSET$8);
        }

        /**
         * Sets ith "recordInfoSet" element
         */
        @Inject(optional=true) public void setRecordInfoSetArray(int i, org.lidoSchema.RecordInfoSetComplexType recordInfoSet)
        {
            generatedSetterHelperImpl(recordInfoSet, RECORDINFOSET$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoSet" element
         */
        public org.lidoSchema.RecordInfoSetComplexType insertNewRecordInfoSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordInfoSetComplexType target = null;
                target = (org.lidoSchema.RecordInfoSetComplexType)get_store().insert_element_user(RECORDINFOSET$8, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoSet" element
         */
        public org.lidoSchema.RecordInfoSetComplexType addNewRecordInfoSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RecordInfoSetComplexType target = null;
                target = (org.lidoSchema.RecordInfoSetComplexType)get_store().add_element_user(RECORDINFOSET$8);
                return target;
            }
        }

        /**
         * Removes the ith "recordInfoSet" element
         */
        public void removeRecordInfoSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINFOSET$8, i);
            }
        }
        /**
         * An XML recordSource(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class RecordSourceImpl extends org.lidoSchema.impl.LegalBodyRefComplexTypeImpl implements org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource
        {
            private static final long serialVersionUID = 1L;

            public RecordSourceImpl(org.apache.xmlbeans.SchemaType sType)
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
        /**
         * An XML recordRights(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class RecordRightsImpl extends org.lidoSchema.impl.RightsComplexTypeImpl implements org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights
        {
            private static final long serialVersionUID = 1L;

            public RecordRightsImpl(org.apache.xmlbeans.SchemaType sType)
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
