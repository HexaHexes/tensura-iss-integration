package org.bitwisemadness.tensuraissintegration.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.bitwisemadness.abilitycore.api.ActivationSource;
import org.junit.jupiter.api.Test;

/**
 * Proves this mod compiles and runs against the published
 * {@code org.bitwisemadness.abilitycore:ability_core} artifact - the classpath
 * entry this test needs comes only from the GitHub Packages dependency.
 *
 * <p>Also pins the wire contract this integration relies on: an unrecognised
 * activation source must fail closed to {@code null} rather than defaulting to
 * a policy-widening value.</p>
 */
class CoreContractTest {

    @Test
    void sourcesMapFromTheirWireNames() {
        assertEquals(ActivationSource.NATIVE_ADAPTER, ActivationSource.fromWire("native_adapter"));
        assertEquals(ActivationSource.NATIVE_ADAPTER, ActivationSource.fromWire("adapter"));
        assertEquals(ActivationSource.COMBO, ActivationSource.fromWire("combo"));
    }

    @Test
    void unknownSourceFailsClosedToNull() {
        assertNull(ActivationSource.fromWire("not_a_source"));
        assertNull(ActivationSource.fromWire(null));
    }

    @Test
    void wireNameRoundTrips() {
        for (ActivationSource source : ActivationSource.values()) {
            assertEquals(source, ActivationSource.fromWire(source.wireName()),
                    "wireName() must round-trip through fromWire() for " + source);
        }
    }
}
