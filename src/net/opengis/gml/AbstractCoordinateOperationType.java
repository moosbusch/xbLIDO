/*
 * XML Type:  AbstractCoordinateOperationType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractCoordinateOperationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML AbstractCoordinateOperationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface AbstractCoordinateOperationType extends net.opengis.gml.AbstractCoordinateOperationBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractCoordinateOperationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("abstractcoordinateoperationtyped286type");
    
    /**
     * Gets a List of "coordinateOperationID" elements
     */
    java.util.List<net.opengis.gml.IdentifierType> getCoordinateOperationIDList();
    
    /**
     * Gets array of all "coordinateOperationID" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IdentifierType[] getCoordinateOperationIDArray();
    
    /**
     * Gets ith "coordinateOperationID" element
     */
    net.opengis.gml.IdentifierType getCoordinateOperationIDArray(int i);
    
    /**
     * Returns number of "coordinateOperationID" element
     */
    int sizeOfCoordinateOperationIDArray();
    
    /**
     * Sets array of all "coordinateOperationID" element
     */
    void setCoordinateOperationIDArray(net.opengis.gml.IdentifierType[] coordinateOperationIDArray);
    
    /**
     * Sets ith "coordinateOperationID" element
     */
    void setCoordinateOperationIDArray(int i, net.opengis.gml.IdentifierType coordinateOperationID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coordinateOperationID" element
     */
    net.opengis.gml.IdentifierType insertNewCoordinateOperationID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coordinateOperationID" element
     */
    net.opengis.gml.IdentifierType addNewCoordinateOperationID();
    
    /**
     * Removes the ith "coordinateOperationID" element
     */
    void removeCoordinateOperationID(int i);
    
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
     * Gets the "operationVersion" element
     */
    java.lang.String getOperationVersion();
    
    /**
     * Gets (as xml) the "operationVersion" element
     */
    org.apache.xmlbeans.XmlString xgetOperationVersion();
    
    /**
     * True if has "operationVersion" element
     */
    boolean isSetOperationVersion();
    
    /**
     * Sets the "operationVersion" element
     */
    void setOperationVersion(java.lang.String operationVersion);
    
    /**
     * Sets (as xml) the "operationVersion" element
     */
    void xsetOperationVersion(org.apache.xmlbeans.XmlString operationVersion);
    
    /**
     * Unsets the "operationVersion" element
     */
    void unsetOperationVersion();
    
    /**
     * Gets the "validArea" element
     */
    net.opengis.gml.ExtentType getValidArea();
    
    /**
     * True if has "validArea" element
     */
    boolean isSetValidArea();
    
    /**
     * Sets the "validArea" element
     */
    void setValidArea(net.opengis.gml.ExtentType validArea);
    
    /**
     * Appends and returns a new empty "validArea" element
     */
    net.opengis.gml.ExtentType addNewValidArea();
    
    /**
     * Unsets the "validArea" element
     */
    void unsetValidArea();
    
    /**
     * Gets the "scope" element
     */
    java.lang.String getScope();
    
    /**
     * Gets (as xml) the "scope" element
     */
    org.apache.xmlbeans.XmlString xgetScope();
    
    /**
     * True if has "scope" element
     */
    boolean isSetScope();
    
    /**
     * Sets the "scope" element
     */
    void setScope(java.lang.String scope);
    
    /**
     * Sets (as xml) the "scope" element
     */
    void xsetScope(org.apache.xmlbeans.XmlString scope);
    
    /**
     * Unsets the "scope" element
     */
    void unsetScope();
    
    /**
     * Gets a List of "_positionalAccuracy" elements
     */
    java.util.List<net.opengis.gml.AbstractPositionalAccuracyType> getPositionalAccuracyList();
    
    /**
     * Gets array of all "_positionalAccuracy" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.AbstractPositionalAccuracyType[] getPositionalAccuracyArray();
    
    /**
     * Gets ith "_positionalAccuracy" element
     */
    net.opengis.gml.AbstractPositionalAccuracyType getPositionalAccuracyArray(int i);
    
    /**
     * Returns number of "_positionalAccuracy" element
     */
    int sizeOfPositionalAccuracyArray();
    
    /**
     * Sets array of all "_positionalAccuracy" element
     */
    void setPositionalAccuracyArray(net.opengis.gml.AbstractPositionalAccuracyType[] positionalAccuracyArray);
    
    /**
     * Sets ith "_positionalAccuracy" element
     */
    void setPositionalAccuracyArray(int i, net.opengis.gml.AbstractPositionalAccuracyType positionalAccuracy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_positionalAccuracy" element
     */
    net.opengis.gml.AbstractPositionalAccuracyType insertNewPositionalAccuracy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_positionalAccuracy" element
     */
    net.opengis.gml.AbstractPositionalAccuracyType addNewPositionalAccuracy();
    
    /**
     * Removes the ith "_positionalAccuracy" element
     */
    void removePositionalAccuracy(int i);
    
    /**
     * Gets the "sourceCRS" element
     */
    net.opengis.gml.CRSRefType getSourceCRS();
    
    /**
     * True if has "sourceCRS" element
     */
    boolean isSetSourceCRS();
    
    /**
     * Sets the "sourceCRS" element
     */
    void setSourceCRS(net.opengis.gml.CRSRefType sourceCRS);
    
    /**
     * Appends and returns a new empty "sourceCRS" element
     */
    net.opengis.gml.CRSRefType addNewSourceCRS();
    
    /**
     * Unsets the "sourceCRS" element
     */
    void unsetSourceCRS();
    
    /**
     * Gets the "targetCRS" element
     */
    net.opengis.gml.CRSRefType getTargetCRS();
    
    /**
     * True if has "targetCRS" element
     */
    boolean isSetTargetCRS();
    
    /**
     * Sets the "targetCRS" element
     */
    void setTargetCRS(net.opengis.gml.CRSRefType targetCRS);
    
    /**
     * Appends and returns a new empty "targetCRS" element
     */
    net.opengis.gml.CRSRefType addNewTargetCRS();
    
    /**
     * Unsets the "targetCRS" element
     */
    void unsetTargetCRS();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        @Deprecated
        public static net.opengis.gml.AbstractCoordinateOperationType newInstance() {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        @Deprecated
        public static net.opengis.gml.AbstractCoordinateOperationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.AbstractCoordinateOperationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractCoordinateOperationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractCoordinateOperationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractCoordinateOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
