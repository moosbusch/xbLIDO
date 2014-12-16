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
 * A document containing one directedFace(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectedFaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DirectedFaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedFaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedFace");
    
    
    /**
     * Gets the "directedFace" element
     */
    public net.opengis.gml.DirectedFacePropertyType getDirectedFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "directedFace" element
     */
     public void setDirectedFace(net.opengis.gml.DirectedFacePropertyType directedFace)
    {
        generatedSetterHelperImpl(directedFace, DIRECTEDFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "directedFace" element
     */
    public net.opengis.gml.DirectedFacePropertyType addNewDirectedFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.DirectedFacePropertyType)get_store().add_element_user(DIRECTEDFACE$0);
            return target;
        }
    }
}
