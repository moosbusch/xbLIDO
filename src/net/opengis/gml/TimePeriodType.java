/*
 * XML Type:  TimePeriodType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimePeriodType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML TimePeriodType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface TimePeriodType extends net.opengis.gml.AbstractTimeGeometricPrimitiveType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimePeriodType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("timeperiodtypeed13type");
    
    /**
     * Gets the "beginPosition" element
     */
    net.opengis.gml.TimePositionType getBeginPosition();
    
    /**
     * True if has "beginPosition" element
     */
    boolean isSetBeginPosition();
    
    /**
     * Sets the "beginPosition" element
     */
    void setBeginPosition(net.opengis.gml.TimePositionType beginPosition);
    
    /**
     * Appends and returns a new empty "beginPosition" element
     */
    net.opengis.gml.TimePositionType addNewBeginPosition();
    
    /**
     * Unsets the "beginPosition" element
     */
    void unsetBeginPosition();
    
    /**
     * Gets the "begin" element
     */
    net.opengis.gml.TimeInstantPropertyType getBegin();
    
    /**
     * True if has "begin" element
     */
    boolean isSetBegin();
    
    /**
     * Sets the "begin" element
     */
    void setBegin(net.opengis.gml.TimeInstantPropertyType begin);
    
    /**
     * Appends and returns a new empty "begin" element
     */
    net.opengis.gml.TimeInstantPropertyType addNewBegin();
    
    /**
     * Unsets the "begin" element
     */
    void unsetBegin();
    
    /**
     * Gets the "endPosition" element
     */
    net.opengis.gml.TimePositionType getEndPosition();
    
    /**
     * True if has "endPosition" element
     */
    boolean isSetEndPosition();
    
    /**
     * Sets the "endPosition" element
     */
    void setEndPosition(net.opengis.gml.TimePositionType endPosition);
    
    /**
     * Appends and returns a new empty "endPosition" element
     */
    net.opengis.gml.TimePositionType addNewEndPosition();
    
    /**
     * Unsets the "endPosition" element
     */
    void unsetEndPosition();
    
    /**
     * Gets the "end" element
     */
    net.opengis.gml.TimeInstantPropertyType getEnd();
    
    /**
     * True if has "end" element
     */
    boolean isSetEnd();
    
    /**
     * Sets the "end" element
     */
    void setEnd(net.opengis.gml.TimeInstantPropertyType end);
    
    /**
     * Appends and returns a new empty "end" element
     */
    net.opengis.gml.TimeInstantPropertyType addNewEnd();
    
    /**
     * Unsets the "end" element
     */
    void unsetEnd();
    
    /**
     * Gets the "duration" element
     */
    org.apache.xmlbeans.GDuration getDuration();
    
    /**
     * Gets (as xml) the "duration" element
     */
    org.apache.xmlbeans.XmlDuration xgetDuration();
    
    /**
     * True if has "duration" element
     */
    boolean isSetDuration();
    
    /**
     * Sets the "duration" element
     */
    void setDuration(org.apache.xmlbeans.GDuration duration);
    
    /**
     * Sets (as xml) the "duration" element
     */
    void xsetDuration(org.apache.xmlbeans.XmlDuration duration);
    
    /**
     * Unsets the "duration" element
     */
    void unsetDuration();
    
    /**
     * Gets the "timeInterval" element
     */
    net.opengis.gml.TimeIntervalLengthType getTimeInterval();
    
    /**
     * True if has "timeInterval" element
     */
    boolean isSetTimeInterval();
    
    /**
     * Sets the "timeInterval" element
     */
    void setTimeInterval(net.opengis.gml.TimeIntervalLengthType timeInterval);
    
    /**
     * Appends and returns a new empty "timeInterval" element
     */
    net.opengis.gml.TimeIntervalLengthType addNewTimeInterval();
    
    /**
     * Unsets the "timeInterval" element
     */
    void unsetTimeInterval();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.TimePeriodType newInstance() {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.TimePeriodType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.TimePeriodType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.TimePeriodType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.TimePeriodType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.TimePeriodType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.TimePeriodType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.TimePeriodType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.TimePeriodType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.TimePeriodType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.TimePeriodType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.TimePeriodType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.TimePeriodType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.TimePeriodType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.TimePeriodType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.TimePeriodType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TimePeriodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TimePeriodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TimePeriodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
