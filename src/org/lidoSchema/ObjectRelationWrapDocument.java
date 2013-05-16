/*
 * An XML document type.
 * Localname: objectRelationWrap
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ObjectRelationWrapDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * A document containing one objectRelationWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface ObjectRelationWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectRelationWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectrelationwrap8f95doctype");
    
    /**
     * Gets the "objectRelationWrap" element
     */
    org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap getObjectRelationWrap();
    
    /**
     * Sets the "objectRelationWrap" element
     */
    void setObjectRelationWrap(org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap objectRelationWrap);
    
    /**
     * Appends and returns a new empty "objectRelationWrap" element
     */
    org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap addNewObjectRelationWrap();
    
    /**
     * An XML objectRelationWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ObjectRelationWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectRelationWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectrelationwraped76elemtype");
        
        /**
         * Gets the "subjectWrap" element
         */
        org.lidoSchema.SubjectWrapDocument.SubjectWrap getSubjectWrap();
        
        /**
         * True if has "subjectWrap" element
         */
        boolean isSetSubjectWrap();
        
        /**
         * Sets the "subjectWrap" element
         */
        void setSubjectWrap(org.lidoSchema.SubjectWrapDocument.SubjectWrap subjectWrap);
        
        /**
         * Appends and returns a new empty "subjectWrap" element
         */
        org.lidoSchema.SubjectWrapDocument.SubjectWrap addNewSubjectWrap();
        
        /**
         * Unsets the "subjectWrap" element
         */
        void unsetSubjectWrap();
        
        /**
         * Gets the "relatedWorksWrap" element
         */
        org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap getRelatedWorksWrap();
        
        /**
         * True if has "relatedWorksWrap" element
         */
        boolean isSetRelatedWorksWrap();
        
        /**
         * Sets the "relatedWorksWrap" element
         */
        void setRelatedWorksWrap(org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap relatedWorksWrap);
        
        /**
         * Appends and returns a new empty "relatedWorksWrap" element
         */
        org.lidoSchema.RelatedWorksWrapDocument.RelatedWorksWrap addNewRelatedWorksWrap();
        
        /**
         * Unsets the "relatedWorksWrap" element
         */
        void unsetRelatedWorksWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap newInstance() {
              return (org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ObjectRelationWrapDocument.ObjectRelationWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ObjectRelationWrapDocument newInstance() {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ObjectRelationWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectRelationWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectRelationWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectRelationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
