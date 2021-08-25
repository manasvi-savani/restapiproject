package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface StockService {
    List<Stock> getAllStocks();
    void deleteUserByUserId(Stock stock);
    void deleteUserByUserId(int stock);

}
