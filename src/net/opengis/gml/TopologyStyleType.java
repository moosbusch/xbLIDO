/*
 * XML Type:  TopologyStyleType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopologyStyleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML TopologyStyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface TopologyStyleType extends net.opengis.gml.BaseStyleDescriptorType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TopologyStyleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("topologystyletypece71type");
    
    /**
     * Gets the "symbol" element
     */
    net.opengis.gml.SymbolType getSymbol();
    
    /**
     * True if has "symbol" element
     */
    boolean isSetSymbol();
    
    /**
     * Sets the "symbol" element
     */
    void setSymbol(net.opengis.gml.SymbolType symbol);
    
    /**
     * Appends and returns a new empty "symbol" element
     */
    net.opengis.gml.SymbolType addNewSymbol();
    
    /**
     * Unsets the "symbol" element
     */
    void unsetSymbol();
    
    /**
     * Gets the "style" element
     */
    java.lang.String getStyle();
    
    /**
     * Gets (as xml) the "style" element
     */
    org.apache.xmlbeans.XmlString xgetStyle();
    
    /**
     * True if has "style" element
     */
    boolean isSetStyle();
    
    /**
     * Sets the "style" element
     */
    void setStyle(java.lang.String style);
    
    /**
     * Sets (as xml) the "style" element
     */
    void xsetStyle(org.apache.xmlbeans.XmlString style);
    
    /**
     * Unsets the "style" element
     */
    void unsetStyle();
    
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
     * Gets the "topologyProperty" attribute
     */
    java.lang.String getTopologyProperty();
    
    /**
     * Gets (as xml) the "topologyProperty" attribute
     */
    org.apache.xmlbeans.XmlString xgetTopologyProperty();
    
    /**
     * True if has "topologyProperty" attribute
     */
    boolean isSetTopologyProperty();
    
    /**
     * Sets the "topologyProperty" attribute
     */
    void setTopologyProperty(java.lang.String topologyProperty);
    
    /**
     * Sets (as xml) the "topologyProperty" attribute
     */
    void xsetTopologyProperty(org.apache.xmlbeans.XmlString topologyProperty);
    
    /**
     * Unsets the "topologyProperty" attribute
     */
    void unsetTopologyProperty();
    
    /**
     * Gets the "topologyType" attribute
     */
    java.lang.String getTopologyType();
    
    /**
     * Gets (as xml) the "topologyType" attribute
     */
    org.apache.xmlbeans.XmlString xgetTopologyType();
    
    /**
     * True if has "topologyType" attribute
     */
    boolean isSetTopologyType();
    
    /**
     * Sets the "topologyType" attribute
     */
    void setTopologyType(java.lang.String topologyType);
    
    /**
     * Sets (as xml) the "topologyType" attribute
     */
    void xsetTopologyType(org.apache.xmlbeans.XmlString topologyType);
    
    /**
     * Unsets the "topologyType" attribute
     */
    void unsetTopologyType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.TopologyStyleType newInstance() {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.TopologyStyleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.TopologyStyleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.TopologyStyleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.TopologyStyleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.TopologyStyleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.TopologyStyleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.TopologyStyleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.TopologyStyleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.TopologyStyleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.TopologyStyleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.TopologyStyleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.TopologyStyleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.TopologyStyleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.TopologyStyleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.TopologyStyleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TopologyStyleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TopologyStyleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TopologyStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
