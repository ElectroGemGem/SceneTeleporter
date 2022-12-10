package electrogem.sceneteleporter;

import emu.grasscutter.plugin.Plugin;
import electrogem.sceneteleporter.commands.SceneTeleporterCommand;

public final class SceneTeleporter extends Plugin {
    /* Turn the plugin into a singleton. */
    private static SceneTeleporter instance;

    public static SceneTeleporter getInstance() {
        return instance;
    }
    
    @Override public void onLoad() {
        // Set the plugin instance.
        instance = this;
    }

    @Override public void onEnable() {
        // Register commands.
        this.getHandle().registerCommand(new SceneTeleporterCommand());

        // Log a plugin status message.
        this.getLogger().info("The SceneTeleporter has been loaded");
    }

    @Override public void onDisable() {
        // Log a plugin status message.
        this.getLogger().info("The SceneTeleporter plugin failed to load");
    }

  
}
