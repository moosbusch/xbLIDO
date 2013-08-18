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
 * A document containing one recordWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface RecordWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("recordwrapcddfdoctype");
    
    /**
     * Gets the "recordWrap" element
     */
    org.lidoSchema.RecordWrapDocument.RecordWrap getRecordWrap();
    
    /**
     * Sets the "recordWrap" element
     */
    void setRecordWrap(org.lidoSchema.RecordWrapDocument.RecordWrap recordWrap);
    
    /**
     * Appends and returns a new empty "recordWrap" element
     */
    org.lidoSchema.RecordWrapDocument.RecordWrap addNewRecordWrap();
    
    /**
     * An XML recordWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface RecordWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("recordwrap35b6elemtype");
        
        /**
         * Gets a List of "recordID" elements
         */
        java.util.List<org.lidoSchema.IdentifierComplexType> getRecordIDList();
        
        /**
         * Gets array of all "recordID" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.IdentifierComplexType[] getRecordIDArray();
        
        /**
         * Gets ith "recordID" element
         */
        org.lidoSchema.IdentifierComplexType getRecordIDArray(int i);
        
        /**
         * Returns number of "recordID" element
         */
        int sizeOfRecordIDArray();
        
        /**
         * Sets array of all "recordID" element
         */
        void setRecordIDArray(org.lidoSchema.IdentifierComplexType[] recordIDArray);
        
        /**
         * Sets ith "recordID" element
         */
        void setRecordIDArray(int i, org.lidoSchema.IdentifierComplexType recordID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordID" element
         */
        org.lidoSchema.IdentifierComplexType insertNewRecordID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordID" element
         */
        org.lidoSchema.IdentifierComplexType addNewRecordID();
        
        /**
         * Removes the ith "recordID" element
         */
        void removeRecordID(int i);
        
        /**
         * Gets the "recordType" element
         */
        org.lidoSchema.ConceptComplexType getRecordType();
        
        /**
         * Sets the "recordType" element
         */
        void setRecordType(org.lidoSchema.ConceptComplexType recordType);
        
        /**
         * Appends and returns a new empty "recordType" element
         */
        org.lidoSchema.ConceptComplexType addNewRecordType();
        
        /**
         * Gets a List of "recordSource" elements
         */
        java.util.List<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource> getRecordSourceList();
        
        /**
         * Gets array of all "recordSource" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource[] getRecordSourceArray();
        
        /**
         * Gets ith "recordSource" element
         */
        org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource getRecordSourceArray(int i);
        
        /**
         * Returns number of "recordSource" element
         */
        int sizeOfRecordSourceArray();
        
        /**
         * Sets array of all "recordSource" element
         */
        void setRecordSourceArray(org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource[] recordSourceArray);
        
        /**
         * Sets ith "recordSource" element
         */
        void setRecordSourceArray(int i, org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource recordSource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordSource" element
         */
        org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource insertNewRecordSource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordSource" element
         */
        org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource addNewRecordSource();
        
        /**
         * Removes the ith "recordSource" element
         */
        void removeRecordSource(int i);
        
        /**
         * Gets a List of "recordRights" elements
         */
        java.util.List<org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights> getRecordRightsList();
        
        /**
         * Gets array of all "recordRights" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights[] getRecordRightsArray();
        
        /**
         * Gets ith "recordRights" element
         */
        org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights getRecordRightsArray(int i);
        
        /**
         * Returns number of "recordRights" element
         */
        int sizeOfRecordRightsArray();
        
        /**
         * Sets array of all "recordRights" element
         */
        void setRecordRightsArray(org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights[] recordRightsArray);
        
        /**
         * Sets ith "recordRights" element
         */
        void setRecordRightsArray(int i, org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights recordRights);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordRights" element
         */
        org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights insertNewRecordRights(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordRights" element
         */
        org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights addNewRecordRights();
        
        /**
         * Removes the ith "recordRights" element
         */
        void removeRecordRights(int i);
        
        /**
         * Gets a List of "recordInfoSet" elements
         */
        java.util.List<org.lidoSchema.RecordInfoSetComplexType> getRecordInfoSetList();
        
        /**
         * Gets array of all "recordInfoSet" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.RecordInfoSetComplexType[] getRecordInfoSetArray();
        
        /**
         * Gets ith "recordInfoSet" element
         */
        org.lidoSchema.RecordInfoSetComplexType getRecordInfoSetArray(int i);
        
        /**
         * Returns number of "recordInfoSet" element
         */
        int sizeOfRecordInfoSetArray();
        
        /**
         * Sets array of all "recordInfoSet" element
         */
        void setRecordInfoSetArray(org.lidoSchema.RecordInfoSetComplexType[] recordInfoSetArray);
        
        /**
         * Sets ith "recordInfoSet" element
         */
        void setRecordInfoSetArray(int i, org.lidoSchema.RecordInfoSetComplexType recordInfoSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoSet" element
         */
        org.lidoSchema.RecordInfoSetComplexType insertNewRecordInfoSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoSet" element
         */
        org.lidoSchema.RecordInfoSetComplexType addNewRecordInfoSet();
        
        /**
         * Removes the ith "recordInfoSet" element
         */
        void removeRecordInfoSet(int i);
        
        /**
         * An XML recordSource(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface RecordSource extends org.lidoSchema.LegalBodyRefComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordSource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("recordsourcec24eelemtype");
            
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
                public static org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource newInstance() {
                  return (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordSource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML recordRights(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface RecordRights extends org.lidoSchema.RightsComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordRights.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("recordrights4612elemtype");
            
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
                public static org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights newInstance() {
                  return (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.RecordWrapDocument.RecordWrap.RecordRights) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.RecordWrapDocument.RecordWrap newInstance() {
              return (org.lidoSchema.RecordWrapDocument.RecordWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.RecordWrapDocument.RecordWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.RecordWrapDocument.RecordWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.RecordWrapDocument newInstance() {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.RecordWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.RecordWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.RecordWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.RecordWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RecordWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RecordWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
