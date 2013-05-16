/*
 * An XML document type.
 * Localname: objectDescriptionWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ObjectDescriptionWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * A document containing one objectDescriptionWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface ObjectDescriptionWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectDescriptionWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectdescriptionwrapd4c5doctype");
    
    /**
     * Gets the "objectDescriptionWrap" element
     */
    org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap getObjectDescriptionWrap();
    
    /**
     * Sets the "objectDescriptionWrap" element
     */
    void setObjectDescriptionWrap(org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap objectDescriptionWrap);
    
    /**
     * Appends and returns a new empty "objectDescriptionWrap" element
     */
    org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap addNewObjectDescriptionWrap();
    
    /**
     * An XML objectDescriptionWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ObjectDescriptionWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectDescriptionWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectdescriptionwrap9a52elemtype");
        
        /**
         * Gets a List of "objectDescriptionSet" elements
         */
        java.util.List<org.lidoSchema.DescriptiveNoteComplexType> getObjectDescriptionSetList();
        
        /**
         * Gets array of all "objectDescriptionSet" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.DescriptiveNoteComplexType[] getObjectDescriptionSetArray();
        
        /**
         * Gets ith "objectDescriptionSet" element
         */
        org.lidoSchema.DescriptiveNoteComplexType getObjectDescriptionSetArray(int i);
        
        /**
         * Returns number of "objectDescriptionSet" element
         */
        int sizeOfObjectDescriptionSetArray();
        
        /**
         * Sets array of all "objectDescriptionSet" element
         */
        void setObjectDescriptionSetArray(org.lidoSchema.DescriptiveNoteComplexType[] objectDescriptionSetArray);
        
        /**
         * Sets ith "objectDescriptionSet" element
         */
        void setObjectDescriptionSetArray(int i, org.lidoSchema.DescriptiveNoteComplexType objectDescriptionSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectDescriptionSet" element
         */
        org.lidoSchema.DescriptiveNoteComplexType insertNewObjectDescriptionSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "objectDescriptionSet" element
         */
        org.lidoSchema.DescriptiveNoteComplexType addNewObjectDescriptionSet();
        
        /**
         * Removes the ith "objectDescriptionSet" element
         */
        void removeObjectDescriptionSet(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap newInstance() {
              return (org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ObjectDescriptionWrapDocument newInstance() {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectDescriptionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectDescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
