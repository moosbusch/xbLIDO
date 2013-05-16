/*
 * XML Type:  materialsTechComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.MaterialsTechComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML materialsTechComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class MaterialsTechComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.MaterialsTechComplexType
{
    private static final long serialVersionUID = 1L;
    
    public MaterialsTechComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMMATERIALSTECH$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "termMaterialsTech");
    private static final javax.xml.namespace.QName EXTENTMATERIALSTECH$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "extentMaterialsTech");
    private static final javax.xml.namespace.QName SOURCEMATERIALSTECH$4 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "sourceMaterialsTech");
    
    
    /**
     * Gets a List of "termMaterialsTech" elements
     */
    public java.util.List<org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech> getTermMaterialsTechList()
    {
        final class TermMaterialsTechList extends java.util.AbstractList<org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech>
        {
            @Override
            public org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech get(int i)
                { return MaterialsTechComplexTypeImpl.this.getTermMaterialsTechArray(i); }
            
            @Override
            public org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech set(int i, org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech o)
            {
                org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech old = MaterialsTechComplexTypeImpl.this.getTermMaterialsTechArray(i);
                MaterialsTechComplexTypeImpl.this.setTermMaterialsTechArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech o)
                { MaterialsTechComplexTypeImpl.this.insertNewTermMaterialsTech(i).set(o); }
            
            @Override
            public org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech remove(int i)
            {
                org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech old = MaterialsTechComplexTypeImpl.this.getTermMaterialsTechArray(i);
                MaterialsTechComplexTypeImpl.this.removeTermMaterialsTech(i);
                return old;
            }
            
            @Override
            public int size()
                { return MaterialsTechComplexTypeImpl.this.sizeOfTermMaterialsTechArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TermMaterialsTechList();
        }
    }
    
    /**
     * Gets array of all "termMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech[] getTermMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech> targetList = new java.util.ArrayList<org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech>();
            get_store().find_all_element_users(TERMMATERIALSTECH$0, targetList);
            org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech[] result = new org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "termMaterialsTech" element
     */
    public org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech getTermMaterialsTechArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech target = null;
            target = (org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech)get_store().find_element_user(TERMMATERIALSTECH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "termMaterialsTech" element
     */
    public int sizeOfTermMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERMMATERIALSTECH$0);
        }
    }
    
    /**
     * Sets array of all "termMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTermMaterialsTechArray(org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech[] termMaterialsTechArray)
    {
        check_orphaned();
        arraySetterHelper(termMaterialsTechArray, TERMMATERIALSTECH$0);
    }
    
    /**
     * Sets ith "termMaterialsTech" element
     */
    @Inject(optional=true) public void setTermMaterialsTechArray(int i, org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech termMaterialsTech)
    {
        generatedSetterHelperImpl(termMaterialsTech, TERMMATERIALSTECH$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "termMaterialsTech" element
     */
    public org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech insertNewTermMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech target = null;
            target = (org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech)get_store().insert_element_user(TERMMATERIALSTECH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "termMaterialsTech" element
     */
    public org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech addNewTermMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech target = null;
            target = (org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech)get_store().add_element_user(TERMMATERIALSTECH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "termMaterialsTech" element
     */
    public void removeTermMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERMMATERIALSTECH$0, i);
        }
    }
    
    /**
     * Gets a List of "extentMaterialsTech" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getExtentMaterialsTechList()
    {
        final class ExtentMaterialsTechList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return MaterialsTechComplexTypeImpl.this.getExtentMaterialsTechArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = MaterialsTechComplexTypeImpl.this.getExtentMaterialsTechArray(i);
                MaterialsTechComplexTypeImpl.this.setExtentMaterialsTechArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { MaterialsTechComplexTypeImpl.this.insertNewExtentMaterialsTech(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = MaterialsTechComplexTypeImpl.this.getExtentMaterialsTechArray(i);
                MaterialsTechComplexTypeImpl.this.removeExtentMaterialsTech(i);
                return old;
            }
            
            @Override
            public int size()
                { return MaterialsTechComplexTypeImpl.this.sizeOfExtentMaterialsTechArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ExtentMaterialsTechList();
        }
    }
    
    /**
     * Gets array of all "extentMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getExtentMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(EXTENTMATERIALSTECH$2, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extentMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType getExtentMaterialsTechArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(EXTENTMATERIALSTECH$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extentMaterialsTech" element
     */
    public int sizeOfExtentMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENTMATERIALSTECH$2);
        }
    }
    
    /**
     * Sets array of all "extentMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setExtentMaterialsTechArray(org.lidoSchema.TextComplexType[] extentMaterialsTechArray)
    {
        check_orphaned();
        arraySetterHelper(extentMaterialsTechArray, EXTENTMATERIALSTECH$2);
    }
    
    /**
     * Sets ith "extentMaterialsTech" element
     */
    @Inject(optional=true) public void setExtentMaterialsTechArray(int i, org.lidoSchema.TextComplexType extentMaterialsTech)
    {
        generatedSetterHelperImpl(extentMaterialsTech, EXTENTMATERIALSTECH$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extentMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType insertNewExtentMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(EXTENTMATERIALSTECH$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extentMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType addNewExtentMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(EXTENTMATERIALSTECH$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "extentMaterialsTech" element
     */
    public void removeExtentMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENTMATERIALSTECH$2, i);
        }
    }
    
    /**
     * Gets a List of "sourceMaterialsTech" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getSourceMaterialsTechList()
    {
        final class SourceMaterialsTechList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return MaterialsTechComplexTypeImpl.this.getSourceMaterialsTechArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = MaterialsTechComplexTypeImpl.this.getSourceMaterialsTechArray(i);
                MaterialsTechComplexTypeImpl.this.setSourceMaterialsTechArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { MaterialsTechComplexTypeImpl.this.insertNewSourceMaterialsTech(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = MaterialsTechComplexTypeImpl.this.getSourceMaterialsTechArray(i);
                MaterialsTechComplexTypeImpl.this.removeSourceMaterialsTech(i);
                return old;
            }
            
            @Override
            public int size()
                { return MaterialsTechComplexTypeImpl.this.sizeOfSourceMaterialsTechArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SourceMaterialsTechList();
        }
    }
    
    /**
     * Gets array of all "sourceMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getSourceMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(SOURCEMATERIALSTECH$4, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sourceMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType getSourceMaterialsTechArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(SOURCEMATERIALSTECH$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sourceMaterialsTech" element
     */
    public int sizeOfSourceMaterialsTechArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEMATERIALSTECH$4);
        }
    }
    
    /**
     * Sets array of all "sourceMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setSourceMaterialsTechArray(org.lidoSchema.TextComplexType[] sourceMaterialsTechArray)
    {
        check_orphaned();
        arraySetterHelper(sourceMaterialsTechArray, SOURCEMATERIALSTECH$4);
    }
    
    /**
     * Sets ith "sourceMaterialsTech" element
     */
    @Inject(optional=true) public void setSourceMaterialsTechArray(int i, org.lidoSchema.TextComplexType sourceMaterialsTech)
    {
        generatedSetterHelperImpl(sourceMaterialsTech, SOURCEMATERIALSTECH$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType insertNewSourceMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(SOURCEMATERIALSTECH$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceMaterialsTech" element
     */
    public org.lidoSchema.TextComplexType addNewSourceMaterialsTech()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(SOURCEMATERIALSTECH$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "sourceMaterialsTech" element
     */
    public void removeSourceMaterialsTech(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEMATERIALSTECH$4, i);
        }
    }
    /**
     * An XML termMaterialsTech(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class TermMaterialsTechImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech
    {
        private static final long serialVersionUID = 1L;
        
        public TermMaterialsTechImpl(org.apache.xmlbeans.SchemaType sType)
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
        @Inject(optional=true) public void setSortorder(java.math.BigInteger sortorder)
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
