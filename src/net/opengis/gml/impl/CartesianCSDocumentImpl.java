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
 * A document containing one CartesianCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CartesianCSDocumentImpl extends net.opengis.gml.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.CartesianCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public CartesianCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CartesianCS");
    
    
    /**
     * Gets the "CartesianCS" element
     */
    public net.opengis.gml.CartesianCSType getCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSType target = null;
            target = (net.opengis.gml.CartesianCSType)get_store().find_element_user(CARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CartesianCS" element
     */
     public void setCartesianCS(net.opengis.gml.CartesianCSType cartesianCS)
    {
        generatedSetterHelperImpl(cartesianCS, CARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CartesianCS" element
     */
    public net.opengis.gml.CartesianCSType addNewCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSType target = null;
            target = (net.opengis.gml.CartesianCSType)get_store().add_element_user(CARTESIANCS$0);
            return target;
        }
    }
}
