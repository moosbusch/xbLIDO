/*
 * An XML document type.
 * Localname: eventWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.EventWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * A document containing one eventWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface EventWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("eventwrap3f48doctype");
    
    /**
     * Gets the "eventWrap" element
     */
    org.lidoSchema.EventWrapDocument.EventWrap getEventWrap();
    
    /**
     * Sets the "eventWrap" element
     */
    void setEventWrap(org.lidoSchema.EventWrapDocument.EventWrap eventWrap);
    
    /**
     * Appends and returns a new empty "eventWrap" element
     */
    org.lidoSchema.EventWrapDocument.EventWrap addNewEventWrap();
    
    /**
     * An XML eventWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface EventWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("eventwrap24d8elemtype");
        
        /**
         * Gets a List of "eventSet" elements
         */
        java.util.List<org.lidoSchema.EventWrapDocument.EventWrap.EventSet> getEventSetList();
        
        /**
         * Gets array of all "eventSet" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.EventWrapDocument.EventWrap.EventSet[] getEventSetArray();
        
        /**
         * Gets ith "eventSet" element
         */
        org.lidoSchema.EventWrapDocument.EventWrap.EventSet getEventSetArray(int i);
        
        /**
         * Returns number of "eventSet" element
         */
        int sizeOfEventSetArray();
        
        /**
         * Sets array of all "eventSet" element
         */
        void setEventSetArray(org.lidoSchema.EventWrapDocument.EventWrap.EventSet[] eventSetArray);
        
        /**
         * Sets ith "eventSet" element
         */
        void setEventSetArray(int i, org.lidoSchema.EventWrapDocument.EventWrap.EventSet eventSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "eventSet" element
         */
        org.lidoSchema.EventWrapDocument.EventWrap.EventSet insertNewEventSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "eventSet" element
         */
        org.lidoSchema.EventWrapDocument.EventWrap.EventSet addNewEventSet();
        
        /**
         * Removes the ith "eventSet" element
         */
        void removeEventSet(int i);
        
        /**
         * An XML eventSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface EventSet extends org.lidoSchema.EventSetComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("eventset8a54elemtype");
            
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
                public static org.lidoSchema.EventWrapDocument.EventWrap.EventSet newInstance() {
                  return (org.lidoSchema.EventWrapDocument.EventWrap.EventSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.EventWrapDocument.EventWrap.EventSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.EventWrapDocument.EventWrap.EventSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.EventWrapDocument.EventWrap newInstance() {
              return (org.lidoSchema.EventWrapDocument.EventWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.EventWrapDocument.EventWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.EventWrapDocument.EventWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.EventWrapDocument newInstance() {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.EventWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.EventWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.EventWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.EventWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.EventWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.EventWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.EventWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.EventWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.EventWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.EventWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.EventWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.EventWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.EventWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.EventWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.EventWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.EventWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.EventWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
