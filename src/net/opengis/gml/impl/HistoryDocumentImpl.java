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
 * A document containing one history(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class HistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.HistoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public HistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HISTORY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "history");
    private static final org.apache.xmlbeans.QNameSet HISTORY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "track"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "history"),
    });
    
    
    /**
     * Gets the "history" element
     */
    public net.opengis.gml.HistoryPropertyType getHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().find_element_user(HISTORY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "history" element
     */
     public void setHistory(net.opengis.gml.HistoryPropertyType history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().find_element_user(HISTORY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.HistoryPropertyType)get_store().add_element_user(HISTORY$0);
            }
            target.set(history);
        }
    }
    
    /**
     * Appends and returns a new empty "history" element
     */
    public net.opengis.gml.HistoryPropertyType addNewHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().add_element_user(HISTORY$0);
            return target;
        }
    }
}
