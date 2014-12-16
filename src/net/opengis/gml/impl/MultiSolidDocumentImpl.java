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
 * A document containing one MultiSolid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiSolidDocumentImpl extends net.opengis.gml.impl.GeometricAggregateDocumentImpl implements net.opengis.gml.MultiSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolid");
    
    
    /**
     * Gets the "MultiSolid" element
     */
    public net.opengis.gml.MultiSolidType getMultiSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidType target = null;
            target = (net.opengis.gml.MultiSolidType)get_store().find_element_user(MULTISOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiSolid" element
     */
     public void setMultiSolid(net.opengis.gml.MultiSolidType multiSolid)
    {
        generatedSetterHelperImpl(multiSolid, MULTISOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiSolid" element
     */
    public net.opengis.gml.MultiSolidType addNewMultiSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSolidType target = null;
            target = (net.opengis.gml.MultiSolidType)get_store().add_element_user(MULTISOLID$0);
            return target;
        }
    }
}
