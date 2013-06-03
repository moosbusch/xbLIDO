/*

 *
 */
package org.moosbusch.museum.lido.inject.impl;

import org.lidoSchema.AdministrativeMetadataComplexType;
import org.lidoSchema.DescriptiveMetadataComplexType;
import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.moosbusch.museum.inject.evt.XmlPostProcessor;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.lido.inject.LIDOModule;

/**
 *
 * @author moosbusch
 */
public class LIDOObjectFactory extends AbstractMuseumXmlObjectFactory<LIDOModule, LidoWrapDocument> {

    public LIDOObjectFactory() {
        init();
    }

    private void init() {
        registerXmlPostProcessor(Lido.class, new LidoElementPostProcessor());
    }

    @Override
    protected LIDOModule createModule() {
        return new LIDOModuleImpl(this);
    }

    @Override
    public LidoWrapDocument createRootElement() {
        return createTypedObject(LidoWrapDocument.class);
    }

    private class LidoElementPostProcessor implements XmlPostProcessor<Lido> {

        @Override
        public void postProcess(Lido xmlObject) {
                if (!containsAdministrativeMetadata(xmlObject)) {
                    AdministrativeMetadataComplexType adminMetadata =
                            createTypedObject(AdministrativeMetadataComplexType.class);
                    xmlObject.getAdministrativeMetadataList().add(adminMetadata);
                }

                if (!containsDescriptiveMetadata(xmlObject)) {
                    DescriptiveMetadataComplexType descMetadata = createTypedObject(
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
