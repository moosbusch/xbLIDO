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
 * An XML GridDomainType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GridDomainTypeImpl extends net.opengis.gml.impl.DomainSetTypeImpl implements net.opengis.gml.GridDomainType
{
    private static final long serialVersionUID = 1L;
    
    public GridDomainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Grid");
    
    
    /**
     * Gets the "Grid" element
     */
    public net.opengis.gml.GridType getGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridType target = null;
            target = (net.opengis.gml.GridType)get_store().find_element_user(GRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Grid" element
     */
    public boolean isSetGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRID$0) != 0;
        }
    }
    
    /**
     * Sets the "Grid" element
     */
    @Inject(optional=true) public void setGrid(net.opengis.gml.GridType grid)
    {
        generatedSetterHelperImpl(grid, GRID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Grid" element
     */
    public net.opengis.gml.GridType addNewGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridType target = null;
            target = (net.opengis.gml.GridType)get_store().add_element_user(GRID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Grid" element
     */
    public void unsetGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRID$0, 0);
        }
    }
}
