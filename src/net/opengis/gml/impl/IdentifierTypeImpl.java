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
 * An XML IdentifierType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class IdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public IdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name");
    private static final org.apache.xmlbeans.QNameSet NAME$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "meridianName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "datumName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "groupName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "srsName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "csName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name"),
    });
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "version");
    private static final javax.xml.namespace.QName REMARKS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    
    
    /**
     * Gets the "name" element
     */
    public net.opengis.gml.CodeType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
     public void setName(net.opengis.gml.CodeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CodeType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public net.opengis.gml.CodeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
     public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$2);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$2);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$2, 0);
        }
    }
    
    /**
     * Gets the "remarks" element
     */
    public net.opengis.gml.StringOrRefType getRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(REMARKS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remarks" element
     */
    public boolean isSetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMARKS$4) != 0;
        }
    }
    
    /**
     * Sets the "remarks" element
     */
     public void setRemarks(net.opengis.gml.StringOrRefType remarks)
    {
        generatedSetterHelperImpl(remarks, REMARKS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    public net.opengis.gml.StringOrRefType addNewRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(REMARKS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "remarks" element
     */
    public void unsetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMARKS$4, 0);
        }
    }
}
