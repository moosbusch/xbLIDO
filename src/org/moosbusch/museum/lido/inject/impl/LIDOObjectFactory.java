/*

 *
 */
package org.moosbusch.museum.lido.inject.impl;

import org.apache.xmlbeans.XmlObject;
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
        addXmlPostProcessor(new LidoElementPostProcessor());
    }

    @Override
    protected LIDOModule createModule() {
        return new LIDOModuleImpl(this);
    }

    @Override
    public LidoWrapDocument createRootElement() {
        return createTypedObject(LidoWrapDocument.class);
    }

    private class LidoElementPostProcessor implements XmlPostProcessor {

        @Override
        public void postProcess(XmlObject xmlObject) {
            if (xmlObject instanceof Lido) {
                Lido lido = (Lido) xmlObject;
                if (!containsAdministrativeMetadata(lido)) {
                    AdministrativeMetadataComplexType adminMetadata =
                            createTypedObject(AdministrativeMetadataComplexType.class);
                    lido.getAdministrativeMetadataList().add(adminMetadata);
                }
                if (!containsDescriptiveMetadata(lido)) {
                    DescriptiveMetadataComplexType descMetadata = createTypedObject(
                            DescriptiveMetadataComplexType.class);
                    lido.getDescriptiveMetadataList().add(descMetadata);
                }
            }
        }

        @Override
        public Class<Lido> getTargetClass() {
            return Lido.class;
        }

        private boolean containsAdministrativeMetadata(Lido lido) {
            return (! lido.getAdministrativeMetadataList().isEmpty());
        }

        private boolean containsDescriptiveMetadata(Lido lido) {
            return (! lido.getDescriptiveMetadataList().isEmpty());
        }
    }
}
