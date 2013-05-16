/*
 * An XML document type.
 * Localname: set
 * Namespace: http://www.w3.org/2001/SMIL20/Language
 * Java type: org.w3.x2001.smil20.language.SetDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.smil20.language.impl;

import com.google.inject.Inject;

/**
 * A document containing one set(@http://www.w3.org/2001/SMIL20/Language) element.
 *
 * This is a complex type.
 */
public class SetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2001.smil20.language.SetDocument
{
    private static final long serialVersionUID = 1L;

    public SetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName SET$0 =
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/Language", "set");
    private static final org.apache.xmlbeans.QNameSet SET$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] {
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "set"),
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/Language", "set"),
    });


    /**
     * Gets the "set" element
     */
    public org.w3.x2001.smil20.language.SetType getSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.SetType target = null;
            target = (org.w3.x2001.smil20.language.SetType)get_store().find_element_user(SET$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "set" element
     */
    @Inject(optional=true) public void setSet(org.w3.x2001.smil20.language.SetType set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.SetType target = null;
            target = (org.w3.x2001.smil20.language.SetType)get_store().find_element_user(SET$1, 0);
            if (target == null)
            {
                target = (org.w3.x2001.smil20.language.SetType)get_store().add_element_user(SET$0);
            }
            target.set(set);
        }
    }

    /**
     * Appends and returns a new empty "set" element
     */
    public org.w3.x2001.smil20.language.SetType addNewSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.SetType target = null;
            target = (org.w3.x2001.smil20.language.SetType)get_store().add_element_user(SET$0);
            return target;
        }
    }
}
