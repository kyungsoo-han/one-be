package com.solutionil.onebe.comm.mapper;

import com.solutionil.onebe.comm.dto.DeductType;
import com.solutionil.onebe.comm.dto.request.BaseStockRequest;
import com.solutionil.onebe.comm.dto.response.BaseStockResponse;
import com.solutionil.onebe.inb.dto.request.InboundRequest;
import com.solutionil.onebe.inb.dto.request.PutawayRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockMapper {

    <T> void insertStock(T request);

    <T> void insertStockHistory(T request);

    <T>void deductStock(T request);

    <T> int getAvailableStock(T request);

    <T> void reservedStock(T request);

    <T> void deleteStockHistory(T request);

    List<BaseStockResponse> findStocks(Integer compId, Integer bizId, Integer itemId);
}
