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
 * A document containing one DefinitionCollection(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DefinitionCollectionDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.DefinitionCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionCollection");
    
    
    /**
     * Gets the "DefinitionCollection" element
     */
    public net.opengis.gml.DictionaryType getDefinitionCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryType target = null;
            target = (net.opengis.gml.DictionaryType)get_store().find_element_user(DEFINITIONCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DefinitionCollection" element
     */
    @Inject(optional=true) public void setDefinitionCollection(net.opengis.gml.DictionaryType definitionCollection)
    {
        generatedSetterHelperImpl(definitionCollection, DEFINITIONCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DefinitionCollection" element
     */
    public net.opengis.gml.DictionaryType addNewDefinitionCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DictionaryType target = null;
            target = (net.opengis.gml.DictionaryType)get_store().add_element_user(DEFINITIONCOLLECTION$0);
            return target;
        }
    }
}
