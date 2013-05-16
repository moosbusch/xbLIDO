/*
 * XML Type:  materialsTechComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.MaterialsTechComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML materialsTechComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface MaterialsTechComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialsTechComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("materialstechcomplextypeb002type");
    
    /**
     * Gets a List of "termMaterialsTech" elements
     */
    java.util.List<org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech> getTermMaterialsTechList();
    
    /**
     * Gets array of all "termMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech[] getTermMaterialsTechArray();
    
    /**
     * Gets ith "termMaterialsTech" element
     */
    org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech getTermMaterialsTechArray(int i);
    
    /**
     * Returns number of "termMaterialsTech" element
     */
    int sizeOfTermMaterialsTechArray();
    
    /**
     * Sets array of all "termMaterialsTech" element
     */
    void setTermMaterialsTechArray(org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech[] termMaterialsTechArray);
    
    /**
     * Sets ith "termMaterialsTech" element
     */
    void setTermMaterialsTechArray(int i, org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech termMaterialsTech);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "termMaterialsTech" element
     */
    org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech insertNewTermMaterialsTech(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "termMaterialsTech" element
     */
    org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech addNewTermMaterialsTech();
    
    /**
     * Removes the ith "termMaterialsTech" element
     */
    void removeTermMaterialsTech(int i);
    
    /**
     * Gets a List of "extentMaterialsTech" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getExtentMaterialsTechList();
    
    /**
     * Gets array of all "extentMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getExtentMaterialsTechArray();
    
    /**
     * Gets ith "extentMaterialsTech" element
     */
    org.lidoSchema.TextComplexType getExtentMaterialsTechArray(int i);
    
    /**
     * Returns number of "extentMaterialsTech" element
     */
    int sizeOfExtentMaterialsTechArray();
    
    /**
     * Sets array of all "extentMaterialsTech" element
     */
    void setExtentMaterialsTechArray(org.lidoSchema.TextComplexType[] extentMaterialsTechArray);
    
    /**
     * Sets ith "extentMaterialsTech" element
     */
    void setExtentMaterialsTechArray(int i, org.lidoSchema.TextComplexType extentMaterialsTech);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extentMaterialsTech" element
     */
    org.lidoSchema.TextComplexType insertNewExtentMaterialsTech(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extentMaterialsTech" element
     */
    org.lidoSchema.TextComplexType addNewExtentMaterialsTech();
    
    /**
     * Removes the ith "extentMaterialsTech" element
     */
    void removeExtentMaterialsTech(int i);
    
    /**
     * Gets a List of "sourceMaterialsTech" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getSourceMaterialsTechList();
    
    /**
     * Gets array of all "sourceMaterialsTech" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getSourceMaterialsTechArray();
    
    /**
     * Gets ith "sourceMaterialsTech" element
     */
    org.lidoSchema.TextComplexType getSourceMaterialsTechArray(int i);
    
    /**
     * Returns number of "sourceMaterialsTech" element
     */
    int sizeOfSourceMaterialsTechArray();
    
    /**
     * Sets array of all "sourceMaterialsTech" element
     */
    void setSourceMaterialsTechArray(org.lidoSchema.TextComplexType[] sourceMaterialsTechArray);
    
    /**
     * Sets ith "sourceMaterialsTech" element
     */
    void setSourceMaterialsTechArray(int i, org.lidoSchema.TextComplexType sourceMaterialsTech);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceMaterialsTech" element
     */
    org.lidoSchema.TextComplexType insertNewSourceMaterialsTech(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceMaterialsTech" element
     */
    org.lidoSchema.TextComplexType addNewSourceMaterialsTech();
    
    /**
     * Removes the ith "sourceMaterialsTech" element
     */
    void removeSourceMaterialsTech(int i);
    
    /**
     * An XML termMaterialsTech(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface TermMaterialsTech extends org.lidoSchema.ConceptComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TermMaterialsTech.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("termmaterialsteche0c4elemtype");
        
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
         * Gets the "sortorder" attribute
         */
        java.math.BigInteger getSortorder();
        
        /**
         * Gets (as xml) the "sortorder" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSortorder();
        
        /**
         * True if has "sortorder" attribute
         */
        boolean isSetSortorder();
        
        /**
         * Sets the "sortorder" attribute
         */
        void setSortorder(java.math.BigInteger sortorder);
        
        /**
         * Sets (as xml) the "sortorder" attribute
         */
        void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder);
        
        /**
         * Unsets the "sortorder" attribute
         */
        void unsetSortorder();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech newInstance() {
              return (org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.MaterialsTechComplexType.TermMaterialsTech) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.MaterialsTechComplexType newInstance() {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.MaterialsTechComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.MaterialsTechComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.MaterialsTechComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.MaterialsTechComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.MaterialsTechComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.MaterialsTechComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.MaterialsTechComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
