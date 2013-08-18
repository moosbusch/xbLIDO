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
 * An XML lidoComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface LidoComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LidoComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("lidocomplextypeb19atype");
    
    /**
     * Gets a List of "lidoRecID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getLidoRecIDList();
    
    /**
     * Gets array of all "lidoRecID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getLidoRecIDArray();
    
    /**
     * Gets ith "lidoRecID" element
     */
    org.lidoSchema.IdentifierComplexType getLidoRecIDArray(int i);
    
    /**
     * Returns number of "lidoRecID" element
     */
    int sizeOfLidoRecIDArray();
    
    /**
     * Sets array of all "lidoRecID" element
     */
    void setLidoRecIDArray(org.lidoSchema.IdentifierComplexType[] lidoRecIDArray);
    
    /**
     * Sets ith "lidoRecID" element
     */
    void setLidoRecIDArray(int i, org.lidoSchema.IdentifierComplexType lidoRecID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lidoRecID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewLidoRecID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lidoRecID" element
     */
    org.lidoSchema.IdentifierComplexType addNewLidoRecID();
    
    /**
     * Removes the ith "lidoRecID" element
     */
    void removeLidoRecID(int i);
    
    /**
     * Gets a List of "objectPublishedID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getObjectPublishedIDList();
    
    /**
     * Gets array of all "objectPublishedID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getObjectPublishedIDArray();
    
    /**
     * Gets ith "objectPublishedID" element
     */
    org.lidoSchema.IdentifierComplexType getObjectPublishedIDArray(int i);
    
    /**
     * Returns number of "objectPublishedID" element
     */
    int sizeOfObjectPublishedIDArray();
    
    /**
     * Sets array of all "objectPublishedID" element
     */
    void setObjectPublishedIDArray(org.lidoSchema.IdentifierComplexType[] objectPublishedIDArray);
    
    /**
     * Sets ith "objectPublishedID" element
     */
    void setObjectPublishedIDArray(int i, org.lidoSchema.IdentifierComplexType objectPublishedID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectPublishedID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewObjectPublishedID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectPublishedID" element
     */
    org.lidoSchema.IdentifierComplexType addNewObjectPublishedID();
    
    /**
     * Removes the ith "objectPublishedID" element
     */
    void removeObjectPublishedID(int i);
    
    /**
     * Gets the "category" element
     */
    org.lidoSchema.ConceptComplexType getCategory();
    
    /**
     * True if has "category" element
     */
    boolean isSetCategory();
    
    /**
     * Sets the "category" element
     */
    void setCategory(org.lidoSchema.ConceptComplexType category);
    
    /**
     * Appends and returns a new empty "category" element
     */
    org.lidoSchema.ConceptComplexType addNewCategory();
    
    /**
     * Unsets the "category" element
     */
    void unsetCategory();
    
    /**
     * Gets a List of "descriptiveMetadata" elements
     */
    java.util.List<org.lidoSchema.DescriptiveMetadataComplexType> getDescriptiveMetadataList();
    
    /**
     * Gets array of all "descriptiveMetadata" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.DescriptiveMetadataComplexType[] getDescriptiveMetadataArray();
    
    /**
     * Gets ith "descriptiveMetadata" element
     */
    org.lidoSchema.DescriptiveMetadataComplexType getDescriptiveMetadataArray(int i);
    
    /**
     * Returns number of "descriptiveMetadata" element
     */
    int sizeOfDescriptiveMetadataArray();
    
    /**
     * Sets array of all "descriptiveMetadata" element
     */
    void setDescriptiveMetadataArray(org.lidoSchema.DescriptiveMetadataComplexType[] descriptiveMetadataArray);
    
    /**
     * Sets ith "descriptiveMetadata" element
     */
    void setDescriptiveMetadataArray(int i, org.lidoSchema.DescriptiveMetadataComplexType descriptiveMetadata);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "descriptiveMetadata" element
     */
    org.lidoSchema.DescriptiveMetadataComplexType insertNewDescriptiveMetadata(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "descriptiveMetadata" element
     */
    org.lidoSchema.DescriptiveMetadataComplexType addNewDescriptiveMetadata();
    
    /**
     * Removes the ith "descriptiveMetadata" element
     */
    void removeDescriptiveMetadata(int i);
    
    /**
     * Gets a List of "administrativeMetadata" elements
     */
    java.util.List<org.lidoSchema.AdministrativeMetadataComplexType> getAdministrativeMetadataList();
    
    /**
     * Gets array of all "administrativeMetadata" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.AdministrativeMetadataComplexType[] getAdministrativeMetadataArray();
    
    /**
     * Gets ith "administrativeMetadata" element
     */
    org.lidoSchema.AdministrativeMetadataComplexType getAdministrativeMetadataArray(int i);
    
    /**
     * Returns number of "administrativeMetadata" element
     */
    int sizeOfAdministrativeMetadataArray();
    
    /**
     * Sets array of all "administrativeMetadata" element
     */
    void setAdministrativeMetadataArray(org.lidoSchema.AdministrativeMetadataComplexType[] administrativeMetadataArray);
    
    /**
     * Sets ith "administrativeMetadata" element
     */
    void setAdministrativeMetadataArray(int i, org.lidoSchema.AdministrativeMetadataComplexType administrativeMetadata);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "administrativeMetadata" element
     */
    org.lidoSchema.AdministrativeMetadataComplexType insertNewAdministrativeMetadata(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "administrativeMetadata" element
     */
    org.lidoSchema.AdministrativeMetadataComplexType addNewAdministrativeMetadata();
    
    /**
     * Removes the ith "administrativeMetadata" element
     */
    void removeAdministrativeMetadata(int i);
    
    /**
     * Gets the "relatedencoding" attribute
     */
    java.lang.String getRelatedencoding();
    
    /**
     * Gets (as xml) the "relatedencoding" attribute
     */
    org.apache.xmlbeans.XmlString xgetRelatedencoding();
    
    /**
     * True if has "relatedencoding" attribute
     */
    boolean isSetRelatedencoding();
    
    /**
     * Sets the "relatedencoding" attribute
     */
    void setRelatedencoding(java.lang.String relatedencoding);
    
    /**
     * Sets (as xml) the "relatedencoding" attribute
     */
    void xsetRelatedencoding(org.apache.xmlbeans.XmlString relatedencoding);
    
    /**
     * Unsets the "relatedencoding" attribute
     */
    void unsetRelatedencoding();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.LidoComplexType newInstance() {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.LidoComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.LidoComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.LidoComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.LidoComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.LidoComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.LidoComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.LidoComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.LidoComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.LidoComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.LidoComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.LidoComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.LidoComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.LidoComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.LidoComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.LidoComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.LidoComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.LidoComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.LidoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
