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
 * A document containing one _GeneralOperationParameter(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralOperationParameterDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.GeneralOperationParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralOperationParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALOPERATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralOperationParameter");
    private static final org.apache.xmlbeans.QNameSet GENERALOPERATIONPARAMETER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameter"),
    });
    
    
    /**
     * Gets the "_GeneralOperationParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterType getGeneralOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterType)get_store().find_element_user(GENERALOPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeneralOperationParameter" element
     */
     public void setGeneralOperationParameter(net.opengis.gml.AbstractGeneralOperationParameterType generalOperationParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterType)get_store().find_element_user(GENERALOPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeneralOperationParameterType)get_store().add_element_user(GENERALOPERATIONPARAMETER$0);
            }
            target.set(generalOperationParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeneralOperationParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterType addNewGeneralOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterType)get_store().add_element_user(GENERALOPERATIONPARAMETER$0);
            return target;
        }
    }
}
