/*
 * An XML document type.
 * Localname: arc
 * Namespace: http://www.w3.org/1999/xlink
 * Java type: org.w3.x1999.xlink.ArcDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xlink.impl;  import com.google.inject.Inject;
/**
 * A document containing one arc(@http://www.w3.org/1999/xlink) element.
 *
 * This is a complex type.
 */
public class ArcDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.ArcDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARC$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "arc");
    
    
    /**
     * Gets the "arc" element
     */
    public org.w3.x1999.xlink.ArcType getArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcType target = null;
            target = (org.w3.x1999.xlink.ArcType)get_store().find_element_user(ARC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "arc" element
     */
    @Inject(optional=true) public void setArc(org.w3.x1999.xlink.ArcType arc)
    {
        generatedSetterHelperImpl(arc, ARC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "arc" element
     */
    public org.w3.x1999.xlink.ArcType addNewArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ArcType target = null;
            target = (org.w3.x1999.xlink.ArcType)get_store().add_element_user(ARC$0);
            return target;
        }
    }
}
