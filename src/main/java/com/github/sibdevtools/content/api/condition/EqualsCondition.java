package com.github.sibdevtools.content.api.condition;

import lombok.Getter;

/**
 * @author sibmaks
 * @since 0.0.1
 */
@Getter
public final class EqualsCondition extends Condition {
    private final String value;

    public EqualsCondition(String attribute, String value) {
        super(attribute, ConditionType.EQ);
        this.value = value;
    }
}
