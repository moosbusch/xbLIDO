/*
 * An XML document type.
 * Localname: resourceWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ResourceWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one resourceWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class ResourceWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ResourceWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEWRAP$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceWrap");
    
    
    /**
     * Gets the "resourceWrap" element
     */
    public org.lidoSchema.ResourceWrapDocument.ResourceWrap getResourceWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceWrapDocument.ResourceWrap target = null;
            target = (org.lidoSchema.ResourceWrapDocument.ResourceWrap)get_store().find_element_user(RESOURCEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceWrap" element
     */
    @Inject(optional=true) public void setResourceWrap(org.lidoSchema.ResourceWrapDocument.ResourceWrap resourceWrap)
    {
        generatedSetterHelperImpl(resourceWrap, RESOURCEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceWrap" element
     */
    public org.lidoSchema.ResourceWrapDocument.ResourceWrap addNewResourceWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceWrapDocument.ResourceWrap target = null;
            target = (org.lidoSchema.ResourceWrapDocument.ResourceWrap)get_store().add_element_user(RESOURCEWRAP$0);
            return target;
        }
    }
    /**
     * An XML resourceWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ResourceWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ResourceWrapDocument.ResourceWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCESET$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceSet");
        
        
        /**
         * Gets a List of "resourceSet" elements
         */
        public java.util.List<org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet> getResourceSetList()
        {
            final class ResourceSetList extends java.util.AbstractList<org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet>
            {
                @Override
                public org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet get(int i)
                    { return ResourceWrapImpl.this.getResourceSetArray(i); }
                
                @Override
                public org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet set(int i, org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet o)
                {
                    org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet old = ResourceWrapImpl.this.getResourceSetArray(i);
                    ResourceWrapImpl.this.setResourceSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet o)
                    { ResourceWrapImpl.this.insertNewResourceSet(i).set(o); }
                
                @Override
                public org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet remove(int i)
                {
                    org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet old = ResourceWrapImpl.this.getResourceSetArray(i);
                    ResourceWrapImpl.this.removeResourceSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceWrapImpl.this.sizeOfResourceSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceSetList();
            }
        }
        
        /**
         * Gets array of all "resourceSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet[] getResourceSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet> targetList = new java.util.ArrayList<org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet>();
                get_store().find_all_element_users(RESOURCESET$0, targetList);
                org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet[] result = new org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceSet" element
         */
        public org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet getResourceSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet target = null;
                target = (org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet)get_store().find_element_user(RESOURCESET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceSet" element
         */
        public int sizeOfResourceSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCESET$0);
            }
        }
        
        /**
         * Sets array of all "resourceSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceSetArray(org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet[] resourceSetArray)
        {
            check_orphaned();
            arraySetterHelper(resourceSetArray, RESOURCESET$0);
        }
        
        /**
         * Sets ith "resourceSet" element
         */
        @Inject(optional=true) public void setResourceSetArray(int i, org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet resourceSet)
        {
            generatedSetterHelperImpl(resourceSet, RESOURCESET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceSet" element
         */
        public org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet insertNewResourceSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet target = null;
                target = (org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet)get_store().insert_element_user(RESOURCESET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceSet" element
         */
        public org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet addNewResourceSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet target = null;
                target = (org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet)get_store().add_element_user(RESOURCESET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceSet" element
         */
        public void removeResourceSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCESET$0, i);
            }
        }
        /**
         * An XML resourceSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public static class ResourceSetImpl extends org.lidoSchema.impl.ResourceSetComplexTypeImpl implements org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet
        {
            private static final long serialVersionUID = 1L;
            
            public ResourceSetImpl(org.apache.xmlbeans.SchemaType sType)
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
