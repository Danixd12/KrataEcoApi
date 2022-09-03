package net.krataland.krataecoapi;

import org.bukkit.plugin.java.JavaPlugin;

public class KrataEcoAPI extends JavaPlugin {

    Api economy;
    @Override
    public void onEnable() {
        economy = new Api();
    }
}
