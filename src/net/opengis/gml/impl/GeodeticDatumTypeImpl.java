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
 * An XML GeodeticDatumType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeodeticDatumTypeImpl extends net.opengis.gml.impl.AbstractDatumTypeImpl implements net.opengis.gml.GeodeticDatumType
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESPRIMEMERIDIAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesPrimeMeridian");
    private static final javax.xml.namespace.QName USESELLIPSOID$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesEllipsoid");
    
    
    /**
     * Gets the "usesPrimeMeridian" element
     */
    public net.opengis.gml.PrimeMeridianRefType getUsesPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PrimeMeridianRefType target = null;
            target = (net.opengis.gml.PrimeMeridianRefType)get_store().find_element_user(USESPRIMEMERIDIAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesPrimeMeridian" element
     */
     public void setUsesPrimeMeridian(net.opengis.gml.PrimeMeridianRefType usesPrimeMeridian)
    {
        generatedSetterHelperImpl(usesPrimeMeridian, USESPRIMEMERIDIAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesPrimeMeridian" element
     */
    public net.opengis.gml.PrimeMeridianRefType addNewUsesPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PrimeMeridianRefType target = null;
            target = (net.opengis.gml.PrimeMeridianRefType)get_store().add_element_user(USESPRIMEMERIDIAN$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesEllipsoid" element
     */
    public net.opengis.gml.EllipsoidRefType getUsesEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidRefType target = null;
            target = (net.opengis.gml.EllipsoidRefType)get_store().find_element_user(USESELLIPSOID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEllipsoid" element
     */
     public void setUsesEllipsoid(net.opengis.gml.EllipsoidRefType usesEllipsoid)
    {
        generatedSetterHelperImpl(usesEllipsoid, USESELLIPSOID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEllipsoid" element
     */
    public net.opengis.gml.EllipsoidRefType addNewUsesEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidRefType target = null;
            target = (net.opengis.gml.EllipsoidRefType)get_store().add_element_user(USESELLIPSOID$2);
            return target;
        }
    }
}
