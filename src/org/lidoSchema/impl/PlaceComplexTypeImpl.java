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
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML placeComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class PlaceComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.PlaceComplexType
{
    private static final long serialVersionUID = 1L;
    
    public PlaceComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLACEID$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "placeID");
    private static final javax.xml.namespace.QName NAMEPLACESET$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "namePlaceSet");
    private static final javax.xml.namespace.QName GML$4 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "gml");
    private static final javax.xml.namespace.QName PARTOFPLACE$6 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "partOfPlace");
    private static final javax.xml.namespace.QName PLACECLASSIFICATION$8 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "placeClassification");
    private static final javax.xml.namespace.QName POLITICALENTITY$10 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "politicalEntity");
    private static final javax.xml.namespace.QName GEOGRAPHICALENTITY$12 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "geographicalEntity");
    
    
    /**
     * Gets a List of "placeID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getPlaceIDList()
    {
        final class PlaceIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return PlaceComplexTypeImpl.this.getPlaceIDArray(i); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = PlaceComplexTypeImpl.this.getPlaceIDArray(i);
                PlaceComplexTypeImpl.this.setPlaceIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { PlaceComplexTypeImpl.this.insertNewPlaceID(i).set(o); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = PlaceComplexTypeImpl.this.getPlaceIDArray(i);
                PlaceComplexTypeImpl.this.removePlaceID(i);
                return old;
            }
            
            @Override
            public int size()
                { return PlaceComplexTypeImpl.this.sizeOfPlaceIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PlaceIDList();
        }
    }
    
    /**
     * Gets array of all "placeID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getPlaceIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(PLACEID$0, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "placeID" element
     */
    public org.lidoSchema.IdentifierComplexType getPlaceIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(PLACEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "placeID" element
     */
    public int sizeOfPlaceIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLACEID$0);
        }
    }
    
    /**
     * Sets array of all "placeID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPlaceIDArray(org.lidoSchema.IdentifierComplexType[] placeIDArray)
    {
        check_orphaned();
        arraySetterHelper(placeIDArray, PLACEID$0);
    }
    
    /**
     * Sets ith "placeID" element
     */
    @Inject(optional=true) public void setPlaceIDArray(int i, org.lidoSchema.IdentifierComplexType placeID)
    {
        generatedSetterHelperImpl(placeID, PLACEID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "placeID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewPlaceID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(PLACEID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "placeID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewPlaceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(PLACEID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "placeID" element
     */
    public void removePlaceID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLACEID$0, i);
        }
    }
    
    /**
     * Gets a List of "namePlaceSet" elements
     */
    public java.util.List<org.lidoSchema.AppellationComplexType> getNamePlaceSetList()
    {
        final class NamePlaceSetList extends java.util.AbstractList<org.lidoSchema.AppellationComplexType>
        {
            @Override
            public org.lidoSchema.AppellationComplexType get(int i)
                { return PlaceComplexTypeImpl.this.getNamePlaceSetArray(i); }
            
            @Override
            public org.lidoSchema.AppellationComplexType set(int i, org.lidoSchema.AppellationComplexType o)
            {
                org.lidoSchema.AppellationComplexType old = PlaceComplexTypeImpl.this.getNamePlaceSetArray(i);
                PlaceComplexTypeImpl.this.setNamePlaceSetArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.AppellationComplexType o)
                { PlaceComplexTypeImpl.this.insertNewNamePlaceSet(i).set(o); }
            
            @Override
            public org.lidoSchema.AppellationComplexType remove(int i)
            {
                org.lidoSchema.AppellationComplexType old = PlaceComplexTypeImpl.this.getNamePlaceSetArray(i);
                PlaceComplexTypeImpl.this.removeNamePlaceSet(i);
                return old;
            }
            
            @Override
            public int size()
                { return PlaceComplexTypeImpl.this.sizeOfNamePlaceSetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NamePlaceSetList();
        }
    }
    
    /**
     * Gets array of all "namePlaceSet" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.AppellationComplexType[] getNamePlaceSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.AppellationComplexType> targetList = new java.util.ArrayList<org.lidoSchema.AppellationComplexType>();
            get_store().find_all_element_users(NAMEPLACESET$2, targetList);
            org.lidoSchema.AppellationComplexType[] result = new org.lidoSchema.AppellationComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "namePlaceSet" element
     */
    public org.lidoSchema.AppellationComplexType getNamePlaceSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().find_element_user(NAMEPLACESET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "namePlaceSet" element
     */
    public int sizeOfNamePlaceSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEPLACESET$2);
        }
    }
    
    /**
     * Sets array of all "namePlaceSet" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setNamePlaceSetArray(org.lidoSchema.AppellationComplexType[] namePlaceSetArray)
    {
        check_orphaned();
        arraySetterHelper(namePlaceSetArray, NAMEPLACESET$2);
    }
    
    /**
     * Sets ith "namePlaceSet" element
     */
    @Inject(optional=true) public void setNamePlaceSetArray(int i, org.lidoSchema.AppellationComplexType namePlaceSet)
    {
        generatedSetterHelperImpl(namePlaceSet, NAMEPLACESET$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "namePlaceSet" element
     */
    public org.lidoSchema.AppellationComplexType insertNewNamePlaceSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().insert_element_user(NAMEPLACESET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "namePlaceSet" element
     */
    public org.lidoSchema.AppellationComplexType addNewNamePlaceSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType target = null;
            target = (org.lidoSchema.AppellationComplexType)get_store().add_element_user(NAMEPLACESET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "namePlaceSet" element
     */
    public void removeNamePlaceSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEPLACESET$2, i);
        }
    }
    
    /**
     * Gets a List of "gml" elements
     */
    public java.util.List<org.lidoSchema.PlaceComplexType.Gml> getGmlList()
    {
        final class GmlList extends java.util.AbstractList<org.lidoSchema.PlaceComplexType.Gml>
        {
            @Override
            public org.lidoSchema.PlaceComplexType.Gml get(int i)
                { return PlaceComplexTypeImpl.this.getGmlArray(i); }
            
            @Override
            public org.lidoSchema.PlaceComplexType.Gml set(int i, org.lidoSchema.PlaceComplexType.Gml o)
            {
                org.lidoSchema.PlaceComplexType.Gml old = PlaceComplexTypeImpl.this.getGmlArray(i);
                PlaceComplexTypeImpl.this.setGmlArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.PlaceComplexType.Gml o)
                { PlaceComplexTypeImpl.this.insertNewGml(i).set(o); }
            
            @Override
            public org.lidoSchema.PlaceComplexType.Gml remove(int i)
            {
                org.lidoSchema.PlaceComplexType.Gml old = PlaceComplexTypeImpl.this.getGmlArray(i);
                PlaceComplexTypeImpl.this.removeGml(i);
                return old;
            }
            
            @Override
            public int size()
                { return PlaceComplexTypeImpl.this.sizeOfGmlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GmlList();
        }
    }
    
    /**
     * Gets array of all "gml" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.PlaceComplexType.Gml[] getGmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.PlaceComplexType.Gml> targetList = new java.util.ArrayList<org.lidoSchema.PlaceComplexType.Gml>();
            get_store().find_all_element_users(GML$4, targetList);
            org.lidoSchema.PlaceComplexType.Gml[] result = new org.lidoSchema.PlaceComplexType.Gml[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gml" element
     */
    public org.lidoSchema.PlaceComplexType.Gml getGmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType.Gml target = null;
            target = (org.lidoSchema.PlaceComplexType.Gml)get_store().find_element_user(GML$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gml" element
     */
    public int sizeOfGmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GML$4);
        }
    }
    
    /**
     * Sets array of all "gml" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setGmlArray(org.lidoSchema.PlaceComplexType.Gml[] gmlArray)
    {
        check_orphaned();
        arraySetterHelper(gmlArray, GML$4);
    }
    
    /**
     * Sets ith "gml" element
     */
    @Inject(optional=true) public void setGmlArray(int i, org.lidoSchema.PlaceComplexType.Gml gml)
    {
        generatedSetterHelperImpl(gml, GML$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gml" element
     */
    public org.lidoSchema.PlaceComplexType.Gml insertNewGml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType.Gml target = null;
            target = (org.lidoSchema.PlaceComplexType.Gml)get_store().insert_element_user(GML$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gml" element
     */
    public org.lidoSchema.PlaceComplexType.Gml addNewGml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType.Gml target = null;
            target = (org.lidoSchema.PlaceComplexType.Gml)get_store().add_element_user(GML$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "gml" element
     */
    public void removeGml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GML$4, i);
        }
    }
    
    /**
     * Gets a List of "partOfPlace" elements
     */
    public java.util.List<org.lidoSchema.PlaceComplexType> getPartOfPlaceList()
    {
        final class PartOfPlaceList extends java.util.AbstractList<org.lidoSchema.PlaceComplexType>
        {
            @Override
            public org.lidoSchema.PlaceComplexType get(int i)
                { return PlaceComplexTypeImpl.this.getPartOfPlaceArray(i); }
            
            @Override
            public org.lidoSchema.PlaceComplexType set(int i, org.lidoSchema.PlaceComplexType o)
            {
                org.lidoSchema.PlaceComplexType old = PlaceComplexTypeImpl.this.getPartOfPlaceArray(i);
                PlaceComplexTypeImpl.this.setPartOfPlaceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.PlaceComplexType o)
                { PlaceComplexTypeImpl.this.insertNewPartOfPlace(i).set(o); }
            
            @Override
            public org.lidoSchema.PlaceComplexType remove(int i)
            {
                org.lidoSchema.PlaceComplexType old = PlaceComplexTypeImpl.this.getPartOfPlaceArray(i);
                PlaceComplexTypeImpl.this.removePartOfPlace(i);
                return old;
            }
            
            @Override
            public int size()
                { return PlaceComplexTypeImpl.this.sizeOfPartOfPlaceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PartOfPlaceList();
        }
    }
    
    /**
     * Gets array of all "partOfPlace" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.PlaceComplexType[] getPartOfPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.PlaceComplexType> targetList = new java.util.ArrayList<org.lidoSchema.PlaceComplexType>();
            get_store().find_all_element_users(PARTOFPLACE$6, targetList);
            org.lidoSchema.PlaceComplexType[] result = new org.lidoSchema.PlaceComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "partOfPlace" element
     */
    public org.lidoSchema.PlaceComplexType getPartOfPlaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType target = null;
            target = (org.lidoSchema.PlaceComplexType)get_store().find_element_user(PARTOFPLACE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "partOfPlace" element
     */
    public int sizeOfPartOfPlaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTOFPLACE$6);
        }
    }
    
    /**
     * Sets array of all "partOfPlace" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPartOfPlaceArray(org.lidoSchema.PlaceComplexType[] partOfPlaceArray)
    {
        check_orphaned();
        arraySetterHelper(partOfPlaceArray, PARTOFPLACE$6);
    }
    
    /**
     * Sets ith "partOfPlace" element
     */
    @Inject(optional=true) public void setPartOfPlaceArray(int i, org.lidoSchema.PlaceComplexType partOfPlace)
    {
        generatedSetterHelperImpl(partOfPlace, PARTOFPLACE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "partOfPlace" element
     */
    public org.lidoSchema.PlaceComplexType insertNewPartOfPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType target = null;
            target = (org.lidoSchema.PlaceComplexType)get_store().insert_element_user(PARTOFPLACE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "partOfPlace" element
     */
    public org.lidoSchema.PlaceComplexType addNewPartOfPlace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType target = null;
            target = (org.lidoSchema.PlaceComplexType)get_store().add_element_user(PARTOFPLACE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "partOfPlace" element
     */
    public void removePartOfPlace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTOFPLACE$6, i);
        }
    }
    
    /**
     * Gets a List of "placeClassification" elements
     */
    public java.util.List<org.lidoSchema.PlaceComplexType.PlaceClassification> getPlaceClassificationList()
    {
        final class PlaceClassificationList extends java.util.AbstractList<org.lidoSchema.PlaceComplexType.PlaceClassification>
        {
            @Override
            public org.lidoSchema.PlaceComplexType.PlaceClassification get(int i)
                { return PlaceComplexTypeImpl.this.getPlaceClassificationArray(i); }
            
            @Override
            public org.lidoSchema.PlaceComplexType.PlaceClassification set(int i, org.lidoSchema.PlaceComplexType.PlaceClassification o)
            {
                org.lidoSchema.PlaceComplexType.PlaceClassification old = PlaceComplexTypeImpl.this.getPlaceClassificationArray(i);
                PlaceComplexTypeImpl.this.setPlaceClassificationArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.PlaceComplexType.PlaceClassification o)
                { PlaceComplexTypeImpl.this.insertNewPlaceClassification(i).set(o); }
            
            @Override
            public org.lidoSchema.PlaceComplexType.PlaceClassification remove(int i)
            {
                org.lidoSchema.PlaceComplexType.PlaceClassification old = PlaceComplexTypeImpl.this.getPlaceClassificationArray(i);
                PlaceComplexTypeImpl.this.removePlaceClassification(i);
                return old;
            }
            
            @Override
            public int size()
                { return PlaceComplexTypeImpl.this.sizeOfPlaceClassificationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PlaceClassificationList();
        }
    }
    
    /**
     * Gets array of all "placeClassification" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.PlaceComplexType.PlaceClassification[] getPlaceClassificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.PlaceComplexType.PlaceClassification> targetList = new java.util.ArrayList<org.lidoSchema.PlaceComplexType.PlaceClassification>();
            get_store().find_all_element_users(PLACECLASSIFICATION$8, targetList);
            org.lidoSchema.PlaceComplexType.PlaceClassification[] result = new org.lidoSchema.PlaceComplexType.PlaceClassification[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "placeClassification" element
     */
    public org.lidoSchema.PlaceComplexType.PlaceClassification getPlaceClassificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType.PlaceClassification target = null;
            target = (org.lidoSchema.PlaceComplexType.PlaceClassification)get_store().find_element_user(PLACECLASSIFICATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "placeClassification" element
     */
    public int sizeOfPlaceClassificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLACECLASSIFICATION$8);
        }
    }
    
    /**
     * Sets array of all "placeClassification" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPlaceClassificationArray(org.lidoSchema.PlaceComplexType.PlaceClassification[] placeClassificationArray)
    {
        check_orphaned();
        arraySetterHelper(placeClassificationArray, PLACECLASSIFICATION$8);
    }
    
    /**
     * Sets ith "placeClassification" element
     */
    @Inject(optional=true) public void setPlaceClassificationArray(int i, org.lidoSchema.PlaceComplexType.PlaceClassification placeClassification)
    {
        generatedSetterHelperImpl(placeClassification, PLACECLASSIFICATION$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "placeClassification" element
     */
    public org.lidoSchema.PlaceComplexType.PlaceClassification insertNewPlaceClassification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType.PlaceClassification target = null;
            target = (org.lidoSchema.PlaceComplexType.PlaceClassification)get_store().insert_element_user(PLACECLASSIFICATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "placeClassification" element
     */
    public org.lidoSchema.PlaceComplexType.PlaceClassification addNewPlaceClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType.PlaceClassification target = null;
            target = (org.lidoSchema.PlaceComplexType.PlaceClassification)get_store().add_element_user(PLACECLASSIFICATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "placeClassification" element
     */
    public void removePlaceClassification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLACECLASSIFICATION$8, i);
        }
    }
    
    /**
     * Gets the "politicalEntity" attribute
     */
    public java.lang.String getPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLITICALENTITY$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "politicalEntity" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLITICALENTITY$10);
            return target;
        }
    }
    
    /**
     * True if has "politicalEntity" attribute
     */
    public boolean isSetPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POLITICALENTITY$10) != null;
        }
    }
    
    /**
     * Sets the "politicalEntity" attribute
     */
    @Inject(optional=true) public void setPoliticalEntity(java.lang.String politicalEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLITICALENTITY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POLITICALENTITY$10);
            }
            target.setStringValue(politicalEntity);
        }
    }
    
    /**
     * Sets (as xml) the "politicalEntity" attribute
     */
    public void xsetPoliticalEntity(org.apache.xmlbeans.XmlString politicalEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLITICALENTITY$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POLITICALENTITY$10);
            }
            target.set(politicalEntity);
        }
    }
    
    /**
     * Unsets the "politicalEntity" attribute
     */
    public void unsetPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POLITICALENTITY$10);
        }
    }
    
    /**
     * Gets the "geographicalEntity" attribute
     */
    public java.lang.String getGeographicalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOGRAPHICALENTITY$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "geographicalEntity" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGeographicalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOGRAPHICALENTITY$12);
            return target;
        }
    }
    
    /**
     * True if has "geographicalEntity" attribute
     */
    public boolean isSetGeographicalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GEOGRAPHICALENTITY$12) != null;
        }
    }
    
    /**
     * Sets the "geographicalEntity" attribute
     */
    @Inject(optional=true) public void setGeographicalEntity(java.lang.String geographicalEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOGRAPHICALENTITY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOGRAPHICALENTITY$12);
            }
            target.setStringValue(geographicalEntity);
        }
    }
    
    /**
     * Sets (as xml) the "geographicalEntity" attribute
     */
    public void xsetGeographicalEntity(org.apache.xmlbeans.XmlString geographicalEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOGRAPHICALENTITY$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOGRAPHICALENTITY$12);
            }
            target.set(geographicalEntity);
        }
    }
    
    /**
     * Unsets the "geographicalEntity" attribute
     */
    public void unsetGeographicalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GEOGRAPHICALENTITY$12);
        }
    }
    /**
     * An XML gml(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class GmlImpl extends org.lidoSchema.impl.GmlComplexTypeImpl implements org.lidoSchema.PlaceComplexType.Gml
    {
        private static final long serialVersionUID = 1L;
        
        public GmlImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LANG$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }
    }
    /**
     * An XML placeClassification(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class PlaceClassificationImpl extends org.lidoSchema.impl.ConceptComplexTypeImpl implements org.lidoSchema.PlaceComplexType.PlaceClassification
    {
        private static final long serialVersionUID = 1L;
        
        public PlaceClassificationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }
    }
}
