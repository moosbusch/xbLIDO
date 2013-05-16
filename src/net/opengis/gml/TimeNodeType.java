/*
 * XML Type:  TimeNodeType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeNodeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML TimeNodeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface TimeNodeType extends net.opengis.gml.AbstractTimeTopologyPrimitiveType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeNodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("timenodetype9732type");
    
    /**
     * Gets a List of "previousEdge" elements
     */
    java.util.List<net.opengis.gml.TimeEdgePropertyType> getPreviousEdgeList();
    
    /**
     * Gets array of all "previousEdge" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.TimeEdgePropertyType[] getPreviousEdgeArray();
    
    /**
     * Gets ith "previousEdge" element
     */
    net.opengis.gml.TimeEdgePropertyType getPreviousEdgeArray(int i);
    
    /**
     * Returns number of "previousEdge" element
     */
    int sizeOfPreviousEdgeArray();
    
    /**
     * Sets array of all "previousEdge" element
     */
    void setPreviousEdgeArray(net.opengis.gml.TimeEdgePropertyType[] previousEdgeArray);
    
    /**
     * Sets ith "previousEdge" element
     */
    void setPreviousEdgeArray(int i, net.opengis.gml.TimeEdgePropertyType previousEdge);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "previousEdge" element
     */
    net.opengis.gml.TimeEdgePropertyType insertNewPreviousEdge(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "previousEdge" element
     */
    net.opengis.gml.TimeEdgePropertyType addNewPreviousEdge();
    
    /**
     * Removes the ith "previousEdge" element
     */
    void removePreviousEdge(int i);
    
    /**
     * Gets a List of "nextEdge" elements
     */
    java.util.List<net.opengis.gml.TimeEdgePropertyType> getNextEdgeList();
    
    /**
     * Gets array of all "nextEdge" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.TimeEdgePropertyType[] getNextEdgeArray();
    
    /**
     * Gets ith "nextEdge" element
     */
    net.opengis.gml.TimeEdgePropertyType getNextEdgeArray(int i);
    
    /**
     * Returns number of "nextEdge" element
     */
    int sizeOfNextEdgeArray();
    
    /**
     * Sets array of all "nextEdge" element
     */
    void setNextEdgeArray(net.opengis.gml.TimeEdgePropertyType[] nextEdgeArray);
    
    /**
     * Sets ith "nextEdge" element
     */
    void setNextEdgeArray(int i, net.opengis.gml.TimeEdgePropertyType nextEdge);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nextEdge" element
     */
    net.opengis.gml.TimeEdgePropertyType insertNewNextEdge(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nextEdge" element
     */
    net.opengis.gml.TimeEdgePropertyType addNewNextEdge();
    
    /**
     * Removes the ith "nextEdge" element
     */
    void removeNextEdge(int i);
    
    /**
     * Gets the "position" element
     */
    net.opengis.gml.TimeInstantPropertyType getPosition();
    
    /**
     * True if has "position" element
     */
    boolean isSetPosition();
    
    /**
     * Sets the "position" element
     */
    void setPosition(net.opengis.gml.TimeInstantPropertyType position);
    
    /**
     * Appends and returns a new empty "position" element
     */
    net.opengis.gml.TimeInstantPropertyType addNewPosition();
    
    /**
     * Unsets the "position" element
     */
    void unsetPosition();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.TimeNodeType newInstance() {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.TimeNodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.TimeNodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.TimeNodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.TimeNodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.TimeNodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.TimeNodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.TimeNodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.TimeNodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.TimeNodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.TimeNodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.TimeNodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.TimeNodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.TimeNodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.TimeNodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.TimeNodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TimeNodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TimeNodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TimeNodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
