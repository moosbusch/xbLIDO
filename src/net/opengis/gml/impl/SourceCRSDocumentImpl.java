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
 * A document containing one sourceCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SourceCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SourceCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "sourceCRS");
    
    
    /**
     * Gets the "sourceCRS" element
     */
    public net.opengis.gml.CRSRefType getSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().find_element_user(SOURCECRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sourceCRS" element
     */
    @Inject(optional=true) public void setSourceCRS(net.opengis.gml.CRSRefType sourceCRS)
    {
        generatedSetterHelperImpl(sourceCRS, SOURCECRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sourceCRS" element
     */
    public net.opengis.gml.CRSRefType addNewSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().add_element_user(SOURCECRS$0);
            return target;
        }
    }
}
