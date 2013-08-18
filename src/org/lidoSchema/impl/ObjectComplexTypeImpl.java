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
/**
 * An XML objectComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ObjectComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectComplexType
{
    private static final long serialVersionUID = 1L;
    
    public ObjectComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTWEBRESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectWebResource");
    private static final javax.xml.namespace.QName OBJECTID$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectID");
    private static final javax.xml.namespace.QName OBJECTNOTE$4 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectNote");
    
    
    /**
     * Gets a List of "objectWebResource" elements
     */
    public java.util.List<org.lidoSchema.WebResourceComplexType> getObjectWebResourceList()
    {
        final class ObjectWebResourceList extends java.util.AbstractList<org.lidoSchema.WebResourceComplexType>
        {
            @Override
            public org.lidoSchema.WebResourceComplexType get(int i)
                { return ObjectComplexTypeImpl.this.getObjectWebResourceArray(i); }
            
            @Override
            public org.lidoSchema.WebResourceComplexType set(int i, org.lidoSchema.WebResourceComplexType o)
            {
                org.lidoSchema.WebResourceComplexType old = ObjectComplexTypeImpl.this.getObjectWebResourceArray(i);
                ObjectComplexTypeImpl.this.setObjectWebResourceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.WebResourceComplexType o)
                { ObjectComplexTypeImpl.this.insertNewObjectWebResource(i).set(o); }
            
            @Override
            public org.lidoSchema.WebResourceComplexType remove(int i)
            {
                org.lidoSchema.WebResourceComplexType old = ObjectComplexTypeImpl.this.getObjectWebResourceArray(i);
                ObjectComplexTypeImpl.this.removeObjectWebResource(i);
                return old;
            }
            
            @Override
            public int size()
                { return ObjectComplexTypeImpl.this.sizeOfObjectWebResourceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ObjectWebResourceList();
        }
    }
    
    /**
     * Gets array of all "objectWebResource" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.WebResourceComplexType[] getObjectWebResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.WebResourceComplexType> targetList = new java.util.ArrayList<org.lidoSchema.WebResourceComplexType>();
            get_store().find_all_element_users(OBJECTWEBRESOURCE$0, targetList);
            org.lidoSchema.WebResourceComplexType[] result = new org.lidoSchema.WebResourceComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objectWebResource" element
     */
    public org.lidoSchema.WebResourceComplexType getObjectWebResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().find_element_user(OBJECTWEBRESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "objectWebResource" element
     */
    public int sizeOfObjectWebResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTWEBRESOURCE$0);
        }
    }
    
    /**
     * Sets array of all "objectWebResource" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setObjectWebResourceArray(org.lidoSchema.WebResourceComplexType[] objectWebResourceArray)
    {
        check_orphaned();
        arraySetterHelper(objectWebResourceArray, OBJECTWEBRESOURCE$0);
    }
    
    /**
     * Sets ith "objectWebResource" element
     */
    @Inject(optional=true) public void setObjectWebResourceArray(int i, org.lidoSchema.WebResourceComplexType objectWebResource)
    {
        generatedSetterHelperImpl(objectWebResource, OBJECTWEBRESOURCE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectWebResource" element
     */
    public org.lidoSchema.WebResourceComplexType insertNewObjectWebResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().insert_element_user(OBJECTWEBRESOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectWebResource" element
     */
    public org.lidoSchema.WebResourceComplexType addNewObjectWebResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.WebResourceComplexType target = null;
            target = (org.lidoSchema.WebResourceComplexType)get_store().add_element_user(OBJECTWEBRESOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "objectWebResource" element
     */
    public void removeObjectWebResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTWEBRESOURCE$0, i);
        }
    }
    
    /**
     * Gets a List of "objectID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getObjectIDList()
    {
        final class ObjectIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return ObjectComplexTypeImpl.this.getObjectIDArray(i); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = ObjectComplexTypeImpl.this.getObjectIDArray(i);
                ObjectComplexTypeImpl.this.setObjectIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { ObjectComplexTypeImpl.this.insertNewObjectID(i).set(o); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = ObjectComplexTypeImpl.this.getObjectIDArray(i);
                ObjectComplexTypeImpl.this.removeObjectID(i);
                return old;
            }
            
            @Override
            public int size()
                { return ObjectComplexTypeImpl.this.sizeOfObjectIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ObjectIDList();
        }
    }
    
    /**
     * Gets array of all "objectID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getObjectIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(OBJECTID$2, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objectID" element
     */
    public org.lidoSchema.IdentifierComplexType getObjectIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(OBJECTID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "objectID" element
     */
    public int sizeOfObjectIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTID$2);
        }
    }
    
    /**
     * Sets array of all "objectID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setObjectIDArray(org.lidoSchema.IdentifierComplexType[] objectIDArray)
    {
        check_orphaned();
        arraySetterHelper(objectIDArray, OBJECTID$2);
    }
    
    /**
     * Sets ith "objectID" element
     */
    @Inject(optional=true) public void setObjectIDArray(int i, org.lidoSchema.IdentifierComplexType objectID)
    {
        generatedSetterHelperImpl(objectID, OBJECTID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewObjectID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(OBJECTID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(OBJECTID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "objectID" element
     */
    public void removeObjectID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTID$2, i);
        }
    }
    
    /**
     * Gets a List of "objectNote" elements
     */
    public java.util.List<org.lidoSchema.ObjectComplexType.ObjectNote> getObjectNoteList()
    {
        final class ObjectNoteList extends java.util.AbstractList<org.lidoSchema.ObjectComplexType.ObjectNote>
        {
            @Override
            public org.lidoSchema.ObjectComplexType.ObjectNote get(int i)
                { return ObjectComplexTypeImpl.this.getObjectNoteArray(i); }
            
            @Override
            public org.lidoSchema.ObjectComplexType.ObjectNote set(int i, org.lidoSchema.ObjectComplexType.ObjectNote o)
            {
                org.lidoSchema.ObjectComplexType.ObjectNote old = ObjectComplexTypeImpl.this.getObjectNoteArray(i);
                ObjectComplexTypeImpl.this.setObjectNoteArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.ObjectComplexType.ObjectNote o)
                { ObjectComplexTypeImpl.this.insertNewObjectNote(i).set(o); }
            
            @Override
            public org.lidoSchema.ObjectComplexType.ObjectNote remove(int i)
            {
                org.lidoSchema.ObjectComplexType.ObjectNote old = ObjectComplexTypeImpl.this.getObjectNoteArray(i);
                ObjectComplexTypeImpl.this.removeObjectNote(i);
                return old;
            }
            
            @Override
            public int size()
                { return ObjectComplexTypeImpl.this.sizeOfObjectNoteArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ObjectNoteList();
        }
    }
    
    /**
     * Gets array of all "objectNote" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ObjectComplexType.ObjectNote[] getObjectNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ObjectComplexType.ObjectNote> targetList = new java.util.ArrayList<org.lidoSchema.ObjectComplexType.ObjectNote>();
            get_store().find_all_element_users(OBJECTNOTE$4, targetList);
            org.lidoSchema.ObjectComplexType.ObjectNote[] result = new org.lidoSchema.ObjectComplexType.ObjectNote[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objectNote" element
     */
    public org.lidoSchema.ObjectComplexType.ObjectNote getObjectNoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectComplexType.ObjectNote target = null;
            target = (org.lidoSchema.ObjectComplexType.ObjectNote)get_store().find_element_user(OBJECTNOTE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "objectNote" element
     */
    public int sizeOfObjectNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTNOTE$4);
        }
    }
    
    /**
     * Sets array of all "objectNote" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setObjectNoteArray(org.lidoSchema.ObjectComplexType.ObjectNote[] objectNoteArray)
    {
        check_orphaned();
        arraySetterHelper(objectNoteArray, OBJECTNOTE$4);
    }
    
    /**
     * Sets ith "objectNote" element
     */
    @Inject(optional=true) public void setObjectNoteArray(int i, org.lidoSchema.ObjectComplexType.ObjectNote objectNote)
    {
        generatedSetterHelperImpl(objectNote, OBJECTNOTE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectNote" element
     */
    public org.lidoSchema.ObjectComplexType.ObjectNote insertNewObjectNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectComplexType.ObjectNote target = null;
            target = (org.lidoSchema.ObjectComplexType.ObjectNote)get_store().insert_element_user(OBJECTNOTE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectNote" element
     */
    public org.lidoSchema.ObjectComplexType.ObjectNote addNewObjectNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectComplexType.ObjectNote target = null;
            target = (org.lidoSchema.ObjectComplexType.ObjectNote)get_store().add_element_user(OBJECTNOTE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "objectNote" element
     */
    public void removeObjectNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTNOTE$4, i);
        }
    }
    /**
     * An XML objectNote(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ObjectComplexType$ObjectNote.
     */
    public static class ObjectNoteImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.ObjectComplexType.ObjectNote
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectNoteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ObjectNoteImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
        @Inject(optional=true) public void setLang(java.lang.String lang)
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
        @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
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
        @Inject(optional=true) public void setLabel(java.lang.String label)
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
        @Inject(optional=true) public void setType(java.lang.String type)
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
    }
}
