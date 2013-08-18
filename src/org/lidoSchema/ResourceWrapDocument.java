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
 * A document containing one resourceWrap(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public interface ResourceWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("resourcewrap90c2doctype");
    
    /**
     * Gets the "resourceWrap" element
     */
    org.lidoSchema.ResourceWrapDocument.ResourceWrap getResourceWrap();
    
    /**
     * Sets the "resourceWrap" element
     */
    void setResourceWrap(org.lidoSchema.ResourceWrapDocument.ResourceWrap resourceWrap);
    
    /**
     * Appends and returns a new empty "resourceWrap" element
     */
    org.lidoSchema.ResourceWrapDocument.ResourceWrap addNewResourceWrap();
    
    /**
     * An XML resourceWrap(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface ResourceWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("resourcewrapedd6elemtype");
        
        /**
         * Gets a List of "resourceSet" elements
         */
        java.util.List<org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet> getResourceSetList();
        
        /**
         * Gets array of all "resourceSet" elements
         * @deprecated
         */
        @Deprecated
        org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet[] getResourceSetArray();
        
        /**
         * Gets ith "resourceSet" element
         */
        org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet getResourceSetArray(int i);
        
        /**
         * Returns number of "resourceSet" element
         */
        int sizeOfResourceSetArray();
        
        /**
         * Sets array of all "resourceSet" element
         */
        void setResourceSetArray(org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet[] resourceSetArray);
        
        /**
         * Sets ith "resourceSet" element
         */
        void setResourceSetArray(int i, org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet resourceSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceSet" element
         */
        org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet insertNewResourceSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceSet" element
         */
        org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet addNewResourceSet();
        
        /**
         * Removes the ith "resourceSet" element
         */
        void removeResourceSet(int i);
        
        /**
         * An XML resourceSet(@http://www.lido-schema.org).
         *
         * This is a complex type.
         */
        public interface ResourceSet extends org.lidoSchema.ResourceSetComplexType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("resourceset43f6elemtype");
            
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
                public static org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet newInstance() {
                  return (org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.lidoSchema.ResourceWrapDocument.ResourceWrap.ResourceSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ResourceWrapDocument.ResourceWrap newInstance() {
              return (org.lidoSchema.ResourceWrapDocument.ResourceWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ResourceWrapDocument.ResourceWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ResourceWrapDocument.ResourceWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ResourceWrapDocument newInstance() {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ResourceWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ResourceWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ResourceWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ResourceWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ResourceWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ResourceWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ResourceWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
