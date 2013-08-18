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
 * An XML ImageDatumType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ImageDatumTypeImpl extends net.opengis.gml.impl.AbstractDatumTypeImpl implements net.opengis.gml.ImageDatumType
{
    private static final long serialVersionUID = 1L;
    
    public ImageDatumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIXELINCELL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pixelInCell");
    
    
    /**
     * Gets the "pixelInCell" element
     */
    public net.opengis.gml.PixelInCellType getPixelInCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PixelInCellType target = null;
            target = (net.opengis.gml.PixelInCellType)get_store().find_element_user(PIXELINCELL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pixelInCell" element
     */
    @Inject(optional=true) public void setPixelInCell(net.opengis.gml.PixelInCellType pixelInCell)
    {
        generatedSetterHelperImpl(pixelInCell, PIXELINCELL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pixelInCell" element
     */
    public net.opengis.gml.PixelInCellType addNewPixelInCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PixelInCellType target = null;
            target = (net.opengis.gml.PixelInCellType)get_store().add_element_user(PIXELINCELL$0);
            return target;
        }
    }
}
