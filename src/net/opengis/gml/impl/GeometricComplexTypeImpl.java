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
 * An XML GeometricComplexType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeometricComplexTypeImpl extends net.opengis.gml.impl.AbstractGeometryTypeImpl implements net.opengis.gml.GeometricComplexType
{
    private static final long serialVersionUID = 1L;
    
    public GeometricComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "element");
    
    
    /**
     * Gets a List of "element" elements
     */
    public java.util.List<net.opengis.gml.GeometricPrimitivePropertyType> getElementList()
    {
        final class ElementList extends java.util.AbstractList<net.opengis.gml.GeometricPrimitivePropertyType>
        {
            @Override
            public net.opengis.gml.GeometricPrimitivePropertyType get(int i)
                { return GeometricComplexTypeImpl.this.getElementArray(i); }
            
            @Override
            public net.opengis.gml.GeometricPrimitivePropertyType set(int i, net.opengis.gml.GeometricPrimitivePropertyType o)
            {
                net.opengis.gml.GeometricPrimitivePropertyType old = GeometricComplexTypeImpl.this.getElementArray(i);
                GeometricComplexTypeImpl.this.setElementArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.GeometricPrimitivePropertyType o)
                { GeometricComplexTypeImpl.this.insertNewElement(i).set(o); }
            
            @Override
            public net.opengis.gml.GeometricPrimitivePropertyType remove(int i)
            {
                net.opengis.gml.GeometricPrimitivePropertyType old = GeometricComplexTypeImpl.this.getElementArray(i);
                GeometricComplexTypeImpl.this.removeElement(i);
                return old;
            }
            
            @Override
            public int size()
                { return GeometricComplexTypeImpl.this.sizeOfElementArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ElementList();
        }
    }
    
    /**
     * Gets array of all "element" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.GeometricPrimitivePropertyType[] getElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.GeometricPrimitivePropertyType> targetList = new java.util.ArrayList<net.opengis.gml.GeometricPrimitivePropertyType>();
            get_store().find_all_element_users(ELEMENT$0, targetList);
            net.opengis.gml.GeometricPrimitivePropertyType[] result = new net.opengis.gml.GeometricPrimitivePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "element" element
     */
    public net.opengis.gml.GeometricPrimitivePropertyType getElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometricPrimitivePropertyType target = null;
            target = (net.opengis.gml.GeometricPrimitivePropertyType)get_store().find_element_user(ELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "element" element
     */
    public int sizeOfElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENT$0);
        }
    }
    
    /**
     * Sets array of all "element" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setElementArray(net.opengis.gml.GeometricPrimitivePropertyType[] elementArray)
    {
        check_orphaned();
        arraySetterHelper(elementArray, ELEMENT$0);
    }
    
    /**
     * Sets ith "element" element
     */
     public void setElementArray(int i, net.opengis.gml.GeometricPrimitivePropertyType element)
    {
        generatedSetterHelperImpl(element, ELEMENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "element" element
     */
    public net.opengis.gml.GeometricPrimitivePropertyType insertNewElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometricPrimitivePropertyType target = null;
            target = (net.opengis.gml.GeometricPrimitivePropertyType)get_store().insert_element_user(ELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "element" element
     */
    public net.opengis.gml.GeometricPrimitivePropertyType addNewElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeometricPrimitivePropertyType target = null;
            target = (net.opengis.gml.GeometricPrimitivePropertyType)get_store().add_element_user(ELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "element" element
     */
    public void removeElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENT$0, i);
        }
    }
}
