package com.scrpdtv.timewarp;

import net.fabricmc.api.ModInitializer;
import com.scrpdtv.timewarp.command.TimeWarpCommand;

public class TimeWarpMod implements ModInitializer {
    public static final String MOD_ID = "timewarp";

    @Override
    public void onInitialize() {
        System.out.println("[TimeWarpMod] Mod initialized!");
        TimeWarpCommand.register();
    }
}
