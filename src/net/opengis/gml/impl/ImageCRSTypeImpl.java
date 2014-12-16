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
 * An XML ImageCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ImageCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.ImageCRSType
{
    private static final long serialVersionUID = 1L;
    
    public ImageCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESCARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesCartesianCS");
    private static final javax.xml.namespace.QName USESOBLIQUECARTESIANCS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesObliqueCartesianCS");
    private static final javax.xml.namespace.QName USESIMAGEDATUM$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesImageDatum");
    
    
    /**
     * Gets the "usesCartesianCS" element
     */
    public net.opengis.gml.CartesianCSRefType getUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSRefType target = null;
            target = (net.opengis.gml.CartesianCSRefType)get_store().find_element_user(USESCARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesCartesianCS" element
     */
    public boolean isSetUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESCARTESIANCS$0) != 0;
        }
    }
    
    /**
     * Sets the "usesCartesianCS" element
     */
     public void setUsesCartesianCS(net.opengis.gml.CartesianCSRefType usesCartesianCS)
    {
        generatedSetterHelperImpl(usesCartesianCS, USESCARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCartesianCS" element
     */
    public net.opengis.gml.CartesianCSRefType addNewUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSRefType target = null;
            target = (net.opengis.gml.CartesianCSRefType)get_store().add_element_user(USESCARTESIANCS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "usesCartesianCS" element
     */
    public void unsetUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESCARTESIANCS$0, 0);
        }
    }
    
    /**
     * Gets the "usesObliqueCartesianCS" element
     */
    public net.opengis.gml.ObliqueCartesianCSRefType getUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObliqueCartesianCSRefType target = null;
            target = (net.opengis.gml.ObliqueCartesianCSRefType)get_store().find_element_user(USESOBLIQUECARTESIANCS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesObliqueCartesianCS" element
     */
    public boolean isSetUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESOBLIQUECARTESIANCS$2) != 0;
        }
    }
    
    /**
     * Sets the "usesObliqueCartesianCS" element
     */
     public void setUsesObliqueCartesianCS(net.opengis.gml.ObliqueCartesianCSRefType usesObliqueCartesianCS)
    {
        generatedSetterHelperImpl(usesObliqueCartesianCS, USESOBLIQUECARTESIANCS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesObliqueCartesianCS" element
     */
    public net.opengis.gml.ObliqueCartesianCSRefType addNewUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObliqueCartesianCSRefType target = null;
            target = (net.opengis.gml.ObliqueCartesianCSRefType)get_store().add_element_user(USESOBLIQUECARTESIANCS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "usesObliqueCartesianCS" element
     */
    public void unsetUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESOBLIQUECARTESIANCS$2, 0);
        }
    }
    
    /**
     * Gets the "usesImageDatum" element
     */
    public net.opengis.gml.ImageDatumRefType getUsesImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageDatumRefType target = null;
            target = (net.opengis.gml.ImageDatumRefType)get_store().find_element_user(USESIMAGEDATUM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesImageDatum" element
     */
     public void setUsesImageDatum(net.opengis.gml.ImageDatumRefType usesImageDatum)
    {
        generatedSetterHelperImpl(usesImageDatum, USESIMAGEDATUM$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesImageDatum" element
     */
    public net.opengis.gml.ImageDatumRefType addNewUsesImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageDatumRefType target = null;
            target = (net.opengis.gml.ImageDatumRefType)get_store().add_element_user(USESIMAGEDATUM$4);
            return target;
        }
    }
}
