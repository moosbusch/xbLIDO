/*
 * XML Type:  AbstractCoordinateSystemType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractCoordinateSystemType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML AbstractCoordinateSystemType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface AbstractCoordinateSystemType extends net.opengis.gml.AbstractCoordinateSystemBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractCoordinateSystemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("abstractcoordinatesystemtyped258type");
    
    /**
     * Gets a List of "csID" elements
     */
    java.util.List<net.opengis.gml.IdentifierType> getCsIDList();
    
    /**
     * Gets array of all "csID" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IdentifierType[] getCsIDArray();
    
    /**
     * Gets ith "csID" element
     */
    net.opengis.gml.IdentifierType getCsIDArray(int i);
    
    /**
     * Returns number of "csID" element
     */
    int sizeOfCsIDArray();
    
    /**
     * Sets array of all "csID" element
     */
    void setCsIDArray(net.opengis.gml.IdentifierType[] csIDArray);
    
    /**
     * Sets ith "csID" element
     */
    void setCsIDArray(int i, net.opengis.gml.IdentifierType csID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "csID" element
     */
    net.opengis.gml.IdentifierType insertNewCsID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "csID" element
     */
    net.opengis.gml.IdentifierType addNewCsID();
    
    /**
     * Removes the ith "csID" element
     */
    void removeCsID(int i);
    
    /**
     * Gets the "remarks" element
     */
    net.opengis.gml.StringOrRefType getRemarks();
    
    /**
     * True if has "remarks" element
     */
    boolean isSetRemarks();
    
    /**
     * Sets the "remarks" element
     */
    void setRemarks(net.opengis.gml.StringOrRefType remarks);
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    net.opengis.gml.StringOrRefType addNewRemarks();
    
    /**
     * Unsets the "remarks" element
     */
    void unsetRemarks();
    
    /**
     * Gets a List of "usesAxis" elements
     */
    java.util.List<net.opengis.gml.CoordinateSystemAxisRefType> getUsesAxisList();
    
    /**
     * Gets array of all "usesAxis" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CoordinateSystemAxisRefType[] getUsesAxisArray();
    
    /**
     * Gets ith "usesAxis" element
     */
    net.opengis.gml.CoordinateSystemAxisRefType getUsesAxisArray(int i);
    
    /**
     * Returns number of "usesAxis" element
     */
    int sizeOfUsesAxisArray();
    
    /**
     * Sets array of all "usesAxis" element
     */
    void setUsesAxisArray(net.opengis.gml.CoordinateSystemAxisRefType[] usesAxisArray);
    
    /**
     * Sets ith "usesAxis" element
     */
    void setUsesAxisArray(int i, net.opengis.gml.CoordinateSystemAxisRefType usesAxis);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usesAxis" element
     */
    net.opengis.gml.CoordinateSystemAxisRefType insertNewUsesAxis(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usesAxis" element
     */
    net.opengis.gml.CoordinateSystemAxisRefType addNewUsesAxis();
    
    /**
     * Removes the ith "usesAxis" element
     */
    void removeUsesAxis(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        @Deprecated
        public static net.opengis.gml.AbstractCoordinateSystemType newInstance() {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        @Deprecated
        public static net.opengis.gml.AbstractCoordinateSystemType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateSystemType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractCoordinateSystemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractCoordinateSystemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractCoordinateSystemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
