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
 * A document containing one objectWorkTypeWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface ObjectWorkTypeWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectWorkTypeWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectworktypewrap71c6doctype");
    
    /**
     * Gets the "objectWorkTypeWrap" element
     */
    org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap();
    
    /**
     * Sets the "objectWorkTypeWrap" element
     */
    void setObjectWorkTypeWrap(org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap);
    
    /**
     * Appends and returns a new empty "objectWorkTypeWrap" element
     */
    org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap();
    
    /**
     * An XML objectWorkTypeWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ObjectWorkTypeWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectWorkTypeWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectworktypewrape616elemtype");
        
        /**
         * Gets a List of "objectWorkType" elements
         */
        java.util.List<org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType> getObjectWorkTypeList();
        
        /**
         * Gets array of all "objectWorkType" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType[] getObjectWorkTypeArray();
        
        /**
         * Gets ith "objectWorkType" element
         */
        org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType getObjectWorkTypeArray(int i);
        
        /**
         * Returns number of "objectWorkType" element
         */
        int sizeOfObjectWorkTypeArray();
        
        /**
         * Sets array of all "objectWorkType" element
         */
        void setObjectWorkTypeArray(org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType[] objectWorkTypeArray);
        
        /**
         * Sets ith "objectWorkType" element
         */
        void setObjectWorkTypeArray(int i, org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType objectWorkType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectWorkType" element
         */
        org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType insertNewObjectWorkType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "objectWorkType" element
         */
        org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType addNewObjectWorkType();
        
        /**
         * Removes the ith "objectWorkType" element
         */
        void removeObjectWorkType(int i);
        
        /**
         * An XML objectWorkType(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface ObjectWorkType extends org.lidoSchema.ConceptComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectWorkType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectworktype64f0elemtype");
            
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
                public static org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType newInstance() {
                  return (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.ObjectWorkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap newInstance() {
              return (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ObjectWorkTypeWrapDocument newInstance() {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectWorkTypeWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
