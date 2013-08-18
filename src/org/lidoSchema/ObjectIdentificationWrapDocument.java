/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lidoSchema;


/**
 * A document containing one objectIdentificationWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface ObjectIdentificationWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectIdentificationWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectidentificationwrap2ae3doctype");
    
    /**
     * Gets the "objectIdentificationWrap" element
     */
    org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap getObjectIdentificationWrap();
    
    /**
     * Sets the "objectIdentificationWrap" element
     */
    void setObjectIdentificationWrap(org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap objectIdentificationWrap);
    
    /**
     * Appends and returns a new empty "objectIdentificationWrap" element
     */
    org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap addNewObjectIdentificationWrap();
    
    /**
     * An XML objectIdentificationWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ObjectIdentificationWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectIdentificationWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectidentificationwrap0cb6elemtype");
        
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
         * Gets the "inscriptionsWrap" element
         */
        org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap();
        
        /**
         * True if has "inscriptionsWrap" element
         */
        boolean isSetInscriptionsWrap();
        
        /**
         * Sets the "inscriptionsWrap" element
         */
        void setInscriptionsWrap(org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap);
        
        /**
         * Appends and returns a new empty "inscriptionsWrap" element
         */
        org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap();
        
        /**
         * Unsets the "inscriptionsWrap" element
         */
        void unsetInscriptionsWrap();
        
        /**
         * Gets the "repositoryWrap" element
         */
        org.lidoSchema.RepositoryWrapDocument.RepositoryWrap getRepositoryWrap();
        
        /**
         * True if has "repositoryWrap" element
         */
        boolean isSetRepositoryWrap();
        
        /**
         * Sets the "repositoryWrap" element
         */
        void setRepositoryWrap(org.lidoSchema.RepositoryWrapDocument.RepositoryWrap repositoryWrap);
        
        /**
         * Appends and returns a new empty "repositoryWrap" element
         */
        org.lidoSchema.RepositoryWrapDocument.RepositoryWrap addNewRepositoryWrap();
        
        /**
         * Unsets the "repositoryWrap" element
         */
        void unsetRepositoryWrap();
        
        /**
         * Gets the "displayStateEditionWrap" element
         */
        org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap();
        
        /**
         * True if has "displayStateEditionWrap" element
         */
        boolean isSetDisplayStateEditionWrap();
        
        /**
         * Sets the "displayStateEditionWrap" element
         */
        void setDisplayStateEditionWrap(org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap);
        
        /**
         * Appends and returns a new empty "displayStateEditionWrap" element
         */
        org.lidoSchema.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap();
        
        /**
         * Unsets the "displayStateEditionWrap" element
         */
        void unsetDisplayStateEditionWrap();
        
        /**
         * Gets the "objectDescriptionWrap" element
         */
        org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap getObjectDescriptionWrap();
        
        /**
         * True if has "objectDescriptionWrap" element
         */
        boolean isSetObjectDescriptionWrap();
        
        /**
         * Sets the "objectDescriptionWrap" element
         */
        void setObjectDescriptionWrap(org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap objectDescriptionWrap);
        
        /**
         * Appends and returns a new empty "objectDescriptionWrap" element
         */
        org.lidoSchema.ObjectDescriptionWrapDocument.ObjectDescriptionWrap addNewObjectDescriptionWrap();
        
        /**
         * Unsets the "objectDescriptionWrap" element
         */
        void unsetObjectDescriptionWrap();
        
        /**
         * Gets the "objectMeasurementsWrap" element
         */
        org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap getObjectMeasurementsWrap();
        
        /**
         * True if has "objectMeasurementsWrap" element
         */
        boolean isSetObjectMeasurementsWrap();
        
        /**
         * Sets the "objectMeasurementsWrap" element
         */
        void setObjectMeasurementsWrap(org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap objectMeasurementsWrap);
        
        /**
         * Appends and returns a new empty "objectMeasurementsWrap" element
         */
        org.lidoSchema.ObjectMeasurementsWrapDocument.ObjectMeasurementsWrap addNewObjectMeasurementsWrap();
        
        /**
         * Unsets the "objectMeasurementsWrap" element
         */
        void unsetObjectMeasurementsWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap newInstance() {
              return (org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ObjectIdentificationWrapDocument.ObjectIdentificationWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ObjectIdentificationWrapDocument newInstance() {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectIdentificationWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectIdentificationWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
