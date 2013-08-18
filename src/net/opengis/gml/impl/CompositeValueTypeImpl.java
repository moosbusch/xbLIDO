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
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CompositeValueType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CompositeValueTypeImpl extends net.opengis.gml.impl.AbstractGMLTypeImpl implements net.opengis.gml.CompositeValueType
{
    private static final long serialVersionUID = 1L;
    
    public CompositeValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUECOMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueComponent");
    private static final javax.xml.namespace.QName VALUECOMPONENTS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "valueComponents");
    
    
    /**
     * Gets a List of "valueComponent" elements
     */
    public java.util.List<net.opengis.gml.ValuePropertyType> getValueComponentList()
    {
        final class ValueComponentList extends java.util.AbstractList<net.opengis.gml.ValuePropertyType>
        {
            @Override
            public net.opengis.gml.ValuePropertyType get(int i)
                { return CompositeValueTypeImpl.this.getValueComponentArray(i); }
            
            @Override
            public net.opengis.gml.ValuePropertyType set(int i, net.opengis.gml.ValuePropertyType o)
            {
                net.opengis.gml.ValuePropertyType old = CompositeValueTypeImpl.this.getValueComponentArray(i);
                CompositeValueTypeImpl.this.setValueComponentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.ValuePropertyType o)
                { CompositeValueTypeImpl.this.insertNewValueComponent(i).set(o); }
            
            @Override
            public net.opengis.gml.ValuePropertyType remove(int i)
            {
                net.opengis.gml.ValuePropertyType old = CompositeValueTypeImpl.this.getValueComponentArray(i);
                CompositeValueTypeImpl.this.removeValueComponent(i);
                return old;
            }
            
            @Override
            public int size()
                { return CompositeValueTypeImpl.this.sizeOfValueComponentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ValueComponentList();
        }
    }
    
    /**
     * Gets array of all "valueComponent" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.ValuePropertyType[] getValueComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.ValuePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.ValuePropertyType>();
            get_store().find_all_element_users(VALUECOMPONENT$0, targetList);
            net.opengis.gml.ValuePropertyType[] result = new net.opengis.gml.ValuePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "valueComponent" element
     */
    public net.opengis.gml.ValuePropertyType getValueComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValuePropertyType target = null;
            target = (net.opengis.gml.ValuePropertyType)get_store().find_element_user(VALUECOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "valueComponent" element
     */
    public int sizeOfValueComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECOMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "valueComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setValueComponentArray(net.opengis.gml.ValuePropertyType[] valueComponentArray)
    {
        check_orphaned();
        arraySetterHelper(valueComponentArray, VALUECOMPONENT$0);
    }
    
    /**
     * Sets ith "valueComponent" element
     */
    @Inject(optional=true) public void setValueComponentArray(int i, net.opengis.gml.ValuePropertyType valueComponent)
    {
        generatedSetterHelperImpl(valueComponent, VALUECOMPONENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "valueComponent" element
     */
    public net.opengis.gml.ValuePropertyType insertNewValueComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValuePropertyType target = null;
            target = (net.opengis.gml.ValuePropertyType)get_store().insert_element_user(VALUECOMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "valueComponent" element
     */
    public net.opengis.gml.ValuePropertyType addNewValueComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValuePropertyType target = null;
            target = (net.opengis.gml.ValuePropertyType)get_store().add_element_user(VALUECOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "valueComponent" element
     */
    public void removeValueComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECOMPONENT$0, i);
        }
    }
    
    /**
     * Gets the "valueComponents" element
     */
    public net.opengis.gml.ValueArrayPropertyType getValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValueArrayPropertyType target = null;
            target = (net.opengis.gml.ValueArrayPropertyType)get_store().find_element_user(VALUECOMPONENTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueComponents" element
     */
    public boolean isSetValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECOMPONENTS$2) != 0;
        }
    }
    
    /**
     * Sets the "valueComponents" element
     */
    @Inject(optional=true) public void setValueComponents(net.opengis.gml.ValueArrayPropertyType valueComponents)
    {
        generatedSetterHelperImpl(valueComponents, VALUECOMPONENTS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueComponents" element
     */
    public net.opengis.gml.ValueArrayPropertyType addNewValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValueArrayPropertyType target = null;
            target = (net.opengis.gml.ValueArrayPropertyType)get_store().add_element_user(VALUECOMPONENTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "valueComponents" element
     */
    public void unsetValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECOMPONENTS$2, 0);
        }
    }
}
