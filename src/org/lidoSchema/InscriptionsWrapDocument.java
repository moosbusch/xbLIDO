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
 * A document containing one inscriptionsWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface InscriptionsWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InscriptionsWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("inscriptionswrap9815doctype");
    
    /**
     * Gets the "inscriptionsWrap" element
     */
    org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap();
    
    /**
     * Sets the "inscriptionsWrap" element
     */
    void setInscriptionsWrap(org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap);
    
    /**
     * Appends and returns a new empty "inscriptionsWrap" element
     */
    org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap();
    
    /**
     * An XML inscriptionsWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface InscriptionsWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InscriptionsWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("inscriptionswrap9d76elemtype");
        
        /**
         * Gets a List of "inscriptions" elements
         */
        java.util.List<org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions> getInscriptionsList();
        
        /**
         * Gets array of all "inscriptions" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions[] getInscriptionsArray();
        
        /**
         * Gets ith "inscriptions" element
         */
        org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions getInscriptionsArray(int i);
        
        /**
         * Returns number of "inscriptions" element
         */
        int sizeOfInscriptionsArray();
        
        /**
         * Sets array of all "inscriptions" element
         */
        void setInscriptionsArray(org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions[] inscriptionsArray);
        
        /**
         * Sets ith "inscriptions" element
         */
        void setInscriptionsArray(int i, org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions inscriptions);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "inscriptions" element
         */
        org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions insertNewInscriptions(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "inscriptions" element
         */
        org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions addNewInscriptions();
        
        /**
         * Removes the ith "inscriptions" element
         */
        void removeInscriptions(int i);
        
        /**
         * An XML inscriptions(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface Inscriptions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Inscriptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("inscriptionsf81felemtype");
            
            /**
             * Gets a List of "inscriptionTranscription" elements
             */
            java.util.List<org.lidoSchema.TextComplexType> getInscriptionTranscriptionList();
            
            /**
             * Gets array of all "inscriptionTranscription" elements
             * @deprecated
             */
            @Deprecated
            org.lidoSchema.TextComplexType[] getInscriptionTranscriptionArray();
            
            /**
             * Gets ith "inscriptionTranscription" element
             */
            org.lidoSchema.TextComplexType getInscriptionTranscriptionArray(int i);
            
            /**
             * Returns number of "inscriptionTranscription" element
             */
            int sizeOfInscriptionTranscriptionArray();
            
            /**
             * Sets array of all "inscriptionTranscription" element
             */
            void setInscriptionTranscriptionArray(org.lidoSchema.TextComplexType[] inscriptionTranscriptionArray);
            
            /**
             * Sets ith "inscriptionTranscription" element
             */
            void setInscriptionTranscriptionArray(int i, org.lidoSchema.TextComplexType inscriptionTranscription);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "inscriptionTranscription" element
             */
            org.lidoSchema.TextComplexType insertNewInscriptionTranscription(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "inscriptionTranscription" element
             */
            org.lidoSchema.TextComplexType addNewInscriptionTranscription();
            
            /**
             * Removes the ith "inscriptionTranscription" element
             */
            void removeInscriptionTranscription(int i);
            
            /**
             * Gets a List of "inscriptionDescription" elements
             */
            java.util.List<org.lidoSchema.DescriptiveNoteComplexType> getInscriptionDescriptionList();
            
            /**
             * Gets array of all "inscriptionDescription" elements
             * @deprecated
             */
            @Deprecated
            org.lidoSchema.DescriptiveNoteComplexType[] getInscriptionDescriptionArray();
            
            /**
             * Gets ith "inscriptionDescription" element
             */
            org.lidoSchema.DescriptiveNoteComplexType getInscriptionDescriptionArray(int i);
            
            /**
             * Returns number of "inscriptionDescription" element
             */
            int sizeOfInscriptionDescriptionArray();
            
            /**
             * Sets array of all "inscriptionDescription" element
             */
            void setInscriptionDescriptionArray(org.lidoSchema.DescriptiveNoteComplexType[] inscriptionDescriptionArray);
            
            /**
             * Sets ith "inscriptionDescription" element
             */
            void setInscriptionDescriptionArray(int i, org.lidoSchema.DescriptiveNoteComplexType inscriptionDescription);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "inscriptionDescription" element
             */
            org.lidoSchema.DescriptiveNoteComplexType insertNewInscriptionDescription(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "inscriptionDescription" element
             */
            org.lidoSchema.DescriptiveNoteComplexType addNewInscriptionDescription();
            
            /**
             * Removes the ith "inscriptionDescription" element
             */
            void removeInscriptionDescription(int i);
            
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
                public static org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions newInstance() {
                  return (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap.Inscriptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap newInstance() {
              return (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.InscriptionsWrapDocument.InscriptionsWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.InscriptionsWrapDocument newInstance() {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.InscriptionsWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.InscriptionsWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.InscriptionsWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.InscriptionsWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
