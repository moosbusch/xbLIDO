/*
 * An XML document type.
 * Localname: administrativeMetadata
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.AdministrativeMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one administrativeMetadata(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class AdministrativeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.AdministrativeMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdministrativeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADMINISTRATIVEMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "administrativeMetadata");
    
    
    /**
     * Gets the "administrativeMetadata" element
     */
    public org.lidoSchema.AdministrativeMetadataComplexType getAdministrativeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AdministrativeMetadataComplexType target = null;
            target = (org.lidoSchema.AdministrativeMetadataComplexType)get_store().find_element_user(ADMINISTRATIVEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "administrativeMetadata" element
     */
    @Inject(optional=true) public void setAdministrativeMetadata(org.lidoSchema.AdministrativeMetadataComplexType administrativeMetadata)
    {
        generatedSetterHelperImpl(administrativeMetadata, ADMINISTRATIVEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "administrativeMetadata" element
     */
    public org.lidoSchema.AdministrativeMetadataComplexType addNewAdministrativeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.AdministrativeMetadataComplexType target = null;
            target = (org.lidoSchema.AdministrativeMetadataComplexType)get_store().add_element_user(ADMINISTRATIVEMETADATA$0);
            return target;
        }
    }
}
