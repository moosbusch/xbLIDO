/*
 * XML Type:  relatedWorkSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.RelatedWorkSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML relatedWorkSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface RelatedWorkSetComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedWorkSetComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("relatedworksetcomplextype39f8type");
    
    /**
     * Gets the "relatedWork" element
     */
    org.lidoSchema.ObjectSetComplexType getRelatedWork();
    
    /**
     * True if has "relatedWork" element
     */
    boolean isSetRelatedWork();
    
    /**
     * Sets the "relatedWork" element
     */
    void setRelatedWork(org.lidoSchema.ObjectSetComplexType relatedWork);
    
    /**
     * Appends and returns a new empty "relatedWork" element
     */
    org.lidoSchema.ObjectSetComplexType addNewRelatedWork();
    
    /**
     * Unsets the "relatedWork" element
     */
    void unsetRelatedWork();
    
    /**
     * Gets the "relatedWorkRelType" element
     */
    org.lidoSchema.ConceptComplexType getRelatedWorkRelType();
    
    /**
     * True if has "relatedWorkRelType" element
     */
    boolean isSetRelatedWorkRelType();
    
    /**
     * Sets the "relatedWorkRelType" element
     */
    void setRelatedWorkRelType(org.lidoSchema.ConceptComplexType relatedWorkRelType);
    
    /**
     * Appends and returns a new empty "relatedWorkRelType" element
     */
    org.lidoSchema.ConceptComplexType addNewRelatedWorkRelType();
    
    /**
     * Unsets the "relatedWorkRelType" element
     */
    void unsetRelatedWorkRelType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.RelatedWorkSetComplexType newInstance() {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.RelatedWorkSetComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RelatedWorkSetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RelatedWorkSetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RelatedWorkSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
