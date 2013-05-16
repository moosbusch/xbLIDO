/*
 * XML Type:  GeodesicStringType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeodesicStringType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML GeodesicStringType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface GeodesicStringType extends net.opengis.gml.AbstractCurveSegmentType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeodesicStringType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("geodesicstringtype7cd5type");

    /**
     * Gets the "posList" element
     */
    net.opengis.gml.DirectPositionListType getPosList();

    /**
     * True if has "posList" element
     */
    boolean isSetPosList();

    /**
     * Sets the "posList" element
     */
    void setPosList(net.opengis.gml.DirectPositionListType posList);

    /**
     * Appends and returns a new empty "posList" element
     */
    net.opengis.gml.DirectPositionListType addNewPosList();

    /**
     * Unsets the "posList" element
     */
    void unsetPosList();

    /**
     * Gets a List of "pos" elements
     */
    java.util.List<net.opengis.gml.DirectPositionType> getPositionList();

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
     * Gets a List of "pointProperty" elements
     */
    java.util.List<net.opengis.gml.PointPropertyType> getPointPropertyList();

    /**
     * Gets array of all "pointProperty" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.PointPropertyType[] getPointPropertyArray();

    /**
     * Gets ith "pointProperty" element
     */
    net.opengis.gml.PointPropertyType getPointPropertyArray(int i);

    /**
     * Returns number of "pointProperty" element
     */
    int sizeOfPointPropertyArray();

    /**
     * Sets array of all "pointProperty" element
     */
    void setPointPropertyArray(net.opengis.gml.PointPropertyType[] pointPropertyArray);

    /**
     * Sets ith "pointProperty" element
     */
    void setPointPropertyArray(int i, net.opengis.gml.PointPropertyType pointProperty);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointProperty" element
     */
    net.opengis.gml.PointPropertyType insertNewPointProperty(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "pointProperty" element
     */
    net.opengis.gml.PointPropertyType addNewPointProperty();

    /**
     * Removes the ith "pointProperty" element
     */
    void removePointProperty(int i);

    /**
     * Gets the "interpolation" attribute
     */
    net.opengis.gml.CurveInterpolationType.Enum getInterpolation();

    /**
     * Gets (as xml) the "interpolation" attribute
     */
    net.opengis.gml.CurveInterpolationType xgetInterpolation();

    /**
     * True if has "interpolation" attribute
     */
    boolean isSetInterpolation();

    /**
     * Sets the "interpolation" attribute
     */
    void setInterpolation(net.opengis.gml.CurveInterpolationType.Enum interpolation);

    /**
     * Sets (as xml) the "interpolation" attribute
     */
    void xsetInterpolation(net.opengis.gml.CurveInterpolationType interpolation);

    /**
     * Unsets the "interpolation" attribute
     */
    void unsetInterpolation();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static net.opengis.gml.GeodesicStringType newInstance() {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static net.opengis.gml.GeodesicStringType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.GeodesicStringType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static net.opengis.gml.GeodesicStringType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }

        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.GeodesicStringType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }

        public static net.opengis.gml.GeodesicStringType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }

        public static net.opengis.gml.GeodesicStringType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }

        public static net.opengis.gml.GeodesicStringType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }

        public static net.opengis.gml.GeodesicStringType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }

        public static net.opengis.gml.GeodesicStringType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }

        public static net.opengis.gml.GeodesicStringType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }

        public static net.opengis.gml.GeodesicStringType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }

        public static net.opengis.gml.GeodesicStringType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }

        public static net.opengis.gml.GeodesicStringType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }

        public static net.opengis.gml.GeodesicStringType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }

        public static net.opengis.gml.GeodesicStringType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }

        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.GeodesicStringType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }

        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.GeodesicStringType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.GeodesicStringType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }

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
