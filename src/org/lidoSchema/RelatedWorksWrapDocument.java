/*
 * An XML document type.
 * Localname: relatedWorksWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.RelatedWorksWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * A document containing one relatedWorksWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface RelatedWorksWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedWorksWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("relatedworkswrap5619doctype");
    
    /**
     * Gets the "relatedWorksWrap" element
     */
    org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap getRelatedWorksWrap();
    
    /**
     * Sets the "relatedWorksWrap" element
     */
    void setRelatedWorksWrap(org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap relatedWorksWrap);
    
    /**
     * Appends and returns a new empty "relatedWorksWrap" element
     */
    org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap addNewRelatedWorksWrap();
    
    /**
     * An XML relatedWorksWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface RelatedWorksWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedWorksWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("relatedworkswrap36f6elemtype");
        
        /**
         * Gets a List of "relatedWorkSet" elements
         */
        java.util.List<org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet> getRelatedWorkSetList();
        
        /**
         * Gets array of all "relatedWorkSet" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet[] getRelatedWorkSetArray();
        
        /**
         * Gets ith "relatedWorkSet" element
         */
        org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet getRelatedWorkSetArray(int i);
        
        /**
         * Returns number of "relatedWorkSet" element
         */
        int sizeOfRelatedWorkSetArray();
        
        /**
         * Sets array of all "relatedWorkSet" element
         */
        void setRelatedWorkSetArray(org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet[] relatedWorkSetArray);
        
        /**
         * Sets ith "relatedWorkSet" element
         */
        void setRelatedWorkSetArray(int i, org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet relatedWorkSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relatedWorkSet" element
         */
        org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet insertNewRelatedWorkSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relatedWorkSet" element
         */
        org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet addNewRelatedWorkSet();
        
        /**
         * Removes the ith "relatedWorkSet" element
         */
        void removeRelatedWorkSet(int i);
        
        /**
         * An XML relatedWorkSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface RelatedWorkSet extends org.lidoSchema.RelatedWorkSetComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedWorkSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("relatedworksetbbb4elemtype");
            
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
                public static org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet newInstance() {
                  return (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap.RelatedWorkSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap newInstance() {
              return (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.RelatedWorksWrapDocument newInstance() {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.RelatedWorksWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RelatedWorksWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RelatedWorksWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RelatedWorksWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
