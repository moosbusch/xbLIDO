/*
 * XML Type:  AbstractTopoPrimitiveType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractTopoPrimitiveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML AbstractTopoPrimitiveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface AbstractTopoPrimitiveType extends net.opengis.gml.AbstractTopologyType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractTopoPrimitiveType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("abstracttopoprimitivetype1988type");
    
    /**
     * Gets a List of "isolated" elements
     */
    java.util.List<net.opengis.gml.IsolatedPropertyType> getIsolatedList();
    
    /**
     * Gets array of all "isolated" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.IsolatedPropertyType[] getIsolatedArray();
    
    /**
     * Gets ith "isolated" element
     */
    net.opengis.gml.IsolatedPropertyType getIsolatedArray(int i);
    
    /**
     * Returns number of "isolated" element
     */
    int sizeOfIsolatedArray();
    
    /**
     * Sets array of all "isolated" element
     */
    void setIsolatedArray(net.opengis.gml.IsolatedPropertyType[] isolatedArray);
    
    /**
     * Sets ith "isolated" element
     */
    void setIsolatedArray(int i, net.opengis.gml.IsolatedPropertyType isolated);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "isolated" element
     */
    net.opengis.gml.IsolatedPropertyType insertNewIsolated(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isolated" element
     */
    net.opengis.gml.IsolatedPropertyType addNewIsolated();
    
    /**
     * Removes the ith "isolated" element
     */
    void removeIsolated(int i);
    
    /**
     * Gets the "container" element
     */
    net.opengis.gml.ContainerPropertyType getContainer();
    
    /**
     * True if has "container" element
     */
    boolean isSetContainer();
    
    /**
     * Sets the "container" element
     */
    void setContainer(net.opengis.gml.ContainerPropertyType container);
    
    /**
     * Appends and returns a new empty "container" element
     */
    net.opengis.gml.ContainerPropertyType addNewContainer();
    
    /**
     * Unsets the "container" element
     */
    void unsetContainer();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        @Deprecated
        public static net.opengis.gml.AbstractTopoPrimitiveType newInstance() {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        @Deprecated
        public static net.opengis.gml.AbstractTopoPrimitiveType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.AbstractTopoPrimitiveType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.AbstractTopoPrimitiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
