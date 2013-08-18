/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
