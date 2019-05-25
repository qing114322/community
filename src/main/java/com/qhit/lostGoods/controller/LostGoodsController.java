package com.qhit.lostGoods.controller; 

import com.qhit.lostGoods.pojo.LostGoods; 
import com.qhit.lostGoods.service.ILostGoodsService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 


@RestController 
@RequestMapping("/lostGoods") 
public class LostGoodsController { 

    @Resource 
    ILostGoodsService lostGoodsService; 

    @RequestMapping("/insert") 
    public void insert(LostGoods lostGoods) { 
        lostGoodsService.insert(lostGoods); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer lgId) { 
        lostGoodsService.delete(lgId); 
    } 

    @RequestMapping("/update") 
    public void update(LostGoods lostGoods) { 
        lostGoodsService.update(lostGoods); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(LostGoods lostGoods) { 
        lostGoodsService.updateSelective(lostGoods); 
    } 

    @RequestMapping("/load") 
    public LostGoods load(Integer lgId) { 
        LostGoods lostGoods = lostGoodsService.findById(lgId); 
        return lostGoods; 
    } 

    @RequestMapping("/list") 
    public List<LostGoods> list()  { 
        List<LostGoods> list = lostGoodsService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<LostGoods> search(LostGoods lostGoods) { 
        List<LostGoods> list = lostGoodsService.search(lostGoods); 
        return list; 
    } 

} 
