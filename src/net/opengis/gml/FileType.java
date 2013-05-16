/*
 * XML Type:  FileType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FileType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML FileType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface FileType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FileType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("filetype8a05type");
    
    /**
     * Gets the "rangeParameters" element
     */
    net.opengis.gml.RangeParametersType getRangeParameters();
    
    /**
     * Sets the "rangeParameters" element
     */
    void setRangeParameters(net.opengis.gml.RangeParametersType rangeParameters);
    
    /**
     * Appends and returns a new empty "rangeParameters" element
     */
    net.opengis.gml.RangeParametersType addNewRangeParameters();
    
    /**
     * Gets the "fileName" element
     */
    java.lang.String getFileName();
    
    /**
     * Gets (as xml) the "fileName" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetFileName();
    
    /**
     * Sets the "fileName" element
     */
    void setFileName(java.lang.String fileName);
    
    /**
     * Sets (as xml) the "fileName" element
     */
    void xsetFileName(org.apache.xmlbeans.XmlAnyURI fileName);
    
    /**
     * Gets the "fileStructure" element
     */
    net.opengis.gml.FileValueModelType.Enum getFileStructure();
    
    /**
     * Gets (as xml) the "fileStructure" element
     */
    net.opengis.gml.FileValueModelType xgetFileStructure();
    
    /**
     * Sets the "fileStructure" element
     */
    void setFileStructure(net.opengis.gml.FileValueModelType.Enum fileStructure);
    
    /**
     * Sets (as xml) the "fileStructure" element
     */
    void xsetFileStructure(net.opengis.gml.FileValueModelType fileStructure);
    
    /**
     * Gets the "mimeType" element
     */
    java.lang.String getMimeType();
    
    /**
     * Gets (as xml) the "mimeType" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetMimeType();
    
    /**
     * True if has "mimeType" element
     */
    boolean isSetMimeType();
    
    /**
     * Sets the "mimeType" element
     */
    void setMimeType(java.lang.String mimeType);
    
    /**
     * Sets (as xml) the "mimeType" element
     */
    void xsetMimeType(org.apache.xmlbeans.XmlAnyURI mimeType);
    
    /**
     * Unsets the "mimeType" element
     */
    void unsetMimeType();
    
    /**
     * Gets the "compression" element
     */
    java.lang.String getCompression();
    
    /**
     * Gets (as xml) the "compression" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetCompression();
    
    /**
     * True if has "compression" element
     */
    boolean isSetCompression();
    
    /**
     * Sets the "compression" element
     */
    void setCompression(java.lang.String compression);
    
    /**
     * Sets (as xml) the "compression" element
     */
    void xsetCompression(org.apache.xmlbeans.XmlAnyURI compression);
    
    /**
     * Unsets the "compression" element
     */
    void unsetCompression();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.FileType newInstance() {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.FileType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.FileType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.FileType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.FileType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.FileType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.FileType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.FileType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.FileType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.FileType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.FileType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.FileType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.FileType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.FileType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.FileType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.FileType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.FileType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.FileType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.FileType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
