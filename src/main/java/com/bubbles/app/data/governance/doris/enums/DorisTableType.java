package com.bubbles.app.data.governance.doris.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>description:  </p>
 *
 * @author CryptoNeedle
 * @date 2026-05-28
 */
@Getter
@AllArgsConstructor
public enum DorisTableType {
    
    BASE_TABLE("表"),
    VIEW("视图"),
    SYSTEM_VIEW("系统视图"),
    ;
    
    private final String description;
    
    public static DorisTableType convert(String tableType) {
        switch (tableType) {
            case "BASE TABLE":
                return BASE_TABLE;
            case "VIEW":
                return VIEW;
            case "SYSTEM VIEW":
                return SYSTEM_VIEW;
            default:
                return null;
        }
    }
}