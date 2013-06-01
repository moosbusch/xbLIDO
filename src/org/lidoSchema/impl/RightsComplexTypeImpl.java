/*
 * XML Type:  rightsComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.RightsComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
/**
 * An XML rightsComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class RightsComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RightsComplexType
{
    private static final long serialVersionUID = 1L;

    public RightsComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName RIGHTSTYPE$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "rightsType");
    private static final javax.xml.namespace.QName RIGHTSDATE$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "rightsDate");
    private static final javax.xml.namespace.QName RIGHTSHOLDER$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "rightsHolder");
    private static final javax.xml.namespace.QName CREDITLINE$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "creditLine");


    /**
     * Gets a List of "rightsType" elements
     */
    public java.util.List<org.lidoSchema.ConceptComplexType> getRightsTypeList()
    {
        final class RightsTypeList extends java.util.AbstractList<org.lidoSchema.ConceptComplexType>
        {
            @Override
            public org.lidoSchema.ConceptComplexType get(int i)
                { return RightsComplexTypeImpl.this.getRightsTypeArray(i); }

            @Override
            public org.lidoSchema.ConceptComplexType set(int i, org.lidoSchema.ConceptComplexType o)
            {
                org.lidoSchema.ConceptComplexType old = RightsComplexTypeImpl.this.getRightsTypeArray(i);
                RightsComplexTypeImpl.this.setRightsTypeArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.ConceptComplexType o)
                { RightsComplexTypeImpl.this.insertNewRightsType(i).set(o); }

            @Override
            public org.lidoSchema.ConceptComplexType remove(int i)
            {
                org.lidoSchema.ConceptComplexType old = RightsComplexTypeImpl.this.getRightsTypeArray(i);
                RightsComplexTypeImpl.this.removeRightsType(i);
                return old;
            }

            @Override
            public int size()
                { return RightsComplexTypeImpl.this.sizeOfRightsTypeArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new RightsTypeList();
        }
    }

    /**
     * Gets array of all "rightsType" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ConceptComplexType[] getRightsTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ConceptComplexType> targetList = new java.util.ArrayList<org.lidoSchema.ConceptComplexType>();
            get_store().find_all_element_users(RIGHTSTYPE$0, targetList);
            org.lidoSchema.ConceptComplexType[] result = new org.lidoSchema.ConceptComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "rightsType" element
     */
    public org.lidoSchema.ConceptComplexType getRightsTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(RIGHTSTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "rightsType" element
     */
    public int sizeOfRightsTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHTSTYPE$0);
        }
    }

    /**
     * Sets array of all "rightsType" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRightsTypeArray(org.lidoSchema.ConceptComplexType[] rightsTypeArray)
    {
        check_orphaned();
        arraySetterHelper(rightsTypeArray, RIGHTSTYPE$0);
    }

    /**
     * Sets ith "rightsType" element
     */
    @Inject(optional=true) public void setRightsTypeArray(int i, org.lidoSchema.ConceptComplexType rightsType)
    {
        generatedSetterHelperImpl(rightsType, RIGHTSTYPE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "rightsType" element
     */
    public org.lidoSchema.ConceptComplexType insertNewRightsType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().insert_element_user(RIGHTSTYPE$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "rightsType" element
     */
    public org.lidoSchema.ConceptComplexType addNewRightsType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(RIGHTSTYPE$0);
            return target;
        }
    }

    /**
     * Removes the ith "rightsType" element
     */
    public void removeRightsType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHTSTYPE$0, i);
        }
    }

    /**
     * Gets the "rightsDate" element
     */
    public org.lidoSchema.DateComplexType getRightsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateComplexType target = null;
            target = (org.lidoSchema.DateComplexType)get_store().find_element_user(RIGHTSDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "rightsDate" element
     */
    public boolean isSetRightsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHTSDATE$2) != 0;
        }
    }

    /**
     * Sets the "rightsDate" element
     */
    @Inject(optional=true) public void setRightsDate(org.lidoSchema.DateComplexType rightsDate)
    {
        generatedSetterHelperImpl(rightsDate, RIGHTSDATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "rightsDate" element
     */
    public org.lidoSchema.DateComplexType addNewRightsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateComplexType target = null;
            target = (org.lidoSchema.DateComplexType)get_store().add_element_user(RIGHTSDATE$2);
            return target;
        }
    }

    /**
     * Unsets the "rightsDate" element
     */
    public void unsetRightsDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHTSDATE$2, 0);
        }
    }

    /**
     * Gets a List of "rightsHolder" elements
     */
    public java.util.List<org.lidoSchema.RightsComplexType.RightsHolder> getRightsHolderList()
    {
        final class RightsHolderList extends java.util.AbstractList<org.lidoSchema.RightsComplexType.RightsHolder>
        {
            @Override
            public org.lidoSchema.RightsComplexType.RightsHolder get(int i)
                { return RightsComplexTypeImpl.this.getRightsHolderArray(i); }

            @Override
            public org.lidoSchema.RightsComplexType.RightsHolder set(int i, org.lidoSchema.RightsComplexType.RightsHolder o)
            {
                org.lidoSchema.RightsComplexType.RightsHolder old = RightsComplexTypeImpl.this.getRightsHolderArray(i);
                RightsComplexTypeImpl.this.setRightsHolderArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.RightsComplexType.RightsHolder o)
                { RightsComplexTypeImpl.this.insertNewRightsHolder(i).set(o); }

            @Override
            public org.lidoSchema.RightsComplexType.RightsHolder remove(int i)
            {
                org.lidoSchema.RightsComplexType.RightsHolder old = RightsComplexTypeImpl.this.getRightsHolderArray(i);
                RightsComplexTypeImpl.this.removeRightsHolder(i);
                return old;
            }

            @Override
            public int size()
                { return RightsComplexTypeImpl.this.sizeOfRightsHolderArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new RightsHolderList();
        }
    }

    /**
     * Gets array of all "rightsHolder" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.RightsComplexType.RightsHolder[] getRightsHolderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.RightsComplexType.RightsHolder> targetList = new java.util.ArrayList<org.lidoSchema.RightsComplexType.RightsHolder>();
            get_store().find_all_element_users(RIGHTSHOLDER$4, targetList);
            org.lidoSchema.RightsComplexType.RightsHolder[] result = new org.lidoSchema.RightsComplexType.RightsHolder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "rightsHolder" element
     */
    public org.lidoSchema.RightsComplexType.RightsHolder getRightsHolderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RightsComplexType.RightsHolder target = null;
            target = (org.lidoSchema.RightsComplexType.RightsHolder)get_store().find_element_user(RIGHTSHOLDER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "rightsHolder" element
     */
    public int sizeOfRightsHolderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHTSHOLDER$4);
        }
    }

    /**
     * Sets array of all "rightsHolder" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRightsHolderArray(org.lidoSchema.RightsComplexType.RightsHolder[] rightsHolderArray)
    {
        check_orphaned();
        arraySetterHelper(rightsHolderArray, RIGHTSHOLDER$4);
    }

    /**
     * Sets ith "rightsHolder" element
     */
    @Inject(optional=true) public void setRightsHolderArray(int i, org.lidoSchema.RightsComplexType.RightsHolder rightsHolder)
    {
        generatedSetterHelperImpl(rightsHolder, RIGHTSHOLDER$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "rightsHolder" element
     */
    public org.lidoSchema.RightsComplexType.RightsHolder insertNewRightsHolder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RightsComplexType.RightsHolder target = null;
            target = (org.lidoSchema.RightsComplexType.RightsHolder)get_store().insert_element_user(RIGHTSHOLDER$4, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "rightsHolder" element
     */
    public org.lidoSchema.RightsComplexType.RightsHolder addNewRightsHolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RightsComplexType.RightsHolder target = null;
            target = (org.lidoSchema.RightsComplexType.RightsHolder)get_store().add_element_user(RIGHTSHOLDER$4);
            return target;
        }
    }

    /**
     * Removes the ith "rightsHolder" element
     */
    public void removeRightsHolder(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHTSHOLDER$4, i);
        }
    }

    /**
     * Gets a List of "creditLine" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getCreditLineList()
    {
        final class CreditLineList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return RightsComplexTypeImpl.this.getCreditLineArray(i); }

            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = RightsComplexTypeImpl.this.getCreditLineArray(i);
                RightsComplexTypeImpl.this.setCreditLineArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { RightsComplexTypeImpl.this.insertNewCreditLine(i).set(o); }

            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = RightsComplexTypeImpl.this.getCreditLineArray(i);
                RightsComplexTypeImpl.this.removeCreditLine(i);
                return old;
            }

            @Override
            public int size()
                { return RightsComplexTypeImpl.this.sizeOfCreditLineArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new CreditLineList();
        }
    }

    /**
     * Gets array of all "creditLine" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getCreditLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(CREDITLINE$6, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "creditLine" element
     */
    public org.lidoSchema.TextComplexType getCreditLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(CREDITLINE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "creditLine" element
     */
    public int sizeOfCreditLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITLINE$6);
        }
    }

    /**
     * Sets array of all "creditLine" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCreditLineArray(org.lidoSchema.TextComplexType[] creditLineArray)
    {
        check_orphaned();
        arraySetterHelper(creditLineArray, CREDITLINE$6);
    }

    /**
     * Sets ith "creditLine" element
     */
    @Inject(optional=true) public void setCreditLineArray(int i, org.lidoSchema.TextComplexType creditLine)
    {
        generatedSetterHelperImpl(creditLine, CREDITLINE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "creditLine" element
     */
    public org.lidoSchema.TextComplexType insertNewCreditLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(CREDITLINE$6, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "creditLine" element
     */
    public org.lidoSchema.TextComplexType addNewCreditLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(CREDITLINE$6);
            return target;
        }
    }

    /**
     * Removes the ith "creditLine" element
     */
    public void removeCreditLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITLINE$6, i);
        }
    }
    /**
     * An XML rightsHolder(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class RightsHolderImpl extends org.lidoSchema.impl.LegalBodyRefComplexTypeImpl implements org.lidoSchema.RightsComplexType.RightsHolder
    {
        private static final long serialVersionUID = 1L;

        public RightsHolderImpl(org.apache.xmlbeans.SchemaType sType)
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
