# Tensura - Iron's Spells Integration

Tensura - Iron's Spells Integration connects the two magic systems of the
Tensura RPG pack. Tensura: Reincarnated's elements and magicule capacity line
up with Iron's Spells 'n Spellbooks' schools, gear and casting pipeline.

## What it does

*(Design phase, no release yet. The open issues on this repository hold the
full plan, research tables and open design decisions.)*

- **Unified gear** - Tensura's staves and grimoires are replaced across every
  acquisition path (recipes, loot, merchants) with the Iron's Spells
  equivalents, and anything already in player inventories is left alone.
- Tensura elements map onto Iron's Spells schools (aspectual and conceptual
  magic explicitly, summoning magic deliberately untyped), so gear and race can
  bias a wizard toward their element.
- **Casting policies** - native Tensura magic can be allowed, disabled, or
  limited by the caster's magicule capacity, globally, per category or per
  spell.
- Casting power is capped by maximum magicule capacity. The cap applies after
  all equipment bonuses, so gear cannot push past the configured ceiling.

## Dependencies
| | Mod | Why |
|---|---|---|
| Required | Minecraft / NeoForge | 1.21.1 / 21.1.259 |
| Required | Tensura: Reincarnated (+ ManasCore) | The abilities, elements and magicule capacity being integrated |
| Required | Iron's Spells 'n Spellbooks | The schools, gear and casting pipeline being integrated with |
| Optional | Tensura RPG System | Its skill equipping can be restricted independently |
| Optional | Tensura: Iron's Spells (official integration) | Overlap analysis is an open issue on this repository |

When the first alpha ships, drop the jar in `mods/` alongside its required
dependencies.

## Credits
- Built on [NeoForge](https://neoforged.net/).
- Integrates [Iron's Spells 'n Spellbooks](https://www.curseforge.com/minecraft/mc-mods/irons-spellbooks)
  and [Tensura: Reincarnated](https://www.curseforge.com/minecraft/mc-mods/tensura-reincarnated).

## License

GNU Lesser General Public License v2.1 - see [`LICENSE`](LICENSE).
Copyright (c) 2026 Bitwise Madness.

## AI disclosure

Parts of this project were written with the assistance of AI coding tools.
AI-assisted code, data and documentation ship only after human review by the
maintainers.