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
 * An XML relatedEventSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class RelatedEventSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RelatedEventSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public RelatedEventSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDEVENT$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedEvent");
    private static final javax.xml.namespace.QName RELATEDEVENTRELTYPE$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedEventRelType");
    
    
    /**
     * Gets the "relatedEvent" element
     */
    public org.lidoSchema.EventSetComplexType getRelatedEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventSetComplexType target = null;
            target = (org.lidoSchema.EventSetComplexType)get_store().find_element_user(RELATEDEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relatedEvent" element
     */
    public boolean isSetRelatedEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDEVENT$0) != 0;
        }
    }
    
    /**
     * Sets the "relatedEvent" element
     */
     public void setRelatedEvent(org.lidoSchema.EventSetComplexType relatedEvent)
    {
        generatedSetterHelperImpl(relatedEvent, RELATEDEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedEvent" element
     */
    public org.lidoSchema.EventSetComplexType addNewRelatedEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventSetComplexType target = null;
            target = (org.lidoSchema.EventSetComplexType)get_store().add_element_user(RELATEDEVENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "relatedEvent" element
     */
    public void unsetRelatedEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDEVENT$0, 0);
        }
    }
    
    /**
     * Gets the "relatedEventRelType" element
     */
    public org.lidoSchema.ConceptComplexType getRelatedEventRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(RELATEDEVENTRELTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relatedEventRelType" element
     */
    public boolean isSetRelatedEventRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDEVENTRELTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "relatedEventRelType" element
     */
     public void setRelatedEventRelType(org.lidoSchema.ConceptComplexType relatedEventRelType)
    {
        generatedSetterHelperImpl(relatedEventRelType, RELATEDEVENTRELTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedEventRelType" element
     */
    public org.lidoSchema.ConceptComplexType addNewRelatedEventRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(RELATEDEVENTRELTYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "relatedEventRelType" element
     */
    public void unsetRelatedEventRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDEVENTRELTYPE$2, 0);
        }
    }
}
