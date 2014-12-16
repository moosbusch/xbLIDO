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
 * An XML TemporalCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TemporalCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.TemporalCRSType
{
    private static final long serialVersionUID = 1L;
    
    public TemporalCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESTEMPORALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesTemporalCS");
    private static final javax.xml.namespace.QName USESTEMPORALDATUM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesTemporalDatum");
    
    
    /**
     * Gets the "usesTemporalCS" element
     */
    public net.opengis.gml.TemporalCSRefType getUsesTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalCSRefType target = null;
            target = (net.opengis.gml.TemporalCSRefType)get_store().find_element_user(USESTEMPORALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesTemporalCS" element
     */
     public void setUsesTemporalCS(net.opengis.gml.TemporalCSRefType usesTemporalCS)
    {
        generatedSetterHelperImpl(usesTemporalCS, USESTEMPORALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesTemporalCS" element
     */
    public net.opengis.gml.TemporalCSRefType addNewUsesTemporalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalCSRefType target = null;
            target = (net.opengis.gml.TemporalCSRefType)get_store().add_element_user(USESTEMPORALCS$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesTemporalDatum" element
     */
    public net.opengis.gml.TemporalDatumRefType getUsesTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalDatumRefType target = null;
            target = (net.opengis.gml.TemporalDatumRefType)get_store().find_element_user(USESTEMPORALDATUM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesTemporalDatum" element
     */
     public void setUsesTemporalDatum(net.opengis.gml.TemporalDatumRefType usesTemporalDatum)
    {
        generatedSetterHelperImpl(usesTemporalDatum, USESTEMPORALDATUM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesTemporalDatum" element
     */
    public net.opengis.gml.TemporalDatumRefType addNewUsesTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalDatumRefType target = null;
            target = (net.opengis.gml.TemporalDatumRefType)get_store().add_element_user(USESTEMPORALDATUM$2);
            return target;
        }
    }
}
