package org.spongepowered.api.text.format;
import com.google.common.base.Optional;

public interface FormattingCode {

    String getName();

    /**
     * Gets the corresponding Minecraft formatting code, that, when applied,
     * has the same effect as this text format.
     *
     * @return a List of Minecraft formatting codes
     */
    @Deprecated
    Optional<Character> getCode();

}