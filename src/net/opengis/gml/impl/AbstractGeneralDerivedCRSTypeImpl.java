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
 * An XML AbstractGeneralDerivedCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractGeneralDerivedCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.AbstractGeneralDerivedCRSType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralDerivedCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "baseCRS");
    private static final javax.xml.namespace.QName DEFINEDBYCONVERSION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "definedByConversion");
    
    
    /**
     * Gets the "baseCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType getBaseCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().find_element_user(BASECRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseCRS" element
     */
    @Inject(optional=true) public void setBaseCRS(net.opengis.gml.CoordinateReferenceSystemRefType baseCRS)
    {
        generatedSetterHelperImpl(baseCRS, BASECRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType addNewBaseCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().add_element_user(BASECRS$0);
            return target;
        }
    }
    
    /**
     * Gets the "definedByConversion" element
     */
    public net.opengis.gml.GeneralConversionRefType getDefinedByConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeneralConversionRefType target = null;
            target = (net.opengis.gml.GeneralConversionRefType)get_store().find_element_user(DEFINEDBYCONVERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definedByConversion" element
     */
    @Inject(optional=true) public void setDefinedByConversion(net.opengis.gml.GeneralConversionRefType definedByConversion)
    {
        generatedSetterHelperImpl(definedByConversion, DEFINEDBYCONVERSION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definedByConversion" element
     */
    public net.opengis.gml.GeneralConversionRefType addNewDefinedByConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GeneralConversionRefType target = null;
            target = (net.opengis.gml.GeneralConversionRefType)get_store().add_element_user(DEFINEDBYCONVERSION$2);
            return target;
        }
    }
}
