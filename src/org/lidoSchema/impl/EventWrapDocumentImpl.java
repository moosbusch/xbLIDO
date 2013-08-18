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
 * A document containing one eventWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class EventWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.EventWrapDocument
{
    private static final long serialVersionUID = 1L;

    public EventWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName EVENTWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "eventWrap");


    /**
     * Gets the "eventWrap" element
     */
    public org.lidoSchema.EventWrapDocument.EventWrap getEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventWrapDocument.EventWrap target = null;
            target = (org.lidoSchema.EventWrapDocument.EventWrap)get_store().find_element_user(EVENTWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "eventWrap" element
     */
    @Inject(optional=true) public void setEventWrap(org.lidoSchema.EventWrapDocument.EventWrap eventWrap)
    {
        generatedSetterHelperImpl(eventWrap, EVENTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "eventWrap" element
     */
    public org.lidoSchema.EventWrapDocument.EventWrap addNewEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventWrapDocument.EventWrap target = null;
            target = (org.lidoSchema.EventWrapDocument.EventWrap)get_store().add_element_user(EVENTWRAP$0);
            return target;
        }
    }
    /**
     * An XML eventWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class EventWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.EventWrapDocument.EventWrap
    {
        private static final long serialVersionUID = 1L;

        public EventWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName EVENTSET$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "eventSet");


        /**
         * Gets a List of "eventSet" elements
         */
        public java.util.List<org.lidoSchema.EventWrapDocument.EventWrap.EventSet> getEventSetList()
        {
            final class EventSetList extends java.util.AbstractList<org.lidoSchema.EventWrapDocument.EventWrap.EventSet>
            {
                @Override
                public org.lidoSchema.EventWrapDocument.EventWrap.EventSet get(int i)
                    { return EventWrapImpl.this.getEventSetArray(i); }

                @Override
                public org.lidoSchema.EventWrapDocument.EventWrap.EventSet set(int i, org.lidoSchema.EventWrapDocument.EventWrap.EventSet o)
                {
                    org.lidoSchema.EventWrapDocument.EventWrap.EventSet old = EventWrapImpl.this.getEventSetArray(i);
                    EventWrapImpl.this.setEventSetArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.EventWrapDocument.EventWrap.EventSet o)
                    { EventWrapImpl.this.insertNewEventSet(i).set(o); }

                @Override
                public org.lidoSchema.EventWrapDocument.EventWrap.EventSet remove(int i)
                {
                    org.lidoSchema.EventWrapDocument.EventWrap.EventSet old = EventWrapImpl.this.getEventSetArray(i);
                    EventWrapImpl.this.removeEventSet(i);
                    return old;
                }

                @Override
                public int size()
                    { return EventWrapImpl.this.sizeOfEventSetArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new EventSetList();
            }
        }

        /**
         * Gets array of all "eventSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.EventWrapDocument.EventWrap.EventSet[] getEventSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.EventWrapDocument.EventWrap.EventSet> targetList = new java.util.ArrayList<org.lidoSchema.EventWrapDocument.EventWrap.EventSet>();
                get_store().find_all_element_users(EVENTSET$0, targetList);
                org.lidoSchema.EventWrapDocument.EventWrap.EventSet[] result = new org.lidoSchema.EventWrapDocument.EventWrap.EventSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "eventSet" element
         */
        public org.lidoSchema.EventWrapDocument.EventWrap.EventSet getEventSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.EventWrapDocument.EventWrap.EventSet target = null;
                target = (org.lidoSchema.EventWrapDocument.EventWrap.EventSet)get_store().find_element_user(EVENTSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "eventSet" element
         */
        public int sizeOfEventSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENTSET$0);
            }
        }

        /**
         * Sets array of all "eventSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setEventSetArray(org.lidoSchema.EventWrapDocument.EventWrap.EventSet[] eventSetArray)
        {
            check_orphaned();
            arraySetterHelper(eventSetArray, EVENTSET$0);
        }

        /**
         * Sets ith "eventSet" element
         */
        @Inject(optional=true) public void setEventSetArray(int i, org.lidoSchema.EventWrapDocument.EventWrap.EventSet eventSet)
        {
            generatedSetterHelperImpl(eventSet, EVENTSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "eventSet" element
         */
        public org.lidoSchema.EventWrapDocument.EventWrap.EventSet insertNewEventSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.EventWrapDocument.EventWrap.EventSet target = null;
                target = (org.lidoSchema.EventWrapDocument.EventWrap.EventSet)get_store().insert_element_user(EVENTSET$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "eventSet" element
         */
        public org.lidoSchema.EventWrapDocument.EventWrap.EventSet addNewEventSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.EventWrapDocument.EventWrap.EventSet target = null;
                target = (org.lidoSchema.EventWrapDocument.EventWrap.EventSet)get_store().add_element_user(EVENTSET$0);
                return target;
            }
        }

        /**
         * Removes the ith "eventSet" element
         */
        public void removeEventSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENTSET$0, i);
            }
        }
        /**
         * An XML eventSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class EventSetImpl extends org.lidoSchema.impl.EventSetComplexTypeImpl implements org.lidoSchema.EventWrapDocument.EventWrap.EventSet
        {
            private static final long serialVersionUID = 1L;

            public EventSetImpl(org.apache.xmlbeans.SchemaType sType)
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
