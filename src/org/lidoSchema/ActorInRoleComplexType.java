/*
 * XML Type:  actorInRoleComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ActorInRoleComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema;


/**
 * An XML actorInRoleComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface ActorInRoleComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActorInRoleComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("actorinrolecomplextype7ff0type");
    
    /**
     * Gets the "actor" element
     */
    org.lidoSchema.ActorComplexType getActor();
    
    /**
     * Sets the "actor" element
     */
    void setActor(org.lidoSchema.ActorComplexType actor);
    
    /**
     * Appends and returns a new empty "actor" element
     */
    org.lidoSchema.ActorComplexType addNewActor();
    
    /**
     * Gets a List of "roleActor" elements
     */
    java.util.List<org.lidoSchema.ActorInRoleComplexType.RoleActor> getRoleActorList();
    
    /**
     * Gets array of all "roleActor" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ActorInRoleComplexType.RoleActor[] getRoleActorArray();
    
    /**
     * Gets ith "roleActor" element
     */
    org.lidoSchema.ActorInRoleComplexType.RoleActor getRoleActorArray(int i);
    
    /**
     * Returns number of "roleActor" element
     */
    int sizeOfRoleActorArray();
    
    /**
     * Sets array of all "roleActor" element
     */
    void setRoleActorArray(org.lidoSchema.ActorInRoleComplexType.RoleActor[] roleActorArray);
    
    /**
     * Sets ith "roleActor" element
     */
    void setRoleActorArray(int i, org.lidoSchema.ActorInRoleComplexType.RoleActor roleActor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "roleActor" element
     */
    org.lidoSchema.ActorInRoleComplexType.RoleActor insertNewRoleActor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "roleActor" element
     */
    org.lidoSchema.ActorInRoleComplexType.RoleActor addNewRoleActor();
    
    /**
     * Removes the ith "roleActor" element
     */
    void removeRoleActor(int i);
    
    /**
     * Gets a List of "attributionQualifierActor" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getAttributionQualifierActorList();
    
    /**
     * Gets array of all "attributionQualifierActor" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getAttributionQualifierActorArray();
    
    /**
     * Gets ith "attributionQualifierActor" element
     */
    org.lidoSchema.TextComplexType getAttributionQualifierActorArray(int i);
    
    /**
     * Returns number of "attributionQualifierActor" element
     */
    int sizeOfAttributionQualifierActorArray();
    
    /**
     * Sets array of all "attributionQualifierActor" element
     */
    void setAttributionQualifierActorArray(org.lidoSchema.TextComplexType[] attributionQualifierActorArray);
    
    /**
     * Sets ith "attributionQualifierActor" element
     */
    void setAttributionQualifierActorArray(int i, org.lidoSchema.TextComplexType attributionQualifierActor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributionQualifierActor" element
     */
    org.lidoSchema.TextComplexType insertNewAttributionQualifierActor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributionQualifierActor" element
     */
    org.lidoSchema.TextComplexType addNewAttributionQualifierActor();
    
    /**
     * Removes the ith "attributionQualifierActor" element
     */
    void removeAttributionQualifierActor(int i);
    
    /**
     * Gets a List of "extentActor" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getExtentActorList();
    
    /**
     * Gets array of all "extentActor" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getExtentActorArray();
    
    /**
     * Gets ith "extentActor" element
     */
    org.lidoSchema.TextComplexType getExtentActorArray(int i);
    
    /**
     * Returns number of "extentActor" element
     */
    int sizeOfExtentActorArray();
    
    /**
     * Sets array of all "extentActor" element
     */
    void setExtentActorArray(org.lidoSchema.TextComplexType[] extentActorArray);
    
    /**
     * Sets ith "extentActor" element
     */
    void setExtentActorArray(int i, org.lidoSchema.TextComplexType extentActor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extentActor" element
     */
    org.lidoSchema.TextComplexType insertNewExtentActor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extentActor" element
     */
    org.lidoSchema.TextComplexType addNewExtentActor();
    
    /**
     * Removes the ith "extentActor" element
     */
    void removeExtentActor(int i);
    
    /**
     * An XML roleActor(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface RoleActor extends org.lidoSchema.ConceptComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoleActor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("roleactor95fbelemtype");
        
        /**
         * Gets the "sortorder" attribute
         */
        java.math.BigInteger getSortorder();
        
        /**
         * Gets (as xml) the "sortorder" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSortorder();
        
        /**
         * True if has "sortorder" attribute
         */
        boolean isSetSortorder();
        
        /**
         * Sets the "sortorder" attribute
         */
        void setSortorder(java.math.BigInteger sortorder);
        
        /**
         * Sets (as xml) the "sortorder" attribute
         */
        void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder);
        
        /**
         * Unsets the "sortorder" attribute
         */
        void unsetSortorder();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ActorInRoleComplexType.RoleActor newInstance() {
              return (org.lidoSchema.ActorInRoleComplexType.RoleActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ActorInRoleComplexType.RoleActor newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ActorInRoleComplexType.RoleActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ActorInRoleComplexType newInstance() {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ActorInRoleComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ActorInRoleComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ActorInRoleComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ActorInRoleComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ActorInRoleComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ActorInRoleComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ActorInRoleComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
