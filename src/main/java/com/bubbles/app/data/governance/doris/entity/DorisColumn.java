package com.bubbles.app.data.governance.doris.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * <p>description:  </p>
 *
 * @author CryptoNeedle
 * @date 2026-05-28
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@ToString
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "doris_column", comment = "DORIS-列")
public class DorisColumn {
    
    @Id
    @Column(comment = "ID", nullable = false)
    private Long id;
    
    @Column(comment = "目录名称", nullable = false)
    private String catalogName;
    @Column(comment = "数据库名称", nullable = false)
    private String databaseName;
    @Column(comment = "表名称", nullable = false)
    private String tableName;
    @Column(comment = "列名称", nullable = false)
    private String columnName;
    
    @Column(length = 2048, comment = "详情")
    private String comment;
    @Column(comment = "排序")
    private Long sort;
    @Column(length = 3, comment = "如果是 UNI，则表示当前字段是 Unique Key 字段")
    private String columnType;
    @Column(length = 32, comment = "字段类型")
    private String dataTypeFormat;
    @Column(length = 64, comment = "数据类型")
    private String dataType;
    @Column(comment = "字段宽度")
    private Long length;
    @Column(length = 1024, comment = "精度")
    private Long precision;
    @Column(comment = "标度")
    private Long scale;
    @Column(comment = "非空")
    private Boolean notNull;
    @Column(length = 27, comment = "字段的一些额外信息。包括展示是否为自增字段，是否为 Generated 字段等")
    private String extra;
    @Column(comment = "默认值")
    private String defaultValue;
}