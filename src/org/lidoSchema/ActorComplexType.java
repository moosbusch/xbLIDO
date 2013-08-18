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
 * An XML actorComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public interface ActorComplexType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActorComplexType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("actorcomplextyped9d5type");
    
    /**
     * Gets a List of "actorID" elements
     */
    java.util.List<org.lidoSchema.IdentifierComplexType> getActorIDList();
    
    /**
     * Gets array of all "actorID" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.IdentifierComplexType[] getActorIDArray();
    
    /**
     * Gets ith "actorID" element
     */
    org.lidoSchema.IdentifierComplexType getActorIDArray(int i);
    
    /**
     * Returns number of "actorID" element
     */
    int sizeOfActorIDArray();
    
    /**
     * Sets array of all "actorID" element
     */
    void setActorIDArray(org.lidoSchema.IdentifierComplexType[] actorIDArray);
    
    /**
     * Sets ith "actorID" element
     */
    void setActorIDArray(int i, org.lidoSchema.IdentifierComplexType actorID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actorID" element
     */
    org.lidoSchema.IdentifierComplexType insertNewActorID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actorID" element
     */
    org.lidoSchema.IdentifierComplexType addNewActorID();
    
    /**
     * Removes the ith "actorID" element
     */
    void removeActorID(int i);
    
    /**
     * Gets a List of "nameActorSet" elements
     */
    java.util.List<org.lidoSchema.AppellationComplexType> getNameActorSetList();
    
    /**
     * Gets array of all "nameActorSet" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.AppellationComplexType[] getNameActorSetArray();
    
    /**
     * Gets ith "nameActorSet" element
     */
    org.lidoSchema.AppellationComplexType getNameActorSetArray(int i);
    
    /**
     * Returns number of "nameActorSet" element
     */
    int sizeOfNameActorSetArray();
    
    /**
     * Sets array of all "nameActorSet" element
     */
    void setNameActorSetArray(org.lidoSchema.AppellationComplexType[] nameActorSetArray);
    
    /**
     * Sets ith "nameActorSet" element
     */
    void setNameActorSetArray(int i, org.lidoSchema.AppellationComplexType nameActorSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nameActorSet" element
     */
    org.lidoSchema.AppellationComplexType insertNewNameActorSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nameActorSet" element
     */
    org.lidoSchema.AppellationComplexType addNewNameActorSet();
    
    /**
     * Removes the ith "nameActorSet" element
     */
    void removeNameActorSet(int i);
    
    /**
     * Gets a List of "nationalityActor" elements
     */
    java.util.List<org.lidoSchema.ActorComplexType.NationalityActor> getNationalityActorList();
    
    /**
     * Gets array of all "nationalityActor" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.ActorComplexType.NationalityActor[] getNationalityActorArray();
    
    /**
     * Gets ith "nationalityActor" element
     */
    org.lidoSchema.ActorComplexType.NationalityActor getNationalityActorArray(int i);
    
    /**
     * Returns number of "nationalityActor" element
     */
    int sizeOfNationalityActorArray();
    
    /**
     * Sets array of all "nationalityActor" element
     */
    void setNationalityActorArray(org.lidoSchema.ActorComplexType.NationalityActor[] nationalityActorArray);
    
    /**
     * Sets ith "nationalityActor" element
     */
    void setNationalityActorArray(int i, org.lidoSchema.ActorComplexType.NationalityActor nationalityActor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nationalityActor" element
     */
    org.lidoSchema.ActorComplexType.NationalityActor insertNewNationalityActor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nationalityActor" element
     */
    org.lidoSchema.ActorComplexType.NationalityActor addNewNationalityActor();
    
    /**
     * Removes the ith "nationalityActor" element
     */
    void removeNationalityActor(int i);
    
    /**
     * Gets the "vitalDatesActor" element
     */
    org.lidoSchema.DateComplexType getVitalDatesActor();
    
    /**
     * True if has "vitalDatesActor" element
     */
    boolean isSetVitalDatesActor();
    
    /**
     * Sets the "vitalDatesActor" element
     */
    void setVitalDatesActor(org.lidoSchema.DateComplexType vitalDatesActor);
    
    /**
     * Appends and returns a new empty "vitalDatesActor" element
     */
    org.lidoSchema.DateComplexType addNewVitalDatesActor();
    
    /**
     * Unsets the "vitalDatesActor" element
     */
    void unsetVitalDatesActor();
    
    /**
     * Gets a List of "genderActor" elements
     */
    java.util.List<org.lidoSchema.TextComplexType> getGenderActorList();
    
    /**
     * Gets array of all "genderActor" elements
     * @deprecated
     */
    @Deprecated
    org.lidoSchema.TextComplexType[] getGenderActorArray();
    
    /**
     * Gets ith "genderActor" element
     */
    org.lidoSchema.TextComplexType getGenderActorArray(int i);
    
    /**
     * Returns number of "genderActor" element
     */
    int sizeOfGenderActorArray();
    
    /**
     * Sets array of all "genderActor" element
     */
    void setGenderActorArray(org.lidoSchema.TextComplexType[] genderActorArray);
    
    /**
     * Sets ith "genderActor" element
     */
    void setGenderActorArray(int i, org.lidoSchema.TextComplexType genderActor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "genderActor" element
     */
    org.lidoSchema.TextComplexType insertNewGenderActor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "genderActor" element
     */
    org.lidoSchema.TextComplexType addNewGenderActor();
    
    /**
     * Removes the ith "genderActor" element
     */
    void removeGenderActor(int i);
    
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
     * An XML nationalityActor(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public interface NationalityActor extends org.lidoSchema.ConceptComplexType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NationalityActor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s6E28D279B6C224D74769DB8B98AF1665").resolveHandle("nationalityactor4f4aelemtype");
        
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
            public static org.lidoSchema.ActorComplexType.NationalityActor newInstance() {
              return (org.lidoSchema.ActorComplexType.NationalityActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.lidoSchema.ActorComplexType.NationalityActor newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.lidoSchema.ActorComplexType.NationalityActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.lidoSchema.ActorComplexType newInstance() {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.lidoSchema.ActorComplexType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.lidoSchema.ActorComplexType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.lidoSchema.ActorComplexType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.lidoSchema.ActorComplexType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.lidoSchema.ActorComplexType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.lidoSchema.ActorComplexType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.lidoSchema.ActorComplexType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.lidoSchema.ActorComplexType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.lidoSchema.ActorComplexType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.lidoSchema.ActorComplexType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.lidoSchema.ActorComplexType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.lidoSchema.ActorComplexType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.lidoSchema.ActorComplexType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.lidoSchema.ActorComplexType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.lidoSchema.ActorComplexType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ActorComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.lidoSchema.ActorComplexType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.lidoSchema.ActorComplexType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
