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
package org.lidoSchema;


/**
 * An XML measurementsSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface MeasurementsSetComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MeasurementsSetComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("measurementssetcomplextyped74btype");
    
    /**
     * Gets a List of "measurementType" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getMeasurementTypeList();
    
    /**
     * Gets array of all "measurementType" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getMeasurementTypeArray();
    
    /**
     * Gets ith "measurementType" element
     */
    org.lidoSchema.TextComplexType getMeasurementTypeArray(int i);
    
    /**
     * Returns number of "measurementType" element
     */
    int sizeOfMeasurementTypeArray();
    
    /**
     * Sets array of all "measurementType" element
     */
    void setMeasurementTypeArray(org.lidoSchema.TextComplexType[] measurementTypeArray);
    
    /**
     * Sets ith "measurementType" element
     */
    void setMeasurementTypeArray(int i, org.lidoSchema.TextComplexType measurementType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "measurementType" element
     */
    org.lidoSchema.TextComplexType insertNewMeasurementType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "measurementType" element
     */
    org.lidoSchema.TextComplexType addNewMeasurementType();
    
    /**
     * Removes the ith "measurementType" element
     */
    void removeMeasurementType(int i);
    
    /**
     * Gets a List of "measurementUnit" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getMeasurementUnitList();
    
    /**
     * Gets array of all "measurementUnit" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getMeasurementUnitArray();
    
    /**
     * Gets ith "measurementUnit" element
     */
    org.lidoSchema.TextComplexType getMeasurementUnitArray(int i);
    
    /**
     * Returns number of "measurementUnit" element
     */
    int sizeOfMeasurementUnitArray();
    
    /**
     * Sets array of all "measurementUnit" element
     */
    void setMeasurementUnitArray(org.lidoSchema.TextComplexType[] measurementUnitArray);
    
    /**
     * Sets ith "measurementUnit" element
     */
    void setMeasurementUnitArray(int i, org.lidoSchema.TextComplexType measurementUnit);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "measurementUnit" element
     */
    org.lidoSchema.TextComplexType insertNewMeasurementUnit(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "measurementUnit" element
     */
    org.lidoSchema.TextComplexType addNewMeasurementUnit();
    
    /**
     * Removes the ith "measurementUnit" element
     */
    void removeMeasurementUnit(int i);
    
    /**
     * Gets the "measurementValue" element
     */
    org.lidoSchema.TextComplexType getMeasurementValue();
    
    /**
     * Sets the "measurementValue" element
     */
    void setMeasurementValue(org.lidoSchema.TextComplexType measurementValue);
    
    /**
     * Appends and returns a new empty "measurementValue" element
     */
    org.lidoSchema.TextComplexType addNewMeasurementValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.MeasurementsSetComplexType newInstance() {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.MeasurementsSetComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.MeasurementsSetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.MeasurementsSetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.MeasurementsSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
