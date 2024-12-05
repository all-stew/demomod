# demo mod

## artifact and version

The artifact name follows this pattern: `${mod_id}-${mc_version}-${loader}-${mod_version}.jar`, where:

1. ${mod_id} is the mod's identifier.
2. ${mc_version} represents the Minecraft version the mod is compatible with.
3. ${loader} indicates the mod loader used, such as neoforge, forge, or fabric.
4. ${mod_version} follows the format major.minor.patch.hotfix-(ALPHA|BETA|RELEASE), which specifies the mod's version
   number and stability stage, where major, minor, patch, and hotfix correspond to the standard versioning levels, and
   the suffix (ALPHA|BETA|RELEASE) indicates the release stage of the mod.

For example, an artifact name like demo_mod-1.21.3-neoforge-0.1.0.0-BETA.jar would indicate the mod "demo_mod" for
Minecraft version 1.21.3, using the NeoForge loader, with version 0.1.0.0 in the Beta release stage. When the first
stable release is published, the version should be changed to 1.0.0.0.

