/*
 * XML Type:  GeographicCRSRefType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeographicCRSRefType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML GeographicCRSRefType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface GeographicCRSRefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeographicCRSRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("geographiccrsreftypec25btype");
    
    /**
     * Gets the "GeographicCRS" element
     */
    net.opengis.gml.GeographicCRSType getGeographicCRS();
    
    /**
     * True if has "GeographicCRS" element
     */
    boolean isSetGeographicCRS();
    
    /**
     * Sets the "GeographicCRS" element
     */
    void setGeographicCRS(net.opengis.gml.GeographicCRSType geographicCRS);
    
    /**
     * Appends and returns a new empty "GeographicCRS" element
     */
    net.opengis.gml.GeographicCRSType addNewGeographicCRS();
    
    /**
     * Unsets the "GeographicCRS" element
     */
    void unsetGeographicCRS();
    
    /**
     * Gets the "type" attribute
     */
    org.w3.x1999.xlink.TypeType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.w3.x1999.xlink.TypeType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.w3.x1999.xlink.TypeType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.w3.x1999.xlink.TypeType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "href" attribute
     */
    java.lang.String getHref();
    
    /**
     * Gets (as xml) the "href" attribute
     */
    org.w3.x1999.xlink.HrefType xgetHref();
    
    /**
     * True if has "href" attribute
     */
    boolean isSetHref();
    
    /**
     * Sets the "href" attribute
     */
    void setHref(java.lang.String href);
    
    /**
     * Sets (as xml) the "href" attribute
     */
    void xsetHref(org.w3.x1999.xlink.HrefType href);
    
    /**
     * Unsets the "href" attribute
     */
    void unsetHref();
    
    /**
     * Gets the "role" attribute
     */
    java.lang.String getRole();
    
    /**
     * Gets (as xml) the "role" attribute
     */
    org.w3.x1999.xlink.RoleType xgetRole();
    
    /**
     * True if has "role" attribute
     */
    boolean isSetRole();
    
    /**
     * Sets the "role" attribute
     */
    void setRole(java.lang.String role);
    
    /**
     * Sets (as xml) the "role" attribute
     */
    void xsetRole(org.w3.x1999.xlink.RoleType role);
    
    /**
     * Unsets the "role" attribute
     */
    void unsetRole();
    
    /**
     * Gets the "arcrole" attribute
     */
    java.lang.String getArcrole();
    
    /**
     * Gets (as xml) the "arcrole" attribute
     */
    org.w3.x1999.xlink.ArcroleType xgetArcrole();
    
    /**
     * True if has "arcrole" attribute
     */
    boolean isSetArcrole();
    
    /**
     * Sets the "arcrole" attribute
     */
    void setArcrole(java.lang.String arcrole);
    
    /**
     * Sets (as xml) the "arcrole" attribute
     */
    void xsetArcrole(org.w3.x1999.xlink.ArcroleType arcrole);
    
    /**
     * Unsets the "arcrole" attribute
     */
    void unsetArcrole();
    
    /**
     * Gets the "title" attribute
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" attribute
     */
    org.w3.x1999.xlink.TitleAttrType xgetTitle();
    
    /**
     * True if has "title" attribute
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" attribute
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" attribute
     */
    void xsetTitle(org.w3.x1999.xlink.TitleAttrType title);
    
    /**
     * Unsets the "title" attribute
     */
    void unsetTitle();
    
    /**
     * Gets the "show" attribute
     */
    org.w3.x1999.xlink.ShowType.Enum getShow();
    
    /**
     * Gets (as xml) the "show" attribute
     */
    org.w3.x1999.xlink.ShowType xgetShow();
    
    /**
     * True if has "show" attribute
     */
    boolean isSetShow();
    
    /**
     * Sets the "show" attribute
     */
    void setShow(org.w3.x1999.xlink.ShowType.Enum show);
    
    /**
     * Sets (as xml) the "show" attribute
     */
    void xsetShow(org.w3.x1999.xlink.ShowType show);
    
    /**
     * Unsets the "show" attribute
     */
    void unsetShow();
    
    /**
     * Gets the "actuate" attribute
     */
    org.w3.x1999.xlink.ActuateType.Enum getActuate();
    
    /**
     * Gets (as xml) the "actuate" attribute
     */
    org.w3.x1999.xlink.ActuateType xgetActuate();
    
    /**
     * True if has "actuate" attribute
     */
    boolean isSetActuate();
    
    /**
     * Sets the "actuate" attribute
     */
    void setActuate(org.w3.x1999.xlink.ActuateType.Enum actuate);
    
    /**
     * Sets (as xml) the "actuate" attribute
     */
    void xsetActuate(org.w3.x1999.xlink.ActuateType actuate);
    
    /**
     * Unsets the "actuate" attribute
     */
    void unsetActuate();
    
    /**
     * Gets the "remoteSchema" attribute
     */
    java.lang.String getRemoteSchema();
    
    /**
     * Gets (as xml) the "remoteSchema" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetRemoteSchema();
    
    /**
     * True if has "remoteSchema" attribute
     */
    boolean isSetRemoteSchema();
    
    /**
     * Sets the "remoteSchema" attribute
     */
    void setRemoteSchema(java.lang.String remoteSchema);
    
    /**
     * Sets (as xml) the "remoteSchema" attribute
     */
    void xsetRemoteSchema(org.apache.xmlbeans.XmlAnyURI remoteSchema);
    
    /**
     * Unsets the "remoteSchema" attribute
     */
    void unsetRemoteSchema();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.GeographicCRSRefType newInstance() {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.GeographicCRSRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.GeographicCRSRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.GeographicCRSRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.GeographicCRSRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.GeographicCRSRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.GeographicCRSRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.GeographicCRSRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
