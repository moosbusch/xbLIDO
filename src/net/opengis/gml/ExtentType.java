/*
 * XML Type:  ExtentType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ExtentType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML ExtentType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface ExtentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("extenttype30d7type");
    
    /**
     * Gets the "description" element
     */
    net.opengis.gml.StringOrRefType getDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(net.opengis.gml.StringOrRefType description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    net.opengis.gml.StringOrRefType addNewDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets a List of "boundingBox" elements
     */
    java.util.List<net.opengis.gml.EnvelopeType> getBoundingBoxList();
    
    /**
     * Gets array of all "boundingBox" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.EnvelopeType[] getBoundingBoxArray();
    
    /**
     * Gets ith "boundingBox" element
     */
    net.opengis.gml.EnvelopeType getBoundingBoxArray(int i);
    
    /**
     * Returns number of "boundingBox" element
     */
    int sizeOfBoundingBoxArray();
    
    /**
     * Sets array of all "boundingBox" element
     */
    void setBoundingBoxArray(net.opengis.gml.EnvelopeType[] boundingBoxArray);
    
    /**
     * Sets ith "boundingBox" element
     */
    void setBoundingBoxArray(int i, net.opengis.gml.EnvelopeType boundingBox);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boundingBox" element
     */
    net.opengis.gml.EnvelopeType insertNewBoundingBox(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boundingBox" element
     */
    net.opengis.gml.EnvelopeType addNewBoundingBox();
    
    /**
     * Removes the ith "boundingBox" element
     */
    void removeBoundingBox(int i);
    
    /**
     * Gets a List of "boundingPolygon" elements
     */
    java.util.List<net.opengis.gml.PolygonType> getBoundingPolygonList();
    
    /**
     * Gets array of all "boundingPolygon" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.PolygonType[] getBoundingPolygonArray();
    
    /**
     * Gets ith "boundingPolygon" element
     */
    net.opengis.gml.PolygonType getBoundingPolygonArray(int i);
    
    /**
     * Returns number of "boundingPolygon" element
     */
    int sizeOfBoundingPolygonArray();
    
    /**
     * Sets array of all "boundingPolygon" element
     */
    void setBoundingPolygonArray(net.opengis.gml.PolygonType[] boundingPolygonArray);
    
    /**
     * Sets ith "boundingPolygon" element
     */
    void setBoundingPolygonArray(int i, net.opengis.gml.PolygonType boundingPolygon);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boundingPolygon" element
     */
    net.opengis.gml.PolygonType insertNewBoundingPolygon(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boundingPolygon" element
     */
    net.opengis.gml.PolygonType addNewBoundingPolygon();
    
    /**
     * Removes the ith "boundingPolygon" element
     */
    void removeBoundingPolygon(int i);
    
    /**
     * Gets a List of "verticalExtent" elements
     */
    java.util.List<net.opengis.gml.EnvelopeType> getVerticalExtentList();
    
    /**
     * Gets array of all "verticalExtent" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.EnvelopeType[] getVerticalExtentArray();
    
    /**
     * Gets ith "verticalExtent" element
     */
    net.opengis.gml.EnvelopeType getVerticalExtentArray(int i);
    
    /**
     * Returns number of "verticalExtent" element
     */
    int sizeOfVerticalExtentArray();
    
    /**
     * Sets array of all "verticalExtent" element
     */
    void setVerticalExtentArray(net.opengis.gml.EnvelopeType[] verticalExtentArray);
    
    /**
     * Sets ith "verticalExtent" element
     */
    void setVerticalExtentArray(int i, net.opengis.gml.EnvelopeType verticalExtent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verticalExtent" element
     */
    net.opengis.gml.EnvelopeType insertNewVerticalExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verticalExtent" element
     */
    net.opengis.gml.EnvelopeType addNewVerticalExtent();
    
    /**
     * Removes the ith "verticalExtent" element
     */
    void removeVerticalExtent(int i);
    
    /**
     * Gets a List of "temporalExtent" elements
     */
    java.util.List<net.opengis.gml.TimePeriodType> getTemporalExtentList();
    
    /**
     * Gets array of all "temporalExtent" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.TimePeriodType[] getTemporalExtentArray();
    
    /**
     * Gets ith "temporalExtent" element
     */
    net.opengis.gml.TimePeriodType getTemporalExtentArray(int i);
    
    /**
     * Returns number of "temporalExtent" element
     */
    int sizeOfTemporalExtentArray();
    
    /**
     * Sets array of all "temporalExtent" element
     */
    void setTemporalExtentArray(net.opengis.gml.TimePeriodType[] temporalExtentArray);
    
    /**
     * Sets ith "temporalExtent" element
     */
    void setTemporalExtentArray(int i, net.opengis.gml.TimePeriodType temporalExtent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "temporalExtent" element
     */
    net.opengis.gml.TimePeriodType insertNewTemporalExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "temporalExtent" element
     */
    net.opengis.gml.TimePeriodType addNewTemporalExtent();
    
    /**
     * Removes the ith "temporalExtent" element
     */
    void removeTemporalExtent(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.ExtentType newInstance() {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.ExtentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.ExtentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.ExtentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.ExtentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.ExtentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.ExtentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.ExtentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.ExtentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.ExtentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.ExtentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.ExtentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.ExtentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.ExtentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.ExtentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.ExtentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ExtentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ExtentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
