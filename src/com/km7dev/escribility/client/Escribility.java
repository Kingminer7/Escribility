package com.km7dev.escribility.client;

import com.km7dev.escribility.data.DataManager;
import com.km7dev.escribility.ui.EscribilityWindow;

public class Escribility {

    public static final Escribility Instance = new Escribility();
    public static final Escribility instance = Instance;
    public static final EscribilityWindow window = new EscribilityWindow();

    public static final DataManager dataManager = new DataManager();

    public void init() {
        window.Initialize();
    }

    public void shutoff() {

    }

}
