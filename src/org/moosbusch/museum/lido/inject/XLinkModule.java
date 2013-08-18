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
package org.moosbusch.museum.lido.inject;

import com.google.inject.Module;
import com.google.inject.Provides;
import org.w3.x1999.xlink.ActuateAttribute;
import org.w3.x1999.xlink.ActuateType;
import org.w3.x1999.xlink.ArcDocument;
import org.w3.x1999.xlink.ArcType;
import org.w3.x1999.xlink.ArcroleAttribute;
import org.w3.x1999.xlink.ArcroleType;
import org.w3.x1999.xlink.Extended;
import org.w3.x1999.xlink.FromAttribute;
import org.w3.x1999.xlink.FromType;
import org.w3.x1999.xlink.HrefAttribute;
import org.w3.x1999.xlink.HrefType;
import org.w3.x1999.xlink.LabelAttribute;
import org.w3.x1999.xlink.LabelType;
import org.w3.x1999.xlink.LocatorDocument;
import org.w3.x1999.xlink.LocatorType;
import org.w3.x1999.xlink.ResourceDocument;
import org.w3.x1999.xlink.ResourceType;
import org.w3.x1999.xlink.RoleAttribute;
import org.w3.x1999.xlink.RoleType;
import org.w3.x1999.xlink.ShowAttribute;
import org.w3.x1999.xlink.ShowType;
import org.w3.x1999.xlink.Simple;
import org.w3.x1999.xlink.TitleAttrType;
import org.w3.x1999.xlink.TitleAttribute;
import org.w3.x1999.xlink.TitleDocument;
import org.w3.x1999.xlink.TitleEltType;
import org.w3.x1999.xlink.ToAttribute;
import org.w3.x1999.xlink.ToType;
import org.w3.x1999.xlink.TypeAttribute;
import org.w3.x1999.xlink.TypeType;

/**
 *
 * @author moosbusch
 */
public interface XLinkModule extends Module {

    @Provides
    public ActuateAttribute createActuateAttribute();

    @Provides
    public ActuateType createActuateType();

    @Provides
    public ArcDocument createXLinkArcDocument();

    @Provides
    public ArcroleAttribute createArcroleAttribute();

    @Provides
    public ArcroleType createArcroleType();

    @Provides
    public ArcType createXLinkArcType();

    @Provides
    public Extended createExtended();

    @Provides
    public FromAttribute createFromAttribute();

    @Provides
    public FromType createFromType();

    @Provides
    public HrefAttribute createHrefAttribute();

    @Provides
    public HrefType createHrefType();

    @Provides
    public LabelAttribute createXlinkLabelAttribute();

    @Provides
    public LabelType createXlinkLabelType();

    @Provides
    public LocatorDocument createLocatorDocument();

    @Provides
    public LocatorType createLocatorType();

    @Provides
    public ResourceDocument createResourceDocument();

    @Provides
    public ResourceType createResourceType();

    @Provides
    public RoleAttribute createRoleAttribute();

    @Provides
    public RoleType createRoleType();

    @Provides
    public ShowAttribute createShowAttribute();

    @Provides
    public ShowType createShowType();

    @Provides
    public Simple createSimple();

    @Provides
    public TitleAttribute createTitleAttribute();

    @Provides
    public TitleAttrType createTitleAttrType();

    @Provides
    public TitleDocument createTitleDocument();

    @Provides
    public TitleEltType createTitleEltType();

    @Provides
    public ToAttribute createToAttribute();

    @Provides
    public ToType createToType();

    @Provides
    public TypeAttribute createXlinkTypeAttribute();

    @Provides
    public TypeType createTypeType();
}
