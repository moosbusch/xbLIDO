/*
 * An XML document type.
 * Localname: animateColor
 * Namespace: http://www.w3.org/2001/SMIL20/
 * Java type: org.w3.x2001.smil20.AnimateColorDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.smil20.impl;

import com.google.inject.Inject;

/**
 * A document containing one animateColor(@http://www.w3.org/2001/SMIL20/) element.
 *
 * This is a complex type.
 */
public class AnimateColorDocumentImpl extends org.w3.x2001.smil20.language.impl.AnimateColorDocumentImpl implements org.w3.x2001.smil20.AnimateColorDocument
{
    private static final long serialVersionUID = 1L;

    public AnimateColorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ANIMATECOLOR2$0 =
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "animateColor");


    /**
     * Gets the "animateColor" element
     */
    public org.w3.x2001.smil20.language.AnimateColorType getAnimateColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateColorType target = null;
            target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().find_element_user(ANIMATECOLOR2$0, 0);
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
    @Inject(optional=true) public void setAnimateColor2(org.w3.x2001.smil20.language.AnimateColorType animateColor2)
    {
        generatedSetterHelperImpl(animateColor2, ANIMATECOLOR2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "animateColor" element
     */
    public org.w3.x2001.smil20.language.AnimateColorType addNewAnimateColor2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.AnimateColorType target = null;
            target = (org.w3.x2001.smil20.language.AnimateColorType)get_store().add_element_user(ANIMATECOLOR2$0);
            return target;
        }
    }
}
