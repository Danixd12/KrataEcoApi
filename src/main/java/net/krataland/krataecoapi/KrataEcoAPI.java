package net.krataland.krataecoapi;

import org.bukkit.plugin.java.JavaPlugin;

public class KrataEcoAPI extends JavaPlugin {

    KrataEconomy economy;
    KrataDatabase database;
    @Override
    public void onEnable() {
        System.setProperty("org.litote.mongo.test.mapping.service", "org.litote.kmongo.jackson.JacksonClassMappingTypeService");

        economy = new KrataEconomy();
        database = new KrataDatabase();

    }
}
