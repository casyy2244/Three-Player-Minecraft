package me.chatgpt.threecontrolone;

import org.bukkit.plugin.java.JavaPlugin;

public class ThreeControlOne extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("ThreeControlOne has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ThreeControlOne has been disabled!");
    }
}
