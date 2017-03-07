package me.hasham.androidbootstrap.data.storage;


import net.orange_box.storebox.annotations.method.KeyByString;

/**
 * Developed by Hasham.Tahir on 10/6/2016.
 */

public interface Preferences {

    @KeyByString("key_menu")
    String getMenu();

    @KeyByString("key_menu")
    void setMenu(String value);

}
