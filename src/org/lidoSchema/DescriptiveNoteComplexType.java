/*
 * XML Type:  descriptiveNoteComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.DescriptiveNoteComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML descriptiveNoteComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface DescriptiveNoteComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("descriptivenotecomplextyped33etype");
    
    /**
     * Gets a List of "descriptiveNoteID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getDescriptiveNoteIDList();
    
    /**
     * Gets array of all "descriptiveNoteID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getDescriptiveNoteIDArray();
    
    /**
     * Gets ith "descriptiveNoteID" element
     */
    org.lidoSchema.IdentifierComplexType getDescriptiveNoteIDArray(int i);
    
    /**
     * Returns number of "descriptiveNoteID" element
     */
    int sizeOfDescriptiveNoteIDArray();
    
    /**
     * Sets array of all "descriptiveNoteID" element
     */
    void setDescriptiveNoteIDArray(org.lidoSchema.IdentifierComplexType[] descriptiveNoteIDArray);
    
    /**
     * Sets ith "descriptiveNoteID" element
     */
    void setDescriptiveNoteIDArray(int i, org.lidoSchema.IdentifierComplexType descriptiveNoteID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "descriptiveNoteID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewDescriptiveNoteID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "descriptiveNoteID" element
     */
    org.lidoSchema.IdentifierComplexType addNewDescriptiveNoteID();
    
    /**
     * Removes the ith "descriptiveNoteID" element
     */
    void removeDescriptiveNoteID(int i);
    
    /**
     * Gets a List of "descriptiveNoteValue" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getDescriptiveNoteValueList();
    
    /**
     * Gets array of all "descriptiveNoteValue" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getDescriptiveNoteValueArray();
    
    /**
     * Gets ith "descriptiveNoteValue" element
     */
    org.lidoSchema.TextComplexType getDescriptiveNoteValueArray(int i);
    
    /**
     * Returns number of "descriptiveNoteValue" element
     */
    int sizeOfDescriptiveNoteValueArray();
    
    /**
     * Sets array of all "descriptiveNoteValue" element
     */
    void setDescriptiveNoteValueArray(org.lidoSchema.TextComplexType[] descriptiveNoteValueArray);
    
    /**
     * Sets ith "descriptiveNoteValue" element
     */
    void setDescriptiveNoteValueArray(int i, org.lidoSchema.TextComplexType descriptiveNoteValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "descriptiveNoteValue" element
     */
    org.lidoSchema.TextComplexType insertNewDescriptiveNoteValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "descriptiveNoteValue" element
     */
    org.lidoSchema.TextComplexType addNewDescriptiveNoteValue();
    
    /**
     * Removes the ith "descriptiveNoteValue" element
     */
    void removeDescriptiveNoteValue(int i);
    
    /**
     * Gets a List of "sourceDescriptiveNote" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getSourceDescriptiveNoteList();
    
    /**
     * Gets array of all "sourceDescriptiveNote" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getSourceDescriptiveNoteArray();
    
    /**
     * Gets ith "sourceDescriptiveNote" element
     */
    org.lidoSchema.TextComplexType getSourceDescriptiveNoteArray(int i);
    
    /**
     * Returns number of "sourceDescriptiveNote" element
     */
    int sizeOfSourceDescriptiveNoteArray();
    
    /**
     * Sets array of all "sourceDescriptiveNote" element
     */
    void setSourceDescriptiveNoteArray(org.lidoSchema.TextComplexType[] sourceDescriptiveNoteArray);
    
    /**
     * Sets ith "sourceDescriptiveNote" element
     */
    void setSourceDescriptiveNoteArray(int i, org.lidoSchema.TextComplexType sourceDescriptiveNote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceDescriptiveNote" element
     */
    org.lidoSchema.TextComplexType insertNewSourceDescriptiveNote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceDescriptiveNote" element
     */
    org.lidoSchema.TextComplexType addNewSourceDescriptiveNote();
    
    /**
     * Removes the ith "sourceDescriptiveNote" element
     */
    void removeSourceDescriptiveNote(int i);
    
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
        public static org.lidoSchema.DescriptiveNoteComplexType newInstance() {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.DescriptiveNoteComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.DescriptiveNoteComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.DescriptiveNoteComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.DescriptiveNoteComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
