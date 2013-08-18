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
 * A document containing one _DiscreteCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DiscreteCoverageDocumentImpl extends net.opengis.gml.impl.CoverageDocumentImpl implements net.opengis.gml.DiscreteCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiscreteCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISCRETECOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_DiscreteCoverage");
    private static final org.apache.xmlbeans.QNameSet DISCRETECOVERAGE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_DiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurveCoverage"),
    });
    
    
    /**
     * Gets the "_DiscreteCoverage" element
     */
    public net.opengis.gml.AbstractDiscreteCoverageType getDiscreteCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractDiscreteCoverageType target = null;
            target = (net.opengis.gml.AbstractDiscreteCoverageType)get_store().find_element_user(DISCRETECOVERAGE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_DiscreteCoverage" element
     */
    @Inject(optional=true) public void setDiscreteCoverage(net.opengis.gml.AbstractDiscreteCoverageType discreteCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractDiscreteCoverageType target = null;
            target = (net.opengis.gml.AbstractDiscreteCoverageType)get_store().find_element_user(DISCRETECOVERAGE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractDiscreteCoverageType)get_store().add_element_user(DISCRETECOVERAGE$0);
            }
            target.set(discreteCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "_DiscreteCoverage" element
     */
    public net.opengis.gml.AbstractDiscreteCoverageType addNewDiscreteCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractDiscreteCoverageType target = null;
            target = (net.opengis.gml.AbstractDiscreteCoverageType)get_store().add_element_user(DISCRETECOVERAGE$0);
            return target;
        }
    }
}
