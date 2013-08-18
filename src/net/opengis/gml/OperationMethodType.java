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
 * An XML OperationMethodType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface OperationMethodType extends net.opengis.gml.OperationMethodBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationMethodType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("operationmethodtype0acbtype");
    
    /**
     * Gets a List of "methodID" elements
     */
    java.util.List<net.opengis.gml.IdentifierType> getMethodIDList();
    
    /**
     * Gets array of all "methodID" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IdentifierType[] getMethodIDArray();
    
    /**
     * Gets ith "methodID" element
     */
    net.opengis.gml.IdentifierType getMethodIDArray(int i);
    
    /**
     * Returns number of "methodID" element
     */
    int sizeOfMethodIDArray();
    
    /**
     * Sets array of all "methodID" element
     */
    void setMethodIDArray(net.opengis.gml.IdentifierType[] methodIDArray);
    
    /**
     * Sets ith "methodID" element
     */
    void setMethodIDArray(int i, net.opengis.gml.IdentifierType methodID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "methodID" element
     */
    net.opengis.gml.IdentifierType insertNewMethodID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "methodID" element
     */
    net.opengis.gml.IdentifierType addNewMethodID();
    
    /**
     * Removes the ith "methodID" element
     */
    void removeMethodID(int i);
    
    /**
     * Gets the "remarks" element
     */
    net.opengis.gml.StringOrRefType getRemarks();
    
    /**
     * True if has "remarks" element
     */
    boolean isSetRemarks();
    
    /**
     * Sets the "remarks" element
     */
    void setRemarks(net.opengis.gml.StringOrRefType remarks);
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    net.opengis.gml.StringOrRefType addNewRemarks();
    
    /**
     * Unsets the "remarks" element
     */
    void unsetRemarks();
    
    /**
     * Gets the "methodFormula" element
     */
    net.opengis.gml.CodeType getMethodFormula();
    
    /**
     * Sets the "methodFormula" element
     */
    void setMethodFormula(net.opengis.gml.CodeType methodFormula);
    
    /**
     * Appends and returns a new empty "methodFormula" element
     */
    net.opengis.gml.CodeType addNewMethodFormula();
    
    /**
     * Gets the "sourceDimensions" element
     */
    java.math.BigInteger getSourceDimensions();
    
    /**
     * Gets (as xml) the "sourceDimensions" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetSourceDimensions();
    
    /**
     * Sets the "sourceDimensions" element
     */
    void setSourceDimensions(java.math.BigInteger sourceDimensions);
    
    /**
     * Sets (as xml) the "sourceDimensions" element
     */
    void xsetSourceDimensions(org.apache.xmlbeans.XmlPositiveInteger sourceDimensions);
    
    /**
     * Gets the "targetDimensions" element
     */
    java.math.BigInteger getTargetDimensions();
    
    /**
     * Gets (as xml) the "targetDimensions" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetTargetDimensions();
    
    /**
     * Sets the "targetDimensions" element
     */
    void setTargetDimensions(java.math.BigInteger targetDimensions);
    
    /**
     * Sets (as xml) the "targetDimensions" element
     */
    void xsetTargetDimensions(org.apache.xmlbeans.XmlPositiveInteger targetDimensions);
    
    /**
     * Gets a List of "usesParameter" elements
     */
    java.util.List<net.opengis.gml.AbstractGeneralOperationParameterRefType> getUsesParameterList();
    
    /**
     * Gets array of all "usesParameter" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.AbstractGeneralOperationParameterRefType[] getUsesParameterArray();
    
    /**
     * Gets ith "usesParameter" element
     */
    net.opengis.gml.AbstractGeneralOperationParameterRefType getUsesParameterArray(int i);
    
    /**
     * Returns number of "usesParameter" element
     */
    int sizeOfUsesParameterArray();
    
    /**
     * Sets array of all "usesParameter" element
     */
    void setUsesParameterArray(net.opengis.gml.AbstractGeneralOperationParameterRefType[] usesParameterArray);
    
    /**
     * Sets ith "usesParameter" element
     */
    void setUsesParameterArray(int i, net.opengis.gml.AbstractGeneralOperationParameterRefType usesParameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usesParameter" element
     */
    net.opengis.gml.AbstractGeneralOperationParameterRefType insertNewUsesParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usesParameter" element
     */
    net.opengis.gml.AbstractGeneralOperationParameterRefType addNewUsesParameter();
    
    /**
     * Removes the ith "usesParameter" element
     */
    void removeUsesParameter(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.OperationMethodType newInstance() {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.OperationMethodType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.OperationMethodType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.OperationMethodType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.OperationMethodType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.OperationMethodType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.OperationMethodType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.OperationMethodType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.OperationMethodType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.OperationMethodType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.OperationMethodType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.OperationMethodType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.OperationMethodType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.OperationMethodType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.OperationMethodType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.OperationMethodType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.OperationMethodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.OperationMethodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
