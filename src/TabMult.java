/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author corre
 */
public class TabMult {
    public String tabMult(int t, int i){  
        if(i==0){
            return t+" x "+0+" = "+0+"\n";
        }else{
            int x=i;
            int sum=0;
            for(int q=0;q<x;q++){
                sum = sum+t;
            }
            return tabMult(t, i-1)+t+" x "+x+" = "+sum+"\n";
        }
    }
}
