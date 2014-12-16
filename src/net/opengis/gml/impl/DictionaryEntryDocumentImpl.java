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
 * A document containing one dictionaryEntry(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DictionaryEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DictionaryEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DictionaryEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DICTIONARYENTRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dictionaryEntry");
    private static final org.apache.xmlbeans.QNameSet DICTIONARYENTRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "definitionMember"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "dictionaryEntry"),
    });
    
    
    /**
     * Gets the "dictionaryEntry" element
     */
    public net.opengis.gml.DictionaryEntryType getDictionaryEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().find_element_user(DICTIONARYENTRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dictionaryEntry" element
     */
     public void setDictionaryEntry(net.opengis.gml.DictionaryEntryType dictionaryEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().find_element_user(DICTIONARYENTRY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DictionaryEntryType)get_store().add_element_user(DICTIONARYENTRY$0);
            }
            target.set(dictionaryEntry);
        }
    }
    
    /**
     * Appends and returns a new empty "dictionaryEntry" element
     */
    public net.opengis.gml.DictionaryEntryType addNewDictionaryEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryEntryType target = null;
            target = (net.opengis.gml.DictionaryEntryType)get_store().add_element_user(DICTIONARYENTRY$0);
            return target;
        }
    }
}
