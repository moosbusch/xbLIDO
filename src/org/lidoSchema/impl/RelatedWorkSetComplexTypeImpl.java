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
 * An XML relatedWorkSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class RelatedWorkSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RelatedWorkSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public RelatedWorkSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDWORK$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedWork");
    private static final javax.xml.namespace.QName RELATEDWORKRELTYPE$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedWorkRelType");
    
    
    /**
     * Gets the "relatedWork" element
     */
    public org.lidoSchema.ObjectSetComplexType getRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectSetComplexType target = null;
            target = (org.lidoSchema.ObjectSetComplexType)get_store().find_element_user(RELATEDWORK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relatedWork" element
     */
    public boolean isSetRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDWORK$0) != 0;
        }
    }
    
    /**
     * Sets the "relatedWork" element
     */
    @Inject(optional=true) public void setRelatedWork(org.lidoSchema.ObjectSetComplexType relatedWork)
    {
        generatedSetterHelperImpl(relatedWork, RELATEDWORK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedWork" element
     */
    public org.lidoSchema.ObjectSetComplexType addNewRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectSetComplexType target = null;
            target = (org.lidoSchema.ObjectSetComplexType)get_store().add_element_user(RELATEDWORK$0);
            return target;
        }
    }
    
    /**
     * Unsets the "relatedWork" element
     */
    public void unsetRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDWORK$0, 0);
        }
    }
    
    /**
     * Gets the "relatedWorkRelType" element
     */
    public org.lidoSchema.ConceptComplexType getRelatedWorkRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(RELATEDWORKRELTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relatedWorkRelType" element
     */
    public boolean isSetRelatedWorkRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDWORKRELTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "relatedWorkRelType" element
     */
    @Inject(optional=true) public void setRelatedWorkRelType(org.lidoSchema.ConceptComplexType relatedWorkRelType)
    {
        generatedSetterHelperImpl(relatedWorkRelType, RELATEDWORKRELTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedWorkRelType" element
     */
    public org.lidoSchema.ConceptComplexType addNewRelatedWorkRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(RELATEDWORKRELTYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "relatedWorkRelType" element
     */
    public void unsetRelatedWorkRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDWORKRELTYPE$2, 0);
        }
    }
}
