/*
 * An XML document type.
 * Localname: titleWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.TitleWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * A document containing one titleWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface TitleWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TitleWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("titlewrap17cadoctype");
    
    /**
     * Gets the "titleWrap" element
     */
    org.lidoSchema.TitleWrapDocument.TitleWrap getTitleWrap();
    
    /**
     * Sets the "titleWrap" element
     */
    void setTitleWrap(org.lidoSchema.TitleWrapDocument.TitleWrap titleWrap);
    
    /**
     * Appends and returns a new empty "titleWrap" element
     */
    org.lidoSchema.TitleWrapDocument.TitleWrap addNewTitleWrap();
    
    /**
     * An XML titleWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface TitleWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TitleWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("titlewrap22dcelemtype");
        
        /**
         * Gets a List of "titleSet" elements
         */
        java.util.List<org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet> getTitleSetList();
        
        /**
         * Gets array of all "titleSet" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet[] getTitleSetArray();
        
        /**
         * Gets ith "titleSet" element
         */
        org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet getTitleSetArray(int i);
        
        /**
         * Returns number of "titleSet" element
         */
        int sizeOfTitleSetArray();
        
        /**
         * Sets array of all "titleSet" element
         */
        void setTitleSetArray(org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet[] titleSetArray);
        
        /**
         * Sets ith "titleSet" element
         */
        void setTitleSetArray(int i, org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet titleSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "titleSet" element
         */
        org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet insertNewTitleSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "titleSet" element
         */
        org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet addNewTitleSet();
        
        /**
         * Removes the ith "titleSet" element
         */
        void removeTitleSet(int i);
        
        /**
         * An XML titleSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface TitleSet extends org.lidoSchema.AppellationComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TitleSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("titleset3d96elemtype");
            
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
                public static org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet newInstance() {
                  return (org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.TitleWrapDocument.TitleWrap.TitleSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.TitleWrapDocument.TitleWrap newInstance() {
              return (org.lidoSchema.TitleWrapDocument.TitleWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.TitleWrapDocument.TitleWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.TitleWrapDocument.TitleWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.TitleWrapDocument newInstance() {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.TitleWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.TitleWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.TitleWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.TitleWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.TitleWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.TitleWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.TitleWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
