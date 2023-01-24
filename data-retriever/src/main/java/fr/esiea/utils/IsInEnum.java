package fr.esiea.utils;

import org.apache.commons.lang3.StringUtils;

public class IsInEnum {
    public <E extends Enum<E>> boolean isInEnum(String text, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (StringUtils.containsIgnoreCase(text, e.name())) {
                return true;
            }
        }
        return false;
    }
}
