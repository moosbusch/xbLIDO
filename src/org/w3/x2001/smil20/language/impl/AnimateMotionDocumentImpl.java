/*
 * An XML document type.
 * Localname: animateMotion
 * Namespace: http://www.w3.org/2001/SMIL20/Language
 * Java type: org.w3.x2001.smil20.language.AnimateMotionDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.smil20.language.impl;

import com.google.inject.Inject;

/**
 * A document containing one animateMotion(@http://www.w3.org/2001/SMIL20/Language) element.
 *
 * This is a complex type.
 */
public class AnimateMotionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.smil20.language.AnimateMotionDocument
{
    private static final long serialVersionUID = 1L;

    public AnimateMotionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ANIMATEMOTION$0 =
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/Language", "animateMotion");
    private static final org.apache.xmlbeans.QNameSet ANIMATEMOTION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] {
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animateMotion"),
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/Language", "animateMotion"),
    });


    /**
     * Gets the "animateMotion" element
     */
    public org.w3.x2001.smil20.language.AnimateMotionType getAnimateMotion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateMotionType target = null;
            target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().find_element_user(ANIMATEMOTION$1, 0);
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
    @Inject(optional=true) public void setAnimateMotion(org.w3.x2001.smil20.language.AnimateMotionType animateMotion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateMotionType target = null;
            target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().find_element_user(ANIMATEMOTION$1, 0);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().add_element_user(ANIMATEMOTION$0);
            }
            target.set(animateMotion);
        }
    }

    /**
     * Appends and returns a new empty "animateMotion" element
     */
    public org.w3.x2001.smil20.language.AnimateMotionType addNewAnimateMotion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateMotionType target = null;
            target = (org.w3.x2001.smil20.language.AnimateMotionType)get_store().add_element_user(ANIMATEMOTION$0);
            return target;
        }
    }
}
