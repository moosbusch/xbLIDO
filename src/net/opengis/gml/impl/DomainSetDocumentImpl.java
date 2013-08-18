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
 * A document containing one domainSet(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DomainSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DomainSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DomainSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINSET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "domainSet");
    private static final org.apache.xmlbeans.QNameSet DOMAINSET$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiPointDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiCurveDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSolidDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "domainSet"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiSurfaceDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rectifiedGridDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "gridDomain"),
    });
    
    
    /**
     * Gets the "domainSet" element
     */
    public net.opengis.gml.DomainSetType getDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DomainSetType target = null;
            target = (net.opengis.gml.DomainSetType)get_store().find_element_user(DOMAINSET$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "domainSet" element
     */
    @Inject(optional=true) public void setDomainSet(net.opengis.gml.DomainSetType domainSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DomainSetType target = null;
            target = (net.opengis.gml.DomainSetType)get_store().find_element_user(DOMAINSET$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DomainSetType)get_store().add_element_user(DOMAINSET$0);
            }
            target.set(domainSet);
        }
    }
    
    /**
     * Appends and returns a new empty "domainSet" element
     */
    public net.opengis.gml.DomainSetType addNewDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DomainSetType target = null;
            target = (net.opengis.gml.DomainSetType)get_store().add_element_user(DOMAINSET$0);
            return target;
        }
    }
}
