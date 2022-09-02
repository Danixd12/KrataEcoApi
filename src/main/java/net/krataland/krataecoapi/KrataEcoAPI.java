package net.krataland.krataecoapi;

import org.bukkit.plugin.java.JavaPlugin;

public class KrataEcoAPI extends JavaPlugin {

    Database database;
    Api economy;
    @Override
    public void onEnable() {
        database = new Database();
        economy = new Api();
    }
}
