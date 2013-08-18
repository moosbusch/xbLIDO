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
package org.w3.x1999.xlink.impl;  import com.google.inject.Inject;
/**
 * A document containing one resource(@http://www.w3.org/1999/xlink) element.
 *
 * This is a complex type.
 */
public class ResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xlink.ResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "resource");
    
    
    /**
     * Gets the "resource" element
     */
    public org.w3.x1999.xlink.ResourceType getResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ResourceType target = null;
            target = (org.w3.x1999.xlink.ResourceType)get_store().find_element_user(RESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource" element
     */
    @Inject(optional=true) public void setResource(org.w3.x1999.xlink.ResourceType resource)
    {
        generatedSetterHelperImpl(resource, RESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resource" element
     */
    public org.w3.x1999.xlink.ResourceType addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ResourceType target = null;
            target = (org.w3.x1999.xlink.ResourceType)get_store().add_element_user(RESOURCE$0);
            return target;
        }
    }
}
