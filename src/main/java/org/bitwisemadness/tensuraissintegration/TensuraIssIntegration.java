package org.bitwisemadness.tensuraissintegration;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * Tensura - Iron's Spells Integration entry point.
 */
@Mod(TensuraIssIntegration.MOD_ID)
public final class TensuraIssIntegration {

    public static final String MOD_ID = "tensura_iss_integration";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TensuraIssIntegration(IEventBus modBus) {
        LOGGER.info("Tensura - Iron's Spells Integration initialized");
    }
}
