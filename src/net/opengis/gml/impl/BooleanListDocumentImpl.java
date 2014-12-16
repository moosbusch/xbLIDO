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
 * A document containing one BooleanList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BooleanListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BooleanListDocument
{
    private static final long serialVersionUID = 1L;
    
    public BooleanListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEANLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BooleanList");
    
    
    /**
     * Gets the "BooleanList" element
     */
    public java.util.List getBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "BooleanList" element
     */
    public net.opengis.gml.BooleanOrNullList xgetBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().find_element_user(BOOLEANLIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BooleanList" element
     */
     public void setBooleanList(java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANLIST$0);
            }
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Sets (as xml) the "BooleanList" element
     */
    public void xsetBooleanList(net.opengis.gml.BooleanOrNullList booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().find_element_user(BOOLEANLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.BooleanOrNullList)get_store().add_element_user(BOOLEANLIST$0);
            }
            target.set(booleanList);
        }
    }
}
