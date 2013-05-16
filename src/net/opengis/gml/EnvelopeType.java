/*
 * XML Type:  EnvelopeType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EnvelopeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML EnvelopeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface EnvelopeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvelopeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("envelopetypee1b1type");
    
    /**
     * Gets the "lowerCorner" element
     */
    net.opengis.gml.DirectPositionType getLowerCorner();
    
    /**
     * True if has "lowerCorner" element
     */
    boolean isSetLowerCorner();
    
    /**
     * Sets the "lowerCorner" element
     */
    void setLowerCorner(net.opengis.gml.DirectPositionType lowerCorner);
    
    /**
     * Appends and returns a new empty "lowerCorner" element
     */
    net.opengis.gml.DirectPositionType addNewLowerCorner();
    
    /**
     * Unsets the "lowerCorner" element
     */
    void unsetLowerCorner();
    
    /**
     * Gets the "upperCorner" element
     */
    net.opengis.gml.DirectPositionType getUpperCorner();
    
    /**
     * True if has "upperCorner" element
     */
    boolean isSetUpperCorner();
    
    /**
     * Sets the "upperCorner" element
     */
    void setUpperCorner(net.opengis.gml.DirectPositionType upperCorner);
    
    /**
     * Appends and returns a new empty "upperCorner" element
     */
    net.opengis.gml.DirectPositionType addNewUpperCorner();
    
    /**
     * Unsets the "upperCorner" element
     */
    void unsetUpperCorner();
    
    /**
     * Gets a List of "coord" elements
     */
    java.util.List<net.opengis.gml.CoordType> getCoordList();
    
    /**
     * Gets array of all "coord" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CoordType[] getCoordArray();
    
    /**
     * Gets ith "coord" element
     */
    net.opengis.gml.CoordType getCoordArray(int i);
    
    /**
     * Returns number of "coord" element
     */
    int sizeOfCoordArray();
    
    /**
     * Sets array of all "coord" element
     */
    void setCoordArray(net.opengis.gml.CoordType[] coordArray);
    
    /**
     * Sets ith "coord" element
     */
    void setCoordArray(int i, net.opengis.gml.CoordType coord);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coord" element
     */
    net.opengis.gml.CoordType insertNewCoord(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coord" element
     */
    net.opengis.gml.CoordType addNewCoord();
    
    /**
     * Removes the ith "coord" element
     */
    void removeCoord(int i);
    
    /**
     * Gets a List of "pos" elements
     */
    java.util.List<net.opengis.gml.DirectPositionType> getPosList();
    
    /**
     * Gets array of all "pos" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.DirectPositionType[] getPosArray();
    
    /**
     * Gets ith "pos" element
     */
    net.opengis.gml.DirectPositionType getPosArray(int i);
    
    /**
     * Returns number of "pos" element
     */
    int sizeOfPosArray();
    
    /**
     * Sets array of all "pos" element
     */
    void setPosArray(net.opengis.gml.DirectPositionType[] posArray);
    
    /**
     * Sets ith "pos" element
     */
    void setPosArray(int i, net.opengis.gml.DirectPositionType pos);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pos" element
     */
    net.opengis.gml.DirectPositionType insertNewPos(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pos" element
     */
    net.opengis.gml.DirectPositionType addNewPos();
    
    /**
     * Removes the ith "pos" element
     */
    void removePos(int i);
    
    /**
     * Gets the "coordinates" element
     */
    net.opengis.gml.CoordinatesType getCoordinates();
    
    /**
     * True if has "coordinates" element
     */
    boolean isSetCoordinates();
    
    /**
     * Sets the "coordinates" element
     */
    void setCoordinates(net.opengis.gml.CoordinatesType coordinates);
    
    /**
     * Appends and returns a new empty "coordinates" element
     */
    net.opengis.gml.CoordinatesType addNewCoordinates();
    
    /**
     * Unsets the "coordinates" element
     */
    void unsetCoordinates();
    
    /**
     * Gets the "srsName" attribute
     */
    java.lang.String getSrsName();
    
    /**
     * Gets (as xml) the "srsName" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetSrsName();
    
    /**
     * True if has "srsName" attribute
     */
    boolean isSetSrsName();
    
    /**
     * Sets the "srsName" attribute
     */
    void setSrsName(java.lang.String srsName);
    
    /**
     * Sets (as xml) the "srsName" attribute
     */
    void xsetSrsName(org.apache.xmlbeans.XmlAnyURI srsName);
    
    /**
     * Unsets the "srsName" attribute
     */
    void unsetSrsName();
    
    /**
     * Gets the "srsDimension" attribute
     */
    java.math.BigInteger getSrsDimension();
    
    /**
     * Gets (as xml) the "srsDimension" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetSrsDimension();
    
    /**
     * True if has "srsDimension" attribute
     */
    boolean isSetSrsDimension();
    
    /**
     * Sets the "srsDimension" attribute
     */
    void setSrsDimension(java.math.BigInteger srsDimension);
    
    /**
     * Sets (as xml) the "srsDimension" attribute
     */
    void xsetSrsDimension(org.apache.xmlbeans.XmlPositiveInteger srsDimension);
    
    /**
     * Unsets the "srsDimension" attribute
     */
    void unsetSrsDimension();
    
    /**
     * Gets the "axisLabels" attribute
     */
    java.util.List getAxisLabels();
    
    /**
     * Gets (as xml) the "axisLabels" attribute
     */
    net.opengis.gml.NCNameList xgetAxisLabels();
    
    /**
     * True if has "axisLabels" attribute
     */
    boolean isSetAxisLabels();
    
    /**
     * Sets the "axisLabels" attribute
     */
    void setAxisLabels(java.util.List axisLabels);
    
    /**
     * Sets (as xml) the "axisLabels" attribute
     */
    void xsetAxisLabels(net.opengis.gml.NCNameList axisLabels);
    
    /**
     * Unsets the "axisLabels" attribute
     */
    void unsetAxisLabels();
    
    /**
     * Gets the "uomLabels" attribute
     */
    java.util.List getUomLabels();
    
    /**
     * Gets (as xml) the "uomLabels" attribute
     */
    net.opengis.gml.NCNameList xgetUomLabels();
    
    /**
     * True if has "uomLabels" attribute
     */
    boolean isSetUomLabels();
    
    /**
     * Sets the "uomLabels" attribute
     */
    void setUomLabels(java.util.List uomLabels);
    
    /**
     * Sets (as xml) the "uomLabels" attribute
     */
    void xsetUomLabels(net.opengis.gml.NCNameList uomLabels);
    
    /**
     * Unsets the "uomLabels" attribute
     */
    void unsetUomLabels();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.EnvelopeType newInstance() {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.EnvelopeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.EnvelopeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.EnvelopeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.EnvelopeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.EnvelopeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.EnvelopeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.EnvelopeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.EnvelopeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.EnvelopeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.EnvelopeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.EnvelopeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.EnvelopeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.EnvelopeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.EnvelopeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.EnvelopeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.EnvelopeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.EnvelopeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.EnvelopeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
