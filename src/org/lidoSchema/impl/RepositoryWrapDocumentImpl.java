/*
 * An XML document type.
 * Localname: repositoryWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.RepositoryWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one repositoryWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class RepositoryWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RepositoryWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RepositoryWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPOSITORYWRAP$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "repositoryWrap");
    
    
    /**
     * Gets the "repositoryWrap" element
     */
    public org.lidoSchema.RepositoryWrapDocument.RepositoryWrap getRepositoryWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RepositoryWrapDocument.RepositoryWrap target = null;
            target = (org.lidoSchema.RepositoryWrapDocument.RepositoryWrap)get_store().find_element_user(REPOSITORYWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "repositoryWrap" element
     */
    @Inject(optional=true) public void setRepositoryWrap(org.lidoSchema.RepositoryWrapDocument.RepositoryWrap repositoryWrap)
    {
        generatedSetterHelperImpl(repositoryWrap, REPOSITORYWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "repositoryWrap" element
     */
    public org.lidoSchema.RepositoryWrapDocument.RepositoryWrap addNewRepositoryWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RepositoryWrapDocument.RepositoryWrap target = null;
            target = (org.lidoSchema.RepositoryWrapDocument.RepositoryWrap)get_store().add_element_user(REPOSITORYWRAP$0);
            return target;
        }
    }
    /**
     * An XML repositoryWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class RepositoryWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RepositoryWrapDocument.RepositoryWrap
    {
        private static final long serialVersionUID = 1L;
        
        public RepositoryWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPOSITORYSET$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "repositorySet");
        
        
        /**
         * Gets a List of "repositorySet" elements
         */
        public java.util.List<org.lidoSchema.RepositorySetComplexType> getRepositorySetList()
        {
            final class RepositorySetList extends java.util.AbstractList<org.lidoSchema.RepositorySetComplexType>
            {
                @Override
                public org.lidoSchema.RepositorySetComplexType get(int i)
                    { return RepositoryWrapImpl.this.getRepositorySetArray(i); }
                
                @Override
                public org.lidoSchema.RepositorySetComplexType set(int i, org.lidoSchema.RepositorySetComplexType o)
                {
                    org.lidoSchema.RepositorySetComplexType old = RepositoryWrapImpl.this.getRepositorySetArray(i);
                    RepositoryWrapImpl.this.setRepositorySetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.lidoSchema.RepositorySetComplexType o)
                    { RepositoryWrapImpl.this.insertNewRepositorySet(i).set(o); }
                
                @Override
                public org.lidoSchema.RepositorySetComplexType remove(int i)
                {
                    org.lidoSchema.RepositorySetComplexType old = RepositoryWrapImpl.this.getRepositorySetArray(i);
                    RepositoryWrapImpl.this.removeRepositorySet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RepositoryWrapImpl.this.sizeOfRepositorySetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RepositorySetList();
            }
        }
        
        /**
         * Gets array of all "repositorySet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.RepositorySetComplexType[] getRepositorySetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.RepositorySetComplexType> targetList = new java.util.ArrayList<org.lidoSchema.RepositorySetComplexType>();
                get_store().find_all_element_users(REPOSITORYSET$0, targetList);
                org.lidoSchema.RepositorySetComplexType[] result = new org.lidoSchema.RepositorySetComplexType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "repositorySet" element
         */
        public org.lidoSchema.RepositorySetComplexType getRepositorySetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RepositorySetComplexType target = null;
                target = (org.lidoSchema.RepositorySetComplexType)get_store().find_element_user(REPOSITORYSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "repositorySet" element
         */
        public int sizeOfRepositorySetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPOSITORYSET$0);
            }
        }
        
        /**
         * Sets array of all "repositorySet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRepositorySetArray(org.lidoSchema.RepositorySetComplexType[] repositorySetArray)
        {
            check_orphaned();
            arraySetterHelper(repositorySetArray, REPOSITORYSET$0);
        }
        
        /**
         * Sets ith "repositorySet" element
         */
        @Inject(optional=true) public void setRepositorySetArray(int i, org.lidoSchema.RepositorySetComplexType repositorySet)
        {
            generatedSetterHelperImpl(repositorySet, REPOSITORYSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "repositorySet" element
         */
        public org.lidoSchema.RepositorySetComplexType insertNewRepositorySet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RepositorySetComplexType target = null;
                target = (org.lidoSchema.RepositorySetComplexType)get_store().insert_element_user(REPOSITORYSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "repositorySet" element
         */
        public org.lidoSchema.RepositorySetComplexType addNewRepositorySet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RepositorySetComplexType target = null;
                target = (org.lidoSchema.RepositorySetComplexType)get_store().add_element_user(REPOSITORYSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "repositorySet" element
         */
        public void removeRepositorySet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPOSITORYSET$0, i);
            }
        }
    }
}
