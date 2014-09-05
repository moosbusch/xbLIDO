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
import org.moosbusch.museum.inject.lido.annotation.SortOrder;
/**
 * An XML repositorySetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class RepositorySetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.RepositorySetComplexType
{
    private static final long serialVersionUID = 1L;

    public RepositorySetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName REPOSITORYNAME$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "repositoryName");
    private static final javax.xml.namespace.QName WORKID$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "workID");
    private static final javax.xml.namespace.QName REPOSITORYLOCATION$4 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "repositoryLocation");
    private static final javax.xml.namespace.QName TYPE$6 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
    private static final javax.xml.namespace.QName SORTORDER$8 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");


    /**
     * Gets the "repositoryName" element
     */
    public org.lidoSchema.LegalBodyRefComplexType getRepositoryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.LegalBodyRefComplexType target = null;
            target = (org.lidoSchema.LegalBodyRefComplexType)get_store().find_element_user(REPOSITORYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "repositoryName" element
     */
    public boolean isSetRepositoryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPOSITORYNAME$0) != 0;
        }
    }

    /**
     * Sets the "repositoryName" element
     */
    @Inject(optional=true) public void setRepositoryName(org.lidoSchema.LegalBodyRefComplexType repositoryName)
    {
        generatedSetterHelperImpl(repositoryName, REPOSITORYNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "repositoryName" element
     */
    public org.lidoSchema.LegalBodyRefComplexType addNewRepositoryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.LegalBodyRefComplexType target = null;
            target = (org.lidoSchema.LegalBodyRefComplexType)get_store().add_element_user(REPOSITORYNAME$0);
            return target;
        }
    }

    /**
     * Unsets the "repositoryName" element
     */
    public void unsetRepositoryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPOSITORYNAME$0, 0);
        }
    }

    /**
     * Gets a List of "workID" elements
     */
    public java.util.List<org.lidoSchema.RepositorySetComplexType.WorkID> getWorkIDList()
    {
        final class WorkIDList extends java.util.AbstractList<org.lidoSchema.RepositorySetComplexType.WorkID>
        {
            @Override
            public org.lidoSchema.RepositorySetComplexType.WorkID get(int i)
                { return RepositorySetComplexTypeImpl.this.getWorkIDArray(i); }

            @Override
            public org.lidoSchema.RepositorySetComplexType.WorkID set(int i, org.lidoSchema.RepositorySetComplexType.WorkID o)
            {
                org.lidoSchema.RepositorySetComplexType.WorkID old = RepositorySetComplexTypeImpl.this.getWorkIDArray(i);
                RepositorySetComplexTypeImpl.this.setWorkIDArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.RepositorySetComplexType.WorkID o)
                { RepositorySetComplexTypeImpl.this.insertNewWorkID(i).set(o); }

            @Override
            public org.lidoSchema.RepositorySetComplexType.WorkID remove(int i)
            {
                org.lidoSchema.RepositorySetComplexType.WorkID old = RepositorySetComplexTypeImpl.this.getWorkIDArray(i);
                RepositorySetComplexTypeImpl.this.removeWorkID(i);
                return old;
            }

            @Override
            public int size()
                { return RepositorySetComplexTypeImpl.this.sizeOfWorkIDArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new WorkIDList();
        }
    }

    /**
     * Gets array of all "workID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.RepositorySetComplexType.WorkID[] getWorkIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.RepositorySetComplexType.WorkID> targetList = new java.util.ArrayList<org.lidoSchema.RepositorySetComplexType.WorkID>();
            get_store().find_all_element_users(WORKID$2, targetList);
            org.lidoSchema.RepositorySetComplexType.WorkID[] result = new org.lidoSchema.RepositorySetComplexType.WorkID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "workID" element
     */
    public org.lidoSchema.RepositorySetComplexType.WorkID getWorkIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RepositorySetComplexType.WorkID target = null;
            target = (org.lidoSchema.RepositorySetComplexType.WorkID)get_store().find_element_user(WORKID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "workID" element
     */
    public int sizeOfWorkIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKID$2);
        }
    }

    /**
     * Sets array of all "workID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setWorkIDArray(org.lidoSchema.RepositorySetComplexType.WorkID[] workIDArray)
    {
        check_orphaned();
        arraySetterHelper(workIDArray, WORKID$2);
    }

    /**
     * Sets ith "workID" element
     */
    @Inject(optional=true) public void setWorkIDArray(int i, org.lidoSchema.RepositorySetComplexType.WorkID workID)
    {
        generatedSetterHelperImpl(workID, WORKID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "workID" element
     */
    public org.lidoSchema.RepositorySetComplexType.WorkID insertNewWorkID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RepositorySetComplexType.WorkID target = null;
            target = (org.lidoSchema.RepositorySetComplexType.WorkID)get_store().insert_element_user(WORKID$2, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "workID" element
     */
    public org.lidoSchema.RepositorySetComplexType.WorkID addNewWorkID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.RepositorySetComplexType.WorkID target = null;
            target = (org.lidoSchema.RepositorySetComplexType.WorkID)get_store().add_element_user(WORKID$2);
            return target;
        }
    }

    /**
     * Removes the ith "workID" element
     */
    public void removeWorkID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKID$2, i);
        }
    }

    /**
     * Gets the "repositoryLocation" element
     */
    public org.lidoSchema.PlaceComplexType getRepositoryLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType target = null;
            target = (org.lidoSchema.PlaceComplexType)get_store().find_element_user(REPOSITORYLOCATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "repositoryLocation" element
     */
    public boolean isSetRepositoryLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPOSITORYLOCATION$4) != 0;
        }
    }

    /**
     * Sets the "repositoryLocation" element
     */
    @Inject(optional=true) public void setRepositoryLocation(org.lidoSchema.PlaceComplexType repositoryLocation)
    {
        generatedSetterHelperImpl(repositoryLocation, REPOSITORYLOCATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "repositoryLocation" element
     */
    public org.lidoSchema.PlaceComplexType addNewRepositoryLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.PlaceComplexType target = null;
            target = (org.lidoSchema.PlaceComplexType)get_store().add_element_user(REPOSITORYLOCATION$4);
            return target;
        }
    }

    /**
     * Unsets the "repositoryLocation" element
     */
    public void unsetRepositoryLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPOSITORYLOCATION$4, 0);
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
    @Inject(optional=true) public void setType(java.lang.String type)
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
    @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
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
    /**
     * An XML workID(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.RepositorySetComplexType$WorkID.
     */
    public static class WorkIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.RepositorySetComplexType.WorkID
    {
        private static final long serialVersionUID = 1L;

        public WorkIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }

        protected WorkIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }

        private static final javax.xml.namespace.QName TYPE$0 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
        private static final javax.xml.namespace.QName SORTORDER$2 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");
        private static final javax.xml.namespace.QName ENCODINGANALOG$4 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$6 =
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");


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

        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
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
                return get_store().find_attribute_user(SORTORDER$2) != null;
            }
        }

        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$2);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$2);
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
                get_store().remove_attribute(SORTORDER$2);
            }
        }

        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$4);
                return target;
            }
        }

        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$4) != null;
            }
        }

        /**
         * Sets the "encodinganalog" attribute
         */
        @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$4);
                }
                target.setStringValue(encodinganalog);
            }
        }

        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$4);
                }
                target.set(encodinganalog);
            }
        }

        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$4);
            }
        }

        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$6);
                return target;
            }
        }

        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$6) != null;
            }
        }

        /**
         * Sets the "label" attribute
         */
        @Inject(optional=true) public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$6);
                }
                target.setStringValue(label);
            }
        }

        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$6);
                }
                target.set(label);
            }
        }

        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$6);
            }
        }
    }
}
