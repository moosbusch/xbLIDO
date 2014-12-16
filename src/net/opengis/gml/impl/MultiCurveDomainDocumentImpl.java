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
 * A document containing one multiCurveDomain(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiCurveDomainDocumentImpl extends net.opengis.gml.impl.DomainSetDocumentImpl implements net.opengis.gml.MultiCurveDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurveDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICURVEDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiCurveDomain");
    
    
    /**
     * Gets the "multiCurveDomain" element
     */
    public net.opengis.gml.MultiCurveDomainType getMultiCurveDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurveDomainType target = null;
            target = (net.opengis.gml.MultiCurveDomainType)get_store().find_element_user(MULTICURVEDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCurveDomain" element
     */
     public void setMultiCurveDomain(net.opengis.gml.MultiCurveDomainType multiCurveDomain)
    {
        generatedSetterHelperImpl(multiCurveDomain, MULTICURVEDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCurveDomain" element
     */
    public net.opengis.gml.MultiCurveDomainType addNewMultiCurveDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiCurveDomainType target = null;
            target = (net.opengis.gml.MultiCurveDomainType)get_store().add_element_user(MULTICURVEDOMAIN$0);
            return target;
        }
    }
}
