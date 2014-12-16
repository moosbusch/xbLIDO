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
 * A document containing one PassThroughOperation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PassThroughOperationDocumentImpl extends net.opengis.gml.impl.SingleOperationDocumentImpl implements net.opengis.gml.PassThroughOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public PassThroughOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSTHROUGHOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PassThroughOperation");
    
    
    /**
     * Gets the "PassThroughOperation" element
     */
    public net.opengis.gml.PassThroughOperationType getPassThroughOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PassThroughOperationType target = null;
            target = (net.opengis.gml.PassThroughOperationType)get_store().find_element_user(PASSTHROUGHOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PassThroughOperation" element
     */
     public void setPassThroughOperation(net.opengis.gml.PassThroughOperationType passThroughOperation)
    {
        generatedSetterHelperImpl(passThroughOperation, PASSTHROUGHOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PassThroughOperation" element
     */
    public net.opengis.gml.PassThroughOperationType addNewPassThroughOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PassThroughOperationType target = null;
            target = (net.opengis.gml.PassThroughOperationType)get_store().add_element_user(PASSTHROUGHOPERATION$0);
            return target;
        }
    }
}
