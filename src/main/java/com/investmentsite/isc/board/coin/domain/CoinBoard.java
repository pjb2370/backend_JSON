package com.investmentsite.isc.board.coin.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Data
public class CoinBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 200)
    private String title;
    private String contents;
    @Column(length = 20)
    private String writer;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private String date;
    private Integer views;
}
