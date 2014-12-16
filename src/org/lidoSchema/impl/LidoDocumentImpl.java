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
package org.lidoSchema.impl;  
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
     public void setLido(org.lidoSchema.LidoComplexType lido)
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
