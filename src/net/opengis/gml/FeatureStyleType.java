/*
 * XML Type:  FeatureStyleType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FeatureStyleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML FeatureStyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface FeatureStyleType extends net.opengis.gml.AbstractGMLType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FeatureStyleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("featurestyletype8046type");
    
    /**
     * Gets the "featureConstraint" element
     */
    java.lang.String getFeatureConstraint();
    
    /**
     * Gets (as xml) the "featureConstraint" element
     */
    org.apache.xmlbeans.XmlString xgetFeatureConstraint();
    
    /**
     * True if has "featureConstraint" element
     */
    boolean isSetFeatureConstraint();
    
    /**
     * Sets the "featureConstraint" element
     */
    void setFeatureConstraint(java.lang.String featureConstraint);
    
    /**
     * Sets (as xml) the "featureConstraint" element
     */
    void xsetFeatureConstraint(org.apache.xmlbeans.XmlString featureConstraint);
    
    /**
     * Unsets the "featureConstraint" element
     */
    void unsetFeatureConstraint();
    
    /**
     * Gets a List of "geometryStyle" elements
     */
    java.util.List<net.opengis.gml.GeometryStylePropertyType> getGeometryStyleList();
    
    /**
     * Gets array of all "geometryStyle" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.GeometryStylePropertyType[] getGeometryStyleArray();
    
    /**
     * Gets ith "geometryStyle" element
     */
    net.opengis.gml.GeometryStylePropertyType getGeometryStyleArray(int i);
    
    /**
     * Returns number of "geometryStyle" element
     */
    int sizeOfGeometryStyleArray();
    
    /**
     * Sets array of all "geometryStyle" element
     */
    void setGeometryStyleArray(net.opengis.gml.GeometryStylePropertyType[] geometryStyleArray);
    
    /**
     * Sets ith "geometryStyle" element
     */
    void setGeometryStyleArray(int i, net.opengis.gml.GeometryStylePropertyType geometryStyle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geometryStyle" element
     */
    net.opengis.gml.GeometryStylePropertyType insertNewGeometryStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geometryStyle" element
     */
    net.opengis.gml.GeometryStylePropertyType addNewGeometryStyle();
    
    /**
     * Removes the ith "geometryStyle" element
     */
    void removeGeometryStyle(int i);
    
    /**
     * Gets a List of "topologyStyle" elements
     */
    java.util.List<net.opengis.gml.TopologyStylePropertyType> getTopologyStyleList();
    
    /**
     * Gets array of all "topologyStyle" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.TopologyStylePropertyType[] getTopologyStyleArray();
    
    /**
     * Gets ith "topologyStyle" element
     */
    net.opengis.gml.TopologyStylePropertyType getTopologyStyleArray(int i);
    
    /**
     * Returns number of "topologyStyle" element
     */
    int sizeOfTopologyStyleArray();
    
    /**
     * Sets array of all "topologyStyle" element
     */
    void setTopologyStyleArray(net.opengis.gml.TopologyStylePropertyType[] topologyStyleArray);
    
    /**
     * Sets ith "topologyStyle" element
     */
    void setTopologyStyleArray(int i, net.opengis.gml.TopologyStylePropertyType topologyStyle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topologyStyle" element
     */
    net.opengis.gml.TopologyStylePropertyType insertNewTopologyStyle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topologyStyle" element
     */
    net.opengis.gml.TopologyStylePropertyType addNewTopologyStyle();
    
    /**
     * Removes the ith "topologyStyle" element
     */
    void removeTopologyStyle(int i);
    
    /**
     * Gets the "labelStyle" element
     */
    net.opengis.gml.LabelStylePropertyType getLabelStyle();
    
    /**
     * True if has "labelStyle" element
     */
    boolean isSetLabelStyle();
    
    /**
     * Sets the "labelStyle" element
     */
    void setLabelStyle(net.opengis.gml.LabelStylePropertyType labelStyle);
    
    /**
     * Appends and returns a new empty "labelStyle" element
     */
    net.opengis.gml.LabelStylePropertyType addNewLabelStyle();
    
    /**
     * Unsets the "labelStyle" element
     */
    void unsetLabelStyle();
    
    /**
     * Gets the "featureType" attribute
     */
    java.lang.String getFeatureType();
    
    /**
     * Gets (as xml) the "featureType" attribute
     */
    org.apache.xmlbeans.XmlString xgetFeatureType();
    
    /**
     * True if has "featureType" attribute
     */
    boolean isSetFeatureType();
    
    /**
     * Sets the "featureType" attribute
     */
    void setFeatureType(java.lang.String featureType);
    
    /**
     * Sets (as xml) the "featureType" attribute
     */
    void xsetFeatureType(org.apache.xmlbeans.XmlString featureType);
    
    /**
     * Unsets the "featureType" attribute
     */
    void unsetFeatureType();
    
    /**
     * Gets the "baseType" attribute
     */
    java.lang.String getBaseType();
    
    /**
     * Gets (as xml) the "baseType" attribute
     */
    org.apache.xmlbeans.XmlString xgetBaseType();
    
    /**
     * True if has "baseType" attribute
     */
    boolean isSetBaseType();
    
    /**
     * Sets the "baseType" attribute
     */
    void setBaseType(java.lang.String baseType);
    
    /**
     * Sets (as xml) the "baseType" attribute
     */
    void xsetBaseType(org.apache.xmlbeans.XmlString baseType);
    
    /**
     * Unsets the "baseType" attribute
     */
    void unsetBaseType();
    
    /**
     * Gets the "queryGrammar" attribute
     */
    net.opengis.gml.QueryGrammarEnumeration.Enum getQueryGrammar();
    
    /**
     * Gets (as xml) the "queryGrammar" attribute
     */
    net.opengis.gml.QueryGrammarEnumeration xgetQueryGrammar();
    
    /**
     * True if has "queryGrammar" attribute
     */
    boolean isSetQueryGrammar();
    
    /**
     * Sets the "queryGrammar" attribute
     */
    void setQueryGrammar(net.opengis.gml.QueryGrammarEnumeration.Enum queryGrammar);
    
    /**
     * Sets (as xml) the "queryGrammar" attribute
     */
    void xsetQueryGrammar(net.opengis.gml.QueryGrammarEnumeration queryGrammar);
    
    /**
     * Unsets the "queryGrammar" attribute
     */
    void unsetQueryGrammar();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.FeatureStyleType newInstance() {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.FeatureStyleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.FeatureStyleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.FeatureStyleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.FeatureStyleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.FeatureStyleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.FeatureStyleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.FeatureStyleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.FeatureStyleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.FeatureStyleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.FeatureStyleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.FeatureStyleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.FeatureStyleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.FeatureStyleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.FeatureStyleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.FeatureStyleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.FeatureStyleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.FeatureStyleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.FeatureStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
