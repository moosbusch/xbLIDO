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
 * An XML MultiPointCoverageType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class MultiPointCoverageTypeImpl extends net.opengis.gml.impl.AbstractDiscreteCoverageTypeImpl implements net.opengis.gml.MultiPointCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOINTDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiPointDomain");
    
    
    /**
     * Gets the "multiPointDomain" element
     */
    public net.opengis.gml.MultiPointDomainType getMultiPointDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointDomainType target = null;
            target = (net.opengis.gml.MultiPointDomainType)get_store().find_element_user(MULTIPOINTDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiPointDomain" element
     */
    @Inject(optional=true) public void setMultiPointDomain(net.opengis.gml.MultiPointDomainType multiPointDomain)
    {
        generatedSetterHelperImpl(multiPointDomain, MULTIPOINTDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiPointDomain" element
     */
    public net.opengis.gml.MultiPointDomainType addNewMultiPointDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointDomainType target = null;
            target = (net.opengis.gml.MultiPointDomainType)get_store().add_element_user(MULTIPOINTDOMAIN$0);
            return target;
        }
    }
}
