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
 * A document containing one inscriptionsWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class InscriptionsWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.InscriptionsWrapDocument
{
    private static final long serialVersionUID = 1L;

    public InscriptionsWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName INSCRIPTIONSWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "inscriptionsWrap");


    /**
     * Gets the "inscriptionsWrap" element
     */
    public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap target = null;
            target = (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap)get_store().find_element_user(INSCRIPTIONSWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "inscriptionsWrap" element
     */
    @Inject(optional=true) public void setInscriptionsWrap(org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap)
    {
        generatedSetterHelperImpl(inscriptionsWrap, INSCRIPTIONSWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "inscriptionsWrap" element
     */
    public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap target = null;
            target = (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap)get_store().add_element_user(INSCRIPTIONSWRAP$0);
            return target;
        }
    }
    /**
     * An XML inscriptionsWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class InscriptionsWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap
    {
        private static final long serialVersionUID = 1L;

        public InscriptionsWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName INSCRIPTIONS$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "inscriptions");


        /**
         * Gets a List of "inscriptions" elements
         */
        public java.util.List<org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions> getInscriptionsList()
        {
            final class InscriptionsList extends java.util.AbstractList<org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions>
            {
                @Override
                public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions get(int i)
                    { return InscriptionsWrapImpl.this.getInscriptionsArray(i); }

                @Override
                public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions set(int i, org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions o)
                {
                    org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions old = InscriptionsWrapImpl.this.getInscriptionsArray(i);
                    InscriptionsWrapImpl.this.setInscriptionsArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions o)
                    { InscriptionsWrapImpl.this.insertNewInscriptions(i).set(o); }

                @Override
                public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions remove(int i)
                {
                    org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions old = InscriptionsWrapImpl.this.getInscriptionsArray(i);
                    InscriptionsWrapImpl.this.removeInscriptions(i);
                    return old;
                }

                @Override
                public int size()
                    { return InscriptionsWrapImpl.this.sizeOfInscriptionsArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new InscriptionsList();
            }
        }

        /**
         * Gets array of all "inscriptions" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions[] getInscriptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions> targetList = new java.util.ArrayList<org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions>();
                get_store().find_all_element_users(INSCRIPTIONS$0, targetList);
                org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions[] result = new org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "inscriptions" element
         */
        public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions getInscriptionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions target = null;
                target = (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions)get_store().find_element_user(INSCRIPTIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "inscriptions" element
         */
        public int sizeOfInscriptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSCRIPTIONS$0);
            }
        }

        /**
         * Sets array of all "inscriptions" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setInscriptionsArray(org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions[] inscriptionsArray)
        {
            check_orphaned();
            arraySetterHelper(inscriptionsArray, INSCRIPTIONS$0);
        }

        /**
         * Sets ith "inscriptions" element
         */
        @Inject(optional=true) public void setInscriptionsArray(int i, org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions inscriptions)
        {
            generatedSetterHelperImpl(inscriptions, INSCRIPTIONS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "inscriptions" element
         */
        public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions insertNewInscriptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions target = null;
                target = (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions)get_store().insert_element_user(INSCRIPTIONS$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "inscriptions" element
         */
        public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions addNewInscriptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions target = null;
                target = (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions)get_store().add_element_user(INSCRIPTIONS$0);
                return target;
            }
        }

        /**
         * Removes the ith "inscriptions" element
         */
        public void removeInscriptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSCRIPTIONS$0, i);
            }
        }
        /**
         * An XML inscriptions(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class InscriptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions
        {
            private static final long serialVersionUID = 1L;

            public InscriptionsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }

            private static final javax.xml.namespace.QName INSCRIPTIONTRANSCRIPTION$0 =
                new javax.xml.namespace.QName("http://www.lido-schema.org", "inscriptionTranscription");
            private static final javax.xml.namespace.QName INSCRIPTIONDESCRIPTION$2 =
                new javax.xml.namespace.QName("http://www.lido-schema.org", "inscriptionDescription");
            private static final javax.xml.namespace.QName TYPE$4 =
                new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
            private static final javax.xml.namespace.QName SORTORDER$6 =
                new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


            /**
             * Gets a List of "inscriptionTranscription" elements
             */
            public java.util.List<org.lidoSchema.TextComplexType> getInscriptionTranscriptionList()
            {
                final class InscriptionTranscriptionList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
                {
                    @Override
                    public org.lidoSchema.TextComplexType get(int i)
                        { return InscriptionsImpl.this.getInscriptionTranscriptionArray(i); }

                    @Override
                    public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
                    {
                      org.lidoSchema.TextComplexType old = InscriptionsImpl.this.getInscriptionTranscriptionArray(i);
                      InscriptionsImpl.this.setInscriptionTranscriptionArray(i, o);
                      return old;
                    }

                    @Override
                    public void add(int i, org.lidoSchema.TextComplexType o)
                        { InscriptionsImpl.this.insertNewInscriptionTranscription(i).set(o); }

                    @Override
                    public org.lidoSchema.TextComplexType remove(int i)
                    {
                      org.lidoSchema.TextComplexType old = InscriptionsImpl.this.getInscriptionTranscriptionArray(i);
                      InscriptionsImpl.this.removeInscriptionTranscription(i);
                      return old;
                    }

                    @Override
                    public int size()
                        { return InscriptionsImpl.this.sizeOfInscriptionTranscriptionArray(); }

                }

                synchronized (monitor())
                {
                    check_orphaned();
                    return new InscriptionTranscriptionList();
                }
            }

            /**
             * Gets array of all "inscriptionTranscription" elements
             * @deprecated
             */
            @Deprecated
            public org.lidoSchema.TextComplexType[] getInscriptionTranscriptionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
                    get_store().find_all_element_users(INSCRIPTIONTRANSCRIPTION$0, targetList);
                    org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }

            /**
             * Gets ith "inscriptionTranscription" element
             */
            public org.lidoSchema.TextComplexType getInscriptionTranscriptionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.lidoSchema.TextComplexType target = null;
                    target = (org.lidoSchema.TextComplexType)get_store().find_element_user(INSCRIPTIONTRANSCRIPTION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }

            /**
             * Returns number of "inscriptionTranscription" element
             */
            public int sizeOfInscriptionTranscriptionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INSCRIPTIONTRANSCRIPTION$0);
                }
            }

            /**
             * Sets array of all "inscriptionTranscription" element  WARNING: This method is not atomicaly synchronized.
             */
            @Inject(optional=true) public void setInscriptionTranscriptionArray(org.lidoSchema.TextComplexType[] inscriptionTranscriptionArray)
            {
                check_orphaned();
                arraySetterHelper(inscriptionTranscriptionArray, INSCRIPTIONTRANSCRIPTION$0);
            }

            /**
             * Sets ith "inscriptionTranscription" element
             */
            @Inject(optional=true) public void setInscriptionTranscriptionArray(int i, org.lidoSchema.TextComplexType inscriptionTranscription)
            {
                generatedSetterHelperImpl(inscriptionTranscription, INSCRIPTIONTRANSCRIPTION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }

            /**
             * Inserts and returns a new empty value (as xml) as the ith "inscriptionTranscription" element
             */
            public org.lidoSchema.TextComplexType insertNewInscriptionTranscription(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.lidoSchema.TextComplexType target = null;
                    target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(INSCRIPTIONTRANSCRIPTION$0, i);
                    return target;
                }
            }

            /**
             * Appends and returns a new empty value (as xml) as the last "inscriptionTranscription" element
             */
            public org.lidoSchema.TextComplexType addNewInscriptionTranscription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.lidoSchema.TextComplexType target = null;
                    target = (org.lidoSchema.TextComplexType)get_store().add_element_user(INSCRIPTIONTRANSCRIPTION$0);
                    return target;
                }
            }

            /**
             * Removes the ith "inscriptionTranscription" element
             */
            public void removeInscriptionTranscription(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INSCRIPTIONTRANSCRIPTION$0, i);
                }
            }

            /**
             * Gets a List of "inscriptionDescription" elements
             */
            public java.util.List<org.lidoSchema.DescriptiveNoteComplexType> getInscriptionDescriptionList()
            {
                final class InscriptionDescriptionList extends java.util.AbstractList<org.lidoSchema.DescriptiveNoteComplexType>
                {
                    @Override
                    public org.lidoSchema.DescriptiveNoteComplexType get(int i)
                        { return InscriptionsImpl.this.getInscriptionDescriptionArray(i); }

                    @Override
                    public org.lidoSchema.DescriptiveNoteComplexType set(int i, org.lidoSchema.DescriptiveNoteComplexType o)
                    {
                      org.lidoSchema.DescriptiveNoteComplexType old = InscriptionsImpl.this.getInscriptionDescriptionArray(i);
                      InscriptionsImpl.this.setInscriptionDescriptionArray(i, o);
                      return old;
                    }

                    @Override
                    public void add(int i, org.lidoSchema.DescriptiveNoteComplexType o)
                        { InscriptionsImpl.this.insertNewInscriptionDescription(i).set(o); }

                    @Override
                    public org.lidoSchema.DescriptiveNoteComplexType remove(int i)
                    {
                      org.lidoSchema.DescriptiveNoteComplexType old = InscriptionsImpl.this.getInscriptionDescriptionArray(i);
                      InscriptionsImpl.this.removeInscriptionDescription(i);
                      return old;
                    }

                    @Override
                    public int size()
                        { return InscriptionsImpl.this.sizeOfInscriptionDescriptionArray(); }

                }

                synchronized (monitor())
                {
                    check_orphaned();
                    return new InscriptionDescriptionList();
                }
            }

            /**
             * Gets array of all "inscriptionDescription" elements
             * @deprecated
             */
            @Deprecated
            public org.lidoSchema.DescriptiveNoteComplexType[] getInscriptionDescriptionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<org.lidoSchema.DescriptiveNoteComplexType> targetList = new java.util.ArrayList<org.lidoSchema.DescriptiveNoteComplexType>();
                    get_store().find_all_element_users(INSCRIPTIONDESCRIPTION$2, targetList);
                    org.lidoSchema.DescriptiveNoteComplexType[] result = new org.lidoSchema.DescriptiveNoteComplexType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }

            /**
             * Gets ith "inscriptionDescription" element
             */
            public org.lidoSchema.DescriptiveNoteComplexType getInscriptionDescriptionArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.lidoSchema.DescriptiveNoteComplexType target = null;
                    target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().find_element_user(INSCRIPTIONDESCRIPTION$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }

            /**
             * Returns number of "inscriptionDescription" element
             */
            public int sizeOfInscriptionDescriptionArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INSCRIPTIONDESCRIPTION$2);
                }
            }

            /**
             * Sets array of all "inscriptionDescription" element  WARNING: This method is not atomicaly synchronized.
             */
            @Inject(optional=true) public void setInscriptionDescriptionArray(org.lidoSchema.DescriptiveNoteComplexType[] inscriptionDescriptionArray)
            {
                check_orphaned();
                arraySetterHelper(inscriptionDescriptionArray, INSCRIPTIONDESCRIPTION$2);
            }

            /**
             * Sets ith "inscriptionDescription" element
             */
            @Inject(optional=true) public void setInscriptionDescriptionArray(int i, org.lidoSchema.DescriptiveNoteComplexType inscriptionDescription)
            {
                generatedSetterHelperImpl(inscriptionDescription, INSCRIPTIONDESCRIPTION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
            }

            /**
             * Inserts and returns a new empty value (as xml) as the ith "inscriptionDescription" element
             */
            public org.lidoSchema.DescriptiveNoteComplexType insertNewInscriptionDescription(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.lidoSchema.DescriptiveNoteComplexType target = null;
                    target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().insert_element_user(INSCRIPTIONDESCRIPTION$2, i);
                    return target;
                }
            }

            /**
             * Appends and returns a new empty value (as xml) as the last "inscriptionDescription" element
             */
            public org.lidoSchema.DescriptiveNoteComplexType addNewInscriptionDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.lidoSchema.DescriptiveNoteComplexType target = null;
                    target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().add_element_user(INSCRIPTIONDESCRIPTION$2);
                    return target;
                }
            }

            /**
             * Removes the ith "inscriptionDescription" element
             */
            public void removeInscriptionDescription(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INSCRIPTIONDESCRIPTION$2, i);
                }
            }

            /**
             * Gets the "type" attribute
             */
            public java.lang.String getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
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
                    return get_store().find_attribute_user(TYPE$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
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
                    get_store().remove_attribute(TYPE$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
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
                    return get_store().find_attribute_user(SORTORDER$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$6);
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
                    target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$6);
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
                    get_store().remove_attribute(SORTORDER$6);
                }
            }
        }
    }
}
