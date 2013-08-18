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
 * An XML AbstractTopoPrimitiveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractTopoPrimitiveTypeImpl extends net.opengis.gml.impl.AbstractTopologyTypeImpl implements net.opengis.gml.AbstractTopoPrimitiveType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTopoPrimitiveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISOLATED$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "isolated");
    private static final javax.xml.namespace.QName CONTAINER$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "container");
    
    
    /**
     * Gets a List of "isolated" elements
     */
    public java.util.List<net.opengis.gml.IsolatedPropertyType> getIsolatedList()
    {
        final class IsolatedList extends java.util.AbstractList<net.opengis.gml.IsolatedPropertyType>
        {
            @Override
            public net.opengis.gml.IsolatedPropertyType get(int i)
                { return AbstractTopoPrimitiveTypeImpl.this.getIsolatedArray(i); }
            
            @Override
            public net.opengis.gml.IsolatedPropertyType set(int i, net.opengis.gml.IsolatedPropertyType o)
            {
                net.opengis.gml.IsolatedPropertyType old = AbstractTopoPrimitiveTypeImpl.this.getIsolatedArray(i);
                AbstractTopoPrimitiveTypeImpl.this.setIsolatedArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IsolatedPropertyType o)
                { AbstractTopoPrimitiveTypeImpl.this.insertNewIsolated(i).set(o); }
            
            @Override
            public net.opengis.gml.IsolatedPropertyType remove(int i)
            {
                net.opengis.gml.IsolatedPropertyType old = AbstractTopoPrimitiveTypeImpl.this.getIsolatedArray(i);
                AbstractTopoPrimitiveTypeImpl.this.removeIsolated(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractTopoPrimitiveTypeImpl.this.sizeOfIsolatedArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IsolatedList();
        }
    }
    
    /**
     * Gets array of all "isolated" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IsolatedPropertyType[] getIsolatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IsolatedPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.IsolatedPropertyType>();
            get_store().find_all_element_users(ISOLATED$0, targetList);
            net.opengis.gml.IsolatedPropertyType[] result = new net.opengis.gml.IsolatedPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "isolated" element
     */
    public net.opengis.gml.IsolatedPropertyType getIsolatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsolatedPropertyType target = null;
            target = (net.opengis.gml.IsolatedPropertyType)get_store().find_element_user(ISOLATED$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "isolated" element
     */
    public int sizeOfIsolatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISOLATED$0);
        }
    }
    
    /**
     * Sets array of all "isolated" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setIsolatedArray(net.opengis.gml.IsolatedPropertyType[] isolatedArray)
    {
        check_orphaned();
        arraySetterHelper(isolatedArray, ISOLATED$0);
    }
    
    /**
     * Sets ith "isolated" element
     */
    @Inject(optional=true) public void setIsolatedArray(int i, net.opengis.gml.IsolatedPropertyType isolated)
    {
        generatedSetterHelperImpl(isolated, ISOLATED$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "isolated" element
     */
    public net.opengis.gml.IsolatedPropertyType insertNewIsolated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsolatedPropertyType target = null;
            target = (net.opengis.gml.IsolatedPropertyType)get_store().insert_element_user(ISOLATED$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isolated" element
     */
    public net.opengis.gml.IsolatedPropertyType addNewIsolated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsolatedPropertyType target = null;
            target = (net.opengis.gml.IsolatedPropertyType)get_store().add_element_user(ISOLATED$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "isolated" element
     */
    public void removeIsolated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISOLATED$0, i);
        }
    }
    
    /**
     * Gets the "container" element
     */
    public net.opengis.gml.ContainerPropertyType getContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ContainerPropertyType target = null;
            target = (net.opengis.gml.ContainerPropertyType)get_store().find_element_user(CONTAINER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "container" element
     */
    public boolean isSetContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINER$2) != 0;
        }
    }
    
    /**
     * Sets the "container" element
     */
    @Inject(optional=true) public void setContainer(net.opengis.gml.ContainerPropertyType container)
    {
        generatedSetterHelperImpl(container, CONTAINER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "container" element
     */
    public net.opengis.gml.ContainerPropertyType addNewContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ContainerPropertyType target = null;
            target = (net.opengis.gml.ContainerPropertyType)get_store().add_element_user(CONTAINER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "container" element
     */
    public void unsetContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINER$2, 0);
        }
    }
}
