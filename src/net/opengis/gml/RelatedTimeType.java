/*
 * XML Type:  RelatedTimeType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RelatedTimeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML RelatedTimeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface RelatedTimeType extends net.opengis.gml.TimePrimitivePropertyType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedTimeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("relatedtimetype9cdbtype");
    
    /**
     * Gets the "relativePosition" attribute
     */
    net.opengis.gml.RelatedTimeType.RelativePosition.Enum getRelativePosition();
    
    /**
     * Gets (as xml) the "relativePosition" attribute
     */
    net.opengis.gml.RelatedTimeType.RelativePosition xgetRelativePosition();
    
    /**
     * True if has "relativePosition" attribute
     */
    boolean isSetRelativePosition();
    
    /**
     * Sets the "relativePosition" attribute
     */
    void setRelativePosition(net.opengis.gml.RelatedTimeType.RelativePosition.Enum relativePosition);
    
    /**
     * Sets (as xml) the "relativePosition" attribute
     */
    void xsetRelativePosition(net.opengis.gml.RelatedTimeType.RelativePosition relativePosition);
    
    /**
     * Unsets the "relativePosition" attribute
     */
    void unsetRelativePosition();
    
    /**
     * An XML relativePosition(@).
     *
     * This is an atomic type that is a restriction of net.opengis.gml.RelatedTimeType$RelativePosition.
     */
    public interface RelativePosition extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelativePosition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("relativepositionb2c6attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum BEFORE = Enum.forString("Before");
        static final Enum AFTER = Enum.forString("After");
        static final Enum BEGINS = Enum.forString("Begins");
        static final Enum ENDS = Enum.forString("Ends");
        static final Enum DURING = Enum.forString("During");
        static final Enum EQUALS = Enum.forString("Equals");
        static final Enum CONTAINS = Enum.forString("Contains");
        static final Enum OVERLAPS = Enum.forString("Overlaps");
        static final Enum MEETS = Enum.forString("Meets");
        static final Enum OVERLAPPED_BY = Enum.forString("OverlappedBy");
        static final Enum MET_BY = Enum.forString("MetBy");
        static final Enum BEGUN_BY = Enum.forString("BegunBy");
        static final Enum ENDED_BY = Enum.forString("EndedBy");
        
        static final int INT_BEFORE = Enum.INT_BEFORE;
        static final int INT_AFTER = Enum.INT_AFTER;
        static final int INT_BEGINS = Enum.INT_BEGINS;
        static final int INT_ENDS = Enum.INT_ENDS;
        static final int INT_DURING = Enum.INT_DURING;
        static final int INT_EQUALS = Enum.INT_EQUALS;
        static final int INT_CONTAINS = Enum.INT_CONTAINS;
        static final int INT_OVERLAPS = Enum.INT_OVERLAPS;
        static final int INT_MEETS = Enum.INT_MEETS;
        static final int INT_OVERLAPPED_BY = Enum.INT_OVERLAPPED_BY;
        static final int INT_MET_BY = Enum.INT_MET_BY;
        static final int INT_BEGUN_BY = Enum.INT_BEGUN_BY;
        static final int INT_ENDED_BY = Enum.INT_ENDED_BY;
        
        /**
         * Enumeration value class for net.opengis.gml.RelatedTimeType$RelativePosition.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_BEFORE
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
            
            static final int INT_BEFORE = 1;
            static final int INT_AFTER = 2;
            static final int INT_BEGINS = 3;
            static final int INT_ENDS = 4;
            static final int INT_DURING = 5;
            static final int INT_EQUALS = 6;
            static final int INT_CONTAINS = 7;
            static final int INT_OVERLAPS = 8;
            static final int INT_MEETS = 9;
            static final int INT_OVERLAPPED_BY = 10;
            static final int INT_MET_BY = 11;
            static final int INT_BEGUN_BY = 12;
            static final int INT_ENDED_BY = 13;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Before", INT_BEFORE),
                    new Enum("After", INT_AFTER),
                    new Enum("Begins", INT_BEGINS),
                    new Enum("Ends", INT_ENDS),
                    new Enum("During", INT_DURING),
                    new Enum("Equals", INT_EQUALS),
                    new Enum("Contains", INT_CONTAINS),
                    new Enum("Overlaps", INT_OVERLAPS),
                    new Enum("Meets", INT_MEETS),
                    new Enum("OverlappedBy", INT_OVERLAPPED_BY),
                    new Enum("MetBy", INT_MET_BY),
                    new Enum("BegunBy", INT_BEGUN_BY),
                    new Enum("EndedBy", INT_ENDED_BY),
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
            public static net.opengis.gml.RelatedTimeType.RelativePosition newValue(java.lang.Object obj) {
              return (net.opengis.gml.RelatedTimeType.RelativePosition) type.newValue( obj ); }
            
            public static net.opengis.gml.RelatedTimeType.RelativePosition newInstance() {
              return (net.opengis.gml.RelatedTimeType.RelativePosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.gml.RelatedTimeType.RelativePosition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.gml.RelatedTimeType.RelativePosition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.RelatedTimeType newInstance() {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.RelatedTimeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.RelatedTimeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.RelatedTimeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.RelatedTimeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.RelatedTimeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.RelatedTimeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.RelatedTimeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.RelatedTimeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.RelatedTimeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.RelatedTimeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.RelatedTimeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.RelatedTimeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.RelatedTimeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.RelatedTimeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.RelatedTimeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.RelatedTimeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.RelatedTimeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.RelatedTimeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
