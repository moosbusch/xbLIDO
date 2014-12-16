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
 * A document containing one _Topology(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopologyDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.TopologyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopologyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOLOGY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Topology");
    private static final org.apache.xmlbeans.QNameSet TOPOLOGY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Topology"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Node"),
    });
    
    
    /**
     * Gets the "_Topology" element
     */
    public net.opengis.gml.AbstractTopologyType getTopology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopologyType target = null;
            target = (net.opengis.gml.AbstractTopologyType)get_store().find_element_user(TOPOLOGY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Topology" element
     */
     public void setTopology(net.opengis.gml.AbstractTopologyType topology)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopologyType target = null;
            target = (net.opengis.gml.AbstractTopologyType)get_store().find_element_user(TOPOLOGY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTopologyType)get_store().add_element_user(TOPOLOGY$0);
            }
            target.set(topology);
        }
    }
    
    /**
     * Appends and returns a new empty "_Topology" element
     */
    public net.opengis.gml.AbstractTopologyType addNewTopology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopologyType target = null;
            target = (net.opengis.gml.AbstractTopologyType)get_store().add_element_user(TOPOLOGY$0);
            return target;
        }
    }
}
