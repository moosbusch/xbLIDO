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
 * An XML repositorySetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface RepositorySetComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepositorySetComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("repositorysetcomplextype4b58type");
    
    /**
     * Gets the "repositoryName" element
     */
    org.lidoSchema.LegalBodyRefComplexType getRepositoryName();
    
    /**
     * True if has "repositoryName" element
     */
    boolean isSetRepositoryName();
    
    /**
     * Sets the "repositoryName" element
     */
    void setRepositoryName(org.lidoSchema.LegalBodyRefComplexType repositoryName);
    
    /**
     * Appends and returns a new empty "repositoryName" element
     */
    org.lidoSchema.LegalBodyRefComplexType addNewRepositoryName();
    
    /**
     * Unsets the "repositoryName" element
     */
    void unsetRepositoryName();
    
    /**
     * Gets a List of "workID" elements
     */
    java.util.List<org.lidoSchema.RepositorySetComplexType.WorkID> getWorkIDList();
    
    /**
     * Gets array of all "workID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.RepositorySetComplexType.WorkID[] getWorkIDArray();
    
    /**
     * Gets ith "workID" element
     */
    org.lidoSchema.RepositorySetComplexType.WorkID getWorkIDArray(int i);
    
    /**
     * Returns number of "workID" element
     */
    int sizeOfWorkIDArray();
    
    /**
     * Sets array of all "workID" element
     */
    void setWorkIDArray(org.lidoSchema.RepositorySetComplexType.WorkID[] workIDArray);
    
    /**
     * Sets ith "workID" element
     */
    void setWorkIDArray(int i, org.lidoSchema.RepositorySetComplexType.WorkID workID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "workID" element
     */
    org.lidoSchema.RepositorySetComplexType.WorkID insertNewWorkID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "workID" element
     */
    org.lidoSchema.RepositorySetComplexType.WorkID addNewWorkID();
    
    /**
     * Removes the ith "workID" element
     */
    void removeWorkID(int i);
    
    /**
     * Gets the "repositoryLocation" element
     */
    org.lidoSchema.PlaceComplexType getRepositoryLocation();
    
    /**
     * True if has "repositoryLocation" element
     */
    boolean isSetRepositoryLocation();
    
    /**
     * Sets the "repositoryLocation" element
     */
    void setRepositoryLocation(org.lidoSchema.PlaceComplexType repositoryLocation);
    
    /**
     * Appends and returns a new empty "repositoryLocation" element
     */
    org.lidoSchema.PlaceComplexType addNewRepositoryLocation();
    
    /**
     * Unsets the "repositoryLocation" element
     */
    void unsetRepositoryLocation();
    
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
     * An XML workID(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.RepositorySetComplexType$WorkID.
     */
    public interface WorkID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("workid9be0elemtype");
        
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
         * Gets the "encodinganalog" attribute
         */
        java.lang.String getEncodinganalog();
        
        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        org.apache.xmlbeans.XmlString xgetEncodinganalog();
        
        /**
         * True if has "encodinganalog" attribute
         */
        boolean isSetEncodinganalog();
        
        /**
         * Sets the "encodinganalog" attribute
         */
        void setEncodinganalog(java.lang.String encodinganalog);
        
        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog);
        
        /**
         * Unsets the "encodinganalog" attribute
         */
        void unsetEncodinganalog();
        
        /**
         * Gets the "label" attribute
         */
        java.lang.String getLabel();
        
        /**
         * Gets (as xml) the "label" attribute
         */
        org.apache.xmlbeans.XmlString xgetLabel();
        
        /**
         * True if has "label" attribute
         */
        boolean isSetLabel();
        
        /**
         * Sets the "label" attribute
         */
        void setLabel(java.lang.String label);
        
        /**
         * Sets (as xml) the "label" attribute
         */
        void xsetLabel(org.apache.xmlbeans.XmlString label);
        
        /**
         * Unsets the "label" attribute
         */
        void unsetLabel();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.RepositorySetComplexType.WorkID newInstance() {
              return (org.lidoSchema.RepositorySetComplexType.WorkID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.RepositorySetComplexType.WorkID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.RepositorySetComplexType.WorkID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.RepositorySetComplexType newInstance() {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.RepositorySetComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.RepositorySetComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.RepositorySetComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.RepositorySetComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RepositorySetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RepositorySetComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RepositorySetComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
