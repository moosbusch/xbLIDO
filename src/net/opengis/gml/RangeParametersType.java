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
 * An XML RangeParametersType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface RangeParametersType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RangeParametersType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("rangeparameterstype890ctype");
    
    /**
     * Gets the "Boolean" element
     */
    boolean getBoolean();
    
    /**
     * Gets (as xml) the "Boolean" element
     */
    org.apache.xmlbeans.XmlBoolean xgetBoolean();
    
    /**
     * True if has "Boolean" element
     */
    boolean isSetBoolean();
    
    /**
     * Sets the "Boolean" element
     */
    void setBoolean(boolean xboolean);
    
    /**
     * Sets (as xml) the "Boolean" element
     */
    void xsetBoolean(org.apache.xmlbeans.XmlBoolean xboolean);
    
    /**
     * Unsets the "Boolean" element
     */
    void unsetBoolean();
    
    /**
     * Gets the "Category" element
     */
    net.opengis.gml.CodeType getCategory();
    
    /**
     * True if has "Category" element
     */
    boolean isSetCategory();
    
    /**
     * Sets the "Category" element
     */
    void setCategory(net.opengis.gml.CodeType category);
    
    /**
     * Appends and returns a new empty "Category" element
     */
    net.opengis.gml.CodeType addNewCategory();
    
    /**
     * Unsets the "Category" element
     */
    void unsetCategory();
    
    /**
     * Gets the "Quantity" element
     */
    net.opengis.gml.MeasureType getQuantity();
    
    /**
     * True if has "Quantity" element
     */
    boolean isSetQuantity();
    
    /**
     * Sets the "Quantity" element
     */
    void setQuantity(net.opengis.gml.MeasureType quantity);
    
    /**
     * Appends and returns a new empty "Quantity" element
     */
    net.opengis.gml.MeasureType addNewQuantity();
    
    /**
     * Unsets the "Quantity" element
     */
    void unsetQuantity();
    
    /**
     * Gets the "Count" element
     */
    java.math.BigInteger getCount();
    
    /**
     * Gets (as xml) the "Count" element
     */
    org.apache.xmlbeans.XmlInteger xgetCount();
    
    /**
     * True if has "Count" element
     */
    boolean isSetCount();
    
    /**
     * Sets the "Count" element
     */
    void setCount(java.math.BigInteger count);
    
    /**
     * Sets (as xml) the "Count" element
     */
    void xsetCount(org.apache.xmlbeans.XmlInteger count);
    
    /**
     * Unsets the "Count" element
     */
    void unsetCount();
    
    /**
     * Gets the "BooleanList" element
     */
    java.util.List getBooleanList();
    
    /**
     * Gets (as xml) the "BooleanList" element
     */
    net.opengis.gml.BooleanOrNullList xgetBooleanList();
    
    /**
     * True if has "BooleanList" element
     */
    boolean isSetBooleanList();
    
    /**
     * Sets the "BooleanList" element
     */
    void setBooleanList(java.util.List booleanList);
    
    /**
     * Sets (as xml) the "BooleanList" element
     */
    void xsetBooleanList(net.opengis.gml.BooleanOrNullList booleanList);
    
    /**
     * Unsets the "BooleanList" element
     */
    void unsetBooleanList();
    
    /**
     * Gets the "CategoryList" element
     */
    net.opengis.gml.CodeOrNullListType getCategoryList();
    
    /**
     * True if has "CategoryList" element
     */
    boolean isSetCategoryList();
    
    /**
     * Sets the "CategoryList" element
     */
    void setCategoryList(net.opengis.gml.CodeOrNullListType categoryList);
    
    /**
     * Appends and returns a new empty "CategoryList" element
     */
    net.opengis.gml.CodeOrNullListType addNewCategoryList();
    
    /**
     * Unsets the "CategoryList" element
     */
    void unsetCategoryList();
    
    /**
     * Gets the "QuantityList" element
     */
    net.opengis.gml.MeasureOrNullListType getQuantityList();
    
    /**
     * True if has "QuantityList" element
     */
    boolean isSetQuantityList();
    
    /**
     * Sets the "QuantityList" element
     */
    void setQuantityList(net.opengis.gml.MeasureOrNullListType quantityList);
    
    /**
     * Appends and returns a new empty "QuantityList" element
     */
    net.opengis.gml.MeasureOrNullListType addNewQuantityList();
    
    /**
     * Unsets the "QuantityList" element
     */
    void unsetQuantityList();
    
    /**
     * Gets the "CountList" element
     */
    java.util.List getCountList();
    
    /**
     * Gets (as xml) the "CountList" element
     */
    net.opengis.gml.IntegerOrNullList xgetCountList();
    
    /**
     * True if has "CountList" element
     */
    boolean isSetCountList();
    
    /**
     * Sets the "CountList" element
     */
    void setCountList(java.util.List countList);
    
    /**
     * Sets (as xml) the "CountList" element
     */
    void xsetCountList(net.opengis.gml.IntegerOrNullList countList);
    
    /**
     * Unsets the "CountList" element
     */
    void unsetCountList();
    
    /**
     * Gets the "CategoryExtent" element
     */
    net.opengis.gml.CategoryExtentType getCategoryExtent();
    
    /**
     * True if has "CategoryExtent" element
     */
    boolean isSetCategoryExtent();
    
    /**
     * Sets the "CategoryExtent" element
     */
    void setCategoryExtent(net.opengis.gml.CategoryExtentType categoryExtent);
    
    /**
     * Appends and returns a new empty "CategoryExtent" element
     */
    net.opengis.gml.CategoryExtentType addNewCategoryExtent();
    
    /**
     * Unsets the "CategoryExtent" element
     */
    void unsetCategoryExtent();
    
    /**
     * Gets the "QuantityExtent" element
     */
    net.opengis.gml.QuantityExtentType getQuantityExtent();
    
    /**
     * True if has "QuantityExtent" element
     */
    boolean isSetQuantityExtent();
    
    /**
     * Sets the "QuantityExtent" element
     */
    void setQuantityExtent(net.opengis.gml.QuantityExtentType quantityExtent);
    
    /**
     * Appends and returns a new empty "QuantityExtent" element
     */
    net.opengis.gml.QuantityExtentType addNewQuantityExtent();
    
    /**
     * Unsets the "QuantityExtent" element
     */
    void unsetQuantityExtent();
    
    /**
     * Gets the "CountExtent" element
     */
    java.util.List getCountExtent();
    
    /**
     * Gets (as xml) the "CountExtent" element
     */
    net.opengis.gml.CountExtentType xgetCountExtent();
    
    /**
     * True if has "CountExtent" element
     */
    boolean isSetCountExtent();
    
    /**
     * Sets the "CountExtent" element
     */
    void setCountExtent(java.util.List countExtent);
    
    /**
     * Sets (as xml) the "CountExtent" element
     */
    void xsetCountExtent(net.opengis.gml.CountExtentType countExtent);
    
    /**
     * Unsets the "CountExtent" element
     */
    void unsetCountExtent();
    
    /**
     * Gets the "CompositeValue" element
     */
    net.opengis.gml.CompositeValueType getCompositeValue();
    
    /**
     * True if has "CompositeValue" element
     */
    boolean isSetCompositeValue();
    
    /**
     * Sets the "CompositeValue" element
     */
    void setCompositeValue(net.opengis.gml.CompositeValueType compositeValue);
    
    /**
     * Appends and returns a new empty "CompositeValue" element
     */
    net.opengis.gml.CompositeValueType addNewCompositeValue();
    
    /**
     * Unsets the "CompositeValue" element
     */
    void unsetCompositeValue();
    
    /**
     * Gets the "type" attribute
     */
    org.w3.x1999.xlink.TypeType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.w3.x1999.xlink.TypeType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.w3.x1999.xlink.TypeType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.w3.x1999.xlink.TypeType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "href" attribute
     */
    java.lang.String getHref();
    
    /**
     * Gets (as xml) the "href" attribute
     */
    org.w3.x1999.xlink.HrefType xgetHref();
    
    /**
     * True if has "href" attribute
     */
    boolean isSetHref();
    
    /**
     * Sets the "href" attribute
     */
    void setHref(java.lang.String href);
    
    /**
     * Sets (as xml) the "href" attribute
     */
    void xsetHref(org.w3.x1999.xlink.HrefType href);
    
    /**
     * Unsets the "href" attribute
     */
    void unsetHref();
    
    /**
     * Gets the "role" attribute
     */
    java.lang.String getRole();
    
    /**
     * Gets (as xml) the "role" attribute
     */
    org.w3.x1999.xlink.RoleType xgetRole();
    
    /**
     * True if has "role" attribute
     */
    boolean isSetRole();
    
    /**
     * Sets the "role" attribute
     */
    void setRole(java.lang.String role);
    
    /**
     * Sets (as xml) the "role" attribute
     */
    void xsetRole(org.w3.x1999.xlink.RoleType role);
    
    /**
     * Unsets the "role" attribute
     */
    void unsetRole();
    
    /**
     * Gets the "arcrole" attribute
     */
    java.lang.String getArcrole();
    
    /**
     * Gets (as xml) the "arcrole" attribute
     */
    org.w3.x1999.xlink.ArcroleType xgetArcrole();
    
    /**
     * True if has "arcrole" attribute
     */
    boolean isSetArcrole();
    
    /**
     * Sets the "arcrole" attribute
     */
    void setArcrole(java.lang.String arcrole);
    
    /**
     * Sets (as xml) the "arcrole" attribute
     */
    void xsetArcrole(org.w3.x1999.xlink.ArcroleType arcrole);
    
    /**
     * Unsets the "arcrole" attribute
     */
    void unsetArcrole();
    
    /**
     * Gets the "title" attribute
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" attribute
     */
    org.w3.x1999.xlink.TitleAttrType xgetTitle();
    
    /**
     * True if has "title" attribute
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" attribute
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" attribute
     */
    void xsetTitle(org.w3.x1999.xlink.TitleAttrType title);
    
    /**
     * Unsets the "title" attribute
     */
    void unsetTitle();
    
    /**
     * Gets the "show" attribute
     */
    org.w3.x1999.xlink.ShowType.Enum getShow();
    
    /**
     * Gets (as xml) the "show" attribute
     */
    org.w3.x1999.xlink.ShowType xgetShow();
    
    /**
     * True if has "show" attribute
     */
    boolean isSetShow();
    
    /**
     * Sets the "show" attribute
     */
    void setShow(org.w3.x1999.xlink.ShowType.Enum show);
    
    /**
     * Sets (as xml) the "show" attribute
     */
    void xsetShow(org.w3.x1999.xlink.ShowType show);
    
    /**
     * Unsets the "show" attribute
     */
    void unsetShow();
    
    /**
     * Gets the "actuate" attribute
     */
    org.w3.x1999.xlink.ActuateType.Enum getActuate();
    
    /**
     * Gets (as xml) the "actuate" attribute
     */
    org.w3.x1999.xlink.ActuateType xgetActuate();
    
    /**
     * True if has "actuate" attribute
     */
    boolean isSetActuate();
    
    /**
     * Sets the "actuate" attribute
     */
    void setActuate(org.w3.x1999.xlink.ActuateType.Enum actuate);
    
    /**
     * Sets (as xml) the "actuate" attribute
     */
    void xsetActuate(org.w3.x1999.xlink.ActuateType actuate);
    
    /**
     * Unsets the "actuate" attribute
     */
    void unsetActuate();
    
    /**
     * Gets the "remoteSchema" attribute
     */
    java.lang.String getRemoteSchema();
    
    /**
     * Gets (as xml) the "remoteSchema" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetRemoteSchema();
    
    /**
     * True if has "remoteSchema" attribute
     */
    boolean isSetRemoteSchema();
    
    /**
     * Sets the "remoteSchema" attribute
     */
    void setRemoteSchema(java.lang.String remoteSchema);
    
    /**
     * Sets (as xml) the "remoteSchema" attribute
     */
    void xsetRemoteSchema(org.apache.xmlbeans.XmlAnyURI remoteSchema);
    
    /**
     * Unsets the "remoteSchema" attribute
     */
    void unsetRemoteSchema();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.RangeParametersType newInstance() {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.RangeParametersType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.RangeParametersType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.RangeParametersType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.RangeParametersType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.RangeParametersType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.RangeParametersType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.RangeParametersType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.RangeParametersType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.RangeParametersType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.RangeParametersType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.RangeParametersType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.RangeParametersType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.RangeParametersType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.RangeParametersType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.RangeParametersType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.RangeParametersType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.RangeParametersType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.RangeParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
