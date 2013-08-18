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
 * An XML CoordinateSystemAxisBaseType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CoordinateSystemAxisBaseTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.CoordinateSystemAxisBaseType
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemAxisBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name");
    private static final org.apache.xmlbeans.QNameSet NAME$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    
    
    /**
     * Gets a List of "name" elements
     */
    public java.util.List<net.opengis.gml.CodeType> getNameList()
    {
        final class NameList extends java.util.AbstractList<net.opengis.gml.CodeType>
        {
            @Override
            public net.opengis.gml.CodeType get(int i)
                { return CoordinateSystemAxisBaseTypeImpl.this.getNameArray(i); }
            
            @Override
            public net.opengis.gml.CodeType set(int i, net.opengis.gml.CodeType o)
            {
                net.opengis.gml.CodeType old = CoordinateSystemAxisBaseTypeImpl.this.getNameArray(i);
                CoordinateSystemAxisBaseTypeImpl.this.setNameArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CodeType o)
                { CoordinateSystemAxisBaseTypeImpl.this.insertNewName(i).set(o); }
            
            @Override
            public net.opengis.gml.CodeType remove(int i)
            {
                net.opengis.gml.CodeType old = CoordinateSystemAxisBaseTypeImpl.this.getNameArray(i);
                CoordinateSystemAxisBaseTypeImpl.this.removeName(i);
                return old;
            }
            
            @Override
            public int size()
                { return CoordinateSystemAxisBaseTypeImpl.this.sizeOfNameArray(); }
            
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
            get_store().find_all_element_users(NAME$1, targetList);
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
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$1, i);
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
            return get_store().count_elements(NAME$1);
        }
    }
    
    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNameArray(net.opengis.gml.CodeType[] nameArray)
    {
        check_orphaned();
        arraySetterHelper(nameArray, NAME$0, NAME$1);
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
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$1, i);
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
            target = (net.opengis.gml.CodeType)get_store().insert_element_user(NAME$1, NAME$0, i);
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
            target = (net.opengis.gml.CodeType)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$1, i);
        }
    }
}
