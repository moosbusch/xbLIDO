/*
 * XML Type:  animatePrototype
 * Namespace: http://www.w3.org/2001/SMIL20/
 * Java type: org.w3.x2001.smil20.AnimatePrototype
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.smil20;


/**
 * An XML animatePrototype(@http://www.w3.org/2001/SMIL20/).
 *
 * This is a complex type.
 */
public interface AnimatePrototype extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnimatePrototype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("animateprototype9ecetype");
    
    /**
     * Gets the "attributeName" attribute
     */
    java.lang.String getAttributeName();
    
    /**
     * Gets (as xml) the "attributeName" attribute
     */
    org.apache.xmlbeans.XmlString xgetAttributeName();
    
    /**
     * Sets the "attributeName" attribute
     */
    void setAttributeName(java.lang.String attributeName);
    
    /**
     * Sets (as xml) the "attributeName" attribute
     */
    void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName);
    
    /**
     * Gets the "attributeType" attribute
     */
    org.w3.x2001.smil20.AnimatePrototype.AttributeType.Enum getAttributeType();
    
    /**
     * Gets (as xml) the "attributeType" attribute
     */
    org.w3.x2001.smil20.AnimatePrototype.AttributeType xgetAttributeType();
    
    /**
     * True if has "attributeType" attribute
     */
    boolean isSetAttributeType();
    
    /**
     * Sets the "attributeType" attribute
     */
    void setAttributeType(org.w3.x2001.smil20.AnimatePrototype.AttributeType.Enum attributeType);
    
    /**
     * Sets (as xml) the "attributeType" attribute
     */
    void xsetAttributeType(org.w3.x2001.smil20.AnimatePrototype.AttributeType attributeType);
    
    /**
     * Unsets the "attributeType" attribute
     */
    void unsetAttributeType();
    
    /**
     * Gets the "additive" attribute
     */
    org.w3.x2001.smil20.AnimatePrototype.Additive.Enum getAdditive();
    
    /**
     * Gets (as xml) the "additive" attribute
     */
    org.w3.x2001.smil20.AnimatePrototype.Additive xgetAdditive();
    
    /**
     * True if has "additive" attribute
     */
    boolean isSetAdditive();
    
    /**
     * Sets the "additive" attribute
     */
    void setAdditive(org.w3.x2001.smil20.AnimatePrototype.Additive.Enum additive);
    
    /**
     * Sets (as xml) the "additive" attribute
     */
    void xsetAdditive(org.w3.x2001.smil20.AnimatePrototype.Additive additive);
    
    /**
     * Unsets the "additive" attribute
     */
    void unsetAdditive();
    
    /**
     * Gets the "accumulate" attribute
     */
    org.w3.x2001.smil20.AnimatePrototype.Accumulate.Enum getAccumulate();
    
    /**
     * Gets (as xml) the "accumulate" attribute
     */
    org.w3.x2001.smil20.AnimatePrototype.Accumulate xgetAccumulate();
    
    /**
     * True if has "accumulate" attribute
     */
    boolean isSetAccumulate();
    
    /**
     * Sets the "accumulate" attribute
     */
    void setAccumulate(org.w3.x2001.smil20.AnimatePrototype.Accumulate.Enum accumulate);
    
    /**
     * Sets (as xml) the "accumulate" attribute
     */
    void xsetAccumulate(org.w3.x2001.smil20.AnimatePrototype.Accumulate accumulate);
    
    /**
     * Unsets the "accumulate" attribute
     */
    void unsetAccumulate();
    
    /**
     * Gets the "to" attribute
     */
    java.lang.String getTo();
    
    /**
     * Gets (as xml) the "to" attribute
     */
    org.apache.xmlbeans.XmlString xgetTo();
    
    /**
     * True if has "to" attribute
     */
    boolean isSetTo();
    
    /**
     * Sets the "to" attribute
     */
    void setTo(java.lang.String to);
    
    /**
     * Sets (as xml) the "to" attribute
     */
    void xsetTo(org.apache.xmlbeans.XmlString to);
    
    /**
     * Unsets the "to" attribute
     */
    void unsetTo();
    
    /**
     * Gets the "from" attribute
     */
    java.lang.String getFrom();
    
    /**
     * Gets (as xml) the "from" attribute
     */
    org.apache.xmlbeans.XmlString xgetFrom();
    
    /**
     * True if has "from" attribute
     */
    boolean isSetFrom();
    
    /**
     * Sets the "from" attribute
     */
    void setFrom(java.lang.String from);
    
    /**
     * Sets (as xml) the "from" attribute
     */
    void xsetFrom(org.apache.xmlbeans.XmlString from);
    
    /**
     * Unsets the "from" attribute
     */
    void unsetFrom();
    
    /**
     * Gets the "by" attribute
     */
    java.lang.String getBy();
    
    /**
     * Gets (as xml) the "by" attribute
     */
    org.apache.xmlbeans.XmlString xgetBy();
    
    /**
     * True if has "by" attribute
     */
    boolean isSetBy();
    
    /**
     * Sets the "by" attribute
     */
    void setBy(java.lang.String by);
    
    /**
     * Sets (as xml) the "by" attribute
     */
    void xsetBy(org.apache.xmlbeans.XmlString by);
    
    /**
     * Unsets the "by" attribute
     */
    void unsetBy();
    
    /**
     * Gets the "values" attribute
     */
    java.lang.String getValues();
    
    /**
     * Gets (as xml) the "values" attribute
     */
    org.apache.xmlbeans.XmlString xgetValues();
    
    /**
     * True if has "values" attribute
     */
    boolean isSetValues();
    
    /**
     * Sets the "values" attribute
     */
    void setValues(java.lang.String values);
    
    /**
     * Sets (as xml) the "values" attribute
     */
    void xsetValues(org.apache.xmlbeans.XmlString values);
    
    /**
     * Unsets the "values" attribute
     */
    void unsetValues();
    
    /**
     * An XML attributeType(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.smil20.AnimatePrototype$AttributeType.
     */
    public interface AttributeType extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttributeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("attributetype50acattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum XML = Enum.forString("XML");
        static final Enum CSS = Enum.forString("CSS");
        static final Enum AUTO = Enum.forString("auto");
        
        static final int INT_XML = Enum.INT_XML;
        static final int INT_CSS = Enum.INT_CSS;
        static final int INT_AUTO = Enum.INT_AUTO;
        
        /**
         * Enumeration value class for org.w3.x2001.smil20.AnimatePrototype$AttributeType.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_XML
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
            
            static final int INT_XML = 1;
            static final int INT_CSS = 2;
            static final int INT_AUTO = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("XML", INT_XML),
                    new Enum("CSS", INT_CSS),
                    new Enum("auto", INT_AUTO),
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
            public static org.w3.x2001.smil20.AnimatePrototype.AttributeType newValue(java.lang.Object obj) {
              return (org.w3.x2001.smil20.AnimatePrototype.AttributeType) type.newValue( obj ); }
            
            public static org.w3.x2001.smil20.AnimatePrototype.AttributeType newInstance() {
              return (org.w3.x2001.smil20.AnimatePrototype.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.smil20.AnimatePrototype.AttributeType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.smil20.AnimatePrototype.AttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML additive(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.smil20.AnimatePrototype$Additive.
     */
    public interface Additive extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Additive.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("additive33baattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum REPLACE = Enum.forString("replace");
        static final Enum SUM = Enum.forString("sum");
        
        static final int INT_REPLACE = Enum.INT_REPLACE;
        static final int INT_SUM = Enum.INT_SUM;
        
        /**
         * Enumeration value class for org.w3.x2001.smil20.AnimatePrototype$Additive.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_REPLACE
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
            
            static final int INT_REPLACE = 1;
            static final int INT_SUM = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("replace", INT_REPLACE),
                    new Enum("sum", INT_SUM),
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
            public static org.w3.x2001.smil20.AnimatePrototype.Additive newValue(java.lang.Object obj) {
              return (org.w3.x2001.smil20.AnimatePrototype.Additive) type.newValue( obj ); }
            
            public static org.w3.x2001.smil20.AnimatePrototype.Additive newInstance() {
              return (org.w3.x2001.smil20.AnimatePrototype.Additive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.smil20.AnimatePrototype.Additive newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.smil20.AnimatePrototype.Additive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML accumulate(@).
     *
     * This is an atomic type that is a restriction of org.w3.x2001.smil20.AnimatePrototype$Accumulate.
     */
    public interface Accumulate extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Accumulate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("accumulate94d0attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum NONE = Enum.forString("none");
        static final Enum SUM = Enum.forString("sum");
        
        static final int INT_NONE = Enum.INT_NONE;
        static final int INT_SUM = Enum.INT_SUM;
        
        /**
         * Enumeration value class for org.w3.x2001.smil20.AnimatePrototype$Accumulate.
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
            static final int INT_SUM = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("none", INT_NONE),
                    new Enum("sum", INT_SUM),
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
            public static org.w3.x2001.smil20.AnimatePrototype.Accumulate newValue(java.lang.Object obj) {
              return (org.w3.x2001.smil20.AnimatePrototype.Accumulate) type.newValue( obj ); }
            
            public static org.w3.x2001.smil20.AnimatePrototype.Accumulate newInstance() {
              return (org.w3.x2001.smil20.AnimatePrototype.Accumulate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2001.smil20.AnimatePrototype.Accumulate newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2001.smil20.AnimatePrototype.Accumulate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2001.smil20.AnimatePrototype newInstance() {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2001.smil20.AnimatePrototype parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.w3.x2001.smil20.AnimatePrototype parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.w3.x2001.smil20.AnimatePrototype parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2001.smil20.AnimatePrototype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
