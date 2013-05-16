/*
 * An XML document type.
 * Localname: objectMeasurementsWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ObjectMeasurementsWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one objectMeasurementsWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class ObjectMeasurementsWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectMeasurementsWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectMeasurementsWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTMEASUREMENTSWRAP$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectMeasurementsWrap");
    
    
    /**
     * Gets the "objectMeasurementsWrap" element
     */
    public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap getObjectMeasurementsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap target = null;
            target = (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap)get_store().find_element_user(OBJECTMEASUREMENTSWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectMeasurementsWrap" element
     */
    @Inject(optional=true) public void setObjectMeasurementsWrap(org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap objectMeasurementsWrap)
    {
        generatedSetterHelperImpl(objectMeasurementsWrap, OBJECTMEASUREMENTSWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectMeasurementsWrap" element
     */
    public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap addNewObjectMeasurementsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap target = null;
            target = (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap)get_store().add_element_user(OBJECTMEASUREMENTSWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectMeasurementsWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ObjectMeasurementsWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectMeasurementsWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTMEASUREMENTSSET$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "objectMeasurementsSet");
        
        
        /**
         * Gets a List of "objectMeasurementsSet" elements
         */
        public java.util.List<org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet> getObjectMeasurementsSetList()
        {
            final class ObjectMeasurementsSetList extends java.util.AbstractList<org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet>
            {
                @Override
                public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet get(int i)
                    { return ObjectMeasurementsWrapImpl.this.getObjectMeasurementsSetArray(i); }
                
                @Override
                public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet set(int i, org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet o)
                {
                    org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet old = ObjectMeasurementsWrapImpl.this.getObjectMeasurementsSetArray(i);
                    ObjectMeasurementsWrapImpl.this.setObjectMeasurementsSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet o)
                    { ObjectMeasurementsWrapImpl.this.insertNewObjectMeasurementsSet(i).set(o); }
                
                @Override
                public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet remove(int i)
                {
                    org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet old = ObjectMeasurementsWrapImpl.this.getObjectMeasurementsSetArray(i);
                    ObjectMeasurementsWrapImpl.this.removeObjectMeasurementsSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ObjectMeasurementsWrapImpl.this.sizeOfObjectMeasurementsSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ObjectMeasurementsSetList();
            }
        }
        
        /**
         * Gets array of all "objectMeasurementsSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet[] getObjectMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet> targetList = new java.util.ArrayList<org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet>();
                get_store().find_all_element_users(OBJECTMEASUREMENTSSET$0, targetList);
                org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet[] result = new org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "objectMeasurementsSet" element
         */
        public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet getObjectMeasurementsSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet target = null;
                target = (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet)get_store().find_element_user(OBJECTMEASUREMENTSSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "objectMeasurementsSet" element
         */
        public int sizeOfObjectMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTMEASUREMENTSSET$0);
            }
        }
        
        /**
         * Sets array of all "objectMeasurementsSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setObjectMeasurementsSetArray(org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet[] objectMeasurementsSetArray)
        {
            check_orphaned();
            arraySetterHelper(objectMeasurementsSetArray, OBJECTMEASUREMENTSSET$0);
        }
        
        /**
         * Sets ith "objectMeasurementsSet" element
         */
        @Inject(optional=true) public void setObjectMeasurementsSetArray(int i, org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet objectMeasurementsSet)
        {
            generatedSetterHelperImpl(objectMeasurementsSet, OBJECTMEASUREMENTSSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectMeasurementsSet" element
         */
        public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet insertNewObjectMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet target = null;
                target = (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet)get_store().insert_element_user(OBJECTMEASUREMENTSSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "objectMeasurementsSet" element
         */
        public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet addNewObjectMeasurementsSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet target = null;
                target = (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet)get_store().add_element_user(OBJECTMEASUREMENTSSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "objectMeasurementsSet" element
         */
        public void removeObjectMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTMEASUREMENTSSET$0, i);
            }
        }
        /**
         * An XML objectMeasurementsSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class ObjectMeasurementsSetImpl extends org.lidoSchema.impl.ObjectMeasurementsSetComplexTypeImpl implements org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet
        {
            private static final long serialVersionUID = 1L;
            
            public ObjectMeasurementsSetImpl(org.apache.xmlbeans.SchemaType sType)
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
            @Inject(optional=true) public void setSortorder(java.math.BigInteger sortorder)
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
