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
 * An XML RectifiedGridDomainType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class RectifiedGridDomainTypeImpl extends net.opengis.gml.impl.DomainSetTypeImpl implements net.opengis.gml.RectifiedGridDomainType
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridDomainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTIFIEDGRID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGrid");
    
    
    /**
     * Gets the "RectifiedGrid" element
     */
    public net.opengis.gml.RectifiedGridType getRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectifiedGridType target = null;
            target = (net.opengis.gml.RectifiedGridType)get_store().find_element_user(RECTIFIEDGRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RectifiedGrid" element
     */
    public boolean isSetRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECTIFIEDGRID$0) != 0;
        }
    }
    
    /**
     * Sets the "RectifiedGrid" element
     */
     public void setRectifiedGrid(net.opengis.gml.RectifiedGridType rectifiedGrid)
    {
        generatedSetterHelperImpl(rectifiedGrid, RECTIFIEDGRID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RectifiedGrid" element
     */
    public net.opengis.gml.RectifiedGridType addNewRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RectifiedGridType target = null;
            target = (net.opengis.gml.RectifiedGridType)get_store().add_element_user(RECTIFIEDGRID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "RectifiedGrid" element
     */
    public void unsetRectifiedGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECTIFIEDGRID$0, 0);
        }
    }
}
