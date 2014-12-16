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



/**
 * A document containing one animateColor(@http://www.w3.org/2001/SMIL20/Language) element.
 *
 * This is a complex type.
 */
public class AnimateColorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.smil20.language.AnimateColorDocument
{
    private static final long serialVersionUID = 1L;

    public AnimateColorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ANIMATECOLOR$0 =
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/Language", "animateColor");
    private static final org.apache.xmlbeans.QNameSet ANIMATECOLOR$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] {
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animateColor"),
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/Language", "animateColor"),
    });


    /**
     * Gets the "animateColor" element
     */
    public org.w3.x2001.smil20.language.AnimateColorType getAnimateColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateColorType target = null;
            target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().find_element_user(ANIMATECOLOR$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "animateColor" element
     */
     public void setAnimateColor(org.w3.x2001.smil20.language.AnimateColorType animateColor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateColorType target = null;
            target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().find_element_user(ANIMATECOLOR$1, 0);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().add_element_user(ANIMATECOLOR$0);
            }
            target.set(animateColor);
        }
    }

    /**
     * Appends and returns a new empty "animateColor" element
     */
    public org.w3.x2001.smil20.language.AnimateColorType addNewAnimateColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateColorType target = null;
            target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().add_element_user(ANIMATECOLOR$0);
            return target;
        }
    }
}
