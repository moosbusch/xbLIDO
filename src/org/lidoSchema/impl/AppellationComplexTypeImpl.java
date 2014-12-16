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
 * An XML appellationComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class AppellationComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.AppellationComplexType
{
    private static final long serialVersionUID = 1L;
    
    public AppellationComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPELLATIONVALUE$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "appellationValue");
    private static final javax.xml.namespace.QName SOURCEAPPELLATION$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "sourceAppellation");
    
    
    /**
     * Gets a List of "appellationValue" elements
     */
    public java.util.List<org.lidoSchema.AppellationComplexType.AppellationValue> getAppellationValueList()
    {
        final class AppellationValueList extends java.util.AbstractList<org.lidoSchema.AppellationComplexType.AppellationValue>
        {
            @Override
            public org.lidoSchema.AppellationComplexType.AppellationValue get(int i)
                { return AppellationComplexTypeImpl.this.getAppellationValueArray(i); }
            
            @Override
            public org.lidoSchema.AppellationComplexType.AppellationValue set(int i, org.lidoSchema.AppellationComplexType.AppellationValue o)
            {
                org.lidoSchema.AppellationComplexType.AppellationValue old = AppellationComplexTypeImpl.this.getAppellationValueArray(i);
                AppellationComplexTypeImpl.this.setAppellationValueArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.AppellationComplexType.AppellationValue o)
                { AppellationComplexTypeImpl.this.insertNewAppellationValue(i).set(o); }
            
            @Override
            public org.lidoSchema.AppellationComplexType.AppellationValue remove(int i)
            {
                org.lidoSchema.AppellationComplexType.AppellationValue old = AppellationComplexTypeImpl.this.getAppellationValueArray(i);
                AppellationComplexTypeImpl.this.removeAppellationValue(i);
                return old;
            }
            
            @Override
            public int size()
                { return AppellationComplexTypeImpl.this.sizeOfAppellationValueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AppellationValueList();
        }
    }
    
    /**
     * Gets array of all "appellationValue" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.AppellationComplexType.AppellationValue[] getAppellationValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.AppellationComplexType.AppellationValue> targetList = new java.util.ArrayList<org.lidoSchema.AppellationComplexType.AppellationValue>();
            get_store().find_all_element_users(APPELLATIONVALUE$0, targetList);
            org.lidoSchema.AppellationComplexType.AppellationValue[] result = new org.lidoSchema.AppellationComplexType.AppellationValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "appellationValue" element
     */
    public org.lidoSchema.AppellationComplexType.AppellationValue getAppellationValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType.AppellationValue target = null;
            target = (org.lidoSchema.AppellationComplexType.AppellationValue)get_store().find_element_user(APPELLATIONVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "appellationValue" element
     */
    public int sizeOfAppellationValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPELLATIONVALUE$0);
        }
    }
    
    /**
     * Sets array of all "appellationValue" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setAppellationValueArray(org.lidoSchema.AppellationComplexType.AppellationValue[] appellationValueArray)
    {
        check_orphaned();
        arraySetterHelper(appellationValueArray, APPELLATIONVALUE$0);
    }
    
    /**
     * Sets ith "appellationValue" element
     */
     public void setAppellationValueArray(int i, org.lidoSchema.AppellationComplexType.AppellationValue appellationValue)
    {
        generatedSetterHelperImpl(appellationValue, APPELLATIONVALUE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "appellationValue" element
     */
    public org.lidoSchema.AppellationComplexType.AppellationValue insertNewAppellationValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType.AppellationValue target = null;
            target = (org.lidoSchema.AppellationComplexType.AppellationValue)get_store().insert_element_user(APPELLATIONVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "appellationValue" element
     */
    public org.lidoSchema.AppellationComplexType.AppellationValue addNewAppellationValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType.AppellationValue target = null;
            target = (org.lidoSchema.AppellationComplexType.AppellationValue)get_store().add_element_user(APPELLATIONVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "appellationValue" element
     */
    public void removeAppellationValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPELLATIONVALUE$0, i);
        }
    }
    
    /**
     * Gets a List of "sourceAppellation" elements
     */
    public java.util.List<org.lidoSchema.AppellationComplexType.SourceAppellation> getSourceAppellationList()
    {
        final class SourceAppellationList extends java.util.AbstractList<org.lidoSchema.AppellationComplexType.SourceAppellation>
        {
            @Override
            public org.lidoSchema.AppellationComplexType.SourceAppellation get(int i)
                { return AppellationComplexTypeImpl.this.getSourceAppellationArray(i); }
            
            @Override
            public org.lidoSchema.AppellationComplexType.SourceAppellation set(int i, org.lidoSchema.AppellationComplexType.SourceAppellation o)
            {
                org.lidoSchema.AppellationComplexType.SourceAppellation old = AppellationComplexTypeImpl.this.getSourceAppellationArray(i);
                AppellationComplexTypeImpl.this.setSourceAppellationArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.AppellationComplexType.SourceAppellation o)
                { AppellationComplexTypeImpl.this.insertNewSourceAppellation(i).set(o); }
            
            @Override
            public org.lidoSchema.AppellationComplexType.SourceAppellation remove(int i)
            {
                org.lidoSchema.AppellationComplexType.SourceAppellation old = AppellationComplexTypeImpl.this.getSourceAppellationArray(i);
                AppellationComplexTypeImpl.this.removeSourceAppellation(i);
                return old;
            }
            
            @Override
            public int size()
                { return AppellationComplexTypeImpl.this.sizeOfSourceAppellationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SourceAppellationList();
        }
    }
    
    /**
     * Gets array of all "sourceAppellation" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.AppellationComplexType.SourceAppellation[] getSourceAppellationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.AppellationComplexType.SourceAppellation> targetList = new java.util.ArrayList<org.lidoSchema.AppellationComplexType.SourceAppellation>();
            get_store().find_all_element_users(SOURCEAPPELLATION$2, targetList);
            org.lidoSchema.AppellationComplexType.SourceAppellation[] result = new org.lidoSchema.AppellationComplexType.SourceAppellation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sourceAppellation" element
     */
    public org.lidoSchema.AppellationComplexType.SourceAppellation getSourceAppellationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType.SourceAppellation target = null;
            target = (org.lidoSchema.AppellationComplexType.SourceAppellation)get_store().find_element_user(SOURCEAPPELLATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sourceAppellation" element
     */
    public int sizeOfSourceAppellationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEAPPELLATION$2);
        }
    }
    
    /**
     * Sets array of all "sourceAppellation" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setSourceAppellationArray(org.lidoSchema.AppellationComplexType.SourceAppellation[] sourceAppellationArray)
    {
        check_orphaned();
        arraySetterHelper(sourceAppellationArray, SOURCEAPPELLATION$2);
    }
    
    /**
     * Sets ith "sourceAppellation" element
     */
     public void setSourceAppellationArray(int i, org.lidoSchema.AppellationComplexType.SourceAppellation sourceAppellation)
    {
        generatedSetterHelperImpl(sourceAppellation, SOURCEAPPELLATION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceAppellation" element
     */
    public org.lidoSchema.AppellationComplexType.SourceAppellation insertNewSourceAppellation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType.SourceAppellation target = null;
            target = (org.lidoSchema.AppellationComplexType.SourceAppellation)get_store().insert_element_user(SOURCEAPPELLATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceAppellation" element
     */
    public org.lidoSchema.AppellationComplexType.SourceAppellation addNewSourceAppellation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AppellationComplexType.SourceAppellation target = null;
            target = (org.lidoSchema.AppellationComplexType.SourceAppellation)get_store().add_element_user(SOURCEAPPELLATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "sourceAppellation" element
     */
    public void removeSourceAppellation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEAPPELLATION$2, i);
        }
    }
    /**
     * An XML appellationValue(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.AppellationComplexType$AppellationValue.
     */
    public static class AppellationValueImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.AppellationComplexType.AppellationValue
    {
        private static final long serialVersionUID = 1L;
        
        public AppellationValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected AppellationValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName PREF$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "pref");
        private static final javax.xml.namespace.QName LANG$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$4 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$6 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        
        
        /**
         * Gets the "pref" attribute
         */
        public java.lang.String getPref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREF$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pref" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREF$0);
                return target;
            }
        }
        
        /**
         * True if has "pref" attribute
         */
        public boolean isSetPref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PREF$0) != null;
            }
        }
        
        /**
         * Sets the "pref" attribute
         */
         public void setPref(java.lang.String pref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREF$0);
                }
                target.setStringValue(pref);
            }
        }
        
        /**
         * Sets (as xml) the "pref" attribute
         */
        public void xsetPref(org.apache.xmlbeans.XmlString pref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREF$0);
                }
                target.set(pref);
            }
        }
        
        /**
         * Unsets the "pref" attribute
         */
        public void unsetPref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PREF$0);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$2);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$2);
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
                return get_store().find_attribute_user(LANG$2) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
         public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$2);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$2);
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
                get_store().remove_attribute(LANG$2);
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
         public void setEncodinganalog(java.lang.String encodinganalog)
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
         public void setLabel(java.lang.String label)
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
    /**
     * An XML sourceAppellation(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.AppellationComplexType$SourceAppellation.
     */
    public static class SourceAppellationImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.AppellationComplexType.SourceAppellation
    {
        private static final long serialVersionUID = 1L;
        
        public SourceAppellationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected SourceAppellationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LANG$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$2 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$4 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        
        
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
         public void setLang(java.lang.String lang)
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
        
        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
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
                return get_store().find_attribute_user(ENCODINGANALOG$2) != null;
            }
        }
        
        /**
         * Sets the "encodinganalog" attribute
         */
         public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$2);
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
                get_store().remove_attribute(ENCODINGANALOG$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
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
                return get_store().find_attribute_user(LABEL$4) != null;
            }
        }
        
        /**
         * Sets the "label" attribute
         */
         public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$4);
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
                get_store().remove_attribute(LABEL$4);
            }
        }
    }
}
