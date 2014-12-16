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
 * An XML descriptiveNoteComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class DescriptiveNoteComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.DescriptiveNoteComplexType
{
    private static final long serialVersionUID = 1L;

    public DescriptiveNoteComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName DESCRIPTIVENOTEID$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "descriptiveNoteID");
    private static final javax.xml.namespace.QName DESCRIPTIVENOTEVALUE$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "descriptiveNoteValue");
    private static final javax.xml.namespace.QName SOURCEDESCRIPTIVENOTE$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "sourceDescriptiveNote");
    private static final javax.xml.namespace.QName TYPE$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
    private static final javax.xml.namespace.QName SORTORDER$8 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


    /**
     * Gets a List of "descriptiveNoteID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getDescriptiveNoteIDList()
    {
        final class DescriptiveNoteIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return DescriptiveNoteComplexTypeImpl.this.getDescriptiveNoteIDArray(i); }

            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = DescriptiveNoteComplexTypeImpl.this.getDescriptiveNoteIDArray(i);
                DescriptiveNoteComplexTypeImpl.this.setDescriptiveNoteIDArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { DescriptiveNoteComplexTypeImpl.this.insertNewDescriptiveNoteID(i).set(o); }

            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = DescriptiveNoteComplexTypeImpl.this.getDescriptiveNoteIDArray(i);
                DescriptiveNoteComplexTypeImpl.this.removeDescriptiveNoteID(i);
                return old;
            }

            @Override
            public int size()
                { return DescriptiveNoteComplexTypeImpl.this.sizeOfDescriptiveNoteIDArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptiveNoteIDList();
        }
    }

    /**
     * Gets array of all "descriptiveNoteID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getDescriptiveNoteIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(DESCRIPTIVENOTEID$0, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "descriptiveNoteID" element
     */
    public org.lidoSchema.IdentifierComplexType getDescriptiveNoteIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(DESCRIPTIVENOTEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "descriptiveNoteID" element
     */
    public int sizeOfDescriptiveNoteIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTIVENOTEID$0);
        }
    }

    /**
     * Sets array of all "descriptiveNoteID" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setDescriptiveNoteIDArray(org.lidoSchema.IdentifierComplexType[] descriptiveNoteIDArray)
    {
        check_orphaned();
        arraySetterHelper(descriptiveNoteIDArray, DESCRIPTIVENOTEID$0);
    }

    /**
     * Sets ith "descriptiveNoteID" element
     */
     public void setDescriptiveNoteIDArray(int i, org.lidoSchema.IdentifierComplexType descriptiveNoteID)
    {
        generatedSetterHelperImpl(descriptiveNoteID, DESCRIPTIVENOTEID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "descriptiveNoteID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewDescriptiveNoteID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(DESCRIPTIVENOTEID$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "descriptiveNoteID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewDescriptiveNoteID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(DESCRIPTIVENOTEID$0);
            return target;
        }
    }

    /**
     * Removes the ith "descriptiveNoteID" element
     */
    public void removeDescriptiveNoteID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTIVENOTEID$0, i);
        }
    }

    /**
     * Gets a List of "descriptiveNoteValue" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDescriptiveNoteValueList()
    {
        final class DescriptiveNoteValueList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return DescriptiveNoteComplexTypeImpl.this.getDescriptiveNoteValueArray(i); }

            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = DescriptiveNoteComplexTypeImpl.this.getDescriptiveNoteValueArray(i);
                DescriptiveNoteComplexTypeImpl.this.setDescriptiveNoteValueArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { DescriptiveNoteComplexTypeImpl.this.insertNewDescriptiveNoteValue(i).set(o); }

            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = DescriptiveNoteComplexTypeImpl.this.getDescriptiveNoteValueArray(i);
                DescriptiveNoteComplexTypeImpl.this.removeDescriptiveNoteValue(i);
                return old;
            }

            @Override
            public int size()
                { return DescriptiveNoteComplexTypeImpl.this.sizeOfDescriptiveNoteValueArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptiveNoteValueList();
        }
    }

    /**
     * Gets array of all "descriptiveNoteValue" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDescriptiveNoteValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DESCRIPTIVENOTEVALUE$2, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "descriptiveNoteValue" element
     */
    public org.lidoSchema.TextComplexType getDescriptiveNoteValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DESCRIPTIVENOTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "descriptiveNoteValue" element
     */
    public int sizeOfDescriptiveNoteValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTIVENOTEVALUE$2);
        }
    }

    /**
     * Sets array of all "descriptiveNoteValue" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setDescriptiveNoteValueArray(org.lidoSchema.TextComplexType[] descriptiveNoteValueArray)
    {
        check_orphaned();
        arraySetterHelper(descriptiveNoteValueArray, DESCRIPTIVENOTEVALUE$2);
    }

    /**
     * Sets ith "descriptiveNoteValue" element
     */
     public void setDescriptiveNoteValueArray(int i, org.lidoSchema.TextComplexType descriptiveNoteValue)
    {
        generatedSetterHelperImpl(descriptiveNoteValue, DESCRIPTIVENOTEVALUE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "descriptiveNoteValue" element
     */
    public org.lidoSchema.TextComplexType insertNewDescriptiveNoteValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DESCRIPTIVENOTEVALUE$2, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "descriptiveNoteValue" element
     */
    public org.lidoSchema.TextComplexType addNewDescriptiveNoteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DESCRIPTIVENOTEVALUE$2);
            return target;
        }
    }

    /**
     * Removes the ith "descriptiveNoteValue" element
     */
    public void removeDescriptiveNoteValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTIVENOTEVALUE$2, i);
        }
    }

    /**
     * Gets a List of "sourceDescriptiveNote" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getSourceDescriptiveNoteList()
    {
        final class SourceDescriptiveNoteList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return DescriptiveNoteComplexTypeImpl.this.getSourceDescriptiveNoteArray(i); }

            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = DescriptiveNoteComplexTypeImpl.this.getSourceDescriptiveNoteArray(i);
                DescriptiveNoteComplexTypeImpl.this.setSourceDescriptiveNoteArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { DescriptiveNoteComplexTypeImpl.this.insertNewSourceDescriptiveNote(i).set(o); }

            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = DescriptiveNoteComplexTypeImpl.this.getSourceDescriptiveNoteArray(i);
                DescriptiveNoteComplexTypeImpl.this.removeSourceDescriptiveNote(i);
                return old;
            }

            @Override
            public int size()
                { return DescriptiveNoteComplexTypeImpl.this.sizeOfSourceDescriptiveNoteArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new SourceDescriptiveNoteList();
        }
    }

    /**
     * Gets array of all "sourceDescriptiveNote" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getSourceDescriptiveNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(SOURCEDESCRIPTIVENOTE$4, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "sourceDescriptiveNote" element
     */
    public org.lidoSchema.TextComplexType getSourceDescriptiveNoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "sourceDescriptiveNote" element
     */
    public int sizeOfSourceDescriptiveNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEDESCRIPTIVENOTE$4);
        }
    }

    /**
     * Sets array of all "sourceDescriptiveNote" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setSourceDescriptiveNoteArray(org.lidoSchema.TextComplexType[] sourceDescriptiveNoteArray)
    {
        check_orphaned();
        arraySetterHelper(sourceDescriptiveNoteArray, SOURCEDESCRIPTIVENOTE$4);
    }

    /**
     * Sets ith "sourceDescriptiveNote" element
     */
     public void setSourceDescriptiveNoteArray(int i, org.lidoSchema.TextComplexType sourceDescriptiveNote)
    {
        generatedSetterHelperImpl(sourceDescriptiveNote, SOURCEDESCRIPTIVENOTE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceDescriptiveNote" element
     */
    public org.lidoSchema.TextComplexType insertNewSourceDescriptiveNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(SOURCEDESCRIPTIVENOTE$4, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "sourceDescriptiveNote" element
     */
    public org.lidoSchema.TextComplexType addNewSourceDescriptiveNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(SOURCEDESCRIPTIVENOTE$4);
            return target;
        }
    }

    /**
     * Removes the ith "sourceDescriptiveNote" element
     */
    public void removeSourceDescriptiveNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEDESCRIPTIVENOTE$4, i);
        }
    }

    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
            return get_store().find_attribute_user(TYPE$6) != null;
        }
    }

    /**
     * Sets the "type" attribute
     */
     public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
            get_store().remove_attribute(TYPE$6);
        }
    }

    /**
     * Gets the "sortorder" attribute
     */
    public java.math.BigInteger getSortorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) the "sortorder" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSortorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$8);
            return target;
        }
    }

    /**
     * True if has "sortorder" attribute
     */
    public boolean isSetSortorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SORTORDER$8) != null;
        }
    }

    /**
     * Sets the "sortorder" attribute
     */
     public void setSortorder(java.math.BigInteger sortorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$8);
            }
            target.setBigIntegerValue(sortorder);
        }
    }

    /**
     * Sets (as xml) the "sortorder" attribute
     */
    public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$8);
            }
            target.set(sortorder);
        }
    }

    /**
     * Unsets the "sortorder" attribute
     */
    public void unsetSortorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SORTORDER$8);
        }
    }
}
