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
 * A document containing one _generalParameterValue(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralParameterValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeneralParameterValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralParameterValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALPARAMETERVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_generalParameterValue");
    private static final org.apache.xmlbeans.QNameSet GENERALPARAMETERVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterValueGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_generalParameterValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesValue"),
    });
    
    
    /**
     * Gets the "_generalParameterValue" element
     */
    public net.opengis.gml.AbstractGeneralParameterValueType getGeneralParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().find_element_user(GENERALPARAMETERVALUE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_generalParameterValue" element
     */
    @Inject(optional=true) public void setGeneralParameterValue(net.opengis.gml.AbstractGeneralParameterValueType generalParameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().find_element_user(GENERALPARAMETERVALUE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().add_element_user(GENERALPARAMETERVALUE$0);
            }
            target.set(generalParameterValue);
        }
    }
    
    /**
     * Appends and returns a new empty "_generalParameterValue" element
     */
    public net.opengis.gml.AbstractGeneralParameterValueType addNewGeneralParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralParameterValueType target = null;
            target = (net.opengis.gml.AbstractGeneralParameterValueType)get_store().add_element_user(GENERALPARAMETERVALUE$0);
            return target;
        }
    }
}
