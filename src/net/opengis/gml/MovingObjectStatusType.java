/*
 * XML Type:  MovingObjectStatusType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MovingObjectStatusType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML MovingObjectStatusType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface MovingObjectStatusType extends net.opengis.gml.AbstractTimeSliceType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MovingObjectStatusType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("movingobjectstatustype0f62type");
    
    /**
     * Gets the "location" element
     */
    net.opengis.gml.LocationPropertyType getLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(net.opengis.gml.LocationPropertyType location);
    
    /**
     * Appends and returns a new empty "location" element
     */
    net.opengis.gml.LocationPropertyType addNewLocation();
    
    /**
     * Gets the "speed" element
     */
    net.opengis.gml.MeasureType getSpeed();
    
    /**
     * True if has "speed" element
     */
    boolean isSetSpeed();
    
    /**
     * Sets the "speed" element
     */
    void setSpeed(net.opengis.gml.MeasureType speed);
    
    /**
     * Appends and returns a new empty "speed" element
     */
    net.opengis.gml.MeasureType addNewSpeed();
    
    /**
     * Unsets the "speed" element
     */
    void unsetSpeed();
    
    /**
     * Gets the "bearing" element
     */
    net.opengis.gml.DirectionPropertyType getBearing();
    
    /**
     * True if has "bearing" element
     */
    boolean isSetBearing();
    
    /**
     * Sets the "bearing" element
     */
    void setBearing(net.opengis.gml.DirectionPropertyType bearing);
    
    /**
     * Appends and returns a new empty "bearing" element
     */
    net.opengis.gml.DirectionPropertyType addNewBearing();
    
    /**
     * Unsets the "bearing" element
     */
    void unsetBearing();
    
    /**
     * Gets the "acceleration" element
     */
    net.opengis.gml.MeasureType getAcceleration();
    
    /**
     * True if has "acceleration" element
     */
    boolean isSetAcceleration();
    
    /**
     * Sets the "acceleration" element
     */
    void setAcceleration(net.opengis.gml.MeasureType acceleration);
    
    /**
     * Appends and returns a new empty "acceleration" element
     */
    net.opengis.gml.MeasureType addNewAcceleration();
    
    /**
     * Unsets the "acceleration" element
     */
    void unsetAcceleration();
    
    /**
     * Gets the "elevation" element
     */
    net.opengis.gml.MeasureType getElevation();
    
    /**
     * True if has "elevation" element
     */
    boolean isSetElevation();
    
    /**
     * Sets the "elevation" element
     */
    void setElevation(net.opengis.gml.MeasureType elevation);
    
    /**
     * Appends and returns a new empty "elevation" element
     */
    net.opengis.gml.MeasureType addNewElevation();
    
    /**
     * Unsets the "elevation" element
     */
    void unsetElevation();
    
    /**
     * Gets the "status" element
     */
    net.opengis.gml.StringOrRefType getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(net.opengis.gml.StringOrRefType status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    net.opengis.gml.StringOrRefType addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.MovingObjectStatusType newInstance() {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.MovingObjectStatusType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.MovingObjectStatusType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.MovingObjectStatusType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.MovingObjectStatusType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.MovingObjectStatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.MovingObjectStatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
