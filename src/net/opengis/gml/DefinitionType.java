/*
 * XML Type:  DefinitionType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DefinitionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML DefinitionType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface DefinitionType extends net.opengis.gml.AbstractGMLType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefinitionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("definitiontyped20etype");
    
    /**
     * Gets a List of "name" elements
     */
    java.util.List<net.opengis.gml.CodeType> getNameList();
    
    /**
     * Gets array of all "name" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.CodeType[] getNameArray();
    
    /**
     * Gets ith "name" element
     */
    net.opengis.gml.CodeType getNameArray(int i);
    
    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "name" element
     */
    void setNameArray(net.opengis.gml.CodeType[] nameArray);
    
    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, net.opengis.gml.CodeType name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    net.opengis.gml.CodeType insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    net.opengis.gml.CodeType addNewName();
    
    /**
     * Removes the ith "name" element
     */
    void removeName(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.DefinitionType newInstance() {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.DefinitionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.DefinitionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.DefinitionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.DefinitionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.DefinitionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.DefinitionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.DefinitionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.DefinitionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.DefinitionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.DefinitionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.DefinitionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.DefinitionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.DefinitionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.DefinitionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.DefinitionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.DefinitionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.DefinitionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.DefinitionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
