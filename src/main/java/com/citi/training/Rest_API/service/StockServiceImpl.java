package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
    private StockRepository stockRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }

    public List<Stock> getTop5Stock() {  return stockRepository.findTopByGain_loss();}
    public List<Stock> getLoser5Stock() {   return stockRepository.findLoserByGain_loss();}

    @Override
    public double totalGL(){
        return stockRepository.findtotal_gain_loss();
    }

    @Override
    public double getgainloss(){
        return stockRepository.findgain_loss();
    }
}
