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
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one booleanValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BooleanValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BooleanValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public BooleanValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEANVALUE1$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "booleanValue");
    
    
    /**
     * Gets the "booleanValue" element
     */
    public boolean getBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALUE1$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "booleanValue" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "booleanValue" element
     */
    @Inject(optional=true) public void setBooleanValue1(boolean booleanValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALUE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANVALUE1$0);
            }
            target.setBooleanValue(booleanValue1);
        }
    }
    
    /**
     * Sets (as xml) the "booleanValue" element
     */
    public void xsetBooleanValue1(org.apache.xmlbeans.XmlBoolean booleanValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEANVALUE1$0);
            }
            target.set(booleanValue1);
        }
    }
}
