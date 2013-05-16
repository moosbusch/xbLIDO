/*
 * XML Type:  EllipsoidType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EllipsoidType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML EllipsoidType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface EllipsoidType extends net.opengis.gml.EllipsoidBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EllipsoidType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("ellipsoidtypef450type");
    
    /**
     * Gets a List of "ellipsoidID" elements
     */
    java.util.List<net.opengis.gml.IdentifierType> getEllipsoidIDList();
    
    /**
     * Gets array of all "ellipsoidID" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IdentifierType[] getEllipsoidIDArray();
    
    /**
     * Gets ith "ellipsoidID" element
     */
    net.opengis.gml.IdentifierType getEllipsoidIDArray(int i);
    
    /**
     * Returns number of "ellipsoidID" element
     */
    int sizeOfEllipsoidIDArray();
    
    /**
     * Sets array of all "ellipsoidID" element
     */
    void setEllipsoidIDArray(net.opengis.gml.IdentifierType[] ellipsoidIDArray);
    
    /**
     * Sets ith "ellipsoidID" element
     */
    void setEllipsoidIDArray(int i, net.opengis.gml.IdentifierType ellipsoidID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ellipsoidID" element
     */
    net.opengis.gml.IdentifierType insertNewEllipsoidID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ellipsoidID" element
     */
    net.opengis.gml.IdentifierType addNewEllipsoidID();
    
    /**
     * Removes the ith "ellipsoidID" element
     */
    void removeEllipsoidID(int i);
    
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
     * Gets the "semiMajorAxis" element
     */
    net.opengis.gml.MeasureType getSemiMajorAxis();
    
    /**
     * Sets the "semiMajorAxis" element
     */
    void setSemiMajorAxis(net.opengis.gml.MeasureType semiMajorAxis);
    
    /**
     * Appends and returns a new empty "semiMajorAxis" element
     */
    net.opengis.gml.MeasureType addNewSemiMajorAxis();
    
    /**
     * Gets the "secondDefiningParameter" element
     */
    net.opengis.gml.SecondDefiningParameterType getSecondDefiningParameter();
    
    /**
     * Sets the "secondDefiningParameter" element
     */
    void setSecondDefiningParameter(net.opengis.gml.SecondDefiningParameterType secondDefiningParameter);
    
    /**
     * Appends and returns a new empty "secondDefiningParameter" element
     */
    net.opengis.gml.SecondDefiningParameterType addNewSecondDefiningParameter();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.EllipsoidType newInstance() {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.EllipsoidType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.EllipsoidType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.EllipsoidType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.EllipsoidType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.EllipsoidType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.EllipsoidType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.EllipsoidType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.EllipsoidType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.EllipsoidType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.EllipsoidType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.EllipsoidType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.EllipsoidType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.EllipsoidType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.EllipsoidType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.EllipsoidType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.EllipsoidType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.EllipsoidType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.EllipsoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
