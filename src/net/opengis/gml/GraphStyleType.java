/*
 * XML Type:  GraphStyleType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GraphStyleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML GraphStyleType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface GraphStyleType extends net.opengis.gml.BaseStyleDescriptorType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GraphStyleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("graphstyletype045etype");
    
    /**
     * Gets the "planar" element
     */
    boolean getPlanar();
    
    /**
     * Gets (as xml) the "planar" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPlanar();
    
    /**
     * True if has "planar" element
     */
    boolean isSetPlanar();
    
    /**
     * Sets the "planar" element
     */
    void setPlanar(boolean planar);
    
    /**
     * Sets (as xml) the "planar" element
     */
    void xsetPlanar(org.apache.xmlbeans.XmlBoolean planar);
    
    /**
     * Unsets the "planar" element
     */
    void unsetPlanar();
    
    /**
     * Gets the "directed" element
     */
    boolean getDirected();
    
    /**
     * Gets (as xml) the "directed" element
     */
    org.apache.xmlbeans.XmlBoolean xgetDirected();
    
    /**
     * True if has "directed" element
     */
    boolean isSetDirected();
    
    /**
     * Sets the "directed" element
     */
    void setDirected(boolean directed);
    
    /**
     * Sets (as xml) the "directed" element
     */
    void xsetDirected(org.apache.xmlbeans.XmlBoolean directed);
    
    /**
     * Unsets the "directed" element
     */
    void unsetDirected();
    
    /**
     * Gets the "grid" element
     */
    boolean getGrid();
    
    /**
     * Gets (as xml) the "grid" element
     */
    org.apache.xmlbeans.XmlBoolean xgetGrid();
    
    /**
     * True if has "grid" element
     */
    boolean isSetGrid();
    
    /**
     * Sets the "grid" element
     */
    void setGrid(boolean grid);
    
    /**
     * Sets (as xml) the "grid" element
     */
    void xsetGrid(org.apache.xmlbeans.XmlBoolean grid);
    
    /**
     * Unsets the "grid" element
     */
    void unsetGrid();
    
    /**
     * Gets the "minDistance" element
     */
    double getMinDistance();
    
    /**
     * Gets (as xml) the "minDistance" element
     */
    org.apache.xmlbeans.XmlDouble xgetMinDistance();
    
    /**
     * True if has "minDistance" element
     */
    boolean isSetMinDistance();
    
    /**
     * Sets the "minDistance" element
     */
    void setMinDistance(double minDistance);
    
    /**
     * Sets (as xml) the "minDistance" element
     */
    void xsetMinDistance(org.apache.xmlbeans.XmlDouble minDistance);
    
    /**
     * Unsets the "minDistance" element
     */
    void unsetMinDistance();
    
    /**
     * Gets the "minAngle" element
     */
    double getMinAngle();
    
    /**
     * Gets (as xml) the "minAngle" element
     */
    org.apache.xmlbeans.XmlDouble xgetMinAngle();
    
    /**
     * True if has "minAngle" element
     */
    boolean isSetMinAngle();
    
    /**
     * Sets the "minAngle" element
     */
    void setMinAngle(double minAngle);
    
    /**
     * Sets (as xml) the "minAngle" element
     */
    void xsetMinAngle(org.apache.xmlbeans.XmlDouble minAngle);
    
    /**
     * Unsets the "minAngle" element
     */
    void unsetMinAngle();
    
    /**
     * Gets the "graphType" element
     */
    net.opengis.gml.GraphTypeType.Enum getGraphType();
    
    /**
     * Gets (as xml) the "graphType" element
     */
    net.opengis.gml.GraphTypeType xgetGraphType();
    
    /**
     * True if has "graphType" element
     */
    boolean isSetGraphType();
    
    /**
     * Sets the "graphType" element
     */
    void setGraphType(net.opengis.gml.GraphTypeType.Enum graphType);
    
    /**
     * Sets (as xml) the "graphType" element
     */
    void xsetGraphType(net.opengis.gml.GraphTypeType graphType);
    
    /**
     * Unsets the "graphType" element
     */
    void unsetGraphType();
    
    /**
     * Gets the "drawingType" element
     */
    net.opengis.gml.DrawingTypeType.Enum getDrawingType();
    
    /**
     * Gets (as xml) the "drawingType" element
     */
    net.opengis.gml.DrawingTypeType xgetDrawingType();
    
    /**
     * True if has "drawingType" element
     */
    boolean isSetDrawingType();
    
    /**
     * Sets the "drawingType" element
     */
    void setDrawingType(net.opengis.gml.DrawingTypeType.Enum drawingType);
    
    /**
     * Sets (as xml) the "drawingType" element
     */
    void xsetDrawingType(net.opengis.gml.DrawingTypeType drawingType);
    
    /**
     * Unsets the "drawingType" element
     */
    void unsetDrawingType();
    
    /**
     * Gets the "lineType" element
     */
    net.opengis.gml.LineTypeType.Enum getLineType();
    
    /**
     * Gets (as xml) the "lineType" element
     */
    net.opengis.gml.LineTypeType xgetLineType();
    
    /**
     * True if has "lineType" element
     */
    boolean isSetLineType();
    
    /**
     * Sets the "lineType" element
     */
    void setLineType(net.opengis.gml.LineTypeType.Enum lineType);
    
    /**
     * Sets (as xml) the "lineType" element
     */
    void xsetLineType(net.opengis.gml.LineTypeType lineType);
    
    /**
     * Unsets the "lineType" element
     */
    void unsetLineType();
    
    /**
     * Gets a List of "aestheticCriteria" elements
     */
    java.util.List<net.opengis.gml.AesheticCriteriaType.Enum> getAestheticCriteriaList();
    
    /**
     * Gets array of all "aestheticCriteria" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.AesheticCriteriaType.Enum[] getAestheticCriteriaArray();
    
    /**
     * Gets ith "aestheticCriteria" element
     */
    net.opengis.gml.AesheticCriteriaType.Enum getAestheticCriteriaArray(int i);
    
    /**
     * Gets (as xml) a List of "aestheticCriteria" elements
     */
    java.util.List<net.opengis.gml.AesheticCriteriaType> xgetAestheticCriteriaList();
    
    /**
     * Gets (as xml) array of all "aestheticCriteria" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.AesheticCriteriaType[] xgetAestheticCriteriaArray();
    
    /**
     * Gets (as xml) ith "aestheticCriteria" element
     */
    net.opengis.gml.AesheticCriteriaType xgetAestheticCriteriaArray(int i);
    
    /**
     * Returns number of "aestheticCriteria" element
     */
    int sizeOfAestheticCriteriaArray();
    
    /**
     * Sets array of all "aestheticCriteria" element
     */
    void setAestheticCriteriaArray(net.opengis.gml.AesheticCriteriaType.Enum[] aestheticCriteriaArray);
    
    /**
     * Sets ith "aestheticCriteria" element
     */
    void setAestheticCriteriaArray(int i, net.opengis.gml.AesheticCriteriaType.Enum aestheticCriteria);
    
    /**
     * Sets (as xml) array of all "aestheticCriteria" element
     */
    void xsetAestheticCriteriaArray(net.opengis.gml.AesheticCriteriaType[] aestheticCriteriaArray);
    
    /**
     * Sets (as xml) ith "aestheticCriteria" element
     */
    void xsetAestheticCriteriaArray(int i, net.opengis.gml.AesheticCriteriaType aestheticCriteria);
    
    /**
     * Inserts the value as the ith "aestheticCriteria" element
     */
    void insertAestheticCriteria(int i, net.opengis.gml.AesheticCriteriaType.Enum aestheticCriteria);
    
    /**
     * Appends the value as the last "aestheticCriteria" element
     */
    void addAestheticCriteria(net.opengis.gml.AesheticCriteriaType.Enum aestheticCriteria);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "aestheticCriteria" element
     */
    net.opengis.gml.AesheticCriteriaType insertNewAestheticCriteria(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "aestheticCriteria" element
     */
    net.opengis.gml.AesheticCriteriaType addNewAestheticCriteria();
    
    /**
     * Removes the ith "aestheticCriteria" element
     */
    void removeAestheticCriteria(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.GraphStyleType newInstance() {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.GraphStyleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.GraphStyleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.GraphStyleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.GraphStyleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.GraphStyleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.GraphStyleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.GraphStyleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.GraphStyleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.GraphStyleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.GraphStyleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.GraphStyleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.GraphStyleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.GraphStyleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.GraphStyleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.GraphStyleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.GraphStyleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.GraphStyleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.GraphStyleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
