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
 * An XML TopoPrimitiveArrayAssociationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TopoPrimitiveArrayAssociationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoPrimitiveArrayAssociationType
{
    private static final long serialVersionUID = 1L;
    
    public TopoPrimitiveArrayAssociationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive");
    private static final org.apache.xmlbeans.QNameSet TOPOPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Node"),
    });
    
    
    /**
     * Gets a List of "_TopoPrimitive" elements
     */
    public java.util.List<net.opengis.gml.AbstractTopoPrimitiveType> getTopoPrimitiveList()
    {
        final class TopoPrimitiveList extends java.util.AbstractList<net.opengis.gml.AbstractTopoPrimitiveType>
        {
            @Override
            public net.opengis.gml.AbstractTopoPrimitiveType get(int i)
                { return TopoPrimitiveArrayAssociationTypeImpl.this.getTopoPrimitiveArray(i); }
            
            @Override
            public net.opengis.gml.AbstractTopoPrimitiveType set(int i, net.opengis.gml.AbstractTopoPrimitiveType o)
            {
                net.opengis.gml.AbstractTopoPrimitiveType old = TopoPrimitiveArrayAssociationTypeImpl.this.getTopoPrimitiveArray(i);
                TopoPrimitiveArrayAssociationTypeImpl.this.setTopoPrimitiveArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractTopoPrimitiveType o)
                { TopoPrimitiveArrayAssociationTypeImpl.this.insertNewTopoPrimitive(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractTopoPrimitiveType remove(int i)
            {
                net.opengis.gml.AbstractTopoPrimitiveType old = TopoPrimitiveArrayAssociationTypeImpl.this.getTopoPrimitiveArray(i);
                TopoPrimitiveArrayAssociationTypeImpl.this.removeTopoPrimitive(i);
                return old;
            }
            
            @Override
            public int size()
                { return TopoPrimitiveArrayAssociationTypeImpl.this.sizeOfTopoPrimitiveArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TopoPrimitiveList();
        }
    }
    
    /**
     * Gets array of all "_TopoPrimitive" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractTopoPrimitiveType[] getTopoPrimitiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractTopoPrimitiveType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractTopoPrimitiveType>();
            get_store().find_all_element_users(TOPOPRIMITIVE$1, targetList);
            net.opengis.gml.AbstractTopoPrimitiveType[] result = new net.opengis.gml.AbstractTopoPrimitiveType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_TopoPrimitive" element
     */
    public net.opengis.gml.AbstractTopoPrimitiveType getTopoPrimitiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().find_element_user(TOPOPRIMITIVE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_TopoPrimitive" element
     */
    public int sizeOfTopoPrimitiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPOPRIMITIVE$1);
        }
    }
    
    /**
     * Sets array of all "_TopoPrimitive" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setTopoPrimitiveArray(net.opengis.gml.AbstractTopoPrimitiveType[] topoPrimitiveArray)
    {
        check_orphaned();
        arraySetterHelper(topoPrimitiveArray, TOPOPRIMITIVE$0, TOPOPRIMITIVE$1);
    }
    
    /**
     * Sets ith "_TopoPrimitive" element
     */
     public void setTopoPrimitiveArray(int i, net.opengis.gml.AbstractTopoPrimitiveType topoPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().find_element_user(TOPOPRIMITIVE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(topoPrimitive);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_TopoPrimitive" element
     */
    public net.opengis.gml.AbstractTopoPrimitiveType insertNewTopoPrimitive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().insert_element_user(TOPOPRIMITIVE$1, TOPOPRIMITIVE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_TopoPrimitive" element
     */
    public net.opengis.gml.AbstractTopoPrimitiveType addNewTopoPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().add_element_user(TOPOPRIMITIVE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_TopoPrimitive" element
     */
    public void removeTopoPrimitive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPOPRIMITIVE$1, i);
        }
    }
}
