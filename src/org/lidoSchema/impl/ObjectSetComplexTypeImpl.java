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
 * An XML objectSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ObjectSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ObjectSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public ObjectSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displayObject");
    private static final javax.xml.namespace.QName OBJECT$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "object");
    
    
    /**
     * Gets a List of "displayObject" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplayObjectList()
    {
        final class DisplayObjectList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return ObjectSetComplexTypeImpl.this.getDisplayObjectArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = ObjectSetComplexTypeImpl.this.getDisplayObjectArray(i);
                ObjectSetComplexTypeImpl.this.setDisplayObjectArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { ObjectSetComplexTypeImpl.this.insertNewDisplayObject(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = ObjectSetComplexTypeImpl.this.getDisplayObjectArray(i);
                ObjectSetComplexTypeImpl.this.removeDisplayObject(i);
                return old;
            }
            
            @Override
            public int size()
                { return ObjectSetComplexTypeImpl.this.sizeOfDisplayObjectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayObjectList();
        }
    }
    
    /**
     * Gets array of all "displayObject" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplayObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYOBJECT$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "displayObject" element
     */
    public org.lidoSchema.TextComplexType getDisplayObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYOBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "displayObject" element
     */
    public int sizeOfDisplayObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYOBJECT$0);
        }
    }
    
    /**
     * Sets array of all "displayObject" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDisplayObjectArray(org.lidoSchema.TextComplexType[] displayObjectArray)
    {
        check_orphaned();
        arraySetterHelper(displayObjectArray, DISPLAYOBJECT$0);
    }
    
    /**
     * Sets ith "displayObject" element
     */
    @Inject(optional=true) public void setDisplayObjectArray(int i, org.lidoSchema.TextComplexType displayObject)
    {
        generatedSetterHelperImpl(displayObject, DISPLAYOBJECT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayObject" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplayObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYOBJECT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "displayObject" element
     */
    public org.lidoSchema.TextComplexType addNewDisplayObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYOBJECT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "displayObject" element
     */
    public void removeDisplayObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYOBJECT$0, i);
        }
    }
    
    /**
     * Gets the "object" element
     */
    public org.lidoSchema.ObjectComplexType getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectComplexType target = null;
            target = (org.lidoSchema.ObjectComplexType)get_store().find_element_user(OBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "object" element
     */
    public boolean isSetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$2) != 0;
        }
    }
    
    /**
     * Sets the "object" element
     */
    @Inject(optional=true) public void setObject(org.lidoSchema.ObjectComplexType object)
    {
        generatedSetterHelperImpl(object, OBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "object" element
     */
    public org.lidoSchema.ObjectComplexType addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ObjectComplexType target = null;
            target = (org.lidoSchema.ObjectComplexType)get_store().add_element_user(OBJECT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "object" element
     */
    public void unsetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$2, 0);
        }
    }
}
