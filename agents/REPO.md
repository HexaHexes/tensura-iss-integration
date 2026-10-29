# Repo rules - tensura-iss-integration

Repo-specific rules and notes. The org-wide `AGENTS.md` beside this file is
maintained in [`neoforge-mod-template`](https://github.com/HexaHexes/neoforge-mod-template)
and pulled in verbatim - **never hand-edit it.** Everything in this file is this
repo's own and is edited freely; keep it aligned with the org rules rather than
restating them.

**Repo:** `HexaHexes/tensura-iss-integration` - **Mod ID:** `tensura_iss_integration` - **Branch:** `main`
**Platform:** Minecraft 1.21.1 / NeoForge 21.1.259 / JDK 21 - **Jar:** `build/libs/tensura_iss_integration-<version>.jar`

Integrates Tensura: Reincarnated with Iron's Spells 'n Spellbooks: replaces
Tensura staves and grimoires with Iron's Spells equivalents across acquisition
paths, maps Tensura elements onto ISS schools (aspectual/conceptual explicit,
summoning untyped), exposes configurable casting policies
(allow/disabled/capacity_limited) and magicule-based casting-power caps, and can
restrict native Tensura and Tensura RPG System skill equipping.

**Dependencies**
- Required: Minecraft, NeoForge, `tensura`, `manascore`, `irons_spellbooks` -
  `compileOnly` plus declared `required` in the toml, once wired (coordinates
  pinned to the pack's exact jars; see the investigation issues).
- Optional: `tensuramorpg` / Tensura RPG System (restriction feature) and the
  official `tensura_iron_spells` integration (overlap audit is an open issue).
- This repo will consume `tensura-ability-core` from GitHub Packages with the
  org secret `PACKAGE_READ_TOKEN`, injected scoped to the Gradle step only.

**Test:** `./gradlew runGameTestServer` - `TensuraIssIntegrationGameTests` (1 test). `expectedTests = 1`
in `build.gradle` must match the `@GameTest` count.

**Gotchas**
- **Do not redistribute upstream material.** Tensura: Reincarnated and the
  official `tensura_iron_spells` compat have no public source; ISS is
  All Rights Reserved on its published artefacts - interoperate through public
  APIs, never copy code or assets.
- Overlap with the official `tensura_iron_spells` compat and with
  `tensura-iss-growth` (EP ladder for ISS gear) must be audited before changing
  any acquisition path - do not fight another mod for the same datapack paths.
- Casting policies are server policy: client preferences must never widen them.
- Bootstrap state: no code ships yet - the open issues hold the plan.