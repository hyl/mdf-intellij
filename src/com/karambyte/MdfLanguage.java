package com.karambyte;

import com.intellij.lang.Language;
/**
 * Created by jamie on 19/01/2016.
 */
public class MdfLanguage extends Language {

    public static final MdfLanguage INSTANCE = new MdfLanguage();

    protected MdfLanguage() {
        super("MDF file", "text/plain");
    }
}
