/*
 * XML Type:  EnvelopeWithTimePeriodType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EnvelopeWithTimePeriodType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML EnvelopeWithTimePeriodType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface EnvelopeWithTimePeriodType extends net.opengis.gml.EnvelopeType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvelopeWithTimePeriodType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("envelopewithtimeperiodtype5a7dtype");

    /**
     * Gets a List of "timePosition" elements
     */
    java.util.List<net.opengis.gml.TimePositionType> getTimePosList();

    /**
     * Gets array of all "timePosition" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.TimePositionType[] getTimePositionArray();

    /**
     * Gets ith "timePosition" element
     */
    net.opengis.gml.TimePositionType getTimePositionArray(int i);

    /**
     * Returns number of "timePosition" element
     */
    int sizeOfTimePositionArray();

    /**
     * Sets array of all "timePosition" element
     */
    void setTimePositionArray(net.opengis.gml.TimePositionType[] timePositionArray);

    /**
     * Sets ith "timePosition" element
     */
    void setTimePositionArray(int i, net.opengis.gml.TimePositionType timePosition);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "timePosition" element
     */
    net.opengis.gml.TimePositionType insertNewTimePosition(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "timePosition" element
     */
    net.opengis.gml.TimePositionType addNewTimePosition();

    /**
     * Removes the ith "timePosition" element
     */
    void removeTimePosition(int i);

    /**
     * Gets the "frame" attribute
     */
    java.lang.String getFrame();

    /**
     * Gets (as xml) the "frame" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetFrame();

    /**
     * True if has "frame" attribute
     */
    boolean isSetFrame();

    /**
     * Sets the "frame" attribute
     */
    void setFrame(java.lang.String frame);

    /**
     * Sets (as xml) the "frame" attribute
     */
    void xsetFrame(org.apache.xmlbeans.XmlAnyURI frame);

    /**
     * Unsets the "frame" attribute
     */
    void unsetFrame();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static net.opengis.gml.EnvelopeWithTimePeriodType newInstance() {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }

        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }

        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }

        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }

        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.EnvelopeWithTimePeriodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.EnvelopeWithTimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }

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
