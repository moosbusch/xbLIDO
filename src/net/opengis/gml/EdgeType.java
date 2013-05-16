/*
 * XML Type:  EdgeType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EdgeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML EdgeType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface EdgeType extends net.opengis.gml.AbstractTopoPrimitiveType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EdgeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("edgetype49a4type");
    
    /**
     * Gets a List of "directedNode" elements
     */
    java.util.List<net.opengis.gml.DirectedNodePropertyType> getDirectedNodeList();
    
    /**
     * Gets array of all "directedNode" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.DirectedNodePropertyType[] getDirectedNodeArray();
    
    /**
     * Gets ith "directedNode" element
     */
    net.opengis.gml.DirectedNodePropertyType getDirectedNodeArray(int i);
    
    /**
     * Returns number of "directedNode" element
     */
    int sizeOfDirectedNodeArray();
    
    /**
     * Sets array of all "directedNode" element
     */
    void setDirectedNodeArray(net.opengis.gml.DirectedNodePropertyType[] directedNodeArray);
    
    /**
     * Sets ith "directedNode" element
     */
    void setDirectedNodeArray(int i, net.opengis.gml.DirectedNodePropertyType directedNode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedNode" element
     */
    net.opengis.gml.DirectedNodePropertyType insertNewDirectedNode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedNode" element
     */
    net.opengis.gml.DirectedNodePropertyType addNewDirectedNode();
    
    /**
     * Removes the ith "directedNode" element
     */
    void removeDirectedNode(int i);
    
    /**
     * Gets a List of "directedFace" elements
     */
    java.util.List<net.opengis.gml.DirectedFacePropertyType> getDirectedFaceList();
    
    /**
     * Gets array of all "directedFace" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.DirectedFacePropertyType[] getDirectedFaceArray();
    
    /**
     * Gets ith "directedFace" element
     */
    net.opengis.gml.DirectedFacePropertyType getDirectedFaceArray(int i);
    
    /**
     * Returns number of "directedFace" element
     */
    int sizeOfDirectedFaceArray();
    
    /**
     * Sets array of all "directedFace" element
     */
    void setDirectedFaceArray(net.opengis.gml.DirectedFacePropertyType[] directedFaceArray);
    
    /**
     * Sets ith "directedFace" element
     */
    void setDirectedFaceArray(int i, net.opengis.gml.DirectedFacePropertyType directedFace);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedFace" element
     */
    net.opengis.gml.DirectedFacePropertyType insertNewDirectedFace(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedFace" element
     */
    net.opengis.gml.DirectedFacePropertyType addNewDirectedFace();
    
    /**
     * Removes the ith "directedFace" element
     */
    void removeDirectedFace(int i);
    
    /**
     * Gets the "curveProperty" element
     */
    net.opengis.gml.CurvePropertyType getCurveProperty();
    
    /**
     * True if has "curveProperty" element
     */
    boolean isSetCurveProperty();
    
    /**
     * Sets the "curveProperty" element
     */
    void setCurveProperty(net.opengis.gml.CurvePropertyType curveProperty);
    
    /**
     * Appends and returns a new empty "curveProperty" element
     */
    net.opengis.gml.CurvePropertyType addNewCurveProperty();
    
    /**
     * Unsets the "curveProperty" element
     */
    void unsetCurveProperty();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.EdgeType newInstance() {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.EdgeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.EdgeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.EdgeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.EdgeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.EdgeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.EdgeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.EdgeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.EdgeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.EdgeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.EdgeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.EdgeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.EdgeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.EdgeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.EdgeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.EdgeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.EdgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.EdgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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