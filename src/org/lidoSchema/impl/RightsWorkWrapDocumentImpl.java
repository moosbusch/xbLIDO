/*
 * An XML document type.
 * Localname: rightsWorkWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.RightsWorkWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
/**
 * A document containing one rightsWorkWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class RightsWorkWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RightsWorkWrapDocument
{
    private static final long serialVersionUID = 1L;

    public RightsWorkWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName RIGHTSWORKWRAP$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "rightsWorkWrap");


    /**
     * Gets the "rightsWorkWrap" element
     */
    public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap getRightsWorkWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap target = null;
            target = (org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap)get_store().find_element_user(RIGHTSWORKWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "rightsWorkWrap" element
     */
    @Inject(optional=true) public void setRightsWorkWrap(org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap rightsWorkWrap)
    {
        generatedSetterHelperImpl(rightsWorkWrap, RIGHTSWORKWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "rightsWorkWrap" element
     */
    public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap addNewRightsWorkWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap target = null;
            target = (org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap)get_store().add_element_user(RIGHTSWORKWRAP$0);
            return target;
        }
    }
    /**
     * An XML rightsWorkWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class RightsWorkWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap
    {
        private static final long serialVersionUID = 1L;

        public RightsWorkWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName RIGHTSWORKSET$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "rightsWorkSet");


        /**
         * Gets a List of "rightsWorkSet" elements
         */
        public java.util.List<org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet> getRightsWorkSetList()
        {
            final class RightsWorkSetList extends java.util.AbstractList<org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet>
            {
                @Override
                public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet get(int i)
                    { return RightsWorkWrapImpl.this.getRightsWorkSetArray(i); }

                @Override
                public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet set(int i, org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet o)
                {
                    org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet old = RightsWorkWrapImpl.this.getRightsWorkSetArray(i);
                    RightsWorkWrapImpl.this.setRightsWorkSetArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet o)
                    { RightsWorkWrapImpl.this.insertNewRightsWorkSet(i).set(o); }

                @Override
                public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet remove(int i)
                {
                    org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet old = RightsWorkWrapImpl.this.getRightsWorkSetArray(i);
                    RightsWorkWrapImpl.this.removeRightsWorkSet(i);
                    return old;
                }

                @Override
                public int size()
                    { return RightsWorkWrapImpl.this.sizeOfRightsWorkSetArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new RightsWorkSetList();
            }
        }

        /**
         * Gets array of all "rightsWorkSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet[] getRightsWorkSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet> targetList = new java.util.ArrayList<org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet>();
                get_store().find_all_element_users(RIGHTSWORKSET$0, targetList);
                org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet[] result = new org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "rightsWorkSet" element
         */
        public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet getRightsWorkSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet target = null;
                target = (org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet)get_store().find_element_user(RIGHTSWORKSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "rightsWorkSet" element
         */
        public int sizeOfRightsWorkSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RIGHTSWORKSET$0);
            }
        }

        /**
         * Sets array of all "rightsWorkSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRightsWorkSetArray(org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet[] rightsWorkSetArray)
        {
            check_orphaned();
            arraySetterHelper(rightsWorkSetArray, RIGHTSWORKSET$0);
        }

        /**
         * Sets ith "rightsWorkSet" element
         */
        @Inject(optional=true) public void setRightsWorkSetArray(int i, org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet rightsWorkSet)
        {
            generatedSetterHelperImpl(rightsWorkSet, RIGHTSWORKSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "rightsWorkSet" element
         */
        public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet insertNewRightsWorkSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet target = null;
                target = (org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet)get_store().insert_element_user(RIGHTSWORKSET$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "rightsWorkSet" element
         */
        public org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet addNewRightsWorkSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet target = null;
                target = (org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet)get_store().add_element_user(RIGHTSWORKSET$0);
                return target;
            }
        }

        /**
         * Removes the ith "rightsWorkSet" element
         */
        public void removeRightsWorkSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RIGHTSWORKSET$0, i);
            }
        }
        /**
         * An XML rightsWorkSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class RightsWorkSetImpl extends org.lidoSchema.impl.RightsComplexTypeImpl implements org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap.RightsWorkSet
        {
            private static final long serialVersionUID = 1L;

            public RightsWorkSetImpl(org.apache.xmlbeans.SchemaType sType)
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
