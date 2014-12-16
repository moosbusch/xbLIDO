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
 * An XML DerivedCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DerivedCRSTypeImpl extends net.opengis.gml.impl.AbstractGeneralDerivedCRSTypeImpl implements net.opengis.gml.DerivedCRSType
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivedCRSType");
    private static final javax.xml.namespace.QName USESCS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesCS");
    
    
    /**
     * Gets the "derivedCRSType" element
     */
    public net.opengis.gml.DerivedCRSTypeType getDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSTypeType target = null;
            target = (net.opengis.gml.DerivedCRSTypeType)get_store().find_element_user(DERIVEDCRSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedCRSType" element
     */
     public void setDerivedCRSType(net.opengis.gml.DerivedCRSTypeType derivedCRSType)
    {
        generatedSetterHelperImpl(derivedCRSType, DERIVEDCRSTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivedCRSType" element
     */
    public net.opengis.gml.DerivedCRSTypeType addNewDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSTypeType target = null;
            target = (net.opengis.gml.DerivedCRSTypeType)get_store().add_element_user(DERIVEDCRSTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType getUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().find_element_user(USESCS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesCS" element
     */
     public void setUsesCS(net.opengis.gml.CoordinateSystemRefType usesCS)
    {
        generatedSetterHelperImpl(usesCS, USESCS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType addNewUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().add_element_user(USESCS$2);
            return target;
        }
    }
}
