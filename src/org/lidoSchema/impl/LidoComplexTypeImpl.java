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
package org.lidoSchema.impl;
/**
 * An XML lidoComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class LidoComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.LidoComplexType
{
    private static final long serialVersionUID = 1L;

    public LidoComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName LIDORECID$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "lidoRecID");
    private static final javax.xml.namespace.QName OBJECTPUBLISHEDID$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "objectPublishedID");
    private static final javax.xml.namespace.QName CATEGORY$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "category");
    private static final javax.xml.namespace.QName DESCRIPTIVEMETADATA$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "descriptiveMetadata");
    private static final javax.xml.namespace.QName ADMINISTRATIVEMETADATA$8 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "administrativeMetadata");
    private static final javax.xml.namespace.QName RELATEDENCODING$10 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "relatedencoding");


    /**
     * Gets a List of "lidoRecID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getLidoRecIDList()
    {
        final class LidoRecIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return LidoComplexTypeImpl.this.getLidoRecIDArray(i); }

            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = LidoComplexTypeImpl.this.getLidoRecIDArray(i);
                LidoComplexTypeImpl.this.setLidoRecIDArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { LidoComplexTypeImpl.this.insertNewLidoRecID(i).set(o); }

            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = LidoComplexTypeImpl.this.getLidoRecIDArray(i);
                LidoComplexTypeImpl.this.removeLidoRecID(i);
                return old;
            }

            @Override
            public int size()
                { return LidoComplexTypeImpl.this.sizeOfLidoRecIDArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new LidoRecIDList();
        }
    }

    /**
     * Gets array of all "lidoRecID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getLidoRecIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(LIDORECID$0, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "lidoRecID" element
     */
    public org.lidoSchema.IdentifierComplexType getLidoRecIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(LIDORECID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lidoRecID" element
     */
    public int sizeOfLidoRecIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIDORECID$0);
        }
    }

    /**
     * Sets array of all "lidoRecID" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setLidoRecIDArray(org.lidoSchema.IdentifierComplexType[] lidoRecIDArray)
    {
        check_orphaned();
        arraySetterHelper(lidoRecIDArray, LIDORECID$0);
    }

    /**
     * Sets ith "lidoRecID" element
     */
     public void setLidoRecIDArray(int i, org.lidoSchema.IdentifierComplexType lidoRecID)
    {
        generatedSetterHelperImpl(lidoRecID, LIDORECID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lidoRecID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewLidoRecID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(LIDORECID$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lidoRecID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewLidoRecID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(LIDORECID$0);
            return target;
        }
    }

    /**
     * Removes the ith "lidoRecID" element
     */
    public void removeLidoRecID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIDORECID$0, i);
        }
    }

    /**
     * Gets a List of "objectPublishedID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getObjectPublishedIDList()
    {
        final class ObjectPublishedIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return LidoComplexTypeImpl.this.getObjectPublishedIDArray(i); }

            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = LidoComplexTypeImpl.this.getObjectPublishedIDArray(i);
                LidoComplexTypeImpl.this.setObjectPublishedIDArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { LidoComplexTypeImpl.this.insertNewObjectPublishedID(i).set(o); }

            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = LidoComplexTypeImpl.this.getObjectPublishedIDArray(i);
                LidoComplexTypeImpl.this.removeObjectPublishedID(i);
                return old;
            }

            @Override
            public int size()
                { return LidoComplexTypeImpl.this.sizeOfObjectPublishedIDArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new ObjectPublishedIDList();
        }
    }

    /**
     * Gets array of all "objectPublishedID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getObjectPublishedIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(OBJECTPUBLISHEDID$2, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "objectPublishedID" element
     */
    public org.lidoSchema.IdentifierComplexType getObjectPublishedIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(OBJECTPUBLISHEDID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "objectPublishedID" element
     */
    public int sizeOfObjectPublishedIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTPUBLISHEDID$2);
        }
    }

    /**
     * Sets array of all "objectPublishedID" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setObjectPublishedIDArray(org.lidoSchema.IdentifierComplexType[] objectPublishedIDArray)
    {
        check_orphaned();
        arraySetterHelper(objectPublishedIDArray, OBJECTPUBLISHEDID$2);
    }

    /**
     * Sets ith "objectPublishedID" element
     */
     public void setObjectPublishedIDArray(int i, org.lidoSchema.IdentifierComplexType objectPublishedID)
    {
        generatedSetterHelperImpl(objectPublishedID, OBJECTPUBLISHEDID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectPublishedID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewObjectPublishedID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(OBJECTPUBLISHEDID$2, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "objectPublishedID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewObjectPublishedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(OBJECTPUBLISHEDID$2);
            return target;
        }
    }

    /**
     * Removes the ith "objectPublishedID" element
     */
    public void removeObjectPublishedID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTPUBLISHEDID$2, i);
        }
    }

    /**
     * Gets the "category" element
     */
    public org.lidoSchema.ConceptComplexType getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(CATEGORY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$4) != 0;
        }
    }

    /**
     * Sets the "category" element
     */
     public void setCategory(org.lidoSchema.ConceptComplexType category)
    {
        generatedSetterHelperImpl(category, CATEGORY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "category" element
     */
    public org.lidoSchema.ConceptComplexType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(CATEGORY$4);
            return target;
        }
    }

    /**
     * Unsets the "category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$4, 0);
        }
    }

    /**
     * Gets a List of "descriptiveMetadata" elements
     */
    public java.util.List<org.lidoSchema.DescriptiveMetadataComplexType> getDescriptiveMetadataList()
    {
        final class DescriptiveMetadataList extends java.util.AbstractList<org.lidoSchema.DescriptiveMetadataComplexType>
        {
            @Override
            public org.lidoSchema.DescriptiveMetadataComplexType get(int i)
                { return LidoComplexTypeImpl.this.getDescriptiveMetadataArray(i); }

            @Override
            public org.lidoSchema.DescriptiveMetadataComplexType set(int i, org.lidoSchema.DescriptiveMetadataComplexType o)
            {
                org.lidoSchema.DescriptiveMetadataComplexType old = LidoComplexTypeImpl.this.getDescriptiveMetadataArray(i);
                LidoComplexTypeImpl.this.setDescriptiveMetadataArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.DescriptiveMetadataComplexType o)
                { LidoComplexTypeImpl.this.insertNewDescriptiveMetadata(i).set(o); }

            @Override
            public org.lidoSchema.DescriptiveMetadataComplexType remove(int i)
            {
                org.lidoSchema.DescriptiveMetadataComplexType old = LidoComplexTypeImpl.this.getDescriptiveMetadataArray(i);
                LidoComplexTypeImpl.this.removeDescriptiveMetadata(i);
                return old;
            }

            @Override
            public int size()
                { return LidoComplexTypeImpl.this.sizeOfDescriptiveMetadataArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptiveMetadataList();
        }
    }

    /**
     * Gets array of all "descriptiveMetadata" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.DescriptiveMetadataComplexType[] getDescriptiveMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.DescriptiveMetadataComplexType> targetList = new java.util.ArrayList<org.lidoSchema.DescriptiveMetadataComplexType>();
            get_store().find_all_element_users(DESCRIPTIVEMETADATA$6, targetList);
            org.lidoSchema.DescriptiveMetadataComplexType[] result = new org.lidoSchema.DescriptiveMetadataComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "descriptiveMetadata" element
     */
    public org.lidoSchema.DescriptiveMetadataComplexType getDescriptiveMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DescriptiveMetadataComplexType target = null;
            target = (org.lidoSchema.DescriptiveMetadataComplexType)get_store().find_element_user(DESCRIPTIVEMETADATA$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "descriptiveMetadata" element
     */
    public int sizeOfDescriptiveMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTIVEMETADATA$6);
        }
    }

    /**
     * Sets array of all "descriptiveMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setDescriptiveMetadataArray(org.lidoSchema.DescriptiveMetadataComplexType[] descriptiveMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(descriptiveMetadataArray, DESCRIPTIVEMETADATA$6);
    }

    /**
     * Sets ith "descriptiveMetadata" element
     */
     public void setDescriptiveMetadataArray(int i, org.lidoSchema.DescriptiveMetadataComplexType descriptiveMetadata)
    {
        generatedSetterHelperImpl(descriptiveMetadata, DESCRIPTIVEMETADATA$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "descriptiveMetadata" element
     */
    public org.lidoSchema.DescriptiveMetadataComplexType insertNewDescriptiveMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DescriptiveMetadataComplexType target = null;
            target = (org.lidoSchema.DescriptiveMetadataComplexType)get_store().insert_element_user(DESCRIPTIVEMETADATA$6, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "descriptiveMetadata" element
     */
    public org.lidoSchema.DescriptiveMetadataComplexType addNewDescriptiveMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DescriptiveMetadataComplexType target = null;
            target = (org.lidoSchema.DescriptiveMetadataComplexType)get_store().add_element_user(DESCRIPTIVEMETADATA$6);
            return target;
        }
    }

    /**
     * Removes the ith "descriptiveMetadata" element
     */
    public void removeDescriptiveMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTIVEMETADATA$6, i);
        }
    }

    /**
     * Gets a List of "administrativeMetadata" elements
     */
    public java.util.List<org.lidoSchema.AdministrativeMetadataComplexType> getAdministrativeMetadataList()
    {
        final class AdministrativeMetadataList extends java.util.AbstractList<org.lidoSchema.AdministrativeMetadataComplexType>
        {
            @Override
            public org.lidoSchema.AdministrativeMetadataComplexType get(int i)
                { return LidoComplexTypeImpl.this.getAdministrativeMetadataArray(i); }

            @Override
            public org.lidoSchema.AdministrativeMetadataComplexType set(int i, org.lidoSchema.AdministrativeMetadataComplexType o)
            {
                org.lidoSchema.AdministrativeMetadataComplexType old = LidoComplexTypeImpl.this.getAdministrativeMetadataArray(i);
                LidoComplexTypeImpl.this.setAdministrativeMetadataArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.AdministrativeMetadataComplexType o)
                { LidoComplexTypeImpl.this.insertNewAdministrativeMetadata(i).set(o); }

            @Override
            public org.lidoSchema.AdministrativeMetadataComplexType remove(int i)
            {
                org.lidoSchema.AdministrativeMetadataComplexType old = LidoComplexTypeImpl.this.getAdministrativeMetadataArray(i);
                LidoComplexTypeImpl.this.removeAdministrativeMetadata(i);
                return old;
            }

            @Override
            public int size()
                { return LidoComplexTypeImpl.this.sizeOfAdministrativeMetadataArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new AdministrativeMetadataList();
        }
    }

    /**
     * Gets array of all "administrativeMetadata" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.AdministrativeMetadataComplexType[] getAdministrativeMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.AdministrativeMetadataComplexType> targetList = new java.util.ArrayList<org.lidoSchema.AdministrativeMetadataComplexType>();
            get_store().find_all_element_users(ADMINISTRATIVEMETADATA$8, targetList);
            org.lidoSchema.AdministrativeMetadataComplexType[] result = new org.lidoSchema.AdministrativeMetadataComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "administrativeMetadata" element
     */
    public org.lidoSchema.AdministrativeMetadataComplexType getAdministrativeMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AdministrativeMetadataComplexType target = null;
            target = (org.lidoSchema.AdministrativeMetadataComplexType)get_store().find_element_user(ADMINISTRATIVEMETADATA$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "administrativeMetadata" element
     */
    public int sizeOfAdministrativeMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINISTRATIVEMETADATA$8);
        }
    }

    /**
     * Sets array of all "administrativeMetadata" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setAdministrativeMetadataArray(org.lidoSchema.AdministrativeMetadataComplexType[] administrativeMetadataArray)
    {
        check_orphaned();
        arraySetterHelper(administrativeMetadataArray, ADMINISTRATIVEMETADATA$8);
    }

    /**
     * Sets ith "administrativeMetadata" element
     */
     public void setAdministrativeMetadataArray(int i, org.lidoSchema.AdministrativeMetadataComplexType administrativeMetadata)
    {
        generatedSetterHelperImpl(administrativeMetadata, ADMINISTRATIVEMETADATA$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "administrativeMetadata" element
     */
    public org.lidoSchema.AdministrativeMetadataComplexType insertNewAdministrativeMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AdministrativeMetadataComplexType target = null;
            target = (org.lidoSchema.AdministrativeMetadataComplexType)get_store().insert_element_user(ADMINISTRATIVEMETADATA$8, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "administrativeMetadata" element
     */
    public org.lidoSchema.AdministrativeMetadataComplexType addNewAdministrativeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AdministrativeMetadataComplexType target = null;
            target = (org.lidoSchema.AdministrativeMetadataComplexType)get_store().add_element_user(ADMINISTRATIVEMETADATA$8);
            return target;
        }
    }

    /**
     * Removes the ith "administrativeMetadata" element
     */
    public void removeAdministrativeMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINISTRATIVEMETADATA$8, i);
        }
    }

    /**
     * Gets the "relatedencoding" attribute
     */
    public java.lang.String getRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "relatedencoding" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$10);
            return target;
        }
    }

    /**
     * True if has "relatedencoding" attribute
     */
    public boolean isSetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATEDENCODING$10) != null;
        }
    }

    /**
     * Sets the "relatedencoding" attribute
     */
     public void setRelatedencoding(java.lang.String relatedencoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATEDENCODING$10);
            }
            target.setStringValue(relatedencoding);
        }
    }

    /**
     * Sets (as xml) the "relatedencoding" attribute
     */
    public void xsetRelatedencoding(org.apache.xmlbeans.XmlString relatedencoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATEDENCODING$10);
            }
            target.set(relatedencoding);
        }
    }

    /**
     * Unsets the "relatedencoding" attribute
     */
    public void unsetRelatedencoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATEDENCODING$10);
        }
    }
}
