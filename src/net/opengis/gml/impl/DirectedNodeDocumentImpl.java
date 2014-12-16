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
 * A document containing one directedNode(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectedNodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DirectedNodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedNodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDNODE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedNode");
    
    
    /**
     * Gets the "directedNode" element
     */
    public net.opengis.gml.DirectedNodePropertyType getDirectedNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.DirectedNodePropertyType)get_store().find_element_user(DIRECTEDNODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "directedNode" element
     */
     public void setDirectedNode(net.opengis.gml.DirectedNodePropertyType directedNode)
    {
        generatedSetterHelperImpl(directedNode, DIRECTEDNODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "directedNode" element
     */
    public net.opengis.gml.DirectedNodePropertyType addNewDirectedNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedNodePropertyType target = null;
            target = (net.opengis.gml.DirectedNodePropertyType)get_store().add_element_user(DIRECTEDNODE$0);
            return target;
        }
    }
}
