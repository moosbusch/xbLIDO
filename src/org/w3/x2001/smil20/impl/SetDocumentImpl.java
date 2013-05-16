/*
 * An XML document type.
 * Localname: set
 * Namespace: http://www.w3.org/2001/SMIL20/
 * Java type: org.w3.x2001.smil20.SetDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2001.smil20.impl;

import com.google.inject.Inject;

/**
 * A document containing one set(@http://www.w3.org/2001/SMIL20/) element.
 *
 * This is a complex type.
 */
public class SetDocumentImpl extends org.w3.x2001.smil20.language.impl.SetDocumentImpl implements org.w3.x2001.smil20.SetDocument
{
    private static final long serialVersionUID = 1L;

    public SetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName SET2$0 =
        new javax.xml.namespace.QName("http://www.w3.org/2001/SMIL20/", "set");


    /**
     * Gets the "set" element
     */
    public org.w3.x2001.smil20.language.SetType getSet2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.SetType target = null;
            target = (org.w3.x2001.smil20.language.SetType)get_store().find_element_user(SET2$0, 0);
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
    @Inject(optional=true) public void setSet2(org.w3.x2001.smil20.language.SetType set2)
    {
        generatedSetterHelperImpl(set2, SET2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "set" element
     */
    public org.w3.x2001.smil20.language.SetType addNewSet2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2001.smil20.language.SetType target = null;
            target = (org.w3.x2001.smil20.language.SetType)get_store().add_element_user(SET2$0);
            return target;
        }
    }
}
