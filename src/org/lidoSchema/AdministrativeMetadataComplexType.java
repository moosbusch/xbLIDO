/*
 * XML Type:  administrativeMetadataComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.AdministrativeMetadataComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML administrativeMetadataComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface AdministrativeMetadataComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdministrativeMetadataComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("administrativemetadatacomplextypecd4ftype");
    
    /**
     * Gets the "rightsWorkWrap" element
     */
    org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap getRightsWorkWrap();
    
    /**
     * True if has "rightsWorkWrap" element
     */
    boolean isSetRightsWorkWrap();
    
    /**
     * Sets the "rightsWorkWrap" element
     */
    void setRightsWorkWrap(org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap rightsWorkWrap);
    
    /**
     * Appends and returns a new empty "rightsWorkWrap" element
     */
    org.lidoSchema.RightsWorkWrapDocument.RightsWorkWrap addNewRightsWorkWrap();
    
    /**
     * Unsets the "rightsWorkWrap" element
     */
    void unsetRightsWorkWrap();
    
    /**
     * Gets the "recordWrap" element
     */
    org.lidoSchema.RecordWrapDocument.RecordWrap getRecordWrap();
    
    /**
     * Sets the "recordWrap" element
     */
    void setRecordWrap(org.lidoSchema.RecordWrapDocument.RecordWrap recordWrap);
    
    /**
     * Appends and returns a new empty "recordWrap" element
     */
    org.lidoSchema.RecordWrapDocument.RecordWrap addNewRecordWrap();
    
    /**
     * Gets the "resourceWrap" element
     */
    org.lidoSchema.ResourceWrapDocument.ResourceWrap getResourceWrap();
    
    /**
     * True if has "resourceWrap" element
     */
    boolean isSetResourceWrap();
    
    /**
     * Sets the "resourceWrap" element
     */
    void setResourceWrap(org.lidoSchema.ResourceWrapDocument.ResourceWrap resourceWrap);
    
    /**
     * Appends and returns a new empty "resourceWrap" element
     */
    org.lidoSchema.ResourceWrapDocument.ResourceWrap addNewResourceWrap();
    
    /**
     * Unsets the "resourceWrap" element
     */
    void unsetResourceWrap();
    
    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLang();
    
    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.String lang);
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(org.apache.xmlbeans.XmlLanguage lang);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.AdministrativeMetadataComplexType newInstance() {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.AdministrativeMetadataComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.AdministrativeMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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