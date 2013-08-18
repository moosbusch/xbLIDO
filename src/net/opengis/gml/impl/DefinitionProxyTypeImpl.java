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
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML DefinitionProxyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DefinitionProxyTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.DefinitionProxyType
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionProxyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "definitionRef");
    
    
    /**
     * Gets the "definitionRef" element
     */
    public net.opengis.gml.ReferenceType getDefinitionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().find_element_user(DEFINITIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitionRef" element
     */
    @Inject(optional=true) public void setDefinitionRef(net.opengis.gml.ReferenceType definitionRef)
    {
        generatedSetterHelperImpl(definitionRef, DEFINITIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definitionRef" element
     */
    public net.opengis.gml.ReferenceType addNewDefinitionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().add_element_user(DEFINITIONREF$0);
            return target;
        }
    }
}
