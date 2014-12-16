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
 * A document containing one TopoComplex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoComplexDocumentImpl extends net.opengis.gml.impl.TopologyDocumentImpl implements net.opengis.gml.TopoComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoComplex");
    
    
    /**
     * Gets the "TopoComplex" element
     */
    public net.opengis.gml.TopoComplexType getTopoComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexType target = null;
            target = (net.opengis.gml.TopoComplexType)get_store().find_element_user(TOPOCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoComplex" element
     */
     public void setTopoComplex(net.opengis.gml.TopoComplexType topoComplex)
    {
        generatedSetterHelperImpl(topoComplex, TOPOCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoComplex" element
     */
    public net.opengis.gml.TopoComplexType addNewTopoComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexType target = null;
            target = (net.opengis.gml.TopoComplexType)get_store().add_element_user(TOPOCOMPLEX$0);
            return target;
        }
    }
}
