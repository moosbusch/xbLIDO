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
 * An XML CurveInterpolationType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.CurveInterpolationType.
 */
public interface CurveInterpolationType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurveInterpolationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("curveinterpolationtypee72ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum LINEAR = Enum.forString("linear");
    static final Enum GEODESIC = Enum.forString("geodesic");
    static final Enum CIRCULAR_ARC_3_POINTS = Enum.forString("circularArc3Points");
    static final Enum CIRCULAR_ARC_2_POINT_WITH_BULGE = Enum.forString("circularArc2PointWithBulge");
    static final Enum CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS = Enum.forString("circularArcCenterPointWithRadius");
    static final Enum ELLIPTICAL = Enum.forString("elliptical");
    static final Enum CLOTHOID = Enum.forString("clothoid");
    static final Enum CONIC = Enum.forString("conic");
    static final Enum POLYNOMIAL_SPLINE = Enum.forString("polynomialSpline");
    static final Enum CUBIC_SPLINE = Enum.forString("cubicSpline");
    static final Enum RATIONAL_SPLINE = Enum.forString("rationalSpline");
    
    static final int INT_LINEAR = Enum.INT_LINEAR;
    static final int INT_GEODESIC = Enum.INT_GEODESIC;
    static final int INT_CIRCULAR_ARC_3_POINTS = Enum.INT_CIRCULAR_ARC_3_POINTS;
    static final int INT_CIRCULAR_ARC_2_POINT_WITH_BULGE = Enum.INT_CIRCULAR_ARC_2_POINT_WITH_BULGE;
    static final int INT_CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS = Enum.INT_CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS;
    static final int INT_ELLIPTICAL = Enum.INT_ELLIPTICAL;
    static final int INT_CLOTHOID = Enum.INT_CLOTHOID;
    static final int INT_CONIC = Enum.INT_CONIC;
    static final int INT_POLYNOMIAL_SPLINE = Enum.INT_POLYNOMIAL_SPLINE;
    static final int INT_CUBIC_SPLINE = Enum.INT_CUBIC_SPLINE;
    static final int INT_RATIONAL_SPLINE = Enum.INT_RATIONAL_SPLINE;
    
    /**
     * Enumeration value class for net.opengis.gml.CurveInterpolationType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_LINEAR
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_LINEAR = 1;
        static final int INT_GEODESIC = 2;
        static final int INT_CIRCULAR_ARC_3_POINTS = 3;
        static final int INT_CIRCULAR_ARC_2_POINT_WITH_BULGE = 4;
        static final int INT_CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS = 5;
        static final int INT_ELLIPTICAL = 6;
        static final int INT_CLOTHOID = 7;
        static final int INT_CONIC = 8;
        static final int INT_POLYNOMIAL_SPLINE = 9;
        static final int INT_CUBIC_SPLINE = 10;
        static final int INT_RATIONAL_SPLINE = 11;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("linear", INT_LINEAR),
                new Enum("geodesic", INT_GEODESIC),
                new Enum("circularArc3Points", INT_CIRCULAR_ARC_3_POINTS),
                new Enum("circularArc2PointWithBulge", INT_CIRCULAR_ARC_2_POINT_WITH_BULGE),
                new Enum("circularArcCenterPointWithRadius", INT_CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS),
                new Enum("elliptical", INT_ELLIPTICAL),
                new Enum("clothoid", INT_CLOTHOID),
                new Enum("conic", INT_CONIC),
                new Enum("polynomialSpline", INT_POLYNOMIAL_SPLINE),
                new Enum("cubicSpline", INT_CUBIC_SPLINE),
                new Enum("rationalSpline", INT_RATIONAL_SPLINE),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.CurveInterpolationType newValue(java.lang.Object obj) {
          return (net.opengis.gml.CurveInterpolationType) type.newValue( obj ); }
        
        public static net.opengis.gml.CurveInterpolationType newInstance() {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.CurveInterpolationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.CurveInterpolationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.CurveInterpolationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.CurveInterpolationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.CurveInterpolationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.CurveInterpolationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.CurveInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
