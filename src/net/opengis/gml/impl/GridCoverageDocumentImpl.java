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
 * A document containing one GridCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GridCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.GridCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public GridCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage");
    
    
    /**
     * Gets the "GridCoverage" element
     */
    public net.opengis.gml.GridCoverageType getGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridCoverageType target = null;
            target = (net.opengis.gml.GridCoverageType)get_store().find_element_user(GRIDCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GridCoverage" element
     */
     public void setGridCoverage(net.opengis.gml.GridCoverageType gridCoverage)
    {
        generatedSetterHelperImpl(gridCoverage, GRIDCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GridCoverage" element
     */
    public net.opengis.gml.GridCoverageType addNewGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridCoverageType target = null;
            target = (net.opengis.gml.GridCoverageType)get_store().add_element_user(GRIDCOVERAGE$0);
            return target;
        }
    }
}
