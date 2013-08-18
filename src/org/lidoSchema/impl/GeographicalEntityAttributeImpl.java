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
 * A document containing one geographicalEntity(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class GeographicalEntityAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.GeographicalEntityAttribute
{
    private static final long serialVersionUID = 1L;
    
    public GeographicalEntityAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICALENTITY$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "geographicalEntity");
    
    
    /**
     * Gets the "geographicalEntity" attribute
     */
    public java.lang.String getGeographicalEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOGRAPHICALENTITY$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOGRAPHICALENTITY$0);
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
            return get_store().find_attribute_user(GEOGRAPHICALENTITY$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOGRAPHICALENTITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOGRAPHICALENTITY$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOGRAPHICALENTITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOGRAPHICALENTITY$0);
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
            get_store().remove_attribute(GEOGRAPHICALENTITY$0);
        }
    }
}
