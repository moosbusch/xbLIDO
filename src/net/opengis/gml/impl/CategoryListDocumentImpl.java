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
package net.opengis.gml.impl; 
/**
 * A document containing one CategoryList(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CategoryListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CategoryListDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CategoryList");
    
    
    /**
     * Gets the "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType getCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().find_element_user(CATEGORYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryList" element
     */
     public void setCategoryList(net.opengis.gml.CodeOrNullListType categoryList)
    {
        generatedSetterHelperImpl(categoryList, CATEGORYLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType addNewCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().add_element_user(CATEGORYLIST$0);
            return target;
        }
    }
}
