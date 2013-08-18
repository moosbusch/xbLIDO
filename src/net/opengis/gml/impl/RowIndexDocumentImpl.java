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
 * A document containing one rowIndex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RowIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.RowIndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public RowIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROWINDEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rowIndex");
    
    
    /**
     * Gets the "rowIndex" element
     */
    public java.math.BigInteger getRowIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWINDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowIndex" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetRowIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROWINDEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rowIndex" element
     */
    @Inject(optional=true) public void setRowIndex(java.math.BigInteger rowIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROWINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROWINDEX$0);
            }
            target.setBigIntegerValue(rowIndex);
        }
    }
    
    /**
     * Sets (as xml) the "rowIndex" element
     */
    public void xsetRowIndex(org.apache.xmlbeans.XmlPositiveInteger rowIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(ROWINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(ROWINDEX$0);
            }
            target.set(rowIndex);
        }
    }
}
