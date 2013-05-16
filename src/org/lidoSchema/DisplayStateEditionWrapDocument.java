/*
 * An XML document type.
 * Localname: displayStateEditionWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.DisplayStateEditionWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * A document containing one displayStateEditionWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface DisplayStateEditionWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayStateEditionWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("displaystateeditionwrap95b3doctype");
    
    /**
     * Gets the "displayStateEditionWrap" element
     */
    org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap();
    
    /**
     * Sets the "displayStateEditionWrap" element
     */
    void setDisplayStateEditionWrap(org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap);
    
    /**
     * Appends and returns a new empty "displayStateEditionWrap" element
     */
    org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap();
    
    /**
     * An XML displayStateEditionWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface DisplayStateEditionWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayStateEditionWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("displaystateeditionwrapa3aeelemtype");
        
        /**
         * Gets a List of "displayState" elements
         */
        java.util.List<org.lidoSchema.TextComplexType> getDisplayStateList();
        
        /**
         * Gets array of all "displayState" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.TextComplexType[] getDisplayStateArray();
        
        /**
         * Gets ith "displayState" element
         */
        org.lidoSchema.TextComplexType getDisplayStateArray(int i);
        
        /**
         * Returns number of "displayState" element
         */
        int sizeOfDisplayStateArray();
        
        /**
         * Sets array of all "displayState" element
         */
        void setDisplayStateArray(org.lidoSchema.TextComplexType[] displayStateArray);
        
        /**
         * Sets ith "displayState" element
         */
        void setDisplayStateArray(int i, org.lidoSchema.TextComplexType displayState);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayState" element
         */
        org.lidoSchema.TextComplexType insertNewDisplayState(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayState" element
         */
        org.lidoSchema.TextComplexType addNewDisplayState();
        
        /**
         * Removes the ith "displayState" element
         */
        void removeDisplayState(int i);
        
        /**
         * Gets a List of "displayEdition" elements
         */
        java.util.List<org.lidoSchema.TextComplexType> getDisplayEditionList();
        
        /**
         * Gets array of all "displayEdition" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.TextComplexType[] getDisplayEditionArray();
        
        /**
         * Gets ith "displayEdition" element
         */
        org.lidoSchema.TextComplexType getDisplayEditionArray(int i);
        
        /**
         * Returns number of "displayEdition" element
         */
        int sizeOfDisplayEditionArray();
        
        /**
         * Sets array of all "displayEdition" element
         */
        void setDisplayEditionArray(org.lidoSchema.TextComplexType[] displayEditionArray);
        
        /**
         * Sets ith "displayEdition" element
         */
        void setDisplayEditionArray(int i, org.lidoSchema.TextComplexType displayEdition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayEdition" element
         */
        org.lidoSchema.TextComplexType insertNewDisplayEdition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayEdition" element
         */
        org.lidoSchema.TextComplexType addNewDisplayEdition();
        
        /**
         * Removes the ith "displayEdition" element
         */
        void removeDisplayEdition(int i);
        
        /**
         * Gets a List of "sourceStateEdition" elements
         */
        java.util.List<org.lidoSchema.TextComplexType> getSourceStateEditionList();
        
        /**
         * Gets array of all "sourceStateEdition" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.TextComplexType[] getSourceStateEditionArray();
        
        /**
         * Gets ith "sourceStateEdition" element
         */
        org.lidoSchema.TextComplexType getSourceStateEditionArray(int i);
        
        /**
         * Returns number of "sourceStateEdition" element
         */
        int sizeOfSourceStateEditionArray();
        
        /**
         * Sets array of all "sourceStateEdition" element
         */
        void setSourceStateEditionArray(org.lidoSchema.TextComplexType[] sourceStateEditionArray);
        
        /**
         * Sets ith "sourceStateEdition" element
         */
        void setSourceStateEditionArray(int i, org.lidoSchema.TextComplexType sourceStateEdition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceStateEdition" element
         */
        org.lidoSchema.TextComplexType insertNewSourceStateEdition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceStateEdition" element
         */
        org.lidoSchema.TextComplexType addNewSourceStateEdition();
        
        /**
         * Removes the ith "sourceStateEdition" element
         */
        void removeSourceStateEdition(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap newInstance() {
              return (org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.DisplayStateEditionWrapDocument newInstance() {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.DisplayStateEditionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
