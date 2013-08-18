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
package org.w3.x1999.xlink.impl;  import com.google.inject.Inject;
/**
 * An XML extended(@http://www.w3.org/1999/xlink).
 *
 * This is a complex type.
 */
public class ExtendedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.Extended
{
    private static final long serialVersionUID = 1L;
    
    public ExtendedImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName RESOURCE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "resource");
    private static final javax.xml.namespace.QName LOCATOR$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "locator");
    private static final javax.xml.namespace.QName ARC$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "arc");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type");
    private static final javax.xml.namespace.QName ROLE$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role");
    private static final javax.xml.namespace.QName TITLE2$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    
    
    /**
     * Gets a List of "title" elements
     */
    public java.util.List<org.w3.x1999.xlink.TitleEltType> getTitleList()
    {
        final class TitleList extends java.util.AbstractList<org.w3.x1999.xlink.TitleEltType>
        {
            @Override
            public org.w3.x1999.xlink.TitleEltType get(int i)
                { return ExtendedImpl.this.getTitleArray(i); }
            
            @Override
            public org.w3.x1999.xlink.TitleEltType set(int i, org.w3.x1999.xlink.TitleEltType o)
            {
                org.w3.x1999.xlink.TitleEltType old = ExtendedImpl.this.getTitleArray(i);
                ExtendedImpl.this.setTitleArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x1999.xlink.TitleEltType o)
                { ExtendedImpl.this.insertNewTitle(i).set(o); }
            
            @Override
            public org.w3.x1999.xlink.TitleEltType remove(int i)
            {
                org.w3.x1999.xlink.TitleEltType old = ExtendedImpl.this.getTitleArray(i);
                ExtendedImpl.this.removeTitle(i);
                return old;
            }
            
            @Override
            public int size()
                { return ExtendedImpl.this.sizeOfTitleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TitleList();
        }
    }
    
    /**
     * Gets array of all "title" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x1999.xlink.TitleEltType[] getTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x1999.xlink.TitleEltType> targetList = new java.util.ArrayList<org.w3.x1999.xlink.TitleEltType>();
            get_store().find_all_element_users(TITLE2$12, targetList);
            org.w3.x1999.xlink.TitleEltType[] result = new org.w3.x1999.xlink.TitleEltType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "title" element
     */
    public org.w3.x1999.xlink.TitleEltType getTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleEltType target = null;
            target = (org.w3.x1999.xlink.TitleEltType)get_store().find_element_user(TITLE2$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "title" element
     */
    public int sizeOfTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE2$12);
        }
    }
    
    /**
     * Sets array of all "title" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTitleArray(org.w3.x1999.xlink.TitleEltType[] titleArray)
    {
        check_orphaned();
        arraySetterHelper(titleArray, TITLE2$12);
    }
    
    /**
     * Sets ith "title" element
     */
    @Inject(optional=true) public void setTitleArray(int i, org.w3.x1999.xlink.TitleEltType title)
    {
        generatedSetterHelperImpl(title, TITLE2$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "title" element
     */
    public org.w3.x1999.xlink.TitleEltType insertNewTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleEltType target = null;
            target = (org.w3.x1999.xlink.TitleEltType)get_store().insert_element_user(TITLE2$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "title" element
     */
    public org.w3.x1999.xlink.TitleEltType addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleEltType target = null;
            target = (org.w3.x1999.xlink.TitleEltType)get_store().add_element_user(TITLE2$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "title" element
     */
    public void removeTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE2$12, i);
        }
    }
    
    /**
     * Gets a List of "resource" elements
     */
    public java.util.List<org.w3.x1999.xlink.ResourceType> getResourceList()
    {
        final class ResourceList extends java.util.AbstractList<org.w3.x1999.xlink.ResourceType>
        {
            @Override
            public org.w3.x1999.xlink.ResourceType get(int i)
                { return ExtendedImpl.this.getResourceArray(i); }
            
            @Override
            public org.w3.x1999.xlink.ResourceType set(int i, org.w3.x1999.xlink.ResourceType o)
            {
                org.w3.x1999.xlink.ResourceType old = ExtendedImpl.this.getResourceArray(i);
                ExtendedImpl.this.setResourceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x1999.xlink.ResourceType o)
                { ExtendedImpl.this.insertNewResource(i).set(o); }
            
            @Override
            public org.w3.x1999.xlink.ResourceType remove(int i)
            {
                org.w3.x1999.xlink.ResourceType old = ExtendedImpl.this.getResourceArray(i);
                ExtendedImpl.this.removeResource(i);
                return old;
            }
            
            @Override
            public int size()
                { return ExtendedImpl.this.sizeOfResourceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceList();
        }
    }
    
    /**
     * Gets array of all "resource" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x1999.xlink.ResourceType[] getResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x1999.xlink.ResourceType> targetList = new java.util.ArrayList<org.w3.x1999.xlink.ResourceType>();
            get_store().find_all_element_users(RESOURCE$2, targetList);
            org.w3.x1999.xlink.ResourceType[] result = new org.w3.x1999.xlink.ResourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource" element
     */
    public org.w3.x1999.xlink.ResourceType getResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ResourceType target = null;
            target = (org.w3.x1999.xlink.ResourceType)get_store().find_element_user(RESOURCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource" element
     */
    public int sizeOfResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCE$2);
        }
    }
    
    /**
     * Sets array of all "resource" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setResourceArray(org.w3.x1999.xlink.ResourceType[] resourceArray)
    {
        check_orphaned();
        arraySetterHelper(resourceArray, RESOURCE$2);
    }
    
    /**
     * Sets ith "resource" element
     */
    @Inject(optional=true) public void setResourceArray(int i, org.w3.x1999.xlink.ResourceType resource)
    {
        generatedSetterHelperImpl(resource, RESOURCE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource" element
     */
    public org.w3.x1999.xlink.ResourceType insertNewResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ResourceType target = null;
            target = (org.w3.x1999.xlink.ResourceType)get_store().insert_element_user(RESOURCE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource" element
     */
    public org.w3.x1999.xlink.ResourceType addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ResourceType target = null;
            target = (org.w3.x1999.xlink.ResourceType)get_store().add_element_user(RESOURCE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource" element
     */
    public void removeResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCE$2, i);
        }
    }
    
    /**
     * Gets a List of "locator" elements
     */
    public java.util.List<org.w3.x1999.xlink.LocatorType> getLocatorList()
    {
        final class LocatorList extends java.util.AbstractList<org.w3.x1999.xlink.LocatorType>
        {
            @Override
            public org.w3.x1999.xlink.LocatorType get(int i)
                { return ExtendedImpl.this.getLocatorArray(i); }
            
            @Override
            public org.w3.x1999.xlink.LocatorType set(int i, org.w3.x1999.xlink.LocatorType o)
            {
                org.w3.x1999.xlink.LocatorType old = ExtendedImpl.this.getLocatorArray(i);
                ExtendedImpl.this.setLocatorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x1999.xlink.LocatorType o)
                { ExtendedImpl.this.insertNewLocator(i).set(o); }
            
            @Override
            public org.w3.x1999.xlink.LocatorType remove(int i)
            {
                org.w3.x1999.xlink.LocatorType old = ExtendedImpl.this.getLocatorArray(i);
                ExtendedImpl.this.removeLocator(i);
                return old;
            }
            
            @Override
            public int size()
                { return ExtendedImpl.this.sizeOfLocatorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LocatorList();
        }
    }
    
    /**
     * Gets array of all "locator" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x1999.xlink.LocatorType[] getLocatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x1999.xlink.LocatorType> targetList = new java.util.ArrayList<org.w3.x1999.xlink.LocatorType>();
            get_store().find_all_element_users(LOCATOR$4, targetList);
            org.w3.x1999.xlink.LocatorType[] result = new org.w3.x1999.xlink.LocatorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "locator" element
     */
    public org.w3.x1999.xlink.LocatorType getLocatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.LocatorType target = null;
            target = (org.w3.x1999.xlink.LocatorType)get_store().find_element_user(LOCATOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "locator" element
     */
    public int sizeOfLocatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATOR$4);
        }
    }
    
    /**
     * Sets array of all "locator" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setLocatorArray(org.w3.x1999.xlink.LocatorType[] locatorArray)
    {
        check_orphaned();
        arraySetterHelper(locatorArray, LOCATOR$4);
    }
    
    /**
     * Sets ith "locator" element
     */
    @Inject(optional=true) public void setLocatorArray(int i, org.w3.x1999.xlink.LocatorType locator)
    {
        generatedSetterHelperImpl(locator, LOCATOR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locator" element
     */
    public org.w3.x1999.xlink.LocatorType insertNewLocator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.LocatorType target = null;
            target = (org.w3.x1999.xlink.LocatorType)get_store().insert_element_user(LOCATOR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locator" element
     */
    public org.w3.x1999.xlink.LocatorType addNewLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.LocatorType target = null;
            target = (org.w3.x1999.xlink.LocatorType)get_store().add_element_user(LOCATOR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "locator" element
     */
    public void removeLocator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATOR$4, i);
        }
    }
    
    /**
     * Gets a List of "arc" elements
     */
    public java.util.List<org.w3.x1999.xlink.ArcType> getArcList()
    {
        final class ArcList extends java.util.AbstractList<org.w3.x1999.xlink.ArcType>
        {
            @Override
            public org.w3.x1999.xlink.ArcType get(int i)
                { return ExtendedImpl.this.getArcArray(i); }
            
            @Override
            public org.w3.x1999.xlink.ArcType set(int i, org.w3.x1999.xlink.ArcType o)
            {
                org.w3.x1999.xlink.ArcType old = ExtendedImpl.this.getArcArray(i);
                ExtendedImpl.this.setArcArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.w3.x1999.xlink.ArcType o)
                { ExtendedImpl.this.insertNewArc(i).set(o); }
            
            @Override
            public org.w3.x1999.xlink.ArcType remove(int i)
            {
                org.w3.x1999.xlink.ArcType old = ExtendedImpl.this.getArcArray(i);
                ExtendedImpl.this.removeArc(i);
                return old;
            }
            
            @Override
            public int size()
                { return ExtendedImpl.this.sizeOfArcArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ArcList();
        }
    }
    
    /**
     * Gets array of all "arc" elements
     * @deprecated
     */
    @Deprecated
    public org.w3.x1999.xlink.ArcType[] getArcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.w3.x1999.xlink.ArcType> targetList = new java.util.ArrayList<org.w3.x1999.xlink.ArcType>();
            get_store().find_all_element_users(ARC$6, targetList);
            org.w3.x1999.xlink.ArcType[] result = new org.w3.x1999.xlink.ArcType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "arc" element
     */
    public org.w3.x1999.xlink.ArcType getArcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcType target = null;
            target = (org.w3.x1999.xlink.ArcType)get_store().find_element_user(ARC$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "arc" element
     */
    public int sizeOfArcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARC$6);
        }
    }
    
    /**
     * Sets array of all "arc" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setArcArray(org.w3.x1999.xlink.ArcType[] arcArray)
    {
        check_orphaned();
        arraySetterHelper(arcArray, ARC$6);
    }
    
    /**
     * Sets ith "arc" element
     */
    @Inject(optional=true) public void setArcArray(int i, org.w3.x1999.xlink.ArcType arc)
    {
        generatedSetterHelperImpl(arc, ARC$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "arc" element
     */
    public org.w3.x1999.xlink.ArcType insertNewArc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcType target = null;
            target = (org.w3.x1999.xlink.ArcType)get_store().insert_element_user(ARC$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "arc" element
     */
    public org.w3.x1999.xlink.ArcType addNewArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcType target = null;
            target = (org.w3.x1999.xlink.ArcType)get_store().add_element_user(ARC$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "arc" element
     */
    public void removeArc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARC$6, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$8);
            }
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.TypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.w3.x1999.xlink.TypeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TypeType target = null;
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_default_attribute_value(TYPE$8);
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    @Inject(optional=true) public void setType(org.w3.x1999.xlink.TypeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.w3.x1999.xlink.TypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TypeType target = null;
            target = (org.w3.x1999.xlink.TypeType)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TypeType)get_store().add_attribute_user(TYPE$8);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "role" attribute
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public org.w3.x1999.xlink.RoleType xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.RoleType target = null;
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$10);
            return target;
        }
    }
    
    /**
     * True if has "role" attribute
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLE$10) != null;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
    @Inject(optional=true) public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$10);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.w3.x1999.xlink.RoleType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.RoleType target = null;
            target = (org.w3.x1999.xlink.RoleType)get_store().find_attribute_user(ROLE$10);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.RoleType)get_store().add_attribute_user(ROLE$10);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" attribute
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLE$10);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE2$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.w3.x1999.xlink.TitleAttrType xgetTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE2$12);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE2$12) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    @Inject(optional=true) public void setTitle2(java.lang.String title2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE2$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE2$12);
            }
            target.setStringValue(title2);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle2(org.w3.x1999.xlink.TitleAttrType title2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleAttrType target = null;
            target = (org.w3.x1999.xlink.TitleAttrType)get_store().find_attribute_user(TITLE2$12);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.TitleAttrType)get_store().add_attribute_user(TITLE2$12);
            }
            target.set(title2);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE2$12);
        }
    }
}
