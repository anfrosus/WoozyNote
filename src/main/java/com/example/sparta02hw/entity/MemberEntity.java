package com.example.sparta02hw.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private int passWord;

    @Column(nullable = false)
    private String userName;

    public MemberEntity(String userId, int passWord, String userName) {
        this.userId = userId;
        this.passWord = passWord;
        this.userName = userName;
    }

    public Long
}
