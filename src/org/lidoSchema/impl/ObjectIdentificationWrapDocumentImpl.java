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
 * A document containing one objectIdentificationWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class ObjectIdentificationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectIdentificationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectIdentificationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTIDENTIFICATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectIdentificationWrap");
    
    
    /**
     * Gets the "objectIdentificationWrap" element
     */
    public org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap getObjectIdentificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap target = null;
            target = (org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap)get_store().find_element_user(OBJECTIDENTIFICATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectIdentificationWrap" element
     */
    @Inject(optional=true) public void setObjectIdentificationWrap(org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap objectIdentificationWrap)
    {
        generatedSetterHelperImpl(objectIdentificationWrap, OBJECTIDENTIFICATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectIdentificationWrap" element
     */
    public org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap addNewObjectIdentificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap target = null;
            target = (org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap)get_store().add_element_user(OBJECTIDENTIFICATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectIdentificationWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ObjectIdentificationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectIdentificationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLEWRAP$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "titleWrap");
        private static final javax.xml.namespace.QName INSCRIPTIONSWRAP$2 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "inscriptionsWrap");
        private static final javax.xml.namespace.QName REPOSITORYWRAP$4 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "repositoryWrap");
        private static final javax.xml.namespace.QName DISPLAYSTATEEDITIONWRAP$6 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "displayStateEditionWrap");
        private static final javax.xml.namespace.QName OBJECTDESCRIPTIONWRAP$8 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "objectDescriptionWrap");
        private static final javax.xml.namespace.QName OBJECTMEASUREMENTSWRAP$10 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "objectMeasurementsWrap");
        
        
        /**
         * Gets the "titleWrap" element
         */
        public org.lidoSchema.TitleWrapDocument.TitleWrap getTitleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.TitleWrapDocument.TitleWrap target = null;
                target = (org.lidoSchema.TitleWrapDocument.TitleWrap)get_store().find_element_user(TITLEWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "titleWrap" element
         */
        @Inject(optional=true) public void setTitleWrap(org.lidoSchema.TitleWrapDocument.TitleWrap titleWrap)
        {
            generatedSetterHelperImpl(titleWrap, TITLEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "titleWrap" element
         */
        public org.lidoSchema.TitleWrapDocument.TitleWrap addNewTitleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.TitleWrapDocument.TitleWrap target = null;
                target = (org.lidoSchema.TitleWrapDocument.TitleWrap)get_store().add_element_user(TITLEWRAP$0);
                return target;
            }
        }
        
        /**
         * Gets the "inscriptionsWrap" element
         */
        public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap target = null;
                target = (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap)get_store().find_element_user(INSCRIPTIONSWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "inscriptionsWrap" element
         */
        public boolean isSetInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSCRIPTIONSWRAP$2) != 0;
            }
        }
        
        /**
         * Sets the "inscriptionsWrap" element
         */
        @Inject(optional=true) public void setInscriptionsWrap(org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap)
        {
            generatedSetterHelperImpl(inscriptionsWrap, INSCRIPTIONSWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "inscriptionsWrap" element
         */
        public org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap target = null;
                target = (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap)get_store().add_element_user(INSCRIPTIONSWRAP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "inscriptionsWrap" element
         */
        public void unsetInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSCRIPTIONSWRAP$2, 0);
            }
        }
        
        /**
         * Gets the "repositoryWrap" element
         */
        public org.lidoSchema.RepositoryWrapDocument.RepositoryWrap getRepositoryWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RepositoryWrapDocument.RepositoryWrap target = null;
                target = (org.lidoSchema.RepositoryWrapDocument.RepositoryWrap)get_store().find_element_user(REPOSITORYWRAP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "repositoryWrap" element
         */
        public boolean isSetRepositoryWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPOSITORYWRAP$4) != 0;
            }
        }
        
        /**
         * Sets the "repositoryWrap" element
         */
        @Inject(optional=true) public void setRepositoryWrap(org.lidoSchema.RepositoryWrapDocument.RepositoryWrap repositoryWrap)
        {
            generatedSetterHelperImpl(repositoryWrap, REPOSITORYWRAP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.lidoSchema.RepositoryWrapDocument.RepositoryWrap)get_store().add_element_user(REPOSITORYWRAP$4);
                return target;
            }
        }
        
        /**
         * Unsets the "repositoryWrap" element
         */
        public void unsetRepositoryWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPOSITORYWRAP$4, 0);
            }
        }
        
        /**
         * Gets the "displayStateEditionWrap" element
         */
        public org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
                target = (org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().find_element_user(DISPLAYSTATEEDITIONWRAP$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayStateEditionWrap" element
         */
        public boolean isSetDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYSTATEEDITIONWRAP$6) != 0;
            }
        }
        
        /**
         * Sets the "displayStateEditionWrap" element
         */
        @Inject(optional=true) public void setDisplayStateEditionWrap(org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap)
        {
            generatedSetterHelperImpl(displayStateEditionWrap, DISPLAYSTATEEDITIONWRAP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayStateEditionWrap" element
         */
        public org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
                target = (org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().add_element_user(DISPLAYSTATEEDITIONWRAP$6);
                return target;
            }
        }
        
        /**
         * Unsets the "displayStateEditionWrap" element
         */
        public void unsetDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYSTATEEDITIONWRAP$6, 0);
            }
        }
        
        /**
         * Gets the "objectDescriptionWrap" element
         */
        public org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap getObjectDescriptionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap target = null;
                target = (org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap)get_store().find_element_user(OBJECTDESCRIPTIONWRAP$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "objectDescriptionWrap" element
         */
        public boolean isSetObjectDescriptionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTDESCRIPTIONWRAP$8) != 0;
            }
        }
        
        /**
         * Sets the "objectDescriptionWrap" element
         */
        @Inject(optional=true) public void setObjectDescriptionWrap(org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap objectDescriptionWrap)
        {
            generatedSetterHelperImpl(objectDescriptionWrap, OBJECTDESCRIPTIONWRAP$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap)get_store().add_element_user(OBJECTDESCRIPTIONWRAP$8);
                return target;
            }
        }
        
        /**
         * Unsets the "objectDescriptionWrap" element
         */
        public void unsetObjectDescriptionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTDESCRIPTIONWRAP$8, 0);
            }
        }
        
        /**
         * Gets the "objectMeasurementsWrap" element
         */
        public org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap getObjectMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap target = null;
                target = (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap)get_store().find_element_user(OBJECTMEASUREMENTSWRAP$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "objectMeasurementsWrap" element
         */
        public boolean isSetObjectMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTMEASUREMENTSWRAP$10) != 0;
            }
        }
        
        /**
         * Sets the "objectMeasurementsWrap" element
         */
        @Inject(optional=true) public void setObjectMeasurementsWrap(org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap objectMeasurementsWrap)
        {
            generatedSetterHelperImpl(objectMeasurementsWrap, OBJECTMEASUREMENTSWRAP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap)get_store().add_element_user(OBJECTMEASUREMENTSWRAP$10);
                return target;
            }
        }
        
        /**
         * Unsets the "objectMeasurementsWrap" element
         */
        public void unsetObjectMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTMEASUREMENTSWRAP$10, 0);
            }
        }
    }
}
