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
 * A document containing one doubleOrNullTupleList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DoubleOrNullTupleListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DoubleOrNullTupleListDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoubleOrNullTupleListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOUBLEORNULLTUPLELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "doubleOrNullTupleList");
    
    
    /**
     * Gets the "doubleOrNullTupleList" element
     */
    public java.util.List getDoubleOrNullTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNULLTUPLELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "doubleOrNullTupleList" element
     */
    public net.opengis.gml.DoubleOrNullList xgetDoubleOrNullTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DoubleOrNullList target = null;
            target = (net.opengis.gml.DoubleOrNullList)get_store().find_element_user(DOUBLEORNULLTUPLELIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "doubleOrNullTupleList" element
     */
     public void setDoubleOrNullTupleList(java.util.List doubleOrNullTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNULLTUPLELIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEORNULLTUPLELIST$0);
            }
            target.setListValue(doubleOrNullTupleList);
        }
    }
    
    /**
     * Sets (as xml) the "doubleOrNullTupleList" element
     */
    public void xsetDoubleOrNullTupleList(net.opengis.gml.DoubleOrNullList doubleOrNullTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DoubleOrNullList target = null;
            target = (net.opengis.gml.DoubleOrNullList)get_store().find_element_user(DOUBLEORNULLTUPLELIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DoubleOrNullList)get_store().add_element_user(DOUBLEORNULLTUPLELIST$0);
            }
            target.set(doubleOrNullTupleList);
        }
    }
}
