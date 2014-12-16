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
 * A document containing one MultiPointCoverage(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiPointCoverageDocumentImpl extends net.opengis.gml.impl.DiscreteCoverageDocumentImpl implements net.opengis.gml.MultiPointCoverageDocument
{
    private static final long serialVersionUID = 1L;

    public MultiPointCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MULTIPOINTCOVERAGE$0 =
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage");


    /**
     * Gets the "MultiPointCoverage" element
     */
    public net.opengis.gml.MultiPointCoverageType getMultiPointCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointCoverageType target = null;
            target = (net.opengis.gml.MultiPointCoverageType)get_store().find_element_user(MULTIPOINTCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "MultiPointCoverage" element
     */
     public void setMultiPointCoverage(net.opengis.gml.MultiPointCoverageType multiPointCoverage)
    {
        generatedSetterHelperImpl(multiPointCoverage, MULTIPOINTCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "MultiPointCoverage" element
     */
    public net.opengis.gml.MultiPointCoverageType addNewMultiPointCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointCoverageType target = null;
            target = (net.opengis.gml.MultiPointCoverageType)get_store().add_element_user(MULTIPOINTCOVERAGE$0);
            return target;
        }
    }
}
