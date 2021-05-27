package com.ratkko.spongebob;

import com.ratkko.spongebob.events.events;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("[SpongebobMC] Plugin is enabled.");
        this.getCommand("frame").setExecutor(new events());
    }
}
