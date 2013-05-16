/*
 * XML Type:  recordInfoSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.RecordInfoSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML recordInfoSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface RecordInfoSetComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordInfoSetComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("recordinfosetcomplextype35a3type");
    
    /**
     * Gets a List of "recordInfoID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getRecordInfoIDList();
    
    /**
     * Gets array of all "recordInfoID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getRecordInfoIDArray();
    
    /**
     * Gets ith "recordInfoID" element
     */
    org.lidoSchema.IdentifierComplexType getRecordInfoIDArray(int i);
    
    /**
     * Returns number of "recordInfoID" element
     */
    int sizeOfRecordInfoIDArray();
    
    /**
     * Sets array of all "recordInfoID" element
     */
    void setRecordInfoIDArray(org.lidoSchema.IdentifierComplexType[] recordInfoIDArray);
    
    /**
     * Sets ith "recordInfoID" element
     */
    void setRecordInfoIDArray(int i, org.lidoSchema.IdentifierComplexType recordInfoID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordInfoID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewRecordInfoID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordInfoID" element
     */
    org.lidoSchema.IdentifierComplexType addNewRecordInfoID();
    
    /**
     * Removes the ith "recordInfoID" element
     */
    void removeRecordInfoID(int i);
    
    /**
     * Gets a List of "recordInfoLink" elements
     */
    java.util.List<org.lidoSchema.WebResourceComplexType> getRecordInfoLinkList();
    
    /**
     * Gets array of all "recordInfoLink" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.WebResourceComplexType[] getRecordInfoLinkArray();
    
    /**
     * Gets ith "recordInfoLink" element
     */
    org.lidoSchema.WebResourceComplexType getRecordInfoLinkArray(int i);
    
    /**
     * Returns number of "recordInfoLink" element
     */
    int sizeOfRecordInfoLinkArray();
    
    /**
     * Sets array of all "recordInfoLink" element
     */
    void setRecordInfoLinkArray(org.lidoSchema.WebResourceComplexType[] recordInfoLinkArray);
    
    /**
     * Sets ith "recordInfoLink" element
     */
    void setRecordInfoLinkArray(int i, org.lidoSchema.WebResourceComplexType recordInfoLink);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordInfoLink" element
     */
    org.lidoSchema.WebResourceComplexType insertNewRecordInfoLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordInfoLink" element
     */
    org.lidoSchema.WebResourceComplexType addNewRecordInfoLink();
    
    /**
     * Removes the ith "recordInfoLink" element
     */
    void removeRecordInfoLink(int i);
    
    /**
     * Gets a List of "recordMetadataDate" elements
     */
    java.util.List<org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate> getRecordMetadataDateList();
    
    /**
     * Gets array of all "recordMetadataDate" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate[] getRecordMetadataDateArray();
    
    /**
     * Gets ith "recordMetadataDate" element
     */
    org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate getRecordMetadataDateArray(int i);
    
    /**
     * Returns number of "recordMetadataDate" element
     */
    int sizeOfRecordMetadataDateArray();
    
    /**
     * Sets array of all "recordMetadataDate" element
     */
    void setRecordMetadataDateArray(org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate[] recordMetadataDateArray);
    
    /**
     * Sets ith "recordMetadataDate" element
     */
    void setRecordMetadataDateArray(int i, org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate recordMetadataDate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordMetadataDate" element
     */
    org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate insertNewRecordMetadataDate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordMetadataDate" element
     */
    org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate addNewRecordMetadataDate();
    
    /**
     * Removes the ith "recordMetadataDate" element
     */
    void removeRecordMetadataDate(int i);
    
    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * An XML recordMetadataDate(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.RecordInfoSetComplexType$RecordMetadataDate.
     */
    public interface RecordMetadataDate extends org.lidoSchema.TextComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordMetadataDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("recordmetadatadate5b2delemtype");
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "source" attribute
         */
        java.lang.String getSource();
        
        /**
         * Gets (as xml) the "source" attribute
         */
        org.apache.xmlbeans.XmlString xgetSource();
        
        /**
         * True if has "source" attribute
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" attribute
         */
        void setSource(java.lang.String source);
        
        /**
         * Sets (as xml) the "source" attribute
         */
        void xsetSource(org.apache.xmlbeans.XmlString source);
        
        /**
         * Unsets the "source" attribute
         */
        void unsetSource();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate newInstance() {
              return (org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.RecordInfoSetComplexType.RecordMetadataDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.RecordInfoSetComplexType newInstance() {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.RecordInfoSetComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RecordInfoSetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RecordInfoSetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RecordInfoSetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
