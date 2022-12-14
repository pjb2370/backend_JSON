package com.investmentsite.isc.board.coin.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@Entity
public class CoinBoardComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String contents;
    @Column(length = 20)
    private String writer;
    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private String date;
    private Integer boardIndex;
}
