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
package org.w3.x1999.xlink.impl;  
/**
 * A document containing one title(@http://www.w3.org/1999/xlink) element.
 *
 * This is a complex type.
 */
public class TitleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.TitleDocument
{
    private static final long serialVersionUID = 1L;
    
    public TitleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    
    
    /**
     * Gets the "title" element
     */
    public org.w3.x1999.xlink.TitleEltType getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleEltType target = null;
            target = (org.w3.x1999.xlink.TitleEltType)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
     public void setTitle(org.w3.x1999.xlink.TitleEltType title)
    {
        generatedSetterHelperImpl(title, TITLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public org.w3.x1999.xlink.TitleEltType addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.TitleEltType target = null;
            target = (org.w3.x1999.xlink.TitleEltType)get_store().add_element_user(TITLE$0);
            return target;
        }
    }
}
