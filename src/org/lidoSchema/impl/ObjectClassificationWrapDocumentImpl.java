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
 * A document containing one objectClassificationWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class ObjectClassificationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectClassificationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectClassificationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTCLASSIFICATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectClassificationWrap");
    
    
    /**
     * Gets the "objectClassificationWrap" element
     */
    public org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap getObjectClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap target = null;
            target = (org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap)get_store().find_element_user(OBJECTCLASSIFICATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectClassificationWrap" element
     */
     public void setObjectClassificationWrap(org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap objectClassificationWrap)
    {
        generatedSetterHelperImpl(objectClassificationWrap, OBJECTCLASSIFICATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectClassificationWrap" element
     */
    public org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap addNewObjectClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap target = null;
            target = (org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap)get_store().add_element_user(OBJECTCLASSIFICATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectClassificationWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ObjectClassificationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectClassificationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTWORKTYPEWRAP$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "objectWorkTypeWrap");
        private static final javax.xml.namespace.QName CLASSIFICATIONWRAP$2 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "classificationWrap");
        
        
        /**
         * Gets the "objectWorkTypeWrap" element
         */
        public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
                target = (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().find_element_user(OBJECTWORKTYPEWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "objectWorkTypeWrap" element
         */
         public void setObjectWorkTypeWrap(org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap)
        {
            generatedSetterHelperImpl(objectWorkTypeWrap, OBJECTWORKTYPEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "objectWorkTypeWrap" element
         */
        public org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
                target = (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().add_element_user(OBJECTWORKTYPEWRAP$0);
                return target;
            }
        }
        
        /**
         * Gets the "classificationWrap" element
         */
        public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap getClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ClassificationWrapDocument.ClassificationWrap target = null;
                target = (org.lidoSchema.ClassificationWrapDocument.ClassificationWrap)get_store().find_element_user(CLASSIFICATIONWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "classificationWrap" element
         */
        public boolean isSetClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATIONWRAP$2) != 0;
            }
        }
        
        /**
         * Sets the "classificationWrap" element
         */
         public void setClassificationWrap(org.lidoSchema.ClassificationWrapDocument.ClassificationWrap classificationWrap)
        {
            generatedSetterHelperImpl(classificationWrap, CLASSIFICATIONWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "classificationWrap" element
         */
        public org.lidoSchema.ClassificationWrapDocument.ClassificationWrap addNewClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ClassificationWrapDocument.ClassificationWrap target = null;
                target = (org.lidoSchema.ClassificationWrapDocument.ClassificationWrap)get_store().add_element_user(CLASSIFICATIONWRAP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "classificationWrap" element
         */
        public void unsetClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATIONWRAP$2, 0);
            }
        }
    }
}
