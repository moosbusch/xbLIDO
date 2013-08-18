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
 * An XML AbstractTimeReferenceSystemType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractTimeReferenceSystemTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.AbstractTimeReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINOFVALIDITY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "domainOfValidity");
    
    
    /**
     * Gets the "domainOfValidity" element
     */
    public java.lang.String getDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domainOfValidity" element
     */
    public org.apache.xmlbeans.XmlString xgetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "domainOfValidity" element
     */
    public boolean isSetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINOFVALIDITY$0) != 0;
        }
    }
    
    /**
     * Sets the "domainOfValidity" element
     */
    @Inject(optional=true) public void setDomainOfValidity(java.lang.String domainOfValidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINOFVALIDITY$0);
            }
            target.setStringValue(domainOfValidity);
        }
    }
    
    /**
     * Sets (as xml) the "domainOfValidity" element
     */
    public void xsetDomainOfValidity(org.apache.xmlbeans.XmlString domainOfValidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINOFVALIDITY$0);
            }
            target.set(domainOfValidity);
        }
    }
    
    /**
     * Unsets the "domainOfValidity" element
     */
    public void unsetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINOFVALIDITY$0, 0);
        }
    }
}
