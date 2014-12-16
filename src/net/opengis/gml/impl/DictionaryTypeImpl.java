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
package net.opengis.gml.impl; 
/**
 * An XML DictionaryType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DictionaryTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.DictionaryType
{
    private static final long serialVersionUID = 1L;
    
    public DictionaryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DICTIONARYENTRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dictionaryEntry");
    private static final org.apache.xmlbeans.QNameSet DICTIONARYENTRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "definitionMember"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dictionaryEntry"),
    });
    private static final javax.xml.namespace.QName INDIRECTENTRY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "indirectEntry");
    
    
    /**
     * Gets a List of "dictionaryEntry" elements
     */
    public java.util.List<net.opengis.gml.DictionaryEntryType> getDictionaryEntryList()
    {
        final class DictionaryEntryList extends java.util.AbstractList<net.opengis.gml.DictionaryEntryType>
        {
            @Override
            public net.opengis.gml.DictionaryEntryType get(int i)
                { return DictionaryTypeImpl.this.getDictionaryEntryArray(i); }
            
            @Override
            public net.opengis.gml.DictionaryEntryType set(int i, net.opengis.gml.DictionaryEntryType o)
            {
                net.opengis.gml.DictionaryEntryType old = DictionaryTypeImpl.this.getDictionaryEntryArray(i);
                DictionaryTypeImpl.this.setDictionaryEntryArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DictionaryEntryType o)
                { DictionaryTypeImpl.this.insertNewDictionaryEntry(i).set(o); }
            
            @Override
            public net.opengis.gml.DictionaryEntryType remove(int i)
            {
                net.opengis.gml.DictionaryEntryType old = DictionaryTypeImpl.this.getDictionaryEntryArray(i);
                DictionaryTypeImpl.this.removeDictionaryEntry(i);
                return old;
            }
            
            @Override
            public int size()
                { return DictionaryTypeImpl.this.sizeOfDictionaryEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DictionaryEntryList();
        }
    }
    
    /**
     * Gets array of all "dictionaryEntry" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.DictionaryEntryType[] getDictionaryEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.DictionaryEntryType> targetList = new java.util.ArrayList<net.opengis.gml.DictionaryEntryType>();
            get_store().find_all_element_users(DICTIONARYENTRY$1, targetList);
            net.opengis.gml.DictionaryEntryType[] result = new net.opengis.gml.DictionaryEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dictionaryEntry" element
     */
    public net.opengis.gml.DictionaryEntryType getDictionaryEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().find_element_user(DICTIONARYENTRY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dictionaryEntry" element
     */
    public int sizeOfDictionaryEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DICTIONARYENTRY$1);
        }
    }
    
    /**
     * Sets array of all "dictionaryEntry" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setDictionaryEntryArray(net.opengis.gml.DictionaryEntryType[] dictionaryEntryArray)
    {
        check_orphaned();
        arraySetterHelper(dictionaryEntryArray, DICTIONARYENTRY$0, DICTIONARYENTRY$1);
    }
    
    /**
     * Sets ith "dictionaryEntry" element
     */
     public void setDictionaryEntryArray(int i, net.opengis.gml.DictionaryEntryType dictionaryEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().find_element_user(DICTIONARYENTRY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dictionaryEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dictionaryEntry" element
     */
    public net.opengis.gml.DictionaryEntryType insertNewDictionaryEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().insert_element_user(DICTIONARYENTRY$1, DICTIONARYENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dictionaryEntry" element
     */
    public net.opengis.gml.DictionaryEntryType addNewDictionaryEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().add_element_user(DICTIONARYENTRY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dictionaryEntry" element
     */
    public void removeDictionaryEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DICTIONARYENTRY$1, i);
        }
    }
    
    /**
     * Gets a List of "indirectEntry" elements
     */
    public java.util.List<net.opengis.gml.IndirectEntryType> getIndirectEntryList()
    {
        final class IndirectEntryList extends java.util.AbstractList<net.opengis.gml.IndirectEntryType>
        {
            @Override
            public net.opengis.gml.IndirectEntryType get(int i)
                { return DictionaryTypeImpl.this.getIndirectEntryArray(i); }
            
            @Override
            public net.opengis.gml.IndirectEntryType set(int i, net.opengis.gml.IndirectEntryType o)
            {
                net.opengis.gml.IndirectEntryType old = DictionaryTypeImpl.this.getIndirectEntryArray(i);
                DictionaryTypeImpl.this.setIndirectEntryArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IndirectEntryType o)
                { DictionaryTypeImpl.this.insertNewIndirectEntry(i).set(o); }
            
            @Override
            public net.opengis.gml.IndirectEntryType remove(int i)
            {
                net.opengis.gml.IndirectEntryType old = DictionaryTypeImpl.this.getIndirectEntryArray(i);
                DictionaryTypeImpl.this.removeIndirectEntry(i);
                return old;
            }
            
            @Override
            public int size()
                { return DictionaryTypeImpl.this.sizeOfIndirectEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IndirectEntryList();
        }
    }
    
    /**
     * Gets array of all "indirectEntry" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IndirectEntryType[] getIndirectEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IndirectEntryType> targetList = new java.util.ArrayList<net.opengis.gml.IndirectEntryType>();
            get_store().find_all_element_users(INDIRECTENTRY$2, targetList);
            net.opengis.gml.IndirectEntryType[] result = new net.opengis.gml.IndirectEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "indirectEntry" element
     */
    public net.opengis.gml.IndirectEntryType getIndirectEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IndirectEntryType target = null;
            target = (net.opengis.gml.IndirectEntryType)get_store().find_element_user(INDIRECTENTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "indirectEntry" element
     */
    public int sizeOfIndirectEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIRECTENTRY$2);
        }
    }
    
    /**
     * Sets array of all "indirectEntry" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setIndirectEntryArray(net.opengis.gml.IndirectEntryType[] indirectEntryArray)
    {
        check_orphaned();
        arraySetterHelper(indirectEntryArray, INDIRECTENTRY$2);
    }
    
    /**
     * Sets ith "indirectEntry" element
     */
     public void setIndirectEntryArray(int i, net.opengis.gml.IndirectEntryType indirectEntry)
    {
        generatedSetterHelperImpl(indirectEntry, INDIRECTENTRY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "indirectEntry" element
     */
    public net.opengis.gml.IndirectEntryType insertNewIndirectEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IndirectEntryType target = null;
            target = (net.opengis.gml.IndirectEntryType)get_store().insert_element_user(INDIRECTENTRY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "indirectEntry" element
     */
    public net.opengis.gml.IndirectEntryType addNewIndirectEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IndirectEntryType target = null;
            target = (net.opengis.gml.IndirectEntryType)get_store().add_element_user(INDIRECTENTRY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "indirectEntry" element
     */
    public void removeIndirectEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIRECTENTRY$2, i);
        }
    }
}
