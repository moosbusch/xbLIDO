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
package org.w3.x2001.smil20.language.impl;

import com.google.inject.Inject;

/**
 * A document containing one animate(@http://www.w3.org/2001/SMIL20/Language) element.
 *
 * This is a complex type.
 */
public class AnimateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.smil20.language.AnimateDocument
{
    private static final long serialVersionUID = 1L;

    public AnimateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ANIMATE$0 =
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/Language", "animate");
    private static final org.apache.xmlbeans.QNameSet ANIMATE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] {
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animate"),
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/Language", "animate"),
    });


    /**
     * Gets the "animate" element
     */
    public org.w3.x2001.smil20.language.AnimateType getAnimate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType target = null;
            target = (org.w3.x2001.smil20.language.AnimateType)get_store().find_element_user(ANIMATE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "animate" element
     */
    @Inject(optional=true) public void setAnimate(org.w3.x2001.smil20.language.AnimateType animate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType target = null;
            target = (org.w3.x2001.smil20.language.AnimateType)get_store().find_element_user(ANIMATE$1, 0);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.language.AnimateType)get_store().add_element_user(ANIMATE$0);
            }
            target.set(animate);
        }
    }

    /**
     * Appends and returns a new empty "animate" element
     */
    public org.w3.x2001.smil20.language.AnimateType addNewAnimate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType target = null;
            target = (org.w3.x2001.smil20.language.AnimateType)get_store().add_element_user(ANIMATE$0);
            return target;
        }
    }
}
