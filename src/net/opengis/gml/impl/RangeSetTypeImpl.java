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
 * An XML RangeSetType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class RangeSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.RangeSetType
{
    private static final long serialVersionUID = 1L;
    
    public RangeSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEARRAY1$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ValueArray");
    private static final javax.xml.namespace.QName BOOLEANLIST$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BooleanList");
    private static final javax.xml.namespace.QName CATEGORYLIST$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CategoryList");
    private static final javax.xml.namespace.QName QUANTITYLIST$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "QuantityList");
    private static final javax.xml.namespace.QName COUNTLIST$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CountList");
    private static final javax.xml.namespace.QName DATABLOCK$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DataBlock");
    private static final javax.xml.namespace.QName FILE$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "File");
    
    
    /**
     * Gets a List of "ValueArray" elements
     */
    public java.util.List<net.opengis.gml.ValueArrayType> getValueArray1List()
    {
        final class ValueArray1List extends java.util.AbstractList<net.opengis.gml.ValueArrayType>
        {
            @Override
            public net.opengis.gml.ValueArrayType get(int i)
                { return RangeSetTypeImpl.this.getValueArray1Array(i); }
            
            @Override
            public net.opengis.gml.ValueArrayType set(int i, net.opengis.gml.ValueArrayType o)
            {
                net.opengis.gml.ValueArrayType old = RangeSetTypeImpl.this.getValueArray1Array(i);
                RangeSetTypeImpl.this.setValueArray1Array(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.ValueArrayType o)
                { RangeSetTypeImpl.this.insertNewValueArray1(i).set(o); }
            
            @Override
            public net.opengis.gml.ValueArrayType remove(int i)
            {
                net.opengis.gml.ValueArrayType old = RangeSetTypeImpl.this.getValueArray1Array(i);
                RangeSetTypeImpl.this.removeValueArray1(i);
                return old;
            }
            
            @Override
            public int size()
                { return RangeSetTypeImpl.this.sizeOfValueArray1Array(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ValueArray1List();
        }
    }
    
    /**
     * Gets array of all "ValueArray" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.ValueArrayType[] getValueArray1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.ValueArrayType> targetList = new java.util.ArrayList<net.opengis.gml.ValueArrayType>();
            get_store().find_all_element_users(VALUEARRAY1$0, targetList);
            net.opengis.gml.ValueArrayType[] result = new net.opengis.gml.ValueArrayType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValueArray" element
     */
    public net.opengis.gml.ValueArrayType getValueArray1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValueArrayType target = null;
            target = (net.opengis.gml.ValueArrayType)get_store().find_element_user(VALUEARRAY1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ValueArray" element
     */
    public int sizeOfValueArray1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEARRAY1$0);
        }
    }
    
    /**
     * Sets array of all "ValueArray" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setValueArray1Array(net.opengis.gml.ValueArrayType[] valueArray1Array)
    {
        check_orphaned();
        arraySetterHelper(valueArray1Array, VALUEARRAY1$0);
    }
    
    /**
     * Sets ith "ValueArray" element
     */
    @Inject(optional=true) public void setValueArray1Array(int i, net.opengis.gml.ValueArrayType valueArray1)
    {
        generatedSetterHelperImpl(valueArray1, VALUEARRAY1$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueArray" element
     */
    public net.opengis.gml.ValueArrayType insertNewValueArray1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValueArrayType target = null;
            target = (net.opengis.gml.ValueArrayType)get_store().insert_element_user(VALUEARRAY1$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValueArray" element
     */
    public net.opengis.gml.ValueArrayType addNewValueArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValueArrayType target = null;
            target = (net.opengis.gml.ValueArrayType)get_store().add_element_user(VALUEARRAY1$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValueArray" element
     */
    public void removeValueArray1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEARRAY1$0, i);
        }
    }
    
    /**
     * Gets a List of "BooleanList" elements
     */
    public java.util.List<java.util.List> getBooleanListList()
    {
        final class BooleanListList extends java.util.AbstractList<java.util.List>
        {
            @Override
            public java.util.List get(int i)
                { return RangeSetTypeImpl.this.getBooleanListArray(i); }
            
            @Override
            public java.util.List set(int i, java.util.List o)
            {
                java.util.List old = RangeSetTypeImpl.this.getBooleanListArray(i);
                RangeSetTypeImpl.this.setBooleanListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.util.List o)
                { RangeSetTypeImpl.this.insertBooleanList(i, o); }
            
            @Override
            public java.util.List remove(int i)
            {
                java.util.List old = RangeSetTypeImpl.this.getBooleanListArray(i);
                RangeSetTypeImpl.this.removeBooleanList(i);
                return old;
            }
            
            @Override
            public int size()
                { return RangeSetTypeImpl.this.sizeOfBooleanListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BooleanListList();
        }
    }
    
    /**
     * Gets array of all "BooleanList" elements
     * @deprecated
     */
    @Deprecated
    public java.util.List[] getBooleanListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.BooleanOrNullList> targetList = new java.util.ArrayList<net.opengis.gml.BooleanOrNullList>();
            get_store().find_all_element_users(BOOLEANLIST$2, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "BooleanList" element
     */
    public java.util.List getBooleanListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "BooleanList" elements
     */
    public java.util.List<net.opengis.gml.BooleanOrNullList> xgetBooleanListList()
    {
        final class BooleanListList extends java.util.AbstractList<net.opengis.gml.BooleanOrNullList>
        {
            @Override
            public net.opengis.gml.BooleanOrNullList get(int i)
                { return RangeSetTypeImpl.this.xgetBooleanListArray(i); }
            
            @Override
            public net.opengis.gml.BooleanOrNullList set(int i, net.opengis.gml.BooleanOrNullList o)
            {
                net.opengis.gml.BooleanOrNullList old = RangeSetTypeImpl.this.xgetBooleanListArray(i);
                RangeSetTypeImpl.this.xsetBooleanListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.BooleanOrNullList o)
                { RangeSetTypeImpl.this.insertNewBooleanList(i).set(o); }
            
            @Override
            public net.opengis.gml.BooleanOrNullList remove(int i)
            {
                net.opengis.gml.BooleanOrNullList old = RangeSetTypeImpl.this.xgetBooleanListArray(i);
                RangeSetTypeImpl.this.removeBooleanList(i);
                return old;
            }
            
            @Override
            public int size()
                { return RangeSetTypeImpl.this.sizeOfBooleanListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BooleanListList();
        }
    }
    
    /**
     * Gets array of all "BooleanList" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.BooleanOrNullList[] xgetBooleanListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.BooleanOrNullList> targetList = new java.util.ArrayList<net.opengis.gml.BooleanOrNullList>();
            get_store().find_all_element_users(BOOLEANLIST$2, targetList);
            net.opengis.gml.BooleanOrNullList[] result = new net.opengis.gml.BooleanOrNullList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "BooleanList" element
     */
    public net.opengis.gml.BooleanOrNullList xgetBooleanListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().find_element_user(BOOLEANLIST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BooleanList" element
     */
    public int sizeOfBooleanListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEANLIST$2);
        }
    }
    
    /**
     * Sets array of all "BooleanList" element
     */
    @Inject(optional=true) public void setBooleanListArray(java.util.List[] booleanListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(booleanListArray, BOOLEANLIST$2);
        }
    }
    
    /**
     * Sets ith "BooleanList" element
     */
    @Inject(optional=true) public void setBooleanListArray(int i, java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Sets (as xml) array of all "BooleanList" element
     */
    public void xsetBooleanListArray(net.opengis.gml.BooleanOrNullList[]booleanListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(booleanListArray, BOOLEANLIST$2);
        }
    }
    
    /**
     * Sets (as xml) ith "BooleanList" element
     */
    public void xsetBooleanListArray(int i, net.opengis.gml.BooleanOrNullList booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().find_element_user(BOOLEANLIST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(booleanList);
        }
    }
    
    /**
     * Inserts the value as the ith "BooleanList" element
     */
    public void insertBooleanList(int i, java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOOLEANLIST$2, i);
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Appends the value as the last "BooleanList" element
     */
    public void addBooleanList(java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANLIST$2);
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BooleanList" element
     */
    public net.opengis.gml.BooleanOrNullList insertNewBooleanList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().insert_element_user(BOOLEANLIST$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BooleanList" element
     */
    public net.opengis.gml.BooleanOrNullList addNewBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().add_element_user(BOOLEANLIST$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "BooleanList" element
     */
    public void removeBooleanList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEANLIST$2, i);
        }
    }
    
    /**
     * Gets a List of "CategoryList" elements
     */
    public java.util.List<net.opengis.gml.CodeOrNullListType> getCategoryListList()
    {
        final class CategoryListList extends java.util.AbstractList<net.opengis.gml.CodeOrNullListType>
        {
            @Override
            public net.opengis.gml.CodeOrNullListType get(int i)
                { return RangeSetTypeImpl.this.getCategoryListArray(i); }
            
            @Override
            public net.opengis.gml.CodeOrNullListType set(int i, net.opengis.gml.CodeOrNullListType o)
            {
                net.opengis.gml.CodeOrNullListType old = RangeSetTypeImpl.this.getCategoryListArray(i);
                RangeSetTypeImpl.this.setCategoryListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CodeOrNullListType o)
                { RangeSetTypeImpl.this.insertNewCategoryList(i).set(o); }
            
            @Override
            public net.opengis.gml.CodeOrNullListType remove(int i)
            {
                net.opengis.gml.CodeOrNullListType old = RangeSetTypeImpl.this.getCategoryListArray(i);
                RangeSetTypeImpl.this.removeCategoryList(i);
                return old;
            }
            
            @Override
            public int size()
                { return RangeSetTypeImpl.this.sizeOfCategoryListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryListList();
        }
    }
    
    /**
     * Gets array of all "CategoryList" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CodeOrNullListType[] getCategoryListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CodeOrNullListType> targetList = new java.util.ArrayList<net.opengis.gml.CodeOrNullListType>();
            get_store().find_all_element_users(CATEGORYLIST$4, targetList);
            net.opengis.gml.CodeOrNullListType[] result = new net.opengis.gml.CodeOrNullListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType getCategoryListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().find_element_user(CATEGORYLIST$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategoryList" element
     */
    public int sizeOfCategoryListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYLIST$4);
        }
    }
    
    /**
     * Sets array of all "CategoryList" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCategoryListArray(net.opengis.gml.CodeOrNullListType[] categoryListArray)
    {
        check_orphaned();
        arraySetterHelper(categoryListArray, CATEGORYLIST$4);
    }
    
    /**
     * Sets ith "CategoryList" element
     */
    @Inject(optional=true) public void setCategoryListArray(int i, net.opengis.gml.CodeOrNullListType categoryList)
    {
        generatedSetterHelperImpl(categoryList, CATEGORYLIST$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType insertNewCategoryList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().insert_element_user(CATEGORYLIST$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType addNewCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().add_element_user(CATEGORYLIST$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategoryList" element
     */
    public void removeCategoryList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYLIST$4, i);
        }
    }
    
    /**
     * Gets a List of "QuantityList" elements
     */
    public java.util.List<net.opengis.gml.MeasureOrNullListType> getQuantityListList()
    {
        final class QuantityListList extends java.util.AbstractList<net.opengis.gml.MeasureOrNullListType>
        {
            @Override
            public net.opengis.gml.MeasureOrNullListType get(int i)
                { return RangeSetTypeImpl.this.getQuantityListArray(i); }
            
            @Override
            public net.opengis.gml.MeasureOrNullListType set(int i, net.opengis.gml.MeasureOrNullListType o)
            {
                net.opengis.gml.MeasureOrNullListType old = RangeSetTypeImpl.this.getQuantityListArray(i);
                RangeSetTypeImpl.this.setQuantityListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.MeasureOrNullListType o)
                { RangeSetTypeImpl.this.insertNewQuantityList(i).set(o); }
            
            @Override
            public net.opengis.gml.MeasureOrNullListType remove(int i)
            {
                net.opengis.gml.MeasureOrNullListType old = RangeSetTypeImpl.this.getQuantityListArray(i);
                RangeSetTypeImpl.this.removeQuantityList(i);
                return old;
            }
            
            @Override
            public int size()
                { return RangeSetTypeImpl.this.sizeOfQuantityListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new QuantityListList();
        }
    }
    
    /**
     * Gets array of all "QuantityList" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.MeasureOrNullListType[] getQuantityListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.MeasureOrNullListType> targetList = new java.util.ArrayList<net.opengis.gml.MeasureOrNullListType>();
            get_store().find_all_element_users(QUANTITYLIST$6, targetList);
            net.opengis.gml.MeasureOrNullListType[] result = new net.opengis.gml.MeasureOrNullListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType getQuantityListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().find_element_user(QUANTITYLIST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QuantityList" element
     */
    public int sizeOfQuantityListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYLIST$6);
        }
    }
    
    /**
     * Sets array of all "QuantityList" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setQuantityListArray(net.opengis.gml.MeasureOrNullListType[] quantityListArray)
    {
        check_orphaned();
        arraySetterHelper(quantityListArray, QUANTITYLIST$6);
    }
    
    /**
     * Sets ith "QuantityList" element
     */
    @Inject(optional=true) public void setQuantityListArray(int i, net.opengis.gml.MeasureOrNullListType quantityList)
    {
        generatedSetterHelperImpl(quantityList, QUANTITYLIST$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType insertNewQuantityList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().insert_element_user(QUANTITYLIST$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType addNewQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().add_element_user(QUANTITYLIST$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuantityList" element
     */
    public void removeQuantityList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYLIST$6, i);
        }
    }
    
    /**
     * Gets a List of "CountList" elements
     */
    public java.util.List<java.util.List> getCountListList()
    {
        final class CountListList extends java.util.AbstractList<java.util.List>
        {
            @Override
            public java.util.List get(int i)
                { return RangeSetTypeImpl.this.getCountListArray(i); }
            
            @Override
            public java.util.List set(int i, java.util.List o)
            {
                java.util.List old = RangeSetTypeImpl.this.getCountListArray(i);
                RangeSetTypeImpl.this.setCountListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.util.List o)
                { RangeSetTypeImpl.this.insertCountList(i, o); }
            
            @Override
            public java.util.List remove(int i)
            {
                java.util.List old = RangeSetTypeImpl.this.getCountListArray(i);
                RangeSetTypeImpl.this.removeCountList(i);
                return old;
            }
            
            @Override
            public int size()
                { return RangeSetTypeImpl.this.sizeOfCountListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CountListList();
        }
    }
    
    /**
     * Gets array of all "CountList" elements
     * @deprecated
     */
    @Deprecated
    public java.util.List[] getCountListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IntegerOrNullList> targetList = new java.util.ArrayList<net.opengis.gml.IntegerOrNullList>();
            get_store().find_all_element_users(COUNTLIST$8, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CountList" element
     */
    public java.util.List getCountListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "CountList" elements
     */
    public java.util.List<net.opengis.gml.IntegerOrNullList> xgetCountListList()
    {
        final class CountListList extends java.util.AbstractList<net.opengis.gml.IntegerOrNullList>
        {
            @Override
            public net.opengis.gml.IntegerOrNullList get(int i)
                { return RangeSetTypeImpl.this.xgetCountListArray(i); }
            
            @Override
            public net.opengis.gml.IntegerOrNullList set(int i, net.opengis.gml.IntegerOrNullList o)
            {
                net.opengis.gml.IntegerOrNullList old = RangeSetTypeImpl.this.xgetCountListArray(i);
                RangeSetTypeImpl.this.xsetCountListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IntegerOrNullList o)
                { RangeSetTypeImpl.this.insertNewCountList(i).set(o); }
            
            @Override
            public net.opengis.gml.IntegerOrNullList remove(int i)
            {
                net.opengis.gml.IntegerOrNullList old = RangeSetTypeImpl.this.xgetCountListArray(i);
                RangeSetTypeImpl.this.removeCountList(i);
                return old;
            }
            
            @Override
            public int size()
                { return RangeSetTypeImpl.this.sizeOfCountListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CountListList();
        }
    }
    
    /**
     * Gets array of all "CountList" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IntegerOrNullList[] xgetCountListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IntegerOrNullList> targetList = new java.util.ArrayList<net.opengis.gml.IntegerOrNullList>();
            get_store().find_all_element_users(COUNTLIST$8, targetList);
            net.opengis.gml.IntegerOrNullList[] result = new net.opengis.gml.IntegerOrNullList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CountList" element
     */
    public net.opengis.gml.IntegerOrNullList xgetCountListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().find_element_user(COUNTLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CountList" element
     */
    public int sizeOfCountListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTLIST$8);
        }
    }
    
    /**
     * Sets array of all "CountList" element
     */
    @Inject(optional=true) public void setCountListArray(java.util.List[] countListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countListArray, COUNTLIST$8);
        }
    }
    
    /**
     * Sets ith "CountList" element
     */
    @Inject(optional=true) public void setCountListArray(int i, java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(countList);
        }
    }
    
    /**
     * Sets (as xml) array of all "CountList" element
     */
    public void xsetCountListArray(net.opengis.gml.IntegerOrNullList[]countListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countListArray, COUNTLIST$8);
        }
    }
    
    /**
     * Sets (as xml) ith "CountList" element
     */
    public void xsetCountListArray(int i, net.opengis.gml.IntegerOrNullList countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().find_element_user(COUNTLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(countList);
        }
    }
    
    /**
     * Inserts the value as the ith "CountList" element
     */
    public void insertCountList(int i, java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COUNTLIST$8, i);
            target.setListValue(countList);
        }
    }
    
    /**
     * Appends the value as the last "CountList" element
     */
    public void addCountList(java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTLIST$8);
            target.setListValue(countList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CountList" element
     */
    public net.opengis.gml.IntegerOrNullList insertNewCountList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().insert_element_user(COUNTLIST$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CountList" element
     */
    public net.opengis.gml.IntegerOrNullList addNewCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().add_element_user(COUNTLIST$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "CountList" element
     */
    public void removeCountList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTLIST$8, i);
        }
    }
    
    /**
     * Gets the "DataBlock" element
     */
    public net.opengis.gml.DataBlockType getDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DataBlockType target = null;
            target = (net.opengis.gml.DataBlockType)get_store().find_element_user(DATABLOCK$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataBlock" element
     */
    public boolean isSetDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABLOCK$10) != 0;
        }
    }
    
    /**
     * Sets the "DataBlock" element
     */
    @Inject(optional=true) public void setDataBlock(net.opengis.gml.DataBlockType dataBlock)
    {
        generatedSetterHelperImpl(dataBlock, DATABLOCK$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DataBlock" element
     */
    public net.opengis.gml.DataBlockType addNewDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DataBlockType target = null;
            target = (net.opengis.gml.DataBlockType)get_store().add_element_user(DATABLOCK$10);
            return target;
        }
    }
    
    /**
     * Unsets the "DataBlock" element
     */
    public void unsetDataBlock()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABLOCK$10, 0);
        }
    }
    
    /**
     * Gets the "File" element
     */
    public net.opengis.gml.FileType getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FileType target = null;
            target = (net.opengis.gml.FileType)get_store().find_element_user(FILE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "File" element
     */
    public boolean isSetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILE$12) != 0;
        }
    }
    
    /**
     * Sets the "File" element
     */
    @Inject(optional=true) public void setFile(net.opengis.gml.FileType file)
    {
        generatedSetterHelperImpl(file, FILE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "File" element
     */
    public net.opengis.gml.FileType addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FileType target = null;
            target = (net.opengis.gml.FileType)get_store().add_element_user(FILE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "File" element
     */
    public void unsetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILE$12, 0);
        }
    }
}
