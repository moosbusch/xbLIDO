/*
 * An XML document type.
 * Localname: lido
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.LidoDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one lido(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class LidoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.LidoDocument
{
    private static final long serialVersionUID = 1L;
    
    public LidoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIDO$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "lido");
    
    
    /**
     * Gets the "lido" element
     */
    public org.lidoSchema.LidoComplexType getLido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.LidoComplexType target = null;
            target = (org.lidoSchema.LidoComplexType)get_store().find_element_user(LIDO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lido" element
     */
    @Inject(optional=true) public void setLido(org.lidoSchema.LidoComplexType lido)
    {
        generatedSetterHelperImpl(lido, LIDO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lido" element
     */
    public org.lidoSchema.LidoComplexType addNewLido()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.LidoComplexType target = null;
            target = (org.lidoSchema.LidoComplexType)get_store().add_element_user(LIDO$0);
            return target;
        }
    }
}
