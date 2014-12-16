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
 * An XML MultiSolidCoverageType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiSolidCoverageTypeImpl extends net.opengis.gml.impl.AbstractDiscreteCoverageTypeImpl implements net.opengis.gml.MultiSolidCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLIDDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSolidDomain");
    
    
    /**
     * Gets the "multiSolidDomain" element
     */
    public net.opengis.gml.MultiSolidDomainType getMultiSolidDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidDomainType target = null;
            target = (net.opengis.gml.MultiSolidDomainType)get_store().find_element_user(MULTISOLIDDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiSolidDomain" element
     */
     public void setMultiSolidDomain(net.opengis.gml.MultiSolidDomainType multiSolidDomain)
    {
        generatedSetterHelperImpl(multiSolidDomain, MULTISOLIDDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiSolidDomain" element
     */
    public net.opengis.gml.MultiSolidDomainType addNewMultiSolidDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidDomainType target = null;
            target = (net.opengis.gml.MultiSolidDomainType)get_store().add_element_user(MULTISOLIDDOMAIN$0);
            return target;
        }
    }
}
