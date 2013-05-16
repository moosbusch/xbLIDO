/*
 * XML Type:  TopoComplexType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoComplexType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml;


/**
 * An XML TopoComplexType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public interface TopoComplexType extends net.opengis.gml.AbstractTopologyType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TopoComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("topocomplextype651dtype");
    
    /**
     * Gets the "maximalComplex" element
     */
    net.opengis.gml.TopoComplexMemberType getMaximalComplex();
    
    /**
     * Sets the "maximalComplex" element
     */
    void setMaximalComplex(net.opengis.gml.TopoComplexMemberType maximalComplex);
    
    /**
     * Appends and returns a new empty "maximalComplex" element
     */
    net.opengis.gml.TopoComplexMemberType addNewMaximalComplex();
    
    /**
     * Gets a List of "superComplex" elements
     */
    java.util.List<net.opengis.gml.TopoComplexMemberType> getSuperComplexList();
    
    /**
     * Gets array of all "superComplex" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.TopoComplexMemberType[] getSuperComplexArray();
    
    /**
     * Gets ith "superComplex" element
     */
    net.opengis.gml.TopoComplexMemberType getSuperComplexArray(int i);
    
    /**
     * Returns number of "superComplex" element
     */
    int sizeOfSuperComplexArray();
    
    /**
     * Sets array of all "superComplex" element
     */
    void setSuperComplexArray(net.opengis.gml.TopoComplexMemberType[] superComplexArray);
    
    /**
     * Sets ith "superComplex" element
     */
    void setSuperComplexArray(int i, net.opengis.gml.TopoComplexMemberType superComplex);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "superComplex" element
     */
    net.opengis.gml.TopoComplexMemberType insertNewSuperComplex(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "superComplex" element
     */
    net.opengis.gml.TopoComplexMemberType addNewSuperComplex();
    
    /**
     * Removes the ith "superComplex" element
     */
    void removeSuperComplex(int i);
    
    /**
     * Gets a List of "subComplex" elements
     */
    java.util.List<net.opengis.gml.TopoComplexMemberType> getSubComplexList();
    
    /**
     * Gets array of all "subComplex" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.TopoComplexMemberType[] getSubComplexArray();
    
    /**
     * Gets ith "subComplex" element
     */
    net.opengis.gml.TopoComplexMemberType getSubComplexArray(int i);
    
    /**
     * Returns number of "subComplex" element
     */
    int sizeOfSubComplexArray();
    
    /**
     * Sets array of all "subComplex" element
     */
    void setSubComplexArray(net.opengis.gml.TopoComplexMemberType[] subComplexArray);
    
    /**
     * Sets ith "subComplex" element
     */
    void setSubComplexArray(int i, net.opengis.gml.TopoComplexMemberType subComplex);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subComplex" element
     */
    net.opengis.gml.TopoComplexMemberType insertNewSubComplex(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subComplex" element
     */
    net.opengis.gml.TopoComplexMemberType addNewSubComplex();
    
    /**
     * Removes the ith "subComplex" element
     */
    void removeSubComplex(int i);
    
    /**
     * Gets a List of "topoPrimitiveMember" elements
     */
    java.util.List<net.opengis.gml.TopoPrimitiveMemberType> getTopoPrimitiveMemberList();
    
    /**
     * Gets array of all "topoPrimitiveMember" elements
     * @deprecated
     */
    @Deprecated
    net.opengis.gml.TopoPrimitiveMemberType[] getTopoPrimitiveMemberArray();
    
    /**
     * Gets ith "topoPrimitiveMember" element
     */
    net.opengis.gml.TopoPrimitiveMemberType getTopoPrimitiveMemberArray(int i);
    
    /**
     * Returns number of "topoPrimitiveMember" element
     */
    int sizeOfTopoPrimitiveMemberArray();
    
    /**
     * Sets array of all "topoPrimitiveMember" element
     */
    void setTopoPrimitiveMemberArray(net.opengis.gml.TopoPrimitiveMemberType[] topoPrimitiveMemberArray);
    
    /**
     * Sets ith "topoPrimitiveMember" element
     */
    void setTopoPrimitiveMemberArray(int i, net.opengis.gml.TopoPrimitiveMemberType topoPrimitiveMember);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topoPrimitiveMember" element
     */
    net.opengis.gml.TopoPrimitiveMemberType insertNewTopoPrimitiveMember(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topoPrimitiveMember" element
     */
    net.opengis.gml.TopoPrimitiveMemberType addNewTopoPrimitiveMember();
    
    /**
     * Removes the ith "topoPrimitiveMember" element
     */
    void removeTopoPrimitiveMember(int i);
    
    /**
     * Gets the "topoPrimitiveMembers" element
     */
    net.opengis.gml.TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers();
    
    /**
     * True if has "topoPrimitiveMembers" element
     */
    boolean isSetTopoPrimitiveMembers();
    
    /**
     * Sets the "topoPrimitiveMembers" element
     */
    void setTopoPrimitiveMembers(net.opengis.gml.TopoPrimitiveArrayAssociationType topoPrimitiveMembers);
    
    /**
     * Appends and returns a new empty "topoPrimitiveMembers" element
     */
    net.opengis.gml.TopoPrimitiveArrayAssociationType addNewTopoPrimitiveMembers();
    
    /**
     * Unsets the "topoPrimitiveMembers" element
     */
    void unsetTopoPrimitiveMembers();
    
    /**
     * Gets the "isMaximal" attribute
     */
    boolean getIsMaximal();
    
    /**
     * Gets (as xml) the "isMaximal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsMaximal();
    
    /**
     * True if has "isMaximal" attribute
     */
    boolean isSetIsMaximal();
    
    /**
     * Sets the "isMaximal" attribute
     */
    void setIsMaximal(boolean isMaximal);
    
    /**
     * Sets (as xml) the "isMaximal" attribute
     */
    void xsetIsMaximal(org.apache.xmlbeans.XmlBoolean isMaximal);
    
    /**
     * Unsets the "isMaximal" attribute
     */
    void unsetIsMaximal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.TopoComplexType newInstance() {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.TopoComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.TopoComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.TopoComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.TopoComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.TopoComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.TopoComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.TopoComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.TopoComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.TopoComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.TopoComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.TopoComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.TopoComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.TopoComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.TopoComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.TopoComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TopoComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static net.opengis.gml.TopoComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.TopoComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
