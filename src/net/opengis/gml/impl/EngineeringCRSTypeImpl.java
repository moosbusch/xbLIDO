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
 * An XML EngineeringCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class EngineeringCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.EngineeringCRSType
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesCS");
    private static final javax.xml.namespace.QName USESENGINEERINGDATUM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesEngineeringDatum");
    
    
    /**
     * Gets the "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType getUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().find_element_user(USESCS$0, 0);
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
    @Inject(optional=true) public void setUsesCS(net.opengis.gml.CoordinateSystemRefType usesCS)
    {
        generatedSetterHelperImpl(usesCS, USESCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().add_element_user(USESCS$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesEngineeringDatum" element
     */
    public net.opengis.gml.EngineeringDatumRefType getUsesEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringDatumRefType target = null;
            target = (net.opengis.gml.EngineeringDatumRefType)get_store().find_element_user(USESENGINEERINGDATUM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEngineeringDatum" element
     */
    @Inject(optional=true) public void setUsesEngineeringDatum(net.opengis.gml.EngineeringDatumRefType usesEngineeringDatum)
    {
        generatedSetterHelperImpl(usesEngineeringDatum, USESENGINEERINGDATUM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEngineeringDatum" element
     */
    public net.opengis.gml.EngineeringDatumRefType addNewUsesEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringDatumRefType target = null;
            target = (net.opengis.gml.EngineeringDatumRefType)get_store().add_element_user(USESENGINEERINGDATUM$2);
            return target;
        }
    }
}
