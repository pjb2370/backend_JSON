package com.investmentsite.isc.board.coin.controller;

import com.investmentsite.isc.board.coin.service.CoinBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/board/coin")
@RequiredArgsConstructor
@RestController
public class CoinBoardController {
    private final CoinBoardService coinBoardService;



}
