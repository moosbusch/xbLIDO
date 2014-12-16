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
 * A document containing one using(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsingDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "using");
    
    
    /**
     * Gets the "using" element
     */
    public net.opengis.gml.FeaturePropertyType getUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().find_element_user(USING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "using" element
     */
     public void setUsing(net.opengis.gml.FeaturePropertyType using)
    {
        generatedSetterHelperImpl(using, USING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "using" element
     */
    public net.opengis.gml.FeaturePropertyType addNewUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().add_element_user(USING$0);
            return target;
        }
    }
}
