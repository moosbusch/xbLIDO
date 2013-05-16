/*
 * XML Type:  legalBodyRefComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.LegalBodyRefComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML legalBodyRefComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface LegalBodyRefComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LegalBodyRefComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("legalbodyrefcomplextypedc6atype");
    
    /**
     * Gets a List of "legalBodyID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getLegalBodyIDList();
    
    /**
     * Gets array of all "legalBodyID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getLegalBodyIDArray();
    
    /**
     * Gets ith "legalBodyID" element
     */
    org.lidoSchema.IdentifierComplexType getLegalBodyIDArray(int i);
    
    /**
     * Returns number of "legalBodyID" element
     */
    int sizeOfLegalBodyIDArray();
    
    /**
     * Sets array of all "legalBodyID" element
     */
    void setLegalBodyIDArray(org.lidoSchema.IdentifierComplexType[] legalBodyIDArray);
    
    /**
     * Sets ith "legalBodyID" element
     */
    void setLegalBodyIDArray(int i, org.lidoSchema.IdentifierComplexType legalBodyID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legalBodyID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewLegalBodyID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legalBodyID" element
     */
    org.lidoSchema.IdentifierComplexType addNewLegalBodyID();
    
    /**
     * Removes the ith "legalBodyID" element
     */
    void removeLegalBodyID(int i);
    
    /**
     * Gets a List of "legalBodyName" elements
     */
    java.util.List<org.lidoSchema.AppellationComplexType> getLegalBodyNameList();
    
    /**
     * Gets array of all "legalBodyName" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.AppellationComplexType[] getLegalBodyNameArray();
    
    /**
     * Gets ith "legalBodyName" element
     */
    org.lidoSchema.AppellationComplexType getLegalBodyNameArray(int i);
    
    /**
     * Returns number of "legalBodyName" element
     */
    int sizeOfLegalBodyNameArray();
    
    /**
     * Sets array of all "legalBodyName" element
     */
    void setLegalBodyNameArray(org.lidoSchema.AppellationComplexType[] legalBodyNameArray);
    
    /**
     * Sets ith "legalBodyName" element
     */
    void setLegalBodyNameArray(int i, org.lidoSchema.AppellationComplexType legalBodyName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legalBodyName" element
     */
    org.lidoSchema.AppellationComplexType insertNewLegalBodyName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legalBodyName" element
     */
    org.lidoSchema.AppellationComplexType addNewLegalBodyName();
    
    /**
     * Removes the ith "legalBodyName" element
     */
    void removeLegalBodyName(int i);
    
    /**
     * Gets a List of "legalBodyWeblink" elements
     */
    java.util.List<org.lidoSchema.WebResourceComplexType> getLegalBodyWeblinkList();
    
    /**
     * Gets array of all "legalBodyWeblink" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.WebResourceComplexType[] getLegalBodyWeblinkArray();
    
    /**
     * Gets ith "legalBodyWeblink" element
     */
    org.lidoSchema.WebResourceComplexType getLegalBodyWeblinkArray(int i);
    
    /**
     * Returns number of "legalBodyWeblink" element
     */
    int sizeOfLegalBodyWeblinkArray();
    
    /**
     * Sets array of all "legalBodyWeblink" element
     */
    void setLegalBodyWeblinkArray(org.lidoSchema.WebResourceComplexType[] legalBodyWeblinkArray);
    
    /**
     * Sets ith "legalBodyWeblink" element
     */
    void setLegalBodyWeblinkArray(int i, org.lidoSchema.WebResourceComplexType legalBodyWeblink);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "legalBodyWeblink" element
     */
    org.lidoSchema.WebResourceComplexType insertNewLegalBodyWeblink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "legalBodyWeblink" element
     */
    org.lidoSchema.WebResourceComplexType addNewLegalBodyWeblink();
    
    /**
     * Removes the ith "legalBodyWeblink" element
     */
    void removeLegalBodyWeblink(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.LegalBodyRefComplexType newInstance() {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.LegalBodyRefComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.LegalBodyRefComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.LegalBodyRefComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.LegalBodyRefComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
