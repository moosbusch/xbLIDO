/*
 * An XML document type.
 * Localname: animateColor
 * Namespace: http://www.w3.org/2001/SMIL20/Language
 * Java type: org.w3.x2001.smil20.language.AnimateColorDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.smil20.language.impl;

import com.google.inject.Inject;

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
    @Inject(optional=true) public void setAnimateColor(org.w3.x2001.smil20.language.AnimateColorType animateColor)
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
