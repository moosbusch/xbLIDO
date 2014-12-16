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
 * A document containing one integerValueList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IntegerValueListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IntegerValueListDocument
{
    private static final long serialVersionUID = 1L;
    
    public IntegerValueListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGERVALUELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "integerValueList");
    
    
    /**
     * Gets the "integerValueList" element
     */
    public java.util.List getIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerValueList" element
     */
    public net.opengis.gml.IntegerList xgetIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(INTEGERVALUELIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "integerValueList" element
     */
     public void setIntegerValueList(java.util.List integerValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUELIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERVALUELIST$0);
            }
            target.setListValue(integerValueList);
        }
    }
    
    /**
     * Sets (as xml) the "integerValueList" element
     */
    public void xsetIntegerValueList(net.opengis.gml.IntegerList integerValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(INTEGERVALUELIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IntegerList)get_store().add_element_user(INTEGERVALUELIST$0);
            }
            target.set(integerValueList);
        }
    }
}
