package com.bubbles.app.data.governance.doris.entity;

import com.bubbles.app.data.governance.doris.enums.DorisTableModelType;
import com.bubbles.app.data.governance.doris.enums.DorisTableType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

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
@Table(name = "doris_table", comment = "DORIS-表")
public class DorisTable {
    
    @Id
    @Column(comment = "ID", nullable = false)
    private Long id;
    
    @Column(comment = "目录", nullable = false)
    private String catalog;
    @Column(comment = "库", nullable = false)
    private String database;
    @Column(comment = "表", nullable = false)
    private String table;
    
    /**
     * SELECT * FROM information_schema.tables
     */
    
    @Column(length = 2048, comment = "说明")
    private String comment;
    @Enumerated(EnumType.STRING)
    @Column(length = 64, comment = "表类型")
    private DorisTableType type;
    @Column(comment = "数据量")
    private Long rowNum;
    @Column(comment = "创建时间")
    private LocalDateTime createDt;
    @Column(comment = "更新时间")
    private LocalDateTime updateDt;
    
    /**
     * SHOW DATA FROM
     */
    @Column(comment = "占用空间(格式化)")
    private String storageSpaceFormat;
    @Column(comment = "副本数量")
    private Integer replicaCount;
    
    /**
     * 分析 CreateTable
     */
    
    @Enumerated(EnumType.STRING)
    @Column(comment = "表模型类型")
    private DorisTableModelType tableModelType;
    @Column(comment = "配置桶数量")
    private String bucketNum;
    @Column(comment = "推荐桶数量")
    private Integer estimateBucketNum;
    @Column(comment = "是否分区")
    private Boolean partitioned = false;
    
    /**
     * 分析 DorisColumn
     */
    
    @Column(comment = "字段数量")
    private Integer columnNum;
}