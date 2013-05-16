/*
 * An XML document type.
 * Localname: descriptiveMetadata
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.DescriptiveMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * A document containing one descriptiveMetadata(@http://www.lido-schema.org) element.
 *
 * This is a complex type.
 */
public class DescriptiveMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.DescriptiveMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiveMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIVEMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "descriptiveMetadata");
    
    
    /**
     * Gets the "descriptiveMetadata" element
     */
    public org.lidoSchema.DescriptiveMetadataComplexType getDescriptiveMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DescriptiveMetadataComplexType target = null;
            target = (org.lidoSchema.DescriptiveMetadataComplexType)get_store().find_element_user(DESCRIPTIVEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptiveMetadata" element
     */
    @Inject(optional=true) public void setDescriptiveMetadata(org.lidoSchema.DescriptiveMetadataComplexType descriptiveMetadata)
    {
        generatedSetterHelperImpl(descriptiveMetadata, DESCRIPTIVEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptiveMetadata" element
     */
    public org.lidoSchema.DescriptiveMetadataComplexType addNewDescriptiveMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DescriptiveMetadataComplexType target = null;
            target = (org.lidoSchema.DescriptiveMetadataComplexType)get_store().add_element_user(DESCRIPTIVEMETADATA$0);
            return target;
        }
    }
}
