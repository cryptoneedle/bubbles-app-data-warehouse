package com.bubbles.app.data.governance.doris.entity;

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
@Table(name = "doris_catalog", comment = "DORIS-目录")
public class DorisCatalog {
    
    @Id
    @Column(comment = "ID", nullable = false)
    private Long id;
    
    @Column(comment = "名称", nullable = false)
    private String catalog;
    
    /**
     * SHOW CATALOGS
     */
    
    @Column(comment = "类型")
    private String type;
    @Column(length = 2048, comment = "说明")
    private String comment;
    @Column(comment = "创建时间(需采用字符类型)")
    private String createDt;
    @Column(comment = "更新时间(需采用字符类型)")
    private LocalDateTime updateDt;
    
    /**
     * 统计 DorisDatabase
     */
    @Column(comment = "库数量")
    private Integer databaseNum;
    
    /**
     * 统计 DorisTable
     */
    
    @Column(comment = "表数量")
    private Integer tableNum;
}