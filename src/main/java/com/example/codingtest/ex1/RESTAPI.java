package com.example.codingtest.ex1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RESTAPI {
    @PostMapping("example1")
    public List<BreadDTO> ex1(@RequestBody List<BreadDTO> list){
        for (int i = 0; i < list.size(); i++) {
            BreadDTO breadDTO=list.get(i);
            RecipeDTO recipeDTO=breadDTO.getRecipe();
            System.out.println("breadType : "+breadDTO.getBreadType());
            System.out.println("recipe");
            if(recipeDTO.getFlour()!=null){
                System.out.println("flour:"+recipeDTO.getFlour());
            }
            if(recipeDTO.getWater()!=null){
                System.out.println("water:"+recipeDTO.getWater());
            }
            if(recipeDTO.getCream()!=null){
                System.out.println("cream:"+recipeDTO.getCream());
            }
            if(recipeDTO.getSugar()!=null) {
                System.out.println("sugar:" + recipeDTO.getSugar());
            }
            if(recipeDTO.getButter()!=null){
                System.out.println("butter:"+recipeDTO.getButter());
            }
            System.out.println();
        }
        return list;
    }


}
