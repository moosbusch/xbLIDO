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
 * A document containing one objectDescriptionWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class ObjectDescriptionWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectDescriptionWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectDescriptionWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTDESCRIPTIONWRAP$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectDescriptionWrap");
    
    
    /**
     * Gets the "objectDescriptionWrap" element
     */
    public org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap getObjectDescriptionWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap target = null;
            target = (org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap)get_store().find_element_user(OBJECTDESCRIPTIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectDescriptionWrap" element
     */
     public void setObjectDescriptionWrap(org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap objectDescriptionWrap)
    {
        generatedSetterHelperImpl(objectDescriptionWrap, OBJECTDESCRIPTIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectDescriptionWrap" element
     */
    public org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap addNewObjectDescriptionWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap target = null;
            target = (org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap)get_store().add_element_user(OBJECTDESCRIPTIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectDescriptionWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ObjectDescriptionWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectDescriptionWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTDESCRIPTIONSET$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "objectDescriptionSet");
        
        
        /**
         * Gets a List of "objectDescriptionSet" elements
         */
        public java.util.List<org.lidoSchema.DescriptiveNoteComplexType> getObjectDescriptionSetList()
        {
            final class ObjectDescriptionSetList extends java.util.AbstractList<org.lidoSchema.DescriptiveNoteComplexType>
            {
                @Override
                public org.lidoSchema.DescriptiveNoteComplexType get(int i)
                    { return ObjectDescriptionWrapImpl.this.getObjectDescriptionSetArray(i); }
                
                @Override
                public org.lidoSchema.DescriptiveNoteComplexType set(int i, org.lidoSchema.DescriptiveNoteComplexType o)
                {
                    org.lidoSchema.DescriptiveNoteComplexType old = ObjectDescriptionWrapImpl.this.getObjectDescriptionSetArray(i);
                    ObjectDescriptionWrapImpl.this.setObjectDescriptionSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.lidoSchema.DescriptiveNoteComplexType o)
                    { ObjectDescriptionWrapImpl.this.insertNewObjectDescriptionSet(i).set(o); }
                
                @Override
                public org.lidoSchema.DescriptiveNoteComplexType remove(int i)
                {
                    org.lidoSchema.DescriptiveNoteComplexType old = ObjectDescriptionWrapImpl.this.getObjectDescriptionSetArray(i);
                    ObjectDescriptionWrapImpl.this.removeObjectDescriptionSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ObjectDescriptionWrapImpl.this.sizeOfObjectDescriptionSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ObjectDescriptionSetList();
            }
        }
        
        /**
         * Gets array of all "objectDescriptionSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.DescriptiveNoteComplexType[] getObjectDescriptionSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.DescriptiveNoteComplexType> targetList = new java.util.ArrayList<org.lidoSchema.DescriptiveNoteComplexType>();
                get_store().find_all_element_users(OBJECTDESCRIPTIONSET$0, targetList);
                org.lidoSchema.DescriptiveNoteComplexType[] result = new org.lidoSchema.DescriptiveNoteComplexType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "objectDescriptionSet" element
         */
        public org.lidoSchema.DescriptiveNoteComplexType getObjectDescriptionSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.DescriptiveNoteComplexType target = null;
                target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().find_element_user(OBJECTDESCRIPTIONSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "objectDescriptionSet" element
         */
        public int sizeOfObjectDescriptionSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTDESCRIPTIONSET$0);
            }
        }
        
        /**
         * Sets array of all "objectDescriptionSet" element  WARNING: This method is not atomicaly synchronized.
         */
         public void setObjectDescriptionSetArray(org.lidoSchema.DescriptiveNoteComplexType[] objectDescriptionSetArray)
        {
            check_orphaned();
            arraySetterHelper(objectDescriptionSetArray, OBJECTDESCRIPTIONSET$0);
        }
        
        /**
         * Sets ith "objectDescriptionSet" element
         */
         public void setObjectDescriptionSetArray(int i, org.lidoSchema.DescriptiveNoteComplexType objectDescriptionSet)
        {
            generatedSetterHelperImpl(objectDescriptionSet, OBJECTDESCRIPTIONSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectDescriptionSet" element
         */
        public org.lidoSchema.DescriptiveNoteComplexType insertNewObjectDescriptionSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.DescriptiveNoteComplexType target = null;
                target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().insert_element_user(OBJECTDESCRIPTIONSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "objectDescriptionSet" element
         */
        public org.lidoSchema.DescriptiveNoteComplexType addNewObjectDescriptionSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.DescriptiveNoteComplexType target = null;
                target = (org.lidoSchema.DescriptiveNoteComplexType)get_store().add_element_user(OBJECTDESCRIPTIONSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "objectDescriptionSet" element
         */
        public void removeObjectDescriptionSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTDESCRIPTIONSET$0, i);
            }
        }
    }
}
