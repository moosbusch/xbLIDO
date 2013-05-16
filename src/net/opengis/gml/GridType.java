/*
 * XML Type:  GridType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GridType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML GridType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface GridType extends net.opengis.gml.AbstractGeometryType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GridType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("gridtypebafbtype");
    
    /**
     * Gets the "limits" element
     */
    net.opengis.gml.GridLimitsType getLimits();
    
    /**
     * Sets the "limits" element
     */
    void setLimits(net.opengis.gml.GridLimitsType limits);
    
    /**
     * Appends and returns a new empty "limits" element
     */
    net.opengis.gml.GridLimitsType addNewLimits();
    
    /**
     * Gets a List of "axisName" elements
     */
    java.util.List<java.lang.String> getAxisNameList();
    
    /**
     * Gets array of all "axisName" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getAxisNameArray();
    
    /**
     * Gets ith "axisName" element
     */
    java.lang.String getAxisNameArray(int i);
    
    /**
     * Gets (as xml) a List of "axisName" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetAxisNameList();
    
    /**
     * Gets (as xml) array of all "axisName" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetAxisNameArray();
    
    /**
     * Gets (as xml) ith "axisName" element
     */
    org.apache.xmlbeans.XmlString xgetAxisNameArray(int i);
    
    /**
     * Returns number of "axisName" element
     */
    int sizeOfAxisNameArray();
    
    /**
     * Sets array of all "axisName" element
     */
    void setAxisNameArray(java.lang.String[] axisNameArray);
    
    /**
     * Sets ith "axisName" element
     */
    void setAxisNameArray(int i, java.lang.String axisName);
    
    /**
     * Sets (as xml) array of all "axisName" element
     */
    void xsetAxisNameArray(org.apache.xmlbeans.XmlString[] axisNameArray);
    
    /**
     * Sets (as xml) ith "axisName" element
     */
    void xsetAxisNameArray(int i, org.apache.xmlbeans.XmlString axisName);
    
    /**
     * Inserts the value as the ith "axisName" element
     */
    void insertAxisName(int i, java.lang.String axisName);
    
    /**
     * Appends the value as the last "axisName" element
     */
    void addAxisName(java.lang.String axisName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axisName" element
     */
    org.apache.xmlbeans.XmlString insertNewAxisName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axisName" element
     */
    org.apache.xmlbeans.XmlString addNewAxisName();
    
    /**
     * Removes the ith "axisName" element
     */
    void removeAxisName(int i);
    
    /**
     * Gets the "dimension" attribute
     */
    java.math.BigInteger getDimension();
    
    /**
     * Gets (as xml) the "dimension" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetDimension();
    
    /**
     * Sets the "dimension" attribute
     */
    void setDimension(java.math.BigInteger dimension);
    
    /**
     * Sets (as xml) the "dimension" attribute
     */
    void xsetDimension(org.apache.xmlbeans.XmlPositiveInteger dimension);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.GridType newInstance() {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.GridType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.GridType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.GridType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.GridType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.GridType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.GridType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.GridType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.GridType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.GridType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.GridType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.GridType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.GridType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.GridType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.GridType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.GridType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.GridType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.GridType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.GridType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
