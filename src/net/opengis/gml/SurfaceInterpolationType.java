/*
 * XML Type:  SurfaceInterpolationType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SurfaceInterpolationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML SurfaceInterpolationType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.SurfaceInterpolationType.
 */
public interface SurfaceInterpolationType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SurfaceInterpolationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("surfaceinterpolationtypee42atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum PLANAR = Enum.forString("planar");
    static final Enum SPHERICAL = Enum.forString("spherical");
    static final Enum ELLIPTICAL = Enum.forString("elliptical");
    static final Enum CONIC = Enum.forString("conic");
    static final Enum TIN = Enum.forString("tin");
    static final Enum PARAMETRIC_CURVE = Enum.forString("parametricCurve");
    static final Enum POLYNOMIAL_SPLINE = Enum.forString("polynomialSpline");
    static final Enum RATIONAL_SPLINE = Enum.forString("rationalSpline");
    static final Enum TRIANGULATED_SPLINE = Enum.forString("triangulatedSpline");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_PLANAR = Enum.INT_PLANAR;
    static final int INT_SPHERICAL = Enum.INT_SPHERICAL;
    static final int INT_ELLIPTICAL = Enum.INT_ELLIPTICAL;
    static final int INT_CONIC = Enum.INT_CONIC;
    static final int INT_TIN = Enum.INT_TIN;
    static final int INT_PARAMETRIC_CURVE = Enum.INT_PARAMETRIC_CURVE;
    static final int INT_POLYNOMIAL_SPLINE = Enum.INT_POLYNOMIAL_SPLINE;
    static final int INT_RATIONAL_SPLINE = Enum.INT_RATIONAL_SPLINE;
    static final int INT_TRIANGULATED_SPLINE = Enum.INT_TRIANGULATED_SPLINE;
    
    /**
     * Enumeration value class for net.opengis.gml.SurfaceInterpolationType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
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
        
        static final int INT_NONE = 1;
        static final int INT_PLANAR = 2;
        static final int INT_SPHERICAL = 3;
        static final int INT_ELLIPTICAL = 4;
        static final int INT_CONIC = 5;
        static final int INT_TIN = 6;
        static final int INT_PARAMETRIC_CURVE = 7;
        static final int INT_POLYNOMIAL_SPLINE = 8;
        static final int INT_RATIONAL_SPLINE = 9;
        static final int INT_TRIANGULATED_SPLINE = 10;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("planar", INT_PLANAR),
                new Enum("spherical", INT_SPHERICAL),
                new Enum("elliptical", INT_ELLIPTICAL),
                new Enum("conic", INT_CONIC),
                new Enum("tin", INT_TIN),
                new Enum("parametricCurve", INT_PARAMETRIC_CURVE),
                new Enum("polynomialSpline", INT_POLYNOMIAL_SPLINE),
                new Enum("rationalSpline", INT_RATIONAL_SPLINE),
                new Enum("triangulatedSpline", INT_TRIANGULATED_SPLINE),
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
        public static net.opengis.gml.SurfaceInterpolationType newValue(java.lang.Object obj) {
          return (net.opengis.gml.SurfaceInterpolationType) type.newValue( obj ); }
        
        public static net.opengis.gml.SurfaceInterpolationType newInstance() {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.SurfaceInterpolationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.SurfaceInterpolationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.SurfaceInterpolationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.SurfaceInterpolationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.SurfaceInterpolationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.SurfaceInterpolationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.SurfaceInterpolationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
