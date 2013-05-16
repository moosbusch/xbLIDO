/*
 * XML Type:  SequenceRuleType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SequenceRuleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML SequenceRuleType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.SequenceRuleType.
 */
public interface SequenceRuleType extends net.opengis.gml.SequenceRuleNames
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SequenceRuleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("sequenceruletypea204type");
    
    static final net.opengis.gml.SequenceRuleNames.Enum LINEAR = net.opengis.gml.SequenceRuleNames.LINEAR;
    static final net.opengis.gml.SequenceRuleNames.Enum BOUSTROPHEDONIC = net.opengis.gml.SequenceRuleNames.BOUSTROPHEDONIC;
    static final net.opengis.gml.SequenceRuleNames.Enum CANTOR_DIAGONAL = net.opengis.gml.SequenceRuleNames.CANTOR_DIAGONAL;
    static final net.opengis.gml.SequenceRuleNames.Enum SPIRAL = net.opengis.gml.SequenceRuleNames.SPIRAL;
    static final net.opengis.gml.SequenceRuleNames.Enum MORTON = net.opengis.gml.SequenceRuleNames.MORTON;
    static final net.opengis.gml.SequenceRuleNames.Enum HILBERT = net.opengis.gml.SequenceRuleNames.HILBERT;
    
    static final int INT_LINEAR = net.opengis.gml.SequenceRuleNames.INT_LINEAR;
    static final int INT_BOUSTROPHEDONIC = net.opengis.gml.SequenceRuleNames.INT_BOUSTROPHEDONIC;
    static final int INT_CANTOR_DIAGONAL = net.opengis.gml.SequenceRuleNames.INT_CANTOR_DIAGONAL;
    static final int INT_SPIRAL = net.opengis.gml.SequenceRuleNames.INT_SPIRAL;
    static final int INT_MORTON = net.opengis.gml.SequenceRuleNames.INT_MORTON;
    static final int INT_HILBERT = net.opengis.gml.SequenceRuleNames.INT_HILBERT;
    
    /**
     * Gets the "order" attribute
     */
    net.opengis.gml.IncrementOrder.Enum getOrder();
    
    /**
     * Gets (as xml) the "order" attribute
     */
    net.opengis.gml.IncrementOrder xgetOrder();
    
    /**
     * True if has "order" attribute
     */
    boolean isSetOrder();
    
    /**
     * Sets the "order" attribute
     */
    void setOrder(net.opengis.gml.IncrementOrder.Enum order);
    
    /**
     * Sets (as xml) the "order" attribute
     */
    void xsetOrder(net.opengis.gml.IncrementOrder order);
    
    /**
     * Unsets the "order" attribute
     */
    void unsetOrder();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.SequenceRuleType newInstance() {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.SequenceRuleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.SequenceRuleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.SequenceRuleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.SequenceRuleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.SequenceRuleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.SequenceRuleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.SequenceRuleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.SequenceRuleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.SequenceRuleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.SequenceRuleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.SequenceRuleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.SequenceRuleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.SequenceRuleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.SequenceRuleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.SequenceRuleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.SequenceRuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.SequenceRuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
