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
 * An XML rightsComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface RightsComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RightsComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("rightscomplextype9b29type");
    
    /**
     * Gets a List of "rightsType" elements
     */
    java.util.List<org.lidoSchema.ConceptComplexType> getRightsTypeList();
    
    /**
     * Gets array of all "rightsType" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ConceptComplexType[] getRightsTypeArray();
    
    /**
     * Gets ith "rightsType" element
     */
    org.lidoSchema.ConceptComplexType getRightsTypeArray(int i);
    
    /**
     * Returns number of "rightsType" element
     */
    int sizeOfRightsTypeArray();
    
    /**
     * Sets array of all "rightsType" element
     */
    void setRightsTypeArray(org.lidoSchema.ConceptComplexType[] rightsTypeArray);
    
    /**
     * Sets ith "rightsType" element
     */
    void setRightsTypeArray(int i, org.lidoSchema.ConceptComplexType rightsType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rightsType" element
     */
    org.lidoSchema.ConceptComplexType insertNewRightsType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rightsType" element
     */
    org.lidoSchema.ConceptComplexType addNewRightsType();
    
    /**
     * Removes the ith "rightsType" element
     */
    void removeRightsType(int i);
    
    /**
     * Gets the "rightsDate" element
     */
    org.lidoSchema.DateComplexType getRightsDate();
    
    /**
     * True if has "rightsDate" element
     */
    boolean isSetRightsDate();
    
    /**
     * Sets the "rightsDate" element
     */
    void setRightsDate(org.lidoSchema.DateComplexType rightsDate);
    
    /**
     * Appends and returns a new empty "rightsDate" element
     */
    org.lidoSchema.DateComplexType addNewRightsDate();
    
    /**
     * Unsets the "rightsDate" element
     */
    void unsetRightsDate();
    
    /**
     * Gets a List of "rightsHolder" elements
     */
    java.util.List<org.lidoSchema.RightsComplexType.RightsHolder> getRightsHolderList();
    
    /**
     * Gets array of all "rightsHolder" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.RightsComplexType.RightsHolder[] getRightsHolderArray();
    
    /**
     * Gets ith "rightsHolder" element
     */
    org.lidoSchema.RightsComplexType.RightsHolder getRightsHolderArray(int i);
    
    /**
     * Returns number of "rightsHolder" element
     */
    int sizeOfRightsHolderArray();
    
    /**
     * Sets array of all "rightsHolder" element
     */
    void setRightsHolderArray(org.lidoSchema.RightsComplexType.RightsHolder[] rightsHolderArray);
    
    /**
     * Sets ith "rightsHolder" element
     */
    void setRightsHolderArray(int i, org.lidoSchema.RightsComplexType.RightsHolder rightsHolder);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rightsHolder" element
     */
    org.lidoSchema.RightsComplexType.RightsHolder insertNewRightsHolder(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rightsHolder" element
     */
    org.lidoSchema.RightsComplexType.RightsHolder addNewRightsHolder();
    
    /**
     * Removes the ith "rightsHolder" element
     */
    void removeRightsHolder(int i);
    
    /**
     * Gets a List of "creditLine" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getCreditLineList();
    
    /**
     * Gets array of all "creditLine" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getCreditLineArray();
    
    /**
     * Gets ith "creditLine" element
     */
    org.lidoSchema.TextComplexType getCreditLineArray(int i);
    
    /**
     * Returns number of "creditLine" element
     */
    int sizeOfCreditLineArray();
    
    /**
     * Sets array of all "creditLine" element
     */
    void setCreditLineArray(org.lidoSchema.TextComplexType[] creditLineArray);
    
    /**
     * Sets ith "creditLine" element
     */
    void setCreditLineArray(int i, org.lidoSchema.TextComplexType creditLine);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "creditLine" element
     */
    org.lidoSchema.TextComplexType insertNewCreditLine(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "creditLine" element
     */
    org.lidoSchema.TextComplexType addNewCreditLine();
    
    /**
     * Removes the ith "creditLine" element
     */
    void removeCreditLine(int i);
    
    /**
     * An XML rightsHolder(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface RightsHolder extends org.lidoSchema.LegalBodyRefComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RightsHolder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("rightsholder764aelemtype");
        
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
            public static org.lidoSchema.RightsComplexType.RightsHolder newInstance() {
              return (org.lidoSchema.RightsComplexType.RightsHolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.RightsComplexType.RightsHolder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.RightsComplexType.RightsHolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.RightsComplexType newInstance() {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.RightsComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.RightsComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.RightsComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.RightsComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.RightsComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.RightsComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.RightsComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.RightsComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.RightsComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.RightsComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.RightsComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.RightsComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.RightsComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.RightsComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.RightsComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RightsComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.RightsComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.RightsComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
