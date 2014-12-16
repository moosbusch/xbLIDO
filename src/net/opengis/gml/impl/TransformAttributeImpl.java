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
package net.opengis.gml.impl; 
/**
 * A document containing one transform(@http://www.opengis.net/gml) attribute.
 *
 * This is a complex type.
 */
public class TransformAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TransformAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TransformAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "transform");
    
    
    /**
     * Gets the "transform" attribute
     */
    public java.lang.String getTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFORM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transform" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSFORM$0);
            return target;
        }
    }
    
    /**
     * True if has "transform" attribute
     */
    public boolean isSetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSFORM$0) != null;
        }
    }
    
    /**
     * Sets the "transform" attribute
     */
     public void setTransform(java.lang.String transform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFORM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSFORM$0);
            }
            target.setStringValue(transform);
        }
    }
    
    /**
     * Sets (as xml) the "transform" attribute
     */
    public void xsetTransform(org.apache.xmlbeans.XmlString transform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSFORM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TRANSFORM$0);
            }
            target.set(transform);
        }
    }
    
    /**
     * Unsets the "transform" attribute
     */
    public void unsetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSFORM$0);
        }
    }
}
