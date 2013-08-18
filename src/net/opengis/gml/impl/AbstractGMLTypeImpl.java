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
 * An XML AbstractGMLType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractGMLTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AbstractGMLType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGMLTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "metaDataProperty");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "description");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name");
    private static final org.apache.xmlbeans.QNameSet NAME$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "meridianName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "datumName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "groupName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "srsName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "csName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name"),
    });
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "id");
    
    
    /**
     * Gets a List of "metaDataProperty" elements
     */
    public java.util.List<net.opengis.gml.MetaDataPropertyType> getMetaDataPropertyList()
    {
        final class MetaDataPropertyList extends java.util.AbstractList<net.opengis.gml.MetaDataPropertyType>
        {
            @Override
            public net.opengis.gml.MetaDataPropertyType get(int i)
                { return AbstractGMLTypeImpl.this.getMetaDataPropertyArray(i); }
            
            @Override
            public net.opengis.gml.MetaDataPropertyType set(int i, net.opengis.gml.MetaDataPropertyType o)
            {
                net.opengis.gml.MetaDataPropertyType old = AbstractGMLTypeImpl.this.getMetaDataPropertyArray(i);
                AbstractGMLTypeImpl.this.setMetaDataPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.MetaDataPropertyType o)
                { AbstractGMLTypeImpl.this.insertNewMetaDataProperty(i).set(o); }
            
            @Override
            public net.opengis.gml.MetaDataPropertyType remove(int i)
            {
                net.opengis.gml.MetaDataPropertyType old = AbstractGMLTypeImpl.this.getMetaDataPropertyArray(i);
                AbstractGMLTypeImpl.this.removeMetaDataProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractGMLTypeImpl.this.sizeOfMetaDataPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MetaDataPropertyList();
        }
    }
    
    /**
     * Gets array of all "metaDataProperty" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.MetaDataPropertyType[] getMetaDataPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.MetaDataPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.MetaDataPropertyType>();
            get_store().find_all_element_users(METADATAPROPERTY$0, targetList);
            net.opengis.gml.MetaDataPropertyType[] result = new net.opengis.gml.MetaDataPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "metaDataProperty" element
     */
    public net.opengis.gml.MetaDataPropertyType getMetaDataPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MetaDataPropertyType target = null;
            target = (net.opengis.gml.MetaDataPropertyType)get_store().find_element_user(METADATAPROPERTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "metaDataProperty" element
     */
    public int sizeOfMetaDataPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAPROPERTY$0);
        }
    }
    
    /**
     * Sets array of all "metaDataProperty" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMetaDataPropertyArray(net.opengis.gml.MetaDataPropertyType[] metaDataPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(metaDataPropertyArray, METADATAPROPERTY$0);
    }
    
    /**
     * Sets ith "metaDataProperty" element
     */
    @Inject(optional=true) public void setMetaDataPropertyArray(int i, net.opengis.gml.MetaDataPropertyType metaDataProperty)
    {
        generatedSetterHelperImpl(metaDataProperty, METADATAPROPERTY$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metaDataProperty" element
     */
    public net.opengis.gml.MetaDataPropertyType insertNewMetaDataProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MetaDataPropertyType target = null;
            target = (net.opengis.gml.MetaDataPropertyType)get_store().insert_element_user(METADATAPROPERTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metaDataProperty" element
     */
    public net.opengis.gml.MetaDataPropertyType addNewMetaDataProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MetaDataPropertyType target = null;
            target = (net.opengis.gml.MetaDataPropertyType)get_store().add_element_user(METADATAPROPERTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "metaDataProperty" element
     */
    public void removeMetaDataProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAPROPERTY$0, i);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public net.opengis.gml.StringOrRefType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    @Inject(optional=true) public void setDescription(net.opengis.gml.StringOrRefType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public net.opengis.gml.StringOrRefType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(DESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets a List of "name" elements
     */
    public java.util.List<net.opengis.gml.CodeType> getNameList()
    {
        final class NameList extends java.util.AbstractList<net.opengis.gml.CodeType>
        {
            @Override
            public net.opengis.gml.CodeType get(int i)
                { return AbstractGMLTypeImpl.this.getNameArray(i); }
            
            @Override
            public net.opengis.gml.CodeType set(int i, net.opengis.gml.CodeType o)
            {
                net.opengis.gml.CodeType old = AbstractGMLTypeImpl.this.getNameArray(i);
                AbstractGMLTypeImpl.this.setNameArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CodeType o)
                { AbstractGMLTypeImpl.this.insertNewName(i).set(o); }
            
            @Override
            public net.opengis.gml.CodeType remove(int i)
            {
                net.opengis.gml.CodeType old = AbstractGMLTypeImpl.this.getNameArray(i);
                AbstractGMLTypeImpl.this.removeName(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractGMLTypeImpl.this.sizeOfNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NameList();
        }
    }
    
    /**
     * Gets array of all "name" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CodeType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CodeType> targetList = new java.util.ArrayList<net.opengis.gml.CodeType>();
            get_store().find_all_element_users(NAME$5, targetList);
            net.opengis.gml.CodeType[] result = new net.opengis.gml.CodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public net.opengis.gml.CodeType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$5);
        }
    }
    
    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNameArray(net.opengis.gml.CodeType[] nameArray)
    {
        check_orphaned();
        arraySetterHelper(nameArray, NAME$4, NAME$5);
    }
    
    /**
     * Sets ith "name" element
     */
    @Inject(optional=true) public void setNameArray(int i, net.opengis.gml.CodeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public net.opengis.gml.CodeType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().insert_element_user(NAME$5, NAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public net.opengis.gml.CodeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$5, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$6) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    @Inject(optional=true) public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$6);
        }
    }
}
