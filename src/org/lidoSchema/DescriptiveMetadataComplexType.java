/*
 * XML Type:  descriptiveMetadataComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.DescriptiveMetadataComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML descriptiveMetadataComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface DescriptiveMetadataComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveMetadataComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("descriptivemetadatacomplextypeff3btype");
    
    /**
     * Gets the "objectClassificationWrap" element
     */
    org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap getObjectClassificationWrap();
    
    /**
     * Sets the "objectClassificationWrap" element
     */
    void setObjectClassificationWrap(org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap objectClassificationWrap);
    
    /**
     * Appends and returns a new empty "objectClassificationWrap" element
     */
    org.lidoSchema.ObjectClassificationWrapDocument.ObjectClassificationWrap addNewObjectClassificationWrap();
    
    /**
     * Gets the "objectIdentificationWrap" element
     */
    org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap getObjectIdentificationWrap();
    
    /**
     * Sets the "objectIdentificationWrap" element
     */
    void setObjectIdentificationWrap(org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap objectIdentificationWrap);
    
    /**
     * Appends and returns a new empty "objectIdentificationWrap" element
     */
    org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap addNewObjectIdentificationWrap();
    
    /**
     * Gets the "eventWrap" element
     */
    org.lidoSchema.EventWrapDocument.EventWrap getEventWrap();
    
    /**
     * True if has "eventWrap" element
     */
    boolean isSetEventWrap();
    
    /**
     * Sets the "eventWrap" element
     */
    void setEventWrap(org.lidoSchema.EventWrapDocument.EventWrap eventWrap);
    
    /**
     * Appends and returns a new empty "eventWrap" element
     */
    org.lidoSchema.EventWrapDocument.EventWrap addNewEventWrap();
    
    /**
     * Unsets the "eventWrap" element
     */
    void unsetEventWrap();
    
    /**
     * Gets the "objectRelationWrap" element
     */
    org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap getObjectRelationWrap();
    
    /**
     * True if has "objectRelationWrap" element
     */
    boolean isSetObjectRelationWrap();
    
    /**
     * Sets the "objectRelationWrap" element
     */
    void setObjectRelationWrap(org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap objectRelationWrap);
    
    /**
     * Appends and returns a new empty "objectRelationWrap" element
     */
    org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap addNewObjectRelationWrap();
    
    /**
     * Unsets the "objectRelationWrap" element
     */
    void unsetObjectRelationWrap();
    
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
        public static org.lidoSchema.DescriptiveMetadataComplexType newInstance() {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.DescriptiveMetadataComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.DescriptiveMetadataComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
