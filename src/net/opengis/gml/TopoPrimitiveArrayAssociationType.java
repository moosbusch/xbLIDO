/*
 * XML Type:  TopoPrimitiveArrayAssociationType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoPrimitiveArrayAssociationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML TopoPrimitiveArrayAssociationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface TopoPrimitiveArrayAssociationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TopoPrimitiveArrayAssociationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("topoprimitivearrayassociationtypebbbetype");
    
    /**
     * Gets a List of "_TopoPrimitive" elements
     */
    java.util.List<net.opengis.gml.AbstractTopoPrimitiveType> getTopoPrimitiveList();
    
    /**
     * Gets array of all "_TopoPrimitive" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.AbstractTopoPrimitiveType[] getTopoPrimitiveArray();
    
    /**
     * Gets ith "_TopoPrimitive" element
     */
    net.opengis.gml.AbstractTopoPrimitiveType getTopoPrimitiveArray(int i);
    
    /**
     * Returns number of "_TopoPrimitive" element
     */
    int sizeOfTopoPrimitiveArray();
    
    /**
     * Sets array of all "_TopoPrimitive" element
     */
    void setTopoPrimitiveArray(net.opengis.gml.AbstractTopoPrimitiveType[] topoPrimitiveArray);
    
    /**
     * Sets ith "_TopoPrimitive" element
     */
    void setTopoPrimitiveArray(int i, net.opengis.gml.AbstractTopoPrimitiveType topoPrimitive);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_TopoPrimitive" element
     */
    net.opengis.gml.AbstractTopoPrimitiveType insertNewTopoPrimitive(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_TopoPrimitive" element
     */
    net.opengis.gml.AbstractTopoPrimitiveType addNewTopoPrimitive();
    
    /**
     * Removes the ith "_TopoPrimitive" element
     */
    void removeTopoPrimitive(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType newInstance() {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TopoPrimitiveArrayAssociationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TopoPrimitiveArrayAssociationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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