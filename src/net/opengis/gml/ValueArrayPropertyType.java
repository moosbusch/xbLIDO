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
package net.opengis.gml;


/**
 * An XML ValueArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface ValueArrayPropertyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValueArrayPropertyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("valuearraypropertytypef5c4type");
    
    /**
     * Gets a List of "Boolean" elements
     */
    java.util.List<java.lang.Boolean> getBooleanList();
    
    /**
     * Gets array of all "Boolean" elements
     * @deprecated
     */
    @Deprecated
    boolean[] getBooleanArray();
    
    /**
     * Gets ith "Boolean" element
     */
    boolean getBooleanArray(int i);
    
    /**
     * Gets (as xml) a List of "Boolean" elements
     */
    java.util.List<org.apache.xmlbeans.XmlBoolean> xgetBooleanList();
    
    /**
     * Gets (as xml) array of all "Boolean" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlBoolean[] xgetBooleanArray();
    
    /**
     * Gets (as xml) ith "Boolean" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBooleanArray(int i);
    
    /**
     * Returns number of "Boolean" element
     */
    int sizeOfBooleanArray();
    
    /**
     * Sets array of all "Boolean" element
     */
    void setBooleanArray(boolean[] xbooleanArray);
    
    /**
     * Sets ith "Boolean" element
     */
    void setBooleanArray(int i, boolean xboolean);
    
    /**
     * Sets (as xml) array of all "Boolean" element
     */
    void xsetBooleanArray(org.apache.xmlbeans.XmlBoolean[] xbooleanArray);
    
    /**
     * Sets (as xml) ith "Boolean" element
     */
    void xsetBooleanArray(int i, org.apache.xmlbeans.XmlBoolean xboolean);
    
    /**
     * Inserts the value as the ith "Boolean" element
     */
    void insertBoolean(int i, boolean xboolean);
    
    /**
     * Appends the value as the last "Boolean" element
     */
    void addBoolean(boolean xboolean);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Boolean" element
     */
    org.apache.xmlbeans.XmlBoolean insertNewBoolean(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Boolean" element
     */
    org.apache.xmlbeans.XmlBoolean addNewBoolean();
    
    /**
     * Removes the ith "Boolean" element
     */
    void removeBoolean(int i);
    
    /**
     * Gets a List of "Category" elements
     */
    java.util.List<net.opengis.gml.CodeType> getCategoryList();
    
    /**
     * Gets array of all "Category" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CodeType[] getCategoryArray();
    
    /**
     * Gets ith "Category" element
     */
    net.opengis.gml.CodeType getCategoryArray(int i);
    
    /**
     * Returns number of "Category" element
     */
    int sizeOfCategoryArray();
    
    /**
     * Sets array of all "Category" element
     */
    void setCategoryArray(net.opengis.gml.CodeType[] categoryArray);
    
    /**
     * Sets ith "Category" element
     */
    void setCategoryArray(int i, net.opengis.gml.CodeType category);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    net.opengis.gml.CodeType insertNewCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    net.opengis.gml.CodeType addNewCategory();
    
    /**
     * Removes the ith "Category" element
     */
    void removeCategory(int i);
    
    /**
     * Gets a List of "Quantity" elements
     */
    java.util.List<net.opengis.gml.MeasureType> getQuantityList();
    
    /**
     * Gets array of all "Quantity" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.MeasureType[] getQuantityArray();
    
    /**
     * Gets ith "Quantity" element
     */
    net.opengis.gml.MeasureType getQuantityArray(int i);
    
    /**
     * Returns number of "Quantity" element
     */
    int sizeOfQuantityArray();
    
    /**
     * Sets array of all "Quantity" element
     */
    void setQuantityArray(net.opengis.gml.MeasureType[] quantityArray);
    
    /**
     * Sets ith "Quantity" element
     */
    void setQuantityArray(int i, net.opengis.gml.MeasureType quantity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Quantity" element
     */
    net.opengis.gml.MeasureType insertNewQuantity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Quantity" element
     */
    net.opengis.gml.MeasureType addNewQuantity();
    
    /**
     * Removes the ith "Quantity" element
     */
    void removeQuantity(int i);
    
    /**
     * Gets a List of "Count" elements
     */
    java.util.List<java.math.BigInteger> getCountList();
    
    /**
     * Gets array of all "Count" elements
     * @deprecated
     */
    @Deprecated
    java.math.BigInteger[] getCountArray();
    
    /**
     * Gets ith "Count" element
     */
    java.math.BigInteger getCountArray(int i);
    
    /**
     * Gets (as xml) a List of "Count" elements
     */
    java.util.List<org.apache.xmlbeans.XmlInteger> xgetCountList();
    
    /**
     * Gets (as xml) array of all "Count" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlInteger[] xgetCountArray();
    
    /**
     * Gets (as xml) ith "Count" element
     */
    org.apache.xmlbeans.XmlInteger xgetCountArray(int i);
    
    /**
     * Returns number of "Count" element
     */
    int sizeOfCountArray();
    
    /**
     * Sets array of all "Count" element
     */
    void setCountArray(java.math.BigInteger[] countArray);
    
    /**
     * Sets ith "Count" element
     */
    void setCountArray(int i, java.math.BigInteger count);
    
    /**
     * Sets (as xml) array of all "Count" element
     */
    void xsetCountArray(org.apache.xmlbeans.XmlInteger[] countArray);
    
    /**
     * Sets (as xml) ith "Count" element
     */
    void xsetCountArray(int i, org.apache.xmlbeans.XmlInteger count);
    
    /**
     * Inserts the value as the ith "Count" element
     */
    void insertCount(int i, java.math.BigInteger count);
    
    /**
     * Appends the value as the last "Count" element
     */
    void addCount(java.math.BigInteger count);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Count" element
     */
    org.apache.xmlbeans.XmlInteger insertNewCount(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Count" element
     */
    org.apache.xmlbeans.XmlInteger addNewCount();
    
    /**
     * Removes the ith "Count" element
     */
    void removeCount(int i);
    
    /**
     * Gets a List of "BooleanList" elements
     */
    java.util.List<java.util.List> getBooleanListList();
    
    /**
     * Gets array of all "BooleanList" elements
     * @deprecated
     */
    @Deprecated
    java.util.List[] getBooleanListArray();
    
    /**
     * Gets ith "BooleanList" element
     */
    java.util.List getBooleanListArray(int i);
    
    /**
     * Gets (as xml) a List of "BooleanList" elements
     */
    java.util.List<net.opengis.gml.BooleanOrNullList> xgetBooleanListList();
    
    /**
     * Gets (as xml) array of all "BooleanList" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.BooleanOrNullList[] xgetBooleanListArray();
    
    /**
     * Gets (as xml) ith "BooleanList" element
     */
    net.opengis.gml.BooleanOrNullList xgetBooleanListArray(int i);
    
    /**
     * Returns number of "BooleanList" element
     */
    int sizeOfBooleanListArray();
    
    /**
     * Sets array of all "BooleanList" element
     */
    void setBooleanListArray(java.util.List[] booleanListArray);
    
    /**
     * Sets ith "BooleanList" element
     */
    void setBooleanListArray(int i, java.util.List booleanList);
    
    /**
     * Sets (as xml) array of all "BooleanList" element
     */
    void xsetBooleanListArray(net.opengis.gml.BooleanOrNullList[] booleanListArray);
    
    /**
     * Sets (as xml) ith "BooleanList" element
     */
    void xsetBooleanListArray(int i, net.opengis.gml.BooleanOrNullList booleanList);
    
    /**
     * Inserts the value as the ith "BooleanList" element
     */
    void insertBooleanList(int i, java.util.List booleanList);
    
    /**
     * Appends the value as the last "BooleanList" element
     */
    void addBooleanList(java.util.List booleanList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BooleanList" element
     */
    net.opengis.gml.BooleanOrNullList insertNewBooleanList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BooleanList" element
     */
    net.opengis.gml.BooleanOrNullList addNewBooleanList();
    
    /**
     * Removes the ith "BooleanList" element
     */
    void removeBooleanList(int i);
    
    /**
     * Gets a List of "CategoryList" elements
     */
    java.util.List<net.opengis.gml.CodeOrNullListType> getCategoryListList();
    
    /**
     * Gets array of all "CategoryList" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CodeOrNullListType[] getCategoryListArray();
    
    /**
     * Gets ith "CategoryList" element
     */
    net.opengis.gml.CodeOrNullListType getCategoryListArray(int i);
    
    /**
     * Returns number of "CategoryList" element
     */
    int sizeOfCategoryListArray();
    
    /**
     * Sets array of all "CategoryList" element
     */
    void setCategoryListArray(net.opengis.gml.CodeOrNullListType[] categoryListArray);
    
    /**
     * Sets ith "CategoryList" element
     */
    void setCategoryListArray(int i, net.opengis.gml.CodeOrNullListType categoryList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryList" element
     */
    net.opengis.gml.CodeOrNullListType insertNewCategoryList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryList" element
     */
    net.opengis.gml.CodeOrNullListType addNewCategoryList();
    
    /**
     * Removes the ith "CategoryList" element
     */
    void removeCategoryList(int i);
    
    /**
     * Gets a List of "QuantityList" elements
     */
    java.util.List<net.opengis.gml.MeasureOrNullListType> getQuantityListList();
    
    /**
     * Gets array of all "QuantityList" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.MeasureOrNullListType[] getQuantityListArray();
    
    /**
     * Gets ith "QuantityList" element
     */
    net.opengis.gml.MeasureOrNullListType getQuantityListArray(int i);
    
    /**
     * Returns number of "QuantityList" element
     */
    int sizeOfQuantityListArray();
    
    /**
     * Sets array of all "QuantityList" element
     */
    void setQuantityListArray(net.opengis.gml.MeasureOrNullListType[] quantityListArray);
    
    /**
     * Sets ith "QuantityList" element
     */
    void setQuantityListArray(int i, net.opengis.gml.MeasureOrNullListType quantityList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityList" element
     */
    net.opengis.gml.MeasureOrNullListType insertNewQuantityList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityList" element
     */
    net.opengis.gml.MeasureOrNullListType addNewQuantityList();
    
    /**
     * Removes the ith "QuantityList" element
     */
    void removeQuantityList(int i);
    
    /**
     * Gets a List of "CountList" elements
     */
    java.util.List<java.util.List> getCountListList();
    
    /**
     * Gets array of all "CountList" elements
     * @deprecated
     */
    @Deprecated
    java.util.List[] getCountListArray();
    
    /**
     * Gets ith "CountList" element
     */
    java.util.List getCountListArray(int i);
    
    /**
     * Gets (as xml) a List of "CountList" elements
     */
    java.util.List<net.opengis.gml.IntegerOrNullList> xgetCountListList();
    
    /**
     * Gets (as xml) array of all "CountList" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IntegerOrNullList[] xgetCountListArray();
    
    /**
     * Gets (as xml) ith "CountList" element
     */
    net.opengis.gml.IntegerOrNullList xgetCountListArray(int i);
    
    /**
     * Returns number of "CountList" element
     */
    int sizeOfCountListArray();
    
    /**
     * Sets array of all "CountList" element
     */
    void setCountListArray(java.util.List[] countListArray);
    
    /**
     * Sets ith "CountList" element
     */
    void setCountListArray(int i, java.util.List countList);
    
    /**
     * Sets (as xml) array of all "CountList" element
     */
    void xsetCountListArray(net.opengis.gml.IntegerOrNullList[] countListArray);
    
    /**
     * Sets (as xml) ith "CountList" element
     */
    void xsetCountListArray(int i, net.opengis.gml.IntegerOrNullList countList);
    
    /**
     * Inserts the value as the ith "CountList" element
     */
    void insertCountList(int i, java.util.List countList);
    
    /**
     * Appends the value as the last "CountList" element
     */
    void addCountList(java.util.List countList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CountList" element
     */
    net.opengis.gml.IntegerOrNullList insertNewCountList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CountList" element
     */
    net.opengis.gml.IntegerOrNullList addNewCountList();
    
    /**
     * Removes the ith "CountList" element
     */
    void removeCountList(int i);
    
    /**
     * Gets a List of "CategoryExtent" elements
     */
    java.util.List<net.opengis.gml.CategoryExtentType> getCategoryExtentList();
    
    /**
     * Gets array of all "CategoryExtent" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CategoryExtentType[] getCategoryExtentArray();
    
    /**
     * Gets ith "CategoryExtent" element
     */
    net.opengis.gml.CategoryExtentType getCategoryExtentArray(int i);
    
    /**
     * Returns number of "CategoryExtent" element
     */
    int sizeOfCategoryExtentArray();
    
    /**
     * Sets array of all "CategoryExtent" element
     */
    void setCategoryExtentArray(net.opengis.gml.CategoryExtentType[] categoryExtentArray);
    
    /**
     * Sets ith "CategoryExtent" element
     */
    void setCategoryExtentArray(int i, net.opengis.gml.CategoryExtentType categoryExtent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryExtent" element
     */
    net.opengis.gml.CategoryExtentType insertNewCategoryExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryExtent" element
     */
    net.opengis.gml.CategoryExtentType addNewCategoryExtent();
    
    /**
     * Removes the ith "CategoryExtent" element
     */
    void removeCategoryExtent(int i);
    
    /**
     * Gets a List of "QuantityExtent" elements
     */
    java.util.List<net.opengis.gml.QuantityExtentType> getQuantityExtentList();
    
    /**
     * Gets array of all "QuantityExtent" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.QuantityExtentType[] getQuantityExtentArray();
    
    /**
     * Gets ith "QuantityExtent" element
     */
    net.opengis.gml.QuantityExtentType getQuantityExtentArray(int i);
    
    /**
     * Returns number of "QuantityExtent" element
     */
    int sizeOfQuantityExtentArray();
    
    /**
     * Sets array of all "QuantityExtent" element
     */
    void setQuantityExtentArray(net.opengis.gml.QuantityExtentType[] quantityExtentArray);
    
    /**
     * Sets ith "QuantityExtent" element
     */
    void setQuantityExtentArray(int i, net.opengis.gml.QuantityExtentType quantityExtent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityExtent" element
     */
    net.opengis.gml.QuantityExtentType insertNewQuantityExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityExtent" element
     */
    net.opengis.gml.QuantityExtentType addNewQuantityExtent();
    
    /**
     * Removes the ith "QuantityExtent" element
     */
    void removeQuantityExtent(int i);
    
    /**
     * Gets a List of "CountExtent" elements
     */
    java.util.List<java.util.List> getCountExtentList();
    
    /**
     * Gets array of all "CountExtent" elements
     * @deprecated
     */
    @Deprecated
    java.util.List[] getCountExtentArray();
    
    /**
     * Gets ith "CountExtent" element
     */
    java.util.List getCountExtentArray(int i);
    
    /**
     * Gets (as xml) a List of "CountExtent" elements
     */
    java.util.List<net.opengis.gml.CountExtentType> xgetCountExtentList();
    
    /**
     * Gets (as xml) array of all "CountExtent" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CountExtentType[] xgetCountExtentArray();
    
    /**
     * Gets (as xml) ith "CountExtent" element
     */
    net.opengis.gml.CountExtentType xgetCountExtentArray(int i);
    
    /**
     * Returns number of "CountExtent" element
     */
    int sizeOfCountExtentArray();
    
    /**
     * Sets array of all "CountExtent" element
     */
    void setCountExtentArray(java.util.List[] countExtentArray);
    
    /**
     * Sets ith "CountExtent" element
     */
    void setCountExtentArray(int i, java.util.List countExtent);
    
    /**
     * Sets (as xml) array of all "CountExtent" element
     */
    void xsetCountExtentArray(net.opengis.gml.CountExtentType[] countExtentArray);
    
    /**
     * Sets (as xml) ith "CountExtent" element
     */
    void xsetCountExtentArray(int i, net.opengis.gml.CountExtentType countExtent);
    
    /**
     * Inserts the value as the ith "CountExtent" element
     */
    void insertCountExtent(int i, java.util.List countExtent);
    
    /**
     * Appends the value as the last "CountExtent" element
     */
    void addCountExtent(java.util.List countExtent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CountExtent" element
     */
    net.opengis.gml.CountExtentType insertNewCountExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CountExtent" element
     */
    net.opengis.gml.CountExtentType addNewCountExtent();
    
    /**
     * Removes the ith "CountExtent" element
     */
    void removeCountExtent(int i);
    
    /**
     * Gets a List of "CompositeValue" elements
     */
    java.util.List<net.opengis.gml.CompositeValueType> getCompositeValueList();
    
    /**
     * Gets array of all "CompositeValue" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CompositeValueType[] getCompositeValueArray();
    
    /**
     * Gets ith "CompositeValue" element
     */
    net.opengis.gml.CompositeValueType getCompositeValueArray(int i);
    
    /**
     * Returns number of "CompositeValue" element
     */
    int sizeOfCompositeValueArray();
    
    /**
     * Sets array of all "CompositeValue" element
     */
    void setCompositeValueArray(net.opengis.gml.CompositeValueType[] compositeValueArray);
    
    /**
     * Sets ith "CompositeValue" element
     */
    void setCompositeValueArray(int i, net.opengis.gml.CompositeValueType compositeValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CompositeValue" element
     */
    net.opengis.gml.CompositeValueType insertNewCompositeValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CompositeValue" element
     */
    net.opengis.gml.CompositeValueType addNewCompositeValue();
    
    /**
     * Removes the ith "CompositeValue" element
     */
    void removeCompositeValue(int i);
    
    /**
     * Gets a List of "_Object" elements
     */
    java.util.List<org.apache.xmlbeans.XmlObject> getObjectList();
    
    /**
     * Gets array of all "_Object" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlObject[] getObjectArray();
    
    /**
     * Gets ith "_Object" element
     */
    org.apache.xmlbeans.XmlObject getObjectArray(int i);
    
    /**
     * Returns number of "_Object" element
     */
    int sizeOfObjectArray();
    
    /**
     * Sets array of all "_Object" element
     */
    void setObjectArray(org.apache.xmlbeans.XmlObject[] objectArray);
    
    /**
     * Sets ith "_Object" element
     */
    void setObjectArray(int i, org.apache.xmlbeans.XmlObject object);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Object" element
     */
    org.apache.xmlbeans.XmlObject insertNewObject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Object" element
     */
    org.apache.xmlbeans.XmlObject addNewObject();
    
    /**
     * Removes the ith "_Object" element
     */
    void removeObject(int i);
    
    /**
     * Gets a List of "Null" elements
     */
    java.util.List<java.lang.Object> getNullList();
    
    /**
     * Gets array of all "Null" elements
     * @deprecated
     */
    @Deprecated
    java.lang.Object[] getNullArray();
    
    /**
     * Gets ith "Null" element
     */
    java.lang.Object getNullArray(int i);
    
    /**
     * Gets (as xml) a List of "Null" elements
     */
    java.util.List<net.opengis.gml.NullType> xgetNullList();
    
    /**
     * Gets (as xml) array of all "Null" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.NullType[] xgetNullArray();
    
    /**
     * Gets (as xml) ith "Null" element
     */
    net.opengis.gml.NullType xgetNullArray(int i);
    
    /**
     * Returns number of "Null" element
     */
    int sizeOfNullArray();
    
    /**
     * Sets array of all "Null" element
     */
    void setNullArray(java.lang.Object[] xnullArray);
    
    /**
     * Sets ith "Null" element
     */
    void setNullArray(int i, java.lang.Object xnull);
    
    /**
     * Sets (as xml) array of all "Null" element
     */
    void xsetNullArray(net.opengis.gml.NullType[] xnullArray);
    
    /**
     * Sets (as xml) ith "Null" element
     */
    void xsetNullArray(int i, net.opengis.gml.NullType xnull);
    
    /**
     * Inserts the value as the ith "Null" element
     */
    void insertNull(int i, java.lang.Object xnull);
    
    /**
     * Appends the value as the last "Null" element
     */
    void addNull(java.lang.Object xnull);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Null" element
     */
    net.opengis.gml.NullType insertNewNull(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Null" element
     */
    net.opengis.gml.NullType addNewNull();
    
    /**
     * Removes the ith "Null" element
     */
    void removeNull(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.ValueArrayPropertyType newInstance() {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.ValueArrayPropertyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.ValueArrayPropertyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.ValueArrayPropertyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.ValueArrayPropertyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ValueArrayPropertyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ValueArrayPropertyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
