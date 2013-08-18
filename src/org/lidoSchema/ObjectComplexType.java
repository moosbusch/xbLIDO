/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lidoSchema;


/**
 * An XML objectComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface ObjectComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectcomplextype6e91type");
    
    /**
     * Gets a List of "objectWebResource" elements
     */
    java.util.List<org.lidoSchema.WebResourceComplexType> getObjectWebResourceList();
    
    /**
     * Gets array of all "objectWebResource" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.WebResourceComplexType[] getObjectWebResourceArray();
    
    /**
     * Gets ith "objectWebResource" element
     */
    org.lidoSchema.WebResourceComplexType getObjectWebResourceArray(int i);
    
    /**
     * Returns number of "objectWebResource" element
     */
    int sizeOfObjectWebResourceArray();
    
    /**
     * Sets array of all "objectWebResource" element
     */
    void setObjectWebResourceArray(org.lidoSchema.WebResourceComplexType[] objectWebResourceArray);
    
    /**
     * Sets ith "objectWebResource" element
     */
    void setObjectWebResourceArray(int i, org.lidoSchema.WebResourceComplexType objectWebResource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectWebResource" element
     */
    org.lidoSchema.WebResourceComplexType insertNewObjectWebResource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectWebResource" element
     */
    org.lidoSchema.WebResourceComplexType addNewObjectWebResource();
    
    /**
     * Removes the ith "objectWebResource" element
     */
    void removeObjectWebResource(int i);
    
    /**
     * Gets a List of "objectID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getObjectIDList();
    
    /**
     * Gets array of all "objectID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getObjectIDArray();
    
    /**
     * Gets ith "objectID" element
     */
    org.lidoSchema.IdentifierComplexType getObjectIDArray(int i);
    
    /**
     * Returns number of "objectID" element
     */
    int sizeOfObjectIDArray();
    
    /**
     * Sets array of all "objectID" element
     */
    void setObjectIDArray(org.lidoSchema.IdentifierComplexType[] objectIDArray);
    
    /**
     * Sets ith "objectID" element
     */
    void setObjectIDArray(int i, org.lidoSchema.IdentifierComplexType objectID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewObjectID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectID" element
     */
    org.lidoSchema.IdentifierComplexType addNewObjectID();
    
    /**
     * Removes the ith "objectID" element
     */
    void removeObjectID(int i);
    
    /**
     * Gets a List of "objectNote" elements
     */
    java.util.List<org.lidoSchema.ObjectComplexType.ObjectNote> getObjectNoteList();
    
    /**
     * Gets array of all "objectNote" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ObjectComplexType.ObjectNote[] getObjectNoteArray();
    
    /**
     * Gets ith "objectNote" element
     */
    org.lidoSchema.ObjectComplexType.ObjectNote getObjectNoteArray(int i);
    
    /**
     * Returns number of "objectNote" element
     */
    int sizeOfObjectNoteArray();
    
    /**
     * Sets array of all "objectNote" element
     */
    void setObjectNoteArray(org.lidoSchema.ObjectComplexType.ObjectNote[] objectNoteArray);
    
    /**
     * Sets ith "objectNote" element
     */
    void setObjectNoteArray(int i, org.lidoSchema.ObjectComplexType.ObjectNote objectNote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectNote" element
     */
    org.lidoSchema.ObjectComplexType.ObjectNote insertNewObjectNote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectNote" element
     */
    org.lidoSchema.ObjectComplexType.ObjectNote addNewObjectNote();
    
    /**
     * Removes the ith "objectNote" element
     */
    void removeObjectNote(int i);
    
    /**
     * An XML objectNote(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ObjectComplexType$ObjectNote.
     */
    public interface ObjectNote extends org.lidoSchema.TextComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectNote.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("objectnotee084elemtype");
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.ObjectComplexType.ObjectNote newInstance() {
              return (org.lidoSchema.ObjectComplexType.ObjectNote) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ObjectComplexType.ObjectNote newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ObjectComplexType.ObjectNote) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ObjectComplexType newInstance() {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ObjectComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ObjectComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ObjectComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ObjectComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ObjectComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ObjectComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ObjectComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ObjectComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ObjectComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ObjectComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ObjectComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ObjectComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ObjectComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ObjectComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ObjectComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ObjectComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ObjectComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
