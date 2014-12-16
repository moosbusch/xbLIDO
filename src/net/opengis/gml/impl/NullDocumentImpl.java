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
 * A document containing one Null(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class NullDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.NullDocument
{
    private static final long serialVersionUID = 1L;
    
    public NullDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NULL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Null");
    
    
    /**
     * Gets the "Null" element
     */
    public java.lang.Object getNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "Null" element
     */
    public net.opengis.gml.NullType xgetNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Null" element
     */
     public void setNull(java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NULL$0);
            }
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Sets (as xml) the "Null" element
     */
    public void xsetNull(net.opengis.gml.NullType xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.NullType)get_store().add_element_user(NULL$0);
            }
            target.set(xnull);
        }
    }
}
