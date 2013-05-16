/*
 * An XML document type.
 * Localname: locator
 * Namespace: http://www.w3.org/1999/xlink
 * Java type: org.w3.x1999.xlink.LocatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink.impl;  import com.google.inject.Inject;
/**
 * A document containing one locator(@http://www.w3.org/1999/xlink) element.
 *
 * This is a complex type.
 */
public class LocatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.LocatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATOR$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "locator");
    
    
    /**
     * Gets the "locator" element
     */
    public org.w3.x1999.xlink.LocatorType getLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.LocatorType target = null;
            target = (org.w3.x1999.xlink.LocatorType)get_store().find_element_user(LOCATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "locator" element
     */
    @Inject(optional=true) public void setLocator(org.w3.x1999.xlink.LocatorType locator)
    {
        generatedSetterHelperImpl(locator, LOCATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locator" element
     */
    public org.w3.x1999.xlink.LocatorType addNewLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.LocatorType target = null;
            target = (org.w3.x1999.xlink.LocatorType)get_store().add_element_user(LOCATOR$0);
            return target;
        }
    }
}
