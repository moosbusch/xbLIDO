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
 * A document containing one addedSearchTerm(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class AddedSearchTermAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.AddedSearchTermAttribute
{
    private static final long serialVersionUID = 1L;
    
    public AddedSearchTermAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDEDSEARCHTERM$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "addedSearchTerm");
    
    
    /**
     * Gets the "addedSearchTerm" attribute
     */
    public org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm.Enum getAddedSearchTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDEDSEARCHTERM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ADDEDSEARCHTERM$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "addedSearchTerm" attribute
     */
    public org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm xgetAddedSearchTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm target = null;
            target = (org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm)get_store().find_attribute_user(ADDEDSEARCHTERM$0);
            if (target == null)
            {
                target = (org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm)get_default_attribute_value(ADDEDSEARCHTERM$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "addedSearchTerm" attribute
     */
    public boolean isSetAddedSearchTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDEDSEARCHTERM$0) != null;
        }
    }
    
    /**
     * Sets the "addedSearchTerm" attribute
     */
    @Inject(optional=true) public void setAddedSearchTerm(org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm.Enum addedSearchTerm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDEDSEARCHTERM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDEDSEARCHTERM$0);
            }
            target.setEnumValue(addedSearchTerm);
        }
    }
    
    /**
     * Sets (as xml) the "addedSearchTerm" attribute
     */
    public void xsetAddedSearchTerm(org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm addedSearchTerm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm target = null;
            target = (org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm)get_store().find_attribute_user(ADDEDSEARCHTERM$0);
            if (target == null)
            {
                target = (org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm)get_store().add_attribute_user(ADDEDSEARCHTERM$0);
            }
            target.set(addedSearchTerm);
        }
    }
    
    /**
     * Unsets the "addedSearchTerm" attribute
     */
    public void unsetAddedSearchTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDEDSEARCHTERM$0);
        }
    }
    /**
     * An XML addedSearchTerm(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.AddedSearchTermAttribute$AddedSearchTerm.
     */
    public static class AddedSearchTermImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.lidoSchema.AddedSearchTermAttribute.AddedSearchTerm
    {
        private static final long serialVersionUID = 1L;
        
        public AddedSearchTermImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AddedSearchTermImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
