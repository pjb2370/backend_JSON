package com.investmentsite.isc.board.coin.dao;

import com.investmentsite.isc.board.coin.domain.CoinBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinBoardRepository extends JpaRepository<CoinBoard, Integer> {
}
