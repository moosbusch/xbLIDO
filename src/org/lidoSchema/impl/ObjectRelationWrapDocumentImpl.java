/*
 * An XML document type.
 * Localname: objectRelationWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ObjectRelationWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one objectRelationWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class ObjectRelationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectRelationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectRelationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTRELATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectRelationWrap");
    
    
    /**
     * Gets the "objectRelationWrap" element
     */
    public org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap getObjectRelationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap target = null;
            target = (org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap)get_store().find_element_user(OBJECTRELATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectRelationWrap" element
     */
    @Inject(optional=true) public void setObjectRelationWrap(org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap objectRelationWrap)
    {
        generatedSetterHelperImpl(objectRelationWrap, OBJECTRELATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectRelationWrap" element
     */
    public org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap addNewObjectRelationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap target = null;
            target = (org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap)get_store().add_element_user(OBJECTRELATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectRelationWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ObjectRelationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectRelationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBJECTWRAP$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "subjectWrap");
        private static final javax.xml.namespace.QName RELATEDWORKSWRAP$2 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedWorksWrap");
        
        
        /**
         * Gets the "subjectWrap" element
         */
        public org.lidoSchema.SubjectWrapDocument.SubjectWrap getSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.SubjectWrapDocument.SubjectWrap target = null;
                target = (org.lidoSchema.SubjectWrapDocument.SubjectWrap)get_store().find_element_user(SUBJECTWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "subjectWrap" element
         */
        public boolean isSetSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBJECTWRAP$0) != 0;
            }
        }
        
        /**
         * Sets the "subjectWrap" element
         */
        @Inject(optional=true) public void setSubjectWrap(org.lidoSchema.SubjectWrapDocument.SubjectWrap subjectWrap)
        {
            generatedSetterHelperImpl(subjectWrap, SUBJECTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "subjectWrap" element
         */
        public org.lidoSchema.SubjectWrapDocument.SubjectWrap addNewSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.SubjectWrapDocument.SubjectWrap target = null;
                target = (org.lidoSchema.SubjectWrapDocument.SubjectWrap)get_store().add_element_user(SUBJECTWRAP$0);
                return target;
            }
        }
        
        /**
         * Unsets the "subjectWrap" element
         */
        public void unsetSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBJECTWRAP$0, 0);
            }
        }
        
        /**
         * Gets the "relatedWorksWrap" element
         */
        public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap getRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
                target = (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().find_element_user(RELATEDWORKSWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "relatedWorksWrap" element
         */
        public boolean isSetRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDWORKSWRAP$2) != 0;
            }
        }
        
        /**
         * Sets the "relatedWorksWrap" element
         */
        @Inject(optional=true) public void setRelatedWorksWrap(org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap relatedWorksWrap)
        {
            generatedSetterHelperImpl(relatedWorksWrap, RELATEDWORKSWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relatedWorksWrap" element
         */
        public org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap addNewRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
                target = (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().add_element_user(RELATEDWORKSWRAP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "relatedWorksWrap" element
         */
        public void unsetRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDWORKSWRAP$2, 0);
            }
        }
    }
}