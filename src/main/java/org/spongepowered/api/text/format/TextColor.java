package org.spongepowered.api.text.format;

import com.google.common.base.Optional;

import java.awt.Color;

public interface TextColor extends FormattingCode {

    Optional<String> getId();

    Color getColor();

    boolean isReset();

}
