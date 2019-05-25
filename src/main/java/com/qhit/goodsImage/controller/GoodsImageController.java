package com.qhit.goodsImage.controller; 

import com.qhit.goodsImage.pojo.GoodsImage; 
import com.qhit.goodsImage.service.IGoodsImageService; 
import org.springframework.web.bind.annotation.RequestMapping; 
import javax.annotation.Resource; 
import java.util.List; 
import org.springframework.web.bind.annotation.RestController; 


@RestController 
@RequestMapping("/goodsImage") 
public class GoodsImageController { 

    @Resource 
    IGoodsImageService goodsImageService; 

    @RequestMapping("/insert") 
    public void insert(GoodsImage goodsImage) { 
        goodsImageService.insert(goodsImage); 
    } 

    @RequestMapping("/delete") 
    public void delete(Integer giId) { 
        goodsImageService.delete(giId); 
    } 

    @RequestMapping("/update") 
    public void update(GoodsImage goodsImage) { 
        goodsImageService.update(goodsImage); 
    } 

    @RequestMapping("/updateSelective") 
    public void updateSelective(GoodsImage goodsImage) { 
        goodsImageService.updateSelective(goodsImage); 
    } 

    @RequestMapping("/load") 
    public GoodsImage load(Integer giId) { 
        GoodsImage goodsImage = goodsImageService.findById(giId); 
        return goodsImage; 
    } 

    @RequestMapping("/list") 
    public List<GoodsImage> list()  { 
        List<GoodsImage> list = goodsImageService.findAll(); 
        return list; 
    } 

    @RequestMapping("/search") 
    public List<GoodsImage> search(GoodsImage goodsImage) { 
        List<GoodsImage> list = goodsImageService.search(goodsImage); 
        return list; 
    } 

} 
