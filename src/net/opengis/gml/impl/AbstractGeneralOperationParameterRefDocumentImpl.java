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
 * A document containing one abstractGeneralOperationParameterRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class AbstractGeneralOperationParameterRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AbstractGeneralOperationParameterRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralOperationParameterRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERALOPERATIONPARAMETERREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "abstractGeneralOperationParameterRef");
    
    
    /**
     * Gets the "abstractGeneralOperationParameterRef" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType getAbstractGeneralOperationParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().find_element_user(ABSTRACTGENERALOPERATIONPARAMETERREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractGeneralOperationParameterRef" element
     */
     public void setAbstractGeneralOperationParameterRef(net.opengis.gml.AbstractGeneralOperationParameterRefType abstractGeneralOperationParameterRef)
    {
        generatedSetterHelperImpl(abstractGeneralOperationParameterRef, ABSTRACTGENERALOPERATIONPARAMETERREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstractGeneralOperationParameterRef" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType addNewAbstractGeneralOperationParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().add_element_user(ABSTRACTGENERALOPERATIONPARAMETERREF$0);
            return target;
        }
    }
}
