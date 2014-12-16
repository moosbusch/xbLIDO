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
 * A document containing one MultiSolidCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSolidCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.MultiSolidCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLIDCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage");
    
    
    /**
     * Gets the "MultiSolidCoverage" element
     */
    public net.opengis.gml.MultiSolidCoverageType getMultiSolidCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidCoverageType target = null;
            target = (net.opengis.gml.MultiSolidCoverageType)get_store().find_element_user(MULTISOLIDCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiSolidCoverage" element
     */
     public void setMultiSolidCoverage(net.opengis.gml.MultiSolidCoverageType multiSolidCoverage)
    {
        generatedSetterHelperImpl(multiSolidCoverage, MULTISOLIDCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiSolidCoverage" element
     */
    public net.opengis.gml.MultiSolidCoverageType addNewMultiSolidCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidCoverageType target = null;
            target = (net.opengis.gml.MultiSolidCoverageType)get_store().add_element_user(MULTISOLIDCOVERAGE$0);
            return target;
        }
    }
}
