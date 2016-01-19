package com.karambyte;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by jamie on 19/01/2016.
 */
public class MdfFileType extends LanguageFileType {
    public static final MdfFileType INSTANCE = new MdfFileType();

    public MdfFileType() {
        super(MdfLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "MDF";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "A Model Definition Format file.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mdf";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MdfIcons.FILE;
    }
}
