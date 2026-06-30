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
public enum DorisTableModelType {
    
    UNIQUE_KEY("主键模型"),
    DUPLICATE_KEY("明细模型"),
    AGGREGATE_KEY("聚合模型"),
    ;
    
    private final String description;
}