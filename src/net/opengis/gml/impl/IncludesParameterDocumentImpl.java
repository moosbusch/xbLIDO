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
 * A document containing one includesParameter(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IncludesParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IncludesParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludesParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesParameter");
    
    
    /**
     * Gets the "includesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType getIncludesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().find_element_user(INCLUDESPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includesParameter" element
     */
     public void setIncludesParameter(net.opengis.gml.AbstractGeneralOperationParameterRefType includesParameter)
    {
        generatedSetterHelperImpl(includesParameter, INCLUDESPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includesParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType addNewIncludesParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().add_element_user(INCLUDESPARAMETER$0);
            return target;
        }
    }
}
