/*
 * XML Type:  ClothoidType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ClothoidType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML ClothoidType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface ClothoidType extends net.opengis.gml.AbstractCurveSegmentType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClothoidType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("clothoidtypedc11type");
    
    /**
     * Gets the "refLocation" element
     */
    net.opengis.gml.ClothoidType.RefLocation getRefLocation();
    
    /**
     * Sets the "refLocation" element
     */
    void setRefLocation(net.opengis.gml.ClothoidType.RefLocation refLocation);
    
    /**
     * Appends and returns a new empty "refLocation" element
     */
    net.opengis.gml.ClothoidType.RefLocation addNewRefLocation();
    
    /**
     * Gets the "scaleFactor" element
     */
    java.math.BigDecimal getScaleFactor();
    
    /**
     * Gets (as xml) the "scaleFactor" element
     */
    org.apache.xmlbeans.XmlDecimal xgetScaleFactor();
    
    /**
     * Sets the "scaleFactor" element
     */
    void setScaleFactor(java.math.BigDecimal scaleFactor);
    
    /**
     * Sets (as xml) the "scaleFactor" element
     */
    void xsetScaleFactor(org.apache.xmlbeans.XmlDecimal scaleFactor);
    
    /**
     * Gets the "startParameter" element
     */
    double getStartParameter();
    
    /**
     * Gets (as xml) the "startParameter" element
     */
    org.apache.xmlbeans.XmlDouble xgetStartParameter();
    
    /**
     * Sets the "startParameter" element
     */
    void setStartParameter(double startParameter);
    
    /**
     * Sets (as xml) the "startParameter" element
     */
    void xsetStartParameter(org.apache.xmlbeans.XmlDouble startParameter);
    
    /**
     * Gets the "endParameter" element
     */
    double getEndParameter();
    
    /**
     * Gets (as xml) the "endParameter" element
     */
    org.apache.xmlbeans.XmlDouble xgetEndParameter();
    
    /**
     * Sets the "endParameter" element
     */
    void setEndParameter(double endParameter);
    
    /**
     * Sets (as xml) the "endParameter" element
     */
    void xsetEndParameter(org.apache.xmlbeans.XmlDouble endParameter);
    
    /**
     * An XML refLocation(@http://www.opengis.net/gml).
     *
     * This is a complex type.
     */
    public interface RefLocation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RefLocation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("reflocationf4e5elemtype");
        
        /**
         * Gets the "AffinePlacement" element
         */
        net.opengis.gml.AffinePlacementType getAffinePlacement();
        
        /**
         * Sets the "AffinePlacement" element
         */
        void setAffinePlacement(net.opengis.gml.AffinePlacementType affinePlacement);
        
        /**
         * Appends and returns a new empty "AffinePlacement" element
         */
        net.opengis.gml.AffinePlacementType addNewAffinePlacement();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.opengis.gml.ClothoidType.RefLocation newInstance() {
              return (net.opengis.gml.ClothoidType.RefLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.gml.ClothoidType.RefLocation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.gml.ClothoidType.RefLocation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.ClothoidType newInstance() {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.ClothoidType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.ClothoidType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.ClothoidType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.ClothoidType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.ClothoidType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.ClothoidType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.ClothoidType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.ClothoidType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.ClothoidType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.ClothoidType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.ClothoidType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.ClothoidType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.ClothoidType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.ClothoidType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.ClothoidType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ClothoidType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.ClothoidType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.ClothoidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
