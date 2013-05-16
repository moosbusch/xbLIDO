/*
 * XML Type:  VectorType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.VectorType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML VectorType(@http://www.opengis.net/gml).
 *
 * This is a list type whose items are org.apache.xmlbeans.XmlDouble.
 */
public interface VectorType extends net.opengis.gml.DoubleList
{
    java.util.List getListValue();
    java.util.List xgetListValue();
    void setListValue(java.util.List list);
    /** @deprecated */
    @Deprecated
    java.util.List listValue();
    /** @deprecated */
    @Deprecated
    java.util.List xlistValue();
    /** @deprecated */
    @Deprecated
    void set(java.util.List list);
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VectorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("vectortype0b9etype");
    
    /**
     * Gets the "srsName" attribute
     */
    java.lang.String getSrsName();
    
    /**
     * Gets (as xml) the "srsName" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetSrsName();
    
    /**
     * True if has "srsName" attribute
     */
    boolean isSetSrsName();
    
    /**
     * Sets the "srsName" attribute
     */
    void setSrsName(java.lang.String srsName);
    
    /**
     * Sets (as xml) the "srsName" attribute
     */
    void xsetSrsName(org.apache.xmlbeans.XmlAnyURI srsName);
    
    /**
     * Unsets the "srsName" attribute
     */
    void unsetSrsName();
    
    /**
     * Gets the "srsDimension" attribute
     */
    java.math.BigInteger getSrsDimension();
    
    /**
     * Gets (as xml) the "srsDimension" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetSrsDimension();
    
    /**
     * True if has "srsDimension" attribute
     */
    boolean isSetSrsDimension();
    
    /**
     * Sets the "srsDimension" attribute
     */
    void setSrsDimension(java.math.BigInteger srsDimension);
    
    /**
     * Sets (as xml) the "srsDimension" attribute
     */
    void xsetSrsDimension(org.apache.xmlbeans.XmlPositiveInteger srsDimension);
    
    /**
     * Unsets the "srsDimension" attribute
     */
    void unsetSrsDimension();
    
    /**
     * Gets the "axisLabels" attribute
     */
    java.util.List getAxisLabels();
    
    /**
     * Gets (as xml) the "axisLabels" attribute
     */
    net.opengis.gml.NCNameList xgetAxisLabels();
    
    /**
     * True if has "axisLabels" attribute
     */
    boolean isSetAxisLabels();
    
    /**
     * Sets the "axisLabels" attribute
     */
    void setAxisLabels(java.util.List axisLabels);
    
    /**
     * Sets (as xml) the "axisLabels" attribute
     */
    void xsetAxisLabels(net.opengis.gml.NCNameList axisLabels);
    
    /**
     * Unsets the "axisLabels" attribute
     */
    void unsetAxisLabels();
    
    /**
     * Gets the "uomLabels" attribute
     */
    java.util.List getUomLabels();
    
    /**
     * Gets (as xml) the "uomLabels" attribute
     */
    net.opengis.gml.NCNameList xgetUomLabels();
    
    /**
     * True if has "uomLabels" attribute
     */
    boolean isSetUomLabels();
    
    /**
     * Sets the "uomLabels" attribute
     */
    void setUomLabels(java.util.List uomLabels);
    
    /**
     * Sets (as xml) the "uomLabels" attribute
     */
    void xsetUomLabels(net.opengis.gml.NCNameList uomLabels);
    
    /**
     * Unsets the "uomLabels" attribute
     */
    void unsetUomLabels();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.VectorType newInstance() {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.VectorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.VectorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.VectorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.VectorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.VectorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.VectorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.VectorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.VectorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.VectorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.VectorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.VectorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.VectorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.VectorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.VectorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.VectorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.VectorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.VectorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.VectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
