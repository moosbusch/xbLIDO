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
package org.moosbusch.museum.inject.lido.impl;

import org.lidoSchema.AdministrativeMetadataComplexType;
import org.lidoSchema.DescriptiveMetadataComplexType;
import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.moosbusch.museum.inject.MuseumXmlPostProcessor;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.inject.lido.LidoModule;

/**
 *
 * @author moosbusch
 */
public class DefaultLidoObjectFactory extends AbstractMuseumXmlObjectFactory<LidoModule, LidoWrapDocument> {

    public DefaultLidoObjectFactory() {
        init();
    }

    private void init() {
        registerXmlPostProcessor(Lido.class, new LidoElementPostProcessor());
    }

    @Override
    protected LidoModule createModule() {
        return new DefaultLidoModule(this);
    }

    @Override
    public LidoWrapDocument createRootWrapper() {
        return createTypedObject(LidoWrapDocument.class);
    }

    private class LidoElementPostProcessor implements MuseumXmlPostProcessor<Lido> {

        @Override
        public void postProcess(Lido xmlObject) {
                if (!containsAdministrativeMetadata(xmlObject)) {
                    AdministrativeMetadataComplexType adminMetadata =
                            createTypedObject(AdministrativeMetadataComplexType.class);
                    xmlObject.getAdministrativeMetadataList().add(adminMetadata);
                }

                if (!containsDescriptiveMetadata(xmlObject)) {
                    DescriptiveMetadataComplexType descMetadata =
                            createTypedObject(
                            DescriptiveMetadataComplexType.class);
                    xmlObject.getDescriptiveMetadataList().add(descMetadata);
                }
        }

        private boolean containsAdministrativeMetadata(Lido lido) {
            return (! lido.getAdministrativeMetadataList().isEmpty());
        }

        private boolean containsDescriptiveMetadata(Lido lido) {
            return (! lido.getDescriptiveMetadataList().isEmpty());
        }
    }
}
