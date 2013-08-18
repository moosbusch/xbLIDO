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
 * An XML placeComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface PlaceComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlaceComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("placecomplextype2b67type");
    
    /**
     * Gets a List of "placeID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getPlaceIDList();
    
    /**
     * Gets array of all "placeID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getPlaceIDArray();
    
    /**
     * Gets ith "placeID" element
     */
    org.lidoSchema.IdentifierComplexType getPlaceIDArray(int i);
    
    /**
     * Returns number of "placeID" element
     */
    int sizeOfPlaceIDArray();
    
    /**
     * Sets array of all "placeID" element
     */
    void setPlaceIDArray(org.lidoSchema.IdentifierComplexType[] placeIDArray);
    
    /**
     * Sets ith "placeID" element
     */
    void setPlaceIDArray(int i, org.lidoSchema.IdentifierComplexType placeID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "placeID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewPlaceID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "placeID" element
     */
    org.lidoSchema.IdentifierComplexType addNewPlaceID();
    
    /**
     * Removes the ith "placeID" element
     */
    void removePlaceID(int i);
    
    /**
     * Gets a List of "namePlaceSet" elements
     */
    java.util.List<org.lidoSchema.AppellationComplexType> getNamePlaceSetList();
    
    /**
     * Gets array of all "namePlaceSet" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.AppellationComplexType[] getNamePlaceSetArray();
    
    /**
     * Gets ith "namePlaceSet" element
     */
    org.lidoSchema.AppellationComplexType getNamePlaceSetArray(int i);
    
    /**
     * Returns number of "namePlaceSet" element
     */
    int sizeOfNamePlaceSetArray();
    
    /**
     * Sets array of all "namePlaceSet" element
     */
    void setNamePlaceSetArray(org.lidoSchema.AppellationComplexType[] namePlaceSetArray);
    
    /**
     * Sets ith "namePlaceSet" element
     */
    void setNamePlaceSetArray(int i, org.lidoSchema.AppellationComplexType namePlaceSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "namePlaceSet" element
     */
    org.lidoSchema.AppellationComplexType insertNewNamePlaceSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "namePlaceSet" element
     */
    org.lidoSchema.AppellationComplexType addNewNamePlaceSet();
    
    /**
     * Removes the ith "namePlaceSet" element
     */
    void removeNamePlaceSet(int i);
    
    /**
     * Gets a List of "gml" elements
     */
    java.util.List<org.lidoSchema.PlaceComplexType.Gml> getGmlList();
    
    /**
     * Gets array of all "gml" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.PlaceComplexType.Gml[] getGmlArray();
    
    /**
     * Gets ith "gml" element
     */
    org.lidoSchema.PlaceComplexType.Gml getGmlArray(int i);
    
    /**
     * Returns number of "gml" element
     */
    int sizeOfGmlArray();
    
    /**
     * Sets array of all "gml" element
     */
    void setGmlArray(org.lidoSchema.PlaceComplexType.Gml[] gmlArray);
    
    /**
     * Sets ith "gml" element
     */
    void setGmlArray(int i, org.lidoSchema.PlaceComplexType.Gml gml);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gml" element
     */
    org.lidoSchema.PlaceComplexType.Gml insertNewGml(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gml" element
     */
    org.lidoSchema.PlaceComplexType.Gml addNewGml();
    
    /**
     * Removes the ith "gml" element
     */
    void removeGml(int i);
    
    /**
     * Gets a List of "partOfPlace" elements
     */
    java.util.List<org.lidoSchema.PlaceComplexType> getPartOfPlaceList();
    
    /**
     * Gets array of all "partOfPlace" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.PlaceComplexType[] getPartOfPlaceArray();
    
    /**
     * Gets ith "partOfPlace" element
     */
    org.lidoSchema.PlaceComplexType getPartOfPlaceArray(int i);
    
    /**
     * Returns number of "partOfPlace" element
     */
    int sizeOfPartOfPlaceArray();
    
    /**
     * Sets array of all "partOfPlace" element
     */
    void setPartOfPlaceArray(org.lidoSchema.PlaceComplexType[] partOfPlaceArray);
    
    /**
     * Sets ith "partOfPlace" element
     */
    void setPartOfPlaceArray(int i, org.lidoSchema.PlaceComplexType partOfPlace);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "partOfPlace" element
     */
    org.lidoSchema.PlaceComplexType insertNewPartOfPlace(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "partOfPlace" element
     */
    org.lidoSchema.PlaceComplexType addNewPartOfPlace();
    
    /**
     * Removes the ith "partOfPlace" element
     */
    void removePartOfPlace(int i);
    
    /**
     * Gets a List of "placeClassification" elements
     */
    java.util.List<org.lidoSchema.PlaceComplexType.PlaceClassification> getPlaceClassificationList();
    
    /**
     * Gets array of all "placeClassification" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.PlaceComplexType.PlaceClassification[] getPlaceClassificationArray();
    
    /**
     * Gets ith "placeClassification" element
     */
    org.lidoSchema.PlaceComplexType.PlaceClassification getPlaceClassificationArray(int i);
    
    /**
     * Returns number of "placeClassification" element
     */
    int sizeOfPlaceClassificationArray();
    
    /**
     * Sets array of all "placeClassification" element
     */
    void setPlaceClassificationArray(org.lidoSchema.PlaceComplexType.PlaceClassification[] placeClassificationArray);
    
    /**
     * Sets ith "placeClassification" element
     */
    void setPlaceClassificationArray(int i, org.lidoSchema.PlaceComplexType.PlaceClassification placeClassification);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "placeClassification" element
     */
    org.lidoSchema.PlaceComplexType.PlaceClassification insertNewPlaceClassification(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "placeClassification" element
     */
    org.lidoSchema.PlaceComplexType.PlaceClassification addNewPlaceClassification();
    
    /**
     * Removes the ith "placeClassification" element
     */
    void removePlaceClassification(int i);
    
    /**
     * Gets the "politicalEntity" attribute
     */
    java.lang.String getPoliticalEntity();
    
    /**
     * Gets (as xml) the "politicalEntity" attribute
     */
    org.apache.xmlbeans.XmlString xgetPoliticalEntity();
    
    /**
     * True if has "politicalEntity" attribute
     */
    boolean isSetPoliticalEntity();
    
    /**
     * Sets the "politicalEntity" attribute
     */
    void setPoliticalEntity(java.lang.String politicalEntity);
    
    /**
     * Sets (as xml) the "politicalEntity" attribute
     */
    void xsetPoliticalEntity(org.apache.xmlbeans.XmlString politicalEntity);
    
    /**
     * Unsets the "politicalEntity" attribute
     */
    void unsetPoliticalEntity();
    
    /**
     * Gets the "geographicalEntity" attribute
     */
    java.lang.String getGeographicalEntity();
    
    /**
     * Gets (as xml) the "geographicalEntity" attribute
     */
    org.apache.xmlbeans.XmlString xgetGeographicalEntity();
    
    /**
     * True if has "geographicalEntity" attribute
     */
    boolean isSetGeographicalEntity();
    
    /**
     * Sets the "geographicalEntity" attribute
     */
    void setGeographicalEntity(java.lang.String geographicalEntity);
    
    /**
     * Sets (as xml) the "geographicalEntity" attribute
     */
    void xsetGeographicalEntity(org.apache.xmlbeans.XmlString geographicalEntity);
    
    /**
     * Unsets the "geographicalEntity" attribute
     */
    void unsetGeographicalEntity();
    
    /**
     * An XML gml(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface Gml extends org.lidoSchema.GmlComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gml.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("gml6499elemtype");
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.XmlLanguage xgetLang();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.apache.xmlbeans.XmlLanguage lang);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.lidoSchema.PlaceComplexType.Gml newInstance() {
              return (org.lidoSchema.PlaceComplexType.Gml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.PlaceComplexType.Gml newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.PlaceComplexType.Gml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML placeClassification(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface PlaceClassification extends org.lidoSchema.ConceptComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PlaceClassification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("placeclassification30e0elemtype");
        
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
            public static org.lidoSchema.PlaceComplexType.PlaceClassification newInstance() {
              return (org.lidoSchema.PlaceComplexType.PlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.PlaceComplexType.PlaceClassification newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.PlaceComplexType.PlaceClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.PlaceComplexType newInstance() {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.PlaceComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.PlaceComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.PlaceComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.PlaceComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.PlaceComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.PlaceComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.PlaceComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.PlaceComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.PlaceComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.PlaceComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.PlaceComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.PlaceComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.PlaceComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.PlaceComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.PlaceComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.PlaceComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.PlaceComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.PlaceComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
