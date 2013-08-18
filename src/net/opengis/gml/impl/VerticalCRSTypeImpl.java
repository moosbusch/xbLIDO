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
 * An XML VerticalCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class VerticalCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.VerticalCRSType
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESVERTICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesVerticalCS");
    private static final javax.xml.namespace.QName USESVERTICALDATUM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesVerticalDatum");
    
    
    /**
     * Gets the "usesVerticalCS" element
     */
    public net.opengis.gml.VerticalCSRefType getUsesVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCSRefType target = null;
            target = (net.opengis.gml.VerticalCSRefType)get_store().find_element_user(USESVERTICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesVerticalCS" element
     */
    @Inject(optional=true) public void setUsesVerticalCS(net.opengis.gml.VerticalCSRefType usesVerticalCS)
    {
        generatedSetterHelperImpl(usesVerticalCS, USESVERTICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesVerticalCS" element
     */
    public net.opengis.gml.VerticalCSRefType addNewUsesVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalCSRefType target = null;
            target = (net.opengis.gml.VerticalCSRefType)get_store().add_element_user(USESVERTICALCS$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesVerticalDatum" element
     */
    public net.opengis.gml.VerticalDatumRefType getUsesVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumRefType target = null;
            target = (net.opengis.gml.VerticalDatumRefType)get_store().find_element_user(USESVERTICALDATUM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesVerticalDatum" element
     */
    @Inject(optional=true) public void setUsesVerticalDatum(net.opengis.gml.VerticalDatumRefType usesVerticalDatum)
    {
        generatedSetterHelperImpl(usesVerticalDatum, USESVERTICALDATUM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesVerticalDatum" element
     */
    public net.opengis.gml.VerticalDatumRefType addNewUsesVerticalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VerticalDatumRefType target = null;
            target = (net.opengis.gml.VerticalDatumRefType)get_store().add_element_user(USESVERTICALDATUM$2);
            return target;
        }
    }
}
