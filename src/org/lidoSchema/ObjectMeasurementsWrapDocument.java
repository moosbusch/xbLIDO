/*
 * An XML document type.
 * Localname: objectMeasurementsWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ObjectMeasurementsWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * A document containing one objectMeasurementsWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface ObjectMeasurementsWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectMeasurementsWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectmeasurementswrap31fadoctype");
    
    /**
     * Gets the "objectMeasurementsWrap" element
     */
    org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap getObjectMeasurementsWrap();
    
    /**
     * Sets the "objectMeasurementsWrap" element
     */
    void setObjectMeasurementsWrap(org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap objectMeasurementsWrap);
    
    /**
     * Appends and returns a new empty "objectMeasurementsWrap" element
     */
    org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap addNewObjectMeasurementsWrap();
    
    /**
     * An XML objectMeasurementsWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ObjectMeasurementsWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectMeasurementsWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectmeasurementswrap9916elemtype");
        
        /**
         * Gets a List of "objectMeasurementsSet" elements
         */
        java.util.List<org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet> getObjectMeasurementsSetList();
        
        /**
         * Gets array of all "objectMeasurementsSet" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet[] getObjectMeasurementsSetArray();
        
        /**
         * Gets ith "objectMeasurementsSet" element
         */
        org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet getObjectMeasurementsSetArray(int i);
        
        /**
         * Returns number of "objectMeasurementsSet" element
         */
        int sizeOfObjectMeasurementsSetArray();
        
        /**
         * Sets array of all "objectMeasurementsSet" element
         */
        void setObjectMeasurementsSetArray(org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet[] objectMeasurementsSetArray);
        
        /**
         * Sets ith "objectMeasurementsSet" element
         */
        void setObjectMeasurementsSetArray(int i, org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet objectMeasurementsSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectMeasurementsSet" element
         */
        org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet insertNewObjectMeasurementsSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "objectMeasurementsSet" element
         */
        org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet addNewObjectMeasurementsSet();
        
        /**
         * Removes the ith "objectMeasurementsSet" element
         */
        void removeObjectMeasurementsSet(int i);
        
        /**
         * An XML objectMeasurementsSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface ObjectMeasurementsSet extends org.lidoSchema.ObjectMeasurementsSetComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectMeasurementsSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectmeasurementsset5a3eelemtype");
            
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
                public static org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet newInstance() {
                  return (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap.ObjectMeasurementsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap newInstance() {
              return (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ObjectMeasurementsWrapDocument newInstance() {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectMeasurementsWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectMeasurementsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
