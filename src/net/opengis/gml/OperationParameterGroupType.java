/*
 * XML Type:  OperationParameterGroupType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationParameterGroupType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML OperationParameterGroupType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface OperationParameterGroupType extends net.opengis.gml.OperationParameterGroupBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationParameterGroupType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("operationparametergrouptypeb6b6type");
    
    /**
     * Gets a List of "groupID" elements
     */
    java.util.List<net.opengis.gml.IdentifierType> getGroupIDList();
    
    /**
     * Gets array of all "groupID" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IdentifierType[] getGroupIDArray();
    
    /**
     * Gets ith "groupID" element
     */
    net.opengis.gml.IdentifierType getGroupIDArray(int i);
    
    /**
     * Returns number of "groupID" element
     */
    int sizeOfGroupIDArray();
    
    /**
     * Sets array of all "groupID" element
     */
    void setGroupIDArray(net.opengis.gml.IdentifierType[] groupIDArray);
    
    /**
     * Sets ith "groupID" element
     */
    void setGroupIDArray(int i, net.opengis.gml.IdentifierType groupID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "groupID" element
     */
    net.opengis.gml.IdentifierType insertNewGroupID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "groupID" element
     */
    net.opengis.gml.IdentifierType addNewGroupID();
    
    /**
     * Removes the ith "groupID" element
     */
    void removeGroupID(int i);
    
    /**
     * Gets the "remarks" element
     */
    net.opengis.gml.StringOrRefType getRemarks();
    
    /**
     * True if has "remarks" element
     */
    boolean isSetRemarks();
    
    /**
     * Sets the "remarks" element
     */
    void setRemarks(net.opengis.gml.StringOrRefType remarks);
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    net.opengis.gml.StringOrRefType addNewRemarks();
    
    /**
     * Unsets the "remarks" element
     */
    void unsetRemarks();
    
    /**
     * Gets the "maximumOccurs" element
     */
    java.math.BigInteger getMaximumOccurs();
    
    /**
     * Gets (as xml) the "maximumOccurs" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetMaximumOccurs();
    
    /**
     * True if has "maximumOccurs" element
     */
    boolean isSetMaximumOccurs();
    
    /**
     * Sets the "maximumOccurs" element
     */
    void setMaximumOccurs(java.math.BigInteger maximumOccurs);
    
    /**
     * Sets (as xml) the "maximumOccurs" element
     */
    void xsetMaximumOccurs(org.apache.xmlbeans.XmlPositiveInteger maximumOccurs);
    
    /**
     * Unsets the "maximumOccurs" element
     */
    void unsetMaximumOccurs();
    
    /**
     * Gets a List of "includesParameter" elements
     */
    java.util.List<net.opengis.gml.AbstractGeneralOperationParameterRefType> getIncludesParameterList();
    
    /**
     * Gets array of all "includesParameter" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.AbstractGeneralOperationParameterRefType[] getIncludesParameterArray();
    
    /**
     * Gets ith "includesParameter" element
     */
    net.opengis.gml.AbstractGeneralOperationParameterRefType getIncludesParameterArray(int i);
    
    /**
     * Returns number of "includesParameter" element
     */
    int sizeOfIncludesParameterArray();
    
    /**
     * Sets array of all "includesParameter" element
     */
    void setIncludesParameterArray(net.opengis.gml.AbstractGeneralOperationParameterRefType[] includesParameterArray);
    
    /**
     * Sets ith "includesParameter" element
     */
    void setIncludesParameterArray(int i, net.opengis.gml.AbstractGeneralOperationParameterRefType includesParameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "includesParameter" element
     */
    net.opengis.gml.AbstractGeneralOperationParameterRefType insertNewIncludesParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "includesParameter" element
     */
    net.opengis.gml.AbstractGeneralOperationParameterRefType addNewIncludesParameter();
    
    /**
     * Removes the ith "includesParameter" element
     */
    void removeIncludesParameter(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.OperationParameterGroupType newInstance() {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.OperationParameterGroupType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.OperationParameterGroupType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.OperationParameterGroupType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.OperationParameterGroupType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.OperationParameterGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.OperationParameterGroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.OperationParameterGroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
