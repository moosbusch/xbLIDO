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
 * An XML FaceType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface FaceType extends net.opengis.gml.AbstractTopoPrimitiveType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FaceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("facetypecd04type");
    
    /**
     * Gets a List of "directedEdge" elements
     */
    java.util.List<net.opengis.gml.DirectedEdgePropertyType> getDirectedEdgeList();
    
    /**
     * Gets array of all "directedEdge" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.DirectedEdgePropertyType[] getDirectedEdgeArray();
    
    /**
     * Gets ith "directedEdge" element
     */
    net.opengis.gml.DirectedEdgePropertyType getDirectedEdgeArray(int i);
    
    /**
     * Returns number of "directedEdge" element
     */
    int sizeOfDirectedEdgeArray();
    
    /**
     * Sets array of all "directedEdge" element
     */
    void setDirectedEdgeArray(net.opengis.gml.DirectedEdgePropertyType[] directedEdgeArray);
    
    /**
     * Sets ith "directedEdge" element
     */
    void setDirectedEdgeArray(int i, net.opengis.gml.DirectedEdgePropertyType directedEdge);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedEdge" element
     */
    net.opengis.gml.DirectedEdgePropertyType insertNewDirectedEdge(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedEdge" element
     */
    net.opengis.gml.DirectedEdgePropertyType addNewDirectedEdge();
    
    /**
     * Removes the ith "directedEdge" element
     */
    void removeDirectedEdge(int i);
    
    /**
     * Gets a List of "directedTopoSolid" elements
     */
    java.util.List<net.opengis.gml.DirectedTopoSolidPropertyType> getDirectedTopoSolidList();
    
    /**
     * Gets array of all "directedTopoSolid" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.DirectedTopoSolidPropertyType[] getDirectedTopoSolidArray();
    
    /**
     * Gets ith "directedTopoSolid" element
     */
    net.opengis.gml.DirectedTopoSolidPropertyType getDirectedTopoSolidArray(int i);
    
    /**
     * Returns number of "directedTopoSolid" element
     */
    int sizeOfDirectedTopoSolidArray();
    
    /**
     * Sets array of all "directedTopoSolid" element
     */
    void setDirectedTopoSolidArray(net.opengis.gml.DirectedTopoSolidPropertyType[] directedTopoSolidArray);
    
    /**
     * Sets ith "directedTopoSolid" element
     */
    void setDirectedTopoSolidArray(int i, net.opengis.gml.DirectedTopoSolidPropertyType directedTopoSolid);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedTopoSolid" element
     */
    net.opengis.gml.DirectedTopoSolidPropertyType insertNewDirectedTopoSolid(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedTopoSolid" element
     */
    net.opengis.gml.DirectedTopoSolidPropertyType addNewDirectedTopoSolid();
    
    /**
     * Removes the ith "directedTopoSolid" element
     */
    void removeDirectedTopoSolid(int i);
    
    /**
     * Gets the "surfaceProperty" element
     */
    net.opengis.gml.SurfacePropertyType getSurfaceProperty();
    
    /**
     * True if has "surfaceProperty" element
     */
    boolean isSetSurfaceProperty();
    
    /**
     * Sets the "surfaceProperty" element
     */
    void setSurfaceProperty(net.opengis.gml.SurfacePropertyType surfaceProperty);
    
    /**
     * Appends and returns a new empty "surfaceProperty" element
     */
    net.opengis.gml.SurfacePropertyType addNewSurfaceProperty();
    
    /**
     * Unsets the "surfaceProperty" element
     */
    void unsetSurfaceProperty();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.FaceType newInstance() {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.FaceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.FaceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.FaceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.FaceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.FaceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.FaceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.FaceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.FaceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.FaceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.FaceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.FaceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.FaceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.FaceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.FaceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.FaceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.FaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.FaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.FaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
