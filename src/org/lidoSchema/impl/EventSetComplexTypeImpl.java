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
 * An XML eventSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class EventSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.EventSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public EventSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYEVENT$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displayEvent");
    private static final javax.xml.namespace.QName EVENT$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "event");
    
    
    /**
     * Gets a List of "displayEvent" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplayEventList()
    {
        final class DisplayEventList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return EventSetComplexTypeImpl.this.getDisplayEventArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = EventSetComplexTypeImpl.this.getDisplayEventArray(i);
                EventSetComplexTypeImpl.this.setDisplayEventArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { EventSetComplexTypeImpl.this.insertNewDisplayEvent(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = EventSetComplexTypeImpl.this.getDisplayEventArray(i);
                EventSetComplexTypeImpl.this.removeDisplayEvent(i);
                return old;
            }
            
            @Override
            public int size()
                { return EventSetComplexTypeImpl.this.sizeOfDisplayEventArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayEventList();
        }
    }
    
    /**
     * Gets array of all "displayEvent" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplayEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYEVENT$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "displayEvent" element
     */
    public org.lidoSchema.TextComplexType getDisplayEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYEVENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "displayEvent" element
     */
    public int sizeOfDisplayEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYEVENT$0);
        }
    }
    
    /**
     * Sets array of all "displayEvent" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setDisplayEventArray(org.lidoSchema.TextComplexType[] displayEventArray)
    {
        check_orphaned();
        arraySetterHelper(displayEventArray, DISPLAYEVENT$0);
    }
    
    /**
     * Sets ith "displayEvent" element
     */
     public void setDisplayEventArray(int i, org.lidoSchema.TextComplexType displayEvent)
    {
        generatedSetterHelperImpl(displayEvent, DISPLAYEVENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayEvent" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplayEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYEVENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "displayEvent" element
     */
    public org.lidoSchema.TextComplexType addNewDisplayEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYEVENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "displayEvent" element
     */
    public void removeDisplayEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYEVENT$0, i);
        }
    }
    
    /**
     * Gets the "event" element
     */
    public org.lidoSchema.EventComplexType getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType target = null;
            target = (org.lidoSchema.EventComplexType)get_store().find_element_user(EVENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "event" element
     */
    public boolean isSetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$2) != 0;
        }
    }
    
    /**
     * Sets the "event" element
     */
     public void setEvent(org.lidoSchema.EventComplexType event)
    {
        generatedSetterHelperImpl(event, EVENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public org.lidoSchema.EventComplexType addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.EventComplexType target = null;
            target = (org.lidoSchema.EventComplexType)get_store().add_element_user(EVENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "event" element
     */
    public void unsetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$2, 0);
        }
    }
}
