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
 * A document containing one _Coverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoverageDocumentImpl extends net.opengis.gml.impl.FeatureDocumentImpl implements net.opengis.gml.CoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Coverage");
    private static final org.apache.xmlbeans.QNameSet COVERAGE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Coverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_DiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurveCoverage"),
    });
    
    
    /**
     * Gets the "_Coverage" element
     */
    public net.opengis.gml.AbstractCoverageType getCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoverageType target = null;
            target = (net.opengis.gml.AbstractCoverageType)get_store().find_element_user(COVERAGE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Coverage" element
     */
     public void setCoverage(net.opengis.gml.AbstractCoverageType coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoverageType target = null;
            target = (net.opengis.gml.AbstractCoverageType)get_store().find_element_user(COVERAGE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractCoverageType)get_store().add_element_user(COVERAGE$0);
            }
            target.set(coverage);
        }
    }
    
    /**
     * Appends and returns a new empty "_Coverage" element
     */
    public net.opengis.gml.AbstractCoverageType addNewCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoverageType target = null;
            target = (net.opengis.gml.AbstractCoverageType)get_store().add_element_user(COVERAGE$0);
            return target;
        }
    }
}
