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
package org.lidoSchema.impl;  
/**
 * An XML recordInfoSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class RecordInfoSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RecordInfoSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public RecordInfoSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDINFOID$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "recordInfoID");
    private static final javax.xml.namespace.QName RECORDINFOLINK$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "recordInfoLink");
    private static final javax.xml.namespace.QName RECORDMETADATADATE$4 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "recordMetadataDate");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
    
    
    /**
     * Gets a List of "recordInfoID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getRecordInfoIDList()
    {
        final class RecordInfoIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return RecordInfoSetComplexTypeImpl.this.getRecordInfoIDArray(i); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = RecordInfoSetComplexTypeImpl.this.getRecordInfoIDArray(i);
                RecordInfoSetComplexTypeImpl.this.setRecordInfoIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { RecordInfoSetComplexTypeImpl.this.insertNewRecordInfoID(i).set(o); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = RecordInfoSetComplexTypeImpl.this.getRecordInfoIDArray(i);
                RecordInfoSetComplexTypeImpl.this.removeRecordInfoID(i);
                return old;
            }
            
            @Override
            public int size()
                { return RecordInfoSetComplexTypeImpl.this.sizeOfRecordInfoIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RecordInfoIDList();
        }
    }
    
    /**
     * Gets array of all "recordInfoID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getRecordInfoIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(RECORDINFOID$0, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recordInfoID" element
     */
    public org.lidoSchema.IdentifierComplexType getRecordInfoIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(RECORDINFOID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recordInfoID" element
     */
    public int sizeOfRecordInfoIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDINFOID$0);
        }
    }
    
    /**
     * Sets array of all "recordInfoID" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setRecordInfoIDArray(org.lidoSchema.IdentifierComplexType[] recordInfoIDArray)
    {
        check_orphaned();
        arraySetterHelper(recordInfoIDArray, RECORDINFOID$0);
    }
    
    /**
     * Sets ith "recordInfoID" element
     */
     public void setRecordInfoIDArray(int i, org.lidoSchema.IdentifierComplexType recordInfoID)
    {
        generatedSetterHelperImpl(recordInfoID, RECORDINFOID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordInfoID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewRecordInfoID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(RECORDINFOID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordInfoID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewRecordInfoID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(RECORDINFOID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "recordInfoID" element
     */
    public void removeRecordInfoID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDINFOID$0, i);
        }
    }
    
    /**
     * Gets a List of "recordInfoLink" elements
     */
    public java.util.List<org.lidoSchema.WebResourceComplexType> getRecordInfoLinkList()
    {
        final class RecordInfoLinkList extends java.util.AbstractList<org.lidoSchema.WebResourceComplexType>
        {
            @Override
            public org.lidoSchema.WebResourceComplexType get(int i)
                { return RecordInfoSetComplexTypeImpl.this.getRecordInfoLinkArray(i); }
            
            @Override
            public org.lidoSchema.WebResourceComplexType set(int i, org.lidoSchema.WebResourceComplexType o)
            {
                org.lidoSchema.WebResourceComplexType old = RecordInfoSetComplexTypeImpl.this.getRecordInfoLinkArray(i);
                RecordInfoSetComplexTypeImpl.this.setRecordInfoLinkArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.WebResourceComplexType o)
                { RecordInfoSetComplexTypeImpl.this.insertNewRecordInfoLink(i).set(o); }
            
            @Override
            public org.lidoSchema.WebResourceComplexType remove(int i)
            {
                org.lidoSchema.WebResourceComplexType old = RecordInfoSetComplexTypeImpl.this.getRecordInfoLinkArray(i);
                RecordInfoSetComplexTypeImpl.this.removeRecordInfoLink(i);
                return old;
            }
            
            @Override
            public int size()
                { return RecordInfoSetComplexTypeImpl.this.sizeOfRecordInfoLinkArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RecordInfoLinkList();
        }
    }
    
    /**
     * Gets array of all "recordInfoLink" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.WebResourceComplexType[] getRecordInfoLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.WebResourceComplexType> targetList = new java.util.ArrayList<org.lidoSchema.WebResourceComplexType>();
            get_store().find_all_element_users(RECORDINFOLINK$2, targetList);
            org.lidoSchema.WebResourceComplexType[] result = new org.lidoSchema.WebResourceComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recordInfoLink" element
     */
    public org.lidoSchema.WebResourceComplexType getRecordInfoLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().find_element_user(RECORDINFOLINK$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recordInfoLink" element
     */
    public int sizeOfRecordInfoLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDINFOLINK$2);
        }
    }
    
    /**
     * Sets array of all "recordInfoLink" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setRecordInfoLinkArray(org.lidoSchema.WebResourceComplexType[] recordInfoLinkArray)
    {
        check_orphaned();
        arraySetterHelper(recordInfoLinkArray, RECORDINFOLINK$2);
    }
    
    /**
     * Sets ith "recordInfoLink" element
     */
     public void setRecordInfoLinkArray(int i, org.lidoSchema.WebResourceComplexType recordInfoLink)
    {
        generatedSetterHelperImpl(recordInfoLink, RECORDINFOLINK$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordInfoLink" element
     */
    public org.lidoSchema.WebResourceComplexType insertNewRecordInfoLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().insert_element_user(RECORDINFOLINK$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordInfoLink" element
     */
    public org.lidoSchema.WebResourceComplexType addNewRecordInfoLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().add_element_user(RECORDINFOLINK$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "recordInfoLink" element
     */
    public void removeRecordInfoLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDINFOLINK$2, i);
        }
    }
    
    /**
     * Gets a List of "recordMetadataDate" elements
     */
    public java.util.List<org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate> getRecordMetadataDateList()
    {
        final class RecordMetadataDateList extends java.util.AbstractList<org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate>
        {
            @Override
            public org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate get(int i)
                { return RecordInfoSetComplexTypeImpl.this.getRecordMetadataDateArray(i); }
            
            @Override
            public org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate set(int i, org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate o)
            {
                org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate old = RecordInfoSetComplexTypeImpl.this.getRecordMetadataDateArray(i);
                RecordInfoSetComplexTypeImpl.this.setRecordMetadataDateArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate o)
                { RecordInfoSetComplexTypeImpl.this.insertNewRecordMetadataDate(i).set(o); }
            
            @Override
            public org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate remove(int i)
            {
                org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate old = RecordInfoSetComplexTypeImpl.this.getRecordMetadataDateArray(i);
                RecordInfoSetComplexTypeImpl.this.removeRecordMetadataDate(i);
                return old;
            }
            
            @Override
            public int size()
                { return RecordInfoSetComplexTypeImpl.this.sizeOfRecordMetadataDateArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RecordMetadataDateList();
        }
    }
    
    /**
     * Gets array of all "recordMetadataDate" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate[] getRecordMetadataDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate> targetList = new java.util.ArrayList<org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate>();
            get_store().find_all_element_users(RECORDMETADATADATE$4, targetList);
            org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate[] result = new org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recordMetadataDate" element
     */
    public org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate getRecordMetadataDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate target = null;
            target = (org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate)get_store().find_element_user(RECORDMETADATADATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recordMetadataDate" element
     */
    public int sizeOfRecordMetadataDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDMETADATADATE$4);
        }
    }
    
    /**
     * Sets array of all "recordMetadataDate" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setRecordMetadataDateArray(org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate[] recordMetadataDateArray)
    {
        check_orphaned();
        arraySetterHelper(recordMetadataDateArray, RECORDMETADATADATE$4);
    }
    
    /**
     * Sets ith "recordMetadataDate" element
     */
     public void setRecordMetadataDateArray(int i, org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate recordMetadataDate)
    {
        generatedSetterHelperImpl(recordMetadataDate, RECORDMETADATADATE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordMetadataDate" element
     */
    public org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate insertNewRecordMetadataDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate target = null;
            target = (org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate)get_store().insert_element_user(RECORDMETADATADATE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordMetadataDate" element
     */
    public org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate addNewRecordMetadataDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate target = null;
            target = (org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate)get_store().add_element_user(RECORDMETADATADATE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "recordMetadataDate" element
     */
    public void removeRecordMetadataDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDMETADATADATE$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
            return get_store().find_attribute_user(TYPE$6) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
     public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
            get_store().remove_attribute(TYPE$6);
        }
    }
    /**
     * An XML recordMetadataDate(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.RecordInfoSetComplexType$RecordMetadataDate.
     */
    public static class RecordMetadataDateImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate
    {
        private static final long serialVersionUID = 1L;
        
        public RecordMetadataDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RecordMetadataDateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LANG$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$2 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$4 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
        private static final javax.xml.namespace.QName SOURCE$8 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "source");
        
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
         public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }
        
        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                return target;
            }
        }
        
        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$2) != null;
            }
        }
        
        /**
         * Sets the "encodinganalog" attribute
         */
         public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.setStringValue(encodinganalog);
            }
        }
        
        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.set(encodinganalog);
            }
        }
        
        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$2);
            }
        }
        
        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                return target;
            }
        }
        
        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$4) != null;
            }
        }
        
        /**
         * Sets the "label" attribute
         */
         public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$4);
                }
                target.setStringValue(label);
            }
        }
        
        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$4);
                }
                target.set(label);
            }
        }
        
        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
                return get_store().find_attribute_user(TYPE$6) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
         public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
                get_store().remove_attribute(TYPE$6);
            }
        }
        
        /**
         * Gets the "source" attribute
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$8);
                return target;
            }
        }
        
        /**
         * True if has "source" attribute
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SOURCE$8) != null;
            }
        }
        
        /**
         * Sets the "source" attribute
         */
         public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$8);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" attribute
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOURCE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOURCE$8);
                }
                target.set(source);
            }
        }
        
        /**
         * Unsets the "source" attribute
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SOURCE$8);
            }
        }
    }
}
