/*
 * XML Type:  PrimeMeridianType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PrimeMeridianType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML PrimeMeridianType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface PrimeMeridianType extends net.opengis.gml.PrimeMeridianBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PrimeMeridianType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("primemeridiantype01d3type");
    
    /**
     * Gets a List of "meridianID" elements
     */
    java.util.List<net.opengis.gml.IdentifierType> getMeridianIDList();
    
    /**
     * Gets array of all "meridianID" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IdentifierType[] getMeridianIDArray();
    
    /**
     * Gets ith "meridianID" element
     */
    net.opengis.gml.IdentifierType getMeridianIDArray(int i);
    
    /**
     * Returns number of "meridianID" element
     */
    int sizeOfMeridianIDArray();
    
    /**
     * Sets array of all "meridianID" element
     */
    void setMeridianIDArray(net.opengis.gml.IdentifierType[] meridianIDArray);
    
    /**
     * Sets ith "meridianID" element
     */
    void setMeridianIDArray(int i, net.opengis.gml.IdentifierType meridianID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "meridianID" element
     */
    net.opengis.gml.IdentifierType insertNewMeridianID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "meridianID" element
     */
    net.opengis.gml.IdentifierType addNewMeridianID();
    
    /**
     * Removes the ith "meridianID" element
     */
    void removeMeridianID(int i);
    
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
     * Gets the "greenwichLongitude" element
     */
    net.opengis.gml.AngleChoiceType getGreenwichLongitude();
    
    /**
     * Sets the "greenwichLongitude" element
     */
    void setGreenwichLongitude(net.opengis.gml.AngleChoiceType greenwichLongitude);
    
    /**
     * Appends and returns a new empty "greenwichLongitude" element
     */
    net.opengis.gml.AngleChoiceType addNewGreenwichLongitude();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.PrimeMeridianType newInstance() {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.PrimeMeridianType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.PrimeMeridianType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.PrimeMeridianType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.PrimeMeridianType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.PrimeMeridianType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.PrimeMeridianType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.PrimeMeridianType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
