package org.spongepowered.api.text.style;

public interface TextStyle {

    boolean isComposite();
    boolean is(TextStyle style);

    // TODO: Decide if this would fit better inside the builder
    TextStyle and(TextStyle... styles);
    TextStyle andNot(TextStyle... styles);
    TextStyle negate();

    interface Base extends FormattingCode, TextStyle {

    }

}
