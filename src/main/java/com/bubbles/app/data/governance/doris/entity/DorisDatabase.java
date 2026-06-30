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
@Table(name = "doris_database", comment = "DORIS-库")
public class DorisDatabase {
    
    @Id
    @Column(comment = "ID", nullable = false)
    private Long id;
    
    @Column(comment = "目录", nullable = false)
    private String catalog;
    @Column(comment = "库", nullable = false)
    private String database;
    
    @Column(comment = "表数量")
    private Integer tableNum;
    @Column(comment = "排序")
    private Integer sort;
}