/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.opengis.gml;


/**
 * An XML TinType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface TinType extends net.opengis.gml.TriangulatedSurfaceType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TinType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("tintype6abatype");

    /**
     * Gets a List of "stopLines" elements
     */
    java.util.List<net.opengis.gml.LineStringSegmentArrayPropertyType> getStopLinesList();

    /**
     * Gets array of all "stopLines" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.LineStringSegmentArrayPropertyType[] getStopLinesArray();

    /**
     * Gets ith "stopLines" element
     */
    net.opengis.gml.LineStringSegmentArrayPropertyType getStopLinesArray(int i);

    /**
     * Returns number of "stopLines" element
     */
    int sizeOfStopLinesArray();

    /**
     * Sets array of all "stopLines" element
     */
    void setStopLinesArray(net.opengis.gml.LineStringSegmentArrayPropertyType[] stopLinesArray);

    /**
     * Sets ith "stopLines" element
     */
    void setStopLinesArray(int i, net.opengis.gml.LineStringSegmentArrayPropertyType stopLines);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "stopLines" element
     */
    net.opengis.gml.LineStringSegmentArrayPropertyType insertNewStopLines(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "stopLines" element
     */
    net.opengis.gml.LineStringSegmentArrayPropertyType addNewStopLines();

    /**
     * Removes the ith "stopLines" element
     */
    void removeStopLines(int i);

    /**
     * Gets a List of "breakLines" elements
     */
    java.util.List<net.opengis.gml.LineStringSegmentArrayPropertyType> getBreakLinesList();

    /**
     * Gets array of all "breakLines" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.LineStringSegmentArrayPropertyType[] getBreakLinesArray();

    /**
     * Gets ith "breakLines" element
     */
    net.opengis.gml.LineStringSegmentArrayPropertyType getBreakLinesArray(int i);

    /**
     * Returns number of "breakLines" element
     */
    int sizeOfBreakLinesArray();

    /**
     * Sets array of all "breakLines" element
     */
    void setBreakLinesArray(net.opengis.gml.LineStringSegmentArrayPropertyType[] breakLinesArray);

    /**
     * Sets ith "breakLines" element
     */
    void setBreakLinesArray(int i, net.opengis.gml.LineStringSegmentArrayPropertyType breakLines);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "breakLines" element
     */
    net.opengis.gml.LineStringSegmentArrayPropertyType insertNewBreakLines(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "breakLines" element
     */
    net.opengis.gml.LineStringSegmentArrayPropertyType addNewBreakLines();

    /**
     * Removes the ith "breakLines" element
     */
    void removeBreakLines(int i);

    /**
     * Gets the "maxLength" element
     */
    net.opengis.gml.LengthType getMaxLength();

    /**
     * Sets the "maxLength" element
     */
    void setMaxLength(net.opengis.gml.LengthType maxLength);

    /**
     * Appends and returns a new empty "maxLength" element
     */
    net.opengis.gml.LengthType addNewMaxLength();

    /**
     * Gets the "controlPoint" element
     */
    net.opengis.gml.TinType.ControlPoint getControlPoint();

    /**
     * Sets the "controlPoint" element
     */
    void setControlPoint(net.opengis.gml.TinType.ControlPoint controlPoint);

    /**
     * Appends and returns a new empty "controlPoint" element
     */
    net.opengis.gml.TinType.ControlPoint addNewControlPoint();

    /**
     * An XML controlPoint(@http://www.opengis.net/gml).
     *
     * This is a complex type.
     */
    public interface ControlPoint extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ControlPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("controlpoint194belemtype");

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
         * A factory class with static methods for creating instances
         * of this type.
         */

        public static final class Factory
        {
            public static net.opengis.gml.TinType.ControlPoint newInstance() {
              return (net.opengis.gml.TinType.ControlPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

            public static net.opengis.gml.TinType.ControlPoint newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.gml.TinType.ControlPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

            private Factory() { } // No instance of this class allowed
        }
    }

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static net.opengis.gml.TinType newInstance() {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static net.opengis.gml.TinType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.TinType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static net.opengis.gml.TinType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }

        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.TinType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }

        public static net.opengis.gml.TinType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }

        public static net.opengis.gml.TinType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }

        public static net.opengis.gml.TinType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }

        public static net.opengis.gml.TinType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }

        public static net.opengis.gml.TinType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }

        public static net.opengis.gml.TinType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }

        public static net.opengis.gml.TinType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }

        public static net.opengis.gml.TinType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }

        public static net.opengis.gml.TinType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }

        public static net.opengis.gml.TinType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }

        public static net.opengis.gml.TinType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }

        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TinType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }

        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TinType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }

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
