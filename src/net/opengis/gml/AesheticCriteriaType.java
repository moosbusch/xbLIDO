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
 * An XML AesheticCriteriaType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.AesheticCriteriaType.
 */
public interface AesheticCriteriaType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AesheticCriteriaType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("aesheticcriteriatypecbe0type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum MIN_CROSSINGS = Enum.forString("MIN_CROSSINGS");
    static final Enum MIN_AREA = Enum.forString("MIN_AREA");
    static final Enum MIN_BENDS = Enum.forString("MIN_BENDS");
    static final Enum MAX_BENDS = Enum.forString("MAX_BENDS");
    static final Enum UNIFORM_BENDS = Enum.forString("UNIFORM_BENDS");
    static final Enum MIN_SLOPES = Enum.forString("MIN_SLOPES");
    static final Enum MIN_EDGE_LENGTH = Enum.forString("MIN_EDGE_LENGTH");
    static final Enum MAX_EDGE_LENGTH = Enum.forString("MAX_EDGE_LENGTH");
    static final Enum UNIFORM_EDGE_LENGTH = Enum.forString("UNIFORM_EDGE_LENGTH");
    static final Enum MAX_ANGULAR_RESOLUTION = Enum.forString("MAX_ANGULAR_RESOLUTION");
    static final Enum MIN_ASPECT_RATIO = Enum.forString("MIN_ASPECT_RATIO");
    static final Enum MAX_SYMMETRIES = Enum.forString("MAX_SYMMETRIES");
    
    static final int INT_MIN_CROSSINGS = Enum.INT_MIN_CROSSINGS;
    static final int INT_MIN_AREA = Enum.INT_MIN_AREA;
    static final int INT_MIN_BENDS = Enum.INT_MIN_BENDS;
    static final int INT_MAX_BENDS = Enum.INT_MAX_BENDS;
    static final int INT_UNIFORM_BENDS = Enum.INT_UNIFORM_BENDS;
    static final int INT_MIN_SLOPES = Enum.INT_MIN_SLOPES;
    static final int INT_MIN_EDGE_LENGTH = Enum.INT_MIN_EDGE_LENGTH;
    static final int INT_MAX_EDGE_LENGTH = Enum.INT_MAX_EDGE_LENGTH;
    static final int INT_UNIFORM_EDGE_LENGTH = Enum.INT_UNIFORM_EDGE_LENGTH;
    static final int INT_MAX_ANGULAR_RESOLUTION = Enum.INT_MAX_ANGULAR_RESOLUTION;
    static final int INT_MIN_ASPECT_RATIO = Enum.INT_MIN_ASPECT_RATIO;
    static final int INT_MAX_SYMMETRIES = Enum.INT_MAX_SYMMETRIES;
    
    /**
     * Enumeration value class for net.opengis.gml.AesheticCriteriaType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_MIN_CROSSINGS
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
        
        static final int INT_MIN_CROSSINGS = 1;
        static final int INT_MIN_AREA = 2;
        static final int INT_MIN_BENDS = 3;
        static final int INT_MAX_BENDS = 4;
        static final int INT_UNIFORM_BENDS = 5;
        static final int INT_MIN_SLOPES = 6;
        static final int INT_MIN_EDGE_LENGTH = 7;
        static final int INT_MAX_EDGE_LENGTH = 8;
        static final int INT_UNIFORM_EDGE_LENGTH = 9;
        static final int INT_MAX_ANGULAR_RESOLUTION = 10;
        static final int INT_MIN_ASPECT_RATIO = 11;
        static final int INT_MAX_SYMMETRIES = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("MIN_CROSSINGS", INT_MIN_CROSSINGS),
                new Enum("MIN_AREA", INT_MIN_AREA),
                new Enum("MIN_BENDS", INT_MIN_BENDS),
                new Enum("MAX_BENDS", INT_MAX_BENDS),
                new Enum("UNIFORM_BENDS", INT_UNIFORM_BENDS),
                new Enum("MIN_SLOPES", INT_MIN_SLOPES),
                new Enum("MIN_EDGE_LENGTH", INT_MIN_EDGE_LENGTH),
                new Enum("MAX_EDGE_LENGTH", INT_MAX_EDGE_LENGTH),
                new Enum("UNIFORM_EDGE_LENGTH", INT_UNIFORM_EDGE_LENGTH),
                new Enum("MAX_ANGULAR_RESOLUTION", INT_MAX_ANGULAR_RESOLUTION),
                new Enum("MIN_ASPECT_RATIO", INT_MIN_ASPECT_RATIO),
                new Enum("MAX_SYMMETRIES", INT_MAX_SYMMETRIES),
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
        public static net.opengis.gml.AesheticCriteriaType newValue(java.lang.Object obj) {
          return (net.opengis.gml.AesheticCriteriaType) type.newValue( obj ); }
        
        public static net.opengis.gml.AesheticCriteriaType newInstance() {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.AesheticCriteriaType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.AesheticCriteriaType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.AesheticCriteriaType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.AesheticCriteriaType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AesheticCriteriaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AesheticCriteriaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AesheticCriteriaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
