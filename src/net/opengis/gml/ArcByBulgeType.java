/*
 * XML Type:  ArcByBulgeType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ArcByBulgeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML ArcByBulgeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface ArcByBulgeType extends net.opengis.gml.ArcStringByBulgeType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArcByBulgeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("arcbybulgetype37b3type");

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
     * Gets a List of "pointRep" elements
     */
    java.util.List<net.opengis.gml.PointPropertyType> getPointRepList();

    /**
     * Gets array of all "pointRep" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.PointPropertyType[] getPointRepArray();

    /**
     * Gets ith "pointRep" element
     */
    net.opengis.gml.PointPropertyType getPointRepArray(int i);

    /**
     * Returns number of "pointRep" element
     */
    int sizeOfPointRepArray();

    /**
     * Sets array of all "pointRep" element
     */
    void setPointRepArray(net.opengis.gml.PointPropertyType[] pointRepArray);

    /**
     * Sets ith "pointRep" element
     */
    void setPointRepArray(int i, net.opengis.gml.PointPropertyType pointRep);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointRep" element
     */
    net.opengis.gml.PointPropertyType insertNewPointRep(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "pointRep" element
     */
    net.opengis.gml.PointPropertyType addNewPointRep();

    /**
     * Removes the ith "pointRep" element
     */
    void removePointRep(int i);

    /**
     * Gets a List of "bulge" elements
     */
    java.util.List<java.lang.Double> getBulgeList();

    /**
     * Gets array of all "bulge" elements
     * @deprecated
     */
    @Deprecated
    double[] getBulgeArray();

    /**
     * Gets ith "bulge" element
     */
    double getBulgeArray(int i);

    /**
     * Gets (as xml) a List of "bulge" elements
     */
    java.util.List<org.apache.xmlbeans.XmlDouble> xgetBulgeList();

    /**
     * Gets (as xml) array of all "bulge" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlDouble[] xgetBulgeArray();

    /**
     * Gets (as xml) ith "bulge" element
     */
    org.apache.xmlbeans.XmlDouble xgetBulgeArray(int i);

    /**
     * Returns number of "bulge" element
     */
    int sizeOfBulgeArray();

    /**
     * Sets array of all "bulge" element
     */
    void setBulgeArray(double[] bulgeArray);

    /**
     * Sets ith "bulge" element
     */
    void setBulgeArray(int i, double bulge);

    /**
     * Sets (as xml) array of all "bulge" element
     */
    void xsetBulgeArray(org.apache.xmlbeans.XmlDouble[] bulgeArray);

    /**
     * Sets (as xml) ith "bulge" element
     */
    void xsetBulgeArray(int i, org.apache.xmlbeans.XmlDouble bulge);

    /**
     * Inserts the value as the ith "bulge" element
     */
    void insertBulge(int i, double bulge);

    /**
     * Appends the value as the last "bulge" element
     */
    void addBulge(double bulge);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "bulge" element
     */
    org.apache.xmlbeans.XmlDouble insertNewBulge(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "bulge" element
     */
    org.apache.xmlbeans.XmlDouble addNewBulge();

    /**
     * Removes the ith "bulge" element
     */
    void removeBulge(int i);

    /**
     * Gets a List of "normal" elements
     */
    java.util.List<net.opengis.gml.VectorType> getNormalList();

    /**
     * Gets array of all "normal" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.VectorType[] getNormalArray();

    /**
     * Gets ith "normal" element
     */
    net.opengis.gml.VectorType getNormalArray(int i);

    /**
     * Returns number of "normal" element
     */
    int sizeOfNormalArray();

    /**
     * Sets array of all "normal" element
     */
    void setNormalArray(net.opengis.gml.VectorType[] normalArray);

    /**
     * Sets ith "normal" element
     */
    void setNormalArray(int i, net.opengis.gml.VectorType normal);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "normal" element
     */
    net.opengis.gml.VectorType insertNewNormal(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "normal" element
     */
    net.opengis.gml.VectorType addNewNormal();

    /**
     * Removes the ith "normal" element
     */
    void removeNormal(int i);

    /**
     * Gets the "numArc" attribute
     */
    java.math.BigInteger getNumArc();

    /**
     * Gets (as xml) the "numArc" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetNumArc();

    /**
     * True if has "numArc" attribute
     */
    boolean isSetNumArc();

    /**
     * Sets the "numArc" attribute
     */
    void setNumArc(java.math.BigInteger numArc);

    /**
     * Sets (as xml) the "numArc" attribute
     */
    void xsetNumArc(org.apache.xmlbeans.XmlInteger numArc);

    /**
     * Unsets the "numArc" attribute
     */
    void unsetNumArc();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static net.opengis.gml.ArcByBulgeType newInstance() {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static net.opengis.gml.ArcByBulgeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.ArcByBulgeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static net.opengis.gml.ArcByBulgeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }

        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.ArcByBulgeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }

        public static net.opengis.gml.ArcByBulgeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }

        public static net.opengis.gml.ArcByBulgeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }

        public static net.opengis.gml.ArcByBulgeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }

        public static net.opengis.gml.ArcByBulgeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }

        public static net.opengis.gml.ArcByBulgeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }

        public static net.opengis.gml.ArcByBulgeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }

        public static net.opengis.gml.ArcByBulgeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }

        public static net.opengis.gml.ArcByBulgeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }

        public static net.opengis.gml.ArcByBulgeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }

        public static net.opengis.gml.ArcByBulgeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }

        public static net.opengis.gml.ArcByBulgeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }

        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ArcByBulgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }

        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ArcByBulgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ArcByBulgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }

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
