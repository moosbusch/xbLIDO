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
 * A document containing one CompositeValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CompositeValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CompositeValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompositeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOSITEVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeValue");
    private static final org.apache.xmlbeans.QNameSet COMPOSITEVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ValueArray"),
    });
    
    
    /**
     * Gets the "CompositeValue" element
     */
    public net.opengis.gml.CompositeValueType getCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().find_element_user(COMPOSITEVALUE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompositeValue" element
     */
     public void setCompositeValue(net.opengis.gml.CompositeValueType compositeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().find_element_user(COMPOSITEVALUE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CompositeValueType)get_store().add_element_user(COMPOSITEVALUE$0);
            }
            target.set(compositeValue);
        }
    }
    
    /**
     * Appends and returns a new empty "CompositeValue" element
     */
    public net.opengis.gml.CompositeValueType addNewCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().add_element_user(COMPOSITEVALUE$0);
            return target;
        }
    }
}
