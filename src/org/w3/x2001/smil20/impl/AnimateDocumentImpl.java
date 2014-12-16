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
package org.w3.x2001.smil20.impl;



/**
 * A document containing one animate(@http://www.w3.org/2001/SMIL20/) element.
 *
 * This is a complex type.
 */
public class AnimateDocumentImpl extends org.w3.x2001.smil20.language.impl.AnimateDocumentImpl implements org.w3.x2001.smil20.AnimateDocument
{
    private static final long serialVersionUID = 1L;

    public AnimateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ANIMATE2$0 =
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animate");


    /**
     * Gets the "animate" element
     */
    public org.w3.x2001.smil20.language.AnimateType getAnimate2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType target = null;
            target = (org.w3.x2001.smil20.language.AnimateType)get_store().find_element_user(ANIMATE2$0, 0);
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
     public void setAnimate2(org.w3.x2001.smil20.language.AnimateType animate2)
    {
        generatedSetterHelperImpl(animate2, ANIMATE2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "animate" element
     */
    public org.w3.x2001.smil20.language.AnimateType addNewAnimate2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateType target = null;
            target = (org.w3.x2001.smil20.language.AnimateType)get_store().add_element_user(ANIMATE2$0);
            return target;
        }
    }
}
