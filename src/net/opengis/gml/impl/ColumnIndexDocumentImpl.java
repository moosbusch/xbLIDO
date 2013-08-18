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
 * A document containing one columnIndex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ColumnIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ColumnIndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public ColumnIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLUMNINDEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "columnIndex");
    
    
    /**
     * Gets the "columnIndex" element
     */
    public java.math.BigInteger getColumnIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNINDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "columnIndex" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetColumnIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(COLUMNINDEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "columnIndex" element
     */
    @Inject(optional=true) public void setColumnIndex(java.math.BigInteger columnIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLUMNINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLUMNINDEX$0);
            }
            target.setBigIntegerValue(columnIndex);
        }
    }
    
    /**
     * Sets (as xml) the "columnIndex" element
     */
    public void xsetColumnIndex(org.apache.xmlbeans.XmlPositiveInteger columnIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(COLUMNINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(COLUMNINDEX$0);
            }
            target.set(columnIndex);
        }
    }
}
