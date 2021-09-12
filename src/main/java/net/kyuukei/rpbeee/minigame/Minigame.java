package net.kyuukei.rpbeee.minigame;

import org.bukkit.plugin.java.JavaPlugin;

public final class Minigame extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("開始しました");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("終了しました");
    }
}
