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
 * An XML CovarianceMatrixType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface CovarianceMatrixType extends net.opengis.gml.AbstractPositionalAccuracyType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CovarianceMatrixType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("covariancematrixtypefbc3type");
    
    /**
     * Gets a List of "unitOfMeasure" elements
     */
    java.util.List<net.opengis.gml.UnitOfMeasureType> getUnitOfMeasureList();
    
    /**
     * Gets array of all "unitOfMeasure" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.UnitOfMeasureType[] getUnitOfMeasureArray();
    
    /**
     * Gets ith "unitOfMeasure" element
     */
    net.opengis.gml.UnitOfMeasureType getUnitOfMeasureArray(int i);
    
    /**
     * Returns number of "unitOfMeasure" element
     */
    int sizeOfUnitOfMeasureArray();
    
    /**
     * Sets array of all "unitOfMeasure" element
     */
    void setUnitOfMeasureArray(net.opengis.gml.UnitOfMeasureType[] unitOfMeasureArray);
    
    /**
     * Sets ith "unitOfMeasure" element
     */
    void setUnitOfMeasureArray(int i, net.opengis.gml.UnitOfMeasureType unitOfMeasure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unitOfMeasure" element
     */
    net.opengis.gml.UnitOfMeasureType insertNewUnitOfMeasure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unitOfMeasure" element
     */
    net.opengis.gml.UnitOfMeasureType addNewUnitOfMeasure();
    
    /**
     * Removes the ith "unitOfMeasure" element
     */
    void removeUnitOfMeasure(int i);
    
    /**
     * Gets a List of "includesElement" elements
     */
    java.util.List<net.opengis.gml.CovarianceElementType> getIncludesElementList();
    
    /**
     * Gets array of all "includesElement" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CovarianceElementType[] getIncludesElementArray();
    
    /**
     * Gets ith "includesElement" element
     */
    net.opengis.gml.CovarianceElementType getIncludesElementArray(int i);
    
    /**
     * Returns number of "includesElement" element
     */
    int sizeOfIncludesElementArray();
    
    /**
     * Sets array of all "includesElement" element
     */
    void setIncludesElementArray(net.opengis.gml.CovarianceElementType[] includesElementArray);
    
    /**
     * Sets ith "includesElement" element
     */
    void setIncludesElementArray(int i, net.opengis.gml.CovarianceElementType includesElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "includesElement" element
     */
    net.opengis.gml.CovarianceElementType insertNewIncludesElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "includesElement" element
     */
    net.opengis.gml.CovarianceElementType addNewIncludesElement();
    
    /**
     * Removes the ith "includesElement" element
     */
    void removeIncludesElement(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.CovarianceMatrixType newInstance() {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.CovarianceMatrixType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.CovarianceMatrixType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.CovarianceMatrixType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.CovarianceMatrixType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.CovarianceMatrixType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.CovarianceMatrixType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.CovarianceMatrixType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
