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
 * An XML gmlComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface GmlComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GmlComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("gmlcomplextype8d26type");
    
    /**
     * Gets a List of "Point" elements
     */
    java.util.List<net.opengis.gml.PointType> getPointList();
    
    /**
     * Gets array of all "Point" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.PointType[] getPointArray();
    
    /**
     * Gets ith "Point" element
     */
    net.opengis.gml.PointType getPointArray(int i);
    
    /**
     * Returns number of "Point" element
     */
    int sizeOfPointArray();
    
    /**
     * Sets array of all "Point" element
     */
    void setPointArray(net.opengis.gml.PointType[] pointArray);
    
    /**
     * Sets ith "Point" element
     */
    void setPointArray(int i, net.opengis.gml.PointType point);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Point" element
     */
    net.opengis.gml.PointType insertNewPoint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Point" element
     */
    net.opengis.gml.PointType addNewPoint();
    
    /**
     * Removes the ith "Point" element
     */
    void removePoint(int i);
    
    /**
     * Gets a List of "LineString" elements
     */
    java.util.List<net.opengis.gml.LineStringType> getLineStringList();
    
    /**
     * Gets array of all "LineString" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.LineStringType[] getLineStringArray();
    
    /**
     * Gets ith "LineString" element
     */
    net.opengis.gml.LineStringType getLineStringArray(int i);
    
    /**
     * Returns number of "LineString" element
     */
    int sizeOfLineStringArray();
    
    /**
     * Sets array of all "LineString" element
     */
    void setLineStringArray(net.opengis.gml.LineStringType[] lineStringArray);
    
    /**
     * Sets ith "LineString" element
     */
    void setLineStringArray(int i, net.opengis.gml.LineStringType lineString);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LineString" element
     */
    net.opengis.gml.LineStringType insertNewLineString(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LineString" element
     */
    net.opengis.gml.LineStringType addNewLineString();
    
    /**
     * Removes the ith "LineString" element
     */
    void removeLineString(int i);
    
    /**
     * Gets a List of "Polygon" elements
     */
    java.util.List<net.opengis.gml.PolygonType> getPolygonList();
    
    /**
     * Gets array of all "Polygon" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.PolygonType[] getPolygonArray();
    
    /**
     * Gets ith "Polygon" element
     */
    net.opengis.gml.PolygonType getPolygonArray(int i);
    
    /**
     * Returns number of "Polygon" element
     */
    int sizeOfPolygonArray();
    
    /**
     * Sets array of all "Polygon" element
     */
    void setPolygonArray(net.opengis.gml.PolygonType[] polygonArray);
    
    /**
     * Sets ith "Polygon" element
     */
    void setPolygonArray(int i, net.opengis.gml.PolygonType polygon);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Polygon" element
     */
    net.opengis.gml.PolygonType insertNewPolygon(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Polygon" element
     */
    net.opengis.gml.PolygonType addNewPolygon();
    
    /**
     * Removes the ith "Polygon" element
     */
    void removePolygon(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.GmlComplexType newInstance() {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.GmlComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.GmlComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.GmlComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.GmlComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.GmlComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.GmlComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.GmlComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.GmlComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.GmlComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.GmlComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.GmlComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.GmlComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.GmlComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.GmlComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.GmlComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.GmlComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.GmlComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.GmlComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
