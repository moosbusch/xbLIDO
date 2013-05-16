/*
 * XML Type:  AbstractDatumType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractDatumType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML AbstractDatumType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface AbstractDatumType extends net.opengis.gml.AbstractDatumBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractDatumType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("abstractdatumtype9c26type");
    
    /**
     * Gets a List of "datumID" elements
     */
    java.util.List<net.opengis.gml.IdentifierType> getDatumIDList();
    
    /**
     * Gets array of all "datumID" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IdentifierType[] getDatumIDArray();
    
    /**
     * Gets ith "datumID" element
     */
    net.opengis.gml.IdentifierType getDatumIDArray(int i);
    
    /**
     * Returns number of "datumID" element
     */
    int sizeOfDatumIDArray();
    
    /**
     * Sets array of all "datumID" element
     */
    void setDatumIDArray(net.opengis.gml.IdentifierType[] datumIDArray);
    
    /**
     * Sets ith "datumID" element
     */
    void setDatumIDArray(int i, net.opengis.gml.IdentifierType datumID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "datumID" element
     */
    net.opengis.gml.IdentifierType insertNewDatumID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "datumID" element
     */
    net.opengis.gml.IdentifierType addNewDatumID();
    
    /**
     * Removes the ith "datumID" element
     */
    void removeDatumID(int i);
    
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
     * Gets the "anchorPoint" element
     */
    net.opengis.gml.CodeType getAnchorPoint();
    
    /**
     * True if has "anchorPoint" element
     */
    boolean isSetAnchorPoint();
    
    /**
     * Sets the "anchorPoint" element
     */
    void setAnchorPoint(net.opengis.gml.CodeType anchorPoint);
    
    /**
     * Appends and returns a new empty "anchorPoint" element
     */
    net.opengis.gml.CodeType addNewAnchorPoint();
    
    /**
     * Unsets the "anchorPoint" element
     */
    void unsetAnchorPoint();
    
    /**
     * Gets the "realizationEpoch" element
     */
    java.util.Calendar getRealizationEpoch();
    
    /**
     * Gets (as xml) the "realizationEpoch" element
     */
    org.apache.xmlbeans.XmlDate xgetRealizationEpoch();
    
    /**
     * True if has "realizationEpoch" element
     */
    boolean isSetRealizationEpoch();
    
    /**
     * Sets the "realizationEpoch" element
     */
    void setRealizationEpoch(java.util.Calendar realizationEpoch);
    
    /**
     * Sets (as xml) the "realizationEpoch" element
     */
    void xsetRealizationEpoch(org.apache.xmlbeans.XmlDate realizationEpoch);
    
    /**
     * Unsets the "realizationEpoch" element
     */
    void unsetRealizationEpoch();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        @Deprecated
        public static net.opengis.gml.AbstractDatumType newInstance() {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        @Deprecated
        public static net.opengis.gml.AbstractDatumType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.AbstractDatumType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.AbstractDatumType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.AbstractDatumType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.AbstractDatumType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.AbstractDatumType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.AbstractDatumType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.AbstractDatumType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.AbstractDatumType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.AbstractDatumType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.AbstractDatumType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.AbstractDatumType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.AbstractDatumType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.AbstractDatumType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.AbstractDatumType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractDatumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractDatumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractDatumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
