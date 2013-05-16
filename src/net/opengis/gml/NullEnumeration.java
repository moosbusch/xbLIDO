/*
 * XML Type:  NullEnumeration
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.NullEnumeration
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML NullEnumeration(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     net.opengis.gml.NullEnumeration$Member
 *     net.opengis.gml.NullEnumeration$Member2
 */
public interface NullEnumeration extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    @Deprecated
    java.lang.Object objectValue();
    /** @deprecated */
    @Deprecated
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NullEnumeration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("nullenumeration86cdtype");
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of net.opengis.gml.NullEnumeration$Member.
     */
    public interface Member extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Member.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("anona648type");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum INAPPLICABLE = Enum.forString("inapplicable");
        static final Enum MISSING = Enum.forString("missing");
        static final Enum TEMPLATE = Enum.forString("template");
        static final Enum UNKNOWN = Enum.forString("unknown");
        static final Enum WITHHELD = Enum.forString("withheld");
        
        static final int INT_INAPPLICABLE = Enum.INT_INAPPLICABLE;
        static final int INT_MISSING = Enum.INT_MISSING;
        static final int INT_TEMPLATE = Enum.INT_TEMPLATE;
        static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
        static final int INT_WITHHELD = Enum.INT_WITHHELD;
        
        /**
         * Enumeration value class for net.opengis.gml.NullEnumeration$Member.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_INAPPLICABLE
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
            
            static final int INT_INAPPLICABLE = 1;
            static final int INT_MISSING = 2;
            static final int INT_TEMPLATE = 3;
            static final int INT_UNKNOWN = 4;
            static final int INT_WITHHELD = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("inapplicable", INT_INAPPLICABLE),
                    new Enum("missing", INT_MISSING),
                    new Enum("template", INT_TEMPLATE),
                    new Enum("unknown", INT_UNKNOWN),
                    new Enum("withheld", INT_WITHHELD),
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
            public static net.opengis.gml.NullEnumeration.Member newValue(java.lang.Object obj) {
              return (net.opengis.gml.NullEnumeration.Member) type.newValue( obj ); }
            
            public static net.opengis.gml.NullEnumeration.Member newInstance() {
              return (net.opengis.gml.NullEnumeration.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.gml.NullEnumeration.Member newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.gml.NullEnumeration.Member) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of net.opengis.gml.NullEnumeration$Member2.
     */
    public interface Member2 extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Member2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("anon33e7type");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.opengis.gml.NullEnumeration.Member2 newValue(java.lang.Object obj) {
              return (net.opengis.gml.NullEnumeration.Member2) type.newValue( obj ); }
            
            public static net.opengis.gml.NullEnumeration.Member2 newInstance() {
              return (net.opengis.gml.NullEnumeration.Member2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.gml.NullEnumeration.Member2 newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.gml.NullEnumeration.Member2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.NullEnumeration newValue(java.lang.Object obj) {
          return (net.opengis.gml.NullEnumeration) type.newValue( obj ); }
        
        public static net.opengis.gml.NullEnumeration newInstance() {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.NullEnumeration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.NullEnumeration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.NullEnumeration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.NullEnumeration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.NullEnumeration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.NullEnumeration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.NullEnumeration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.NullEnumeration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.NullEnumeration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.NullEnumeration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.NullEnumeration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.NullEnumeration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.NullEnumeration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.NullEnumeration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.NullEnumeration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.NullEnumeration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.NullEnumeration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.NullEnumeration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
