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
 * An XML actorSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ActorSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ActorSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public ActorSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYACTOR$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displayActor");
    private static final javax.xml.namespace.QName ACTOR$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "actor");
    
    
    /**
     * Gets a List of "displayActor" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplayActorList()
    {
        final class DisplayActorList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return ActorSetComplexTypeImpl.this.getDisplayActorArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = ActorSetComplexTypeImpl.this.getDisplayActorArray(i);
                ActorSetComplexTypeImpl.this.setDisplayActorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { ActorSetComplexTypeImpl.this.insertNewDisplayActor(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = ActorSetComplexTypeImpl.this.getDisplayActorArray(i);
                ActorSetComplexTypeImpl.this.removeDisplayActor(i);
                return old;
            }
            
            @Override
            public int size()
                { return ActorSetComplexTypeImpl.this.sizeOfDisplayActorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayActorList();
        }
    }
    
    /**
     * Gets array of all "displayActor" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplayActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYACTOR$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "displayActor" element
     */
    public org.lidoSchema.TextComplexType getDisplayActorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYACTOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "displayActor" element
     */
    public int sizeOfDisplayActorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYACTOR$0);
        }
    }
    
    /**
     * Sets array of all "displayActor" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDisplayActorArray(org.lidoSchema.TextComplexType[] displayActorArray)
    {
        check_orphaned();
        arraySetterHelper(displayActorArray, DISPLAYACTOR$0);
    }
    
    /**
     * Sets ith "displayActor" element
     */
    @Inject(optional=true) public void setDisplayActorArray(int i, org.lidoSchema.TextComplexType displayActor)
    {
        generatedSetterHelperImpl(displayActor, DISPLAYACTOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayActor" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplayActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYACTOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "displayActor" element
     */
    public org.lidoSchema.TextComplexType addNewDisplayActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYACTOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "displayActor" element
     */
    public void removeDisplayActor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYACTOR$0, i);
        }
    }
    
    /**
     * Gets the "actor" element
     */
    public org.lidoSchema.ActorComplexType getActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorComplexType target = null;
            target = (org.lidoSchema.ActorComplexType)get_store().find_element_user(ACTOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "actor" element
     */
    public boolean isSetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTOR$2) != 0;
        }
    }
    
    /**
     * Sets the "actor" element
     */
    @Inject(optional=true) public void setActor(org.lidoSchema.ActorComplexType actor)
    {
        generatedSetterHelperImpl(actor, ACTOR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "actor" element
     */
    public org.lidoSchema.ActorComplexType addNewActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorComplexType target = null;
            target = (org.lidoSchema.ActorComplexType)get_store().add_element_user(ACTOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "actor" element
     */
    public void unsetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTOR$2, 0);
        }
    }
}
