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
 * A document containing one politicalEntity(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class PoliticalEntityAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.PoliticalEntityAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PoliticalEntityAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLITICALENTITY$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "politicalEntity");
    
    
    /**
     * Gets the "politicalEntity" attribute
     */
    public java.lang.String getPoliticalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLITICALENTITY$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLITICALENTITY$0);
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
            return get_store().find_attribute_user(POLITICALENTITY$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLITICALENTITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POLITICALENTITY$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLITICALENTITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POLITICALENTITY$0);
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
            get_store().remove_attribute(POLITICALENTITY$0);
        }
    }
}
