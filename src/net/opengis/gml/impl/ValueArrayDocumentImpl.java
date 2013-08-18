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
 * A document containing one ValueArray(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ValueArrayDocumentImpl extends net.opengis.gml.impl.CompositeValueDocumentImpl implements net.opengis.gml.ValueArrayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueArrayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEARRAY1$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ValueArray");
    
    
    /**
     * Gets the "ValueArray" element
     */
    public net.opengis.gml.ValueArrayType getValueArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValueArrayType target = null;
            target = (net.opengis.gml.ValueArrayType)get_store().find_element_user(VALUEARRAY1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValueArray" element
     */
    @Inject(optional=true) public void setValueArray1(net.opengis.gml.ValueArrayType valueArray1)
    {
        generatedSetterHelperImpl(valueArray1, VALUEARRAY1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValueArray" element
     */
    public net.opengis.gml.ValueArrayType addNewValueArray1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ValueArrayType target = null;
            target = (net.opengis.gml.ValueArrayType)get_store().add_element_user(VALUEARRAY1$0);
            return target;
        }
    }
}
