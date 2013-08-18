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

import com.google.inject.Inject;

/**
 * A document containing one animateMotion(@http://www.w3.org/2001/SMIL20/) element.
 *
 * This is a complex type.
 */
public class AnimateMotionDocumentImpl extends org.w3.x2001.smil20.language.impl.AnimateMotionDocumentImpl implements org.w3.x2001.smil20.AnimateMotionDocument
{
    private static final long serialVersionUID = 1L;

    public AnimateMotionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ANIMATEMOTION2$0 =
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animateMotion");


    /**
     * Gets the "animateMotion" element
     */
    public org.w3.x2001.smil20.language.AnimateMotionType getAnimateMotion2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateMotionType target = null;
            target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().find_element_user(ANIMATEMOTION2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "animateMotion" element
     */
    @Inject(optional=true) public void setAnimateMotion2(org.w3.x2001.smil20.language.AnimateMotionType animateMotion2)
    {
        generatedSetterHelperImpl(animateMotion2, ANIMATEMOTION2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "animateMotion" element
     */
    public org.w3.x2001.smil20.language.AnimateMotionType addNewAnimateMotion2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateMotionType target = null;
            target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().add_element_user(ANIMATEMOTION2$0);
            return target;
        }
    }
}
