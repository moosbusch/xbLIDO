/*
 * XML Type:  RangeSetType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RangeSetType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML RangeSetType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface RangeSetType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RangeSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("rangesettype48fctype");
    
    /**
     * Gets a List of "ValueArray" elements
     */
    java.util.List<net.opengis.gml.ValueArrayType> getValueArray1List();
    
    /**
     * Gets array of all "ValueArray" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.ValueArrayType[] getValueArray1Array();
    
    /**
     * Gets ith "ValueArray" element
     */
    net.opengis.gml.ValueArrayType getValueArray1Array(int i);
    
    /**
     * Returns number of "ValueArray" element
     */
    int sizeOfValueArray1Array();
    
    /**
     * Sets array of all "ValueArray" element
     */
    void setValueArray1Array(net.opengis.gml.ValueArrayType[] valueArray1Array);
    
    /**
     * Sets ith "ValueArray" element
     */
    void setValueArray1Array(int i, net.opengis.gml.ValueArrayType valueArray1);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueArray" element
     */
    net.opengis.gml.ValueArrayType insertNewValueArray1(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValueArray" element
     */
    net.opengis.gml.ValueArrayType addNewValueArray1();
    
    /**
     * Removes the ith "ValueArray" element
     */
    void removeValueArray1(int i);
    
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
     * Gets the "DataBlock" element
     */
    net.opengis.gml.DataBlockType getDataBlock();
    
    /**
     * True if has "DataBlock" element
     */
    boolean isSetDataBlock();
    
    /**
     * Sets the "DataBlock" element
     */
    void setDataBlock(net.opengis.gml.DataBlockType dataBlock);
    
    /**
     * Appends and returns a new empty "DataBlock" element
     */
    net.opengis.gml.DataBlockType addNewDataBlock();
    
    /**
     * Unsets the "DataBlock" element
     */
    void unsetDataBlock();
    
    /**
     * Gets the "File" element
     */
    net.opengis.gml.FileType getFile();
    
    /**
     * True if has "File" element
     */
    boolean isSetFile();
    
    /**
     * Sets the "File" element
     */
    void setFile(net.opengis.gml.FileType file);
    
    /**
     * Appends and returns a new empty "File" element
     */
    net.opengis.gml.FileType addNewFile();
    
    /**
     * Unsets the "File" element
     */
    void unsetFile();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.RangeSetType newInstance() {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.RangeSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.RangeSetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.RangeSetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.RangeSetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.RangeSetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.RangeSetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.RangeSetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.RangeSetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.RangeSetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.RangeSetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.RangeSetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.RangeSetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.RangeSetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.RangeSetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.RangeSetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.RangeSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.RangeSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
